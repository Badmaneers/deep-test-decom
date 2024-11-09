package com.coloros.neton;

import android.content.Context;
import android.net.SSLSessionCache;
import android.text.TextUtils;
import com.coloros.neton.NetonConfig;
import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509TrustManager;
import neton.Cache;
import neton.Call;
import neton.Callback;
import neton.HttpUrl;
import neton.OkHttpClient;
import neton.Request;
import neton.Response;
import neton.client.Utils.LogUtil;
import neton.client.Utils.ModeUtil;
import neton.client.Utils.NetHelper;
import neton.client.Utils.ResponseCode;
import neton.client.Utils.ThreadPoolUtil;
import neton.client.Utils.Util;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;
import neton.client.cookie.CookiesManager;
import neton.client.dns.DnsImp;
import neton.client.dns.DnsManager;
import neton.client.dns.IpInfo;
import neton.client.liveon.LiveOnHttps;
import neton.client.liveon.LiveOnHttpsManager;
import neton.client.statistics.RequestStatistic;
import neton.client.statistics.StatisticUtil;
import neton.internal.tls.NetonSslSocketFactory;
import neton.internal.tls.TrustAllCertification;

/* loaded from: classes.dex */
public class Processor {
    private static final String ENCYPT_HEADER = "encypt";
    private static final String LEVEL = "level";
    private static final String NETON_HEADER = "O_NETON";
    private static final String TRACE_ID = "traceId";
    Context mContext;
    private File mFile;
    NetonConfig mNetonConfig;
    private OkHttpClient mOkHttpClient;

    public Processor(Context context, NetonConfig netonConfig) {
        SSLSessionCache sSLSessionCache = null;
        this.mFile = null;
        this.mContext = context;
        this.mNetonConfig = netonConfig;
        if (this.mNetonConfig == null) {
            this.mNetonConfig = new NetonConfig.Builder().build();
        }
        if (-1 != this.mNetonConfig.getRetryIntervalTime()) {
            ConfigManager.getInstance().setLongData(Constants.KEY_RETRY_INTERVAL_TIME, Long.valueOf(this.mNetonConfig.getRetryIntervalTime()));
        }
        if (-1 != this.mNetonConfig.getRetryTimes()) {
            ConfigManager.getInstance().setIntData(Constants.KEY_RETRY_TIMES, this.mNetonConfig.getRetryTimes());
        }
        this.mNetonConfig.getTraceHit();
        if (-1 != this.mNetonConfig.getDnsMode()) {
            ConfigManager.getInstance().setIntData(Constants.KEY_DNS_MODE, this.mNetonConfig.getDnsMode());
        }
        if (-1 != this.mNetonConfig.getSessionTimeout()) {
            ConfigManager.getInstance().setIntData(Constants.KEY_SESSION_TIMEOUT, this.mNetonConfig.getSessionTimeout());
        }
        if (-1 != this.mNetonConfig.getSessionCacheSize()) {
            ConfigManager.getInstance().setIntData(Constants.KEY_SESSION_CACHE_SIZE, this.mNetonConfig.getSessionCacheSize());
        }
        if (-1 != this.mNetonConfig.getLiveOnTime()) {
            ConfigManager.getInstance().setLongData(Constants.KEY_LIVE_ON_TIME, Long.valueOf(this.mNetonConfig.getLiveOnTime()));
        }
        if (this.mNetonConfig.getLiveOnHttpsMap() != null && !this.mNetonConfig.getLiveOnHttpsMap().isEmpty()) {
            LiveOnHttpsManager.getInstance().parseLiveOnHttpsMap(this.mNetonConfig.getLiveOnHttpsMap());
        }
        if (-1 != this.mNetonConfig.getMode()) {
            ConfigManager.getInstance().setIntData(Constants.KEY_MODE, this.mNetonConfig.getMode());
            ModeUtil.setMode(this.mNetonConfig.getMode());
        }
        if (this.mNetonConfig.getRegionCode() != null) {
            ConfigManager.getInstance().setStringData(Constants.KEY_REGIONCODE, this.mNetonConfig.getRegionCode());
        }
        OkHttpClient.Builder okHttpBuilder = this.mNetonConfig.okHttpBuilder();
        okHttpBuilder = okHttpBuilder == null ? new OkHttpClient.Builder() : okHttpBuilder;
        if (this.mNetonConfig.timeout() != null) {
            okHttpBuilder.timeout(this.mNetonConfig.timeout());
        }
        okHttpBuilder.addInterceptor(new OppoSetInterceptor());
        if (this.mNetonConfig.isDebug()) {
            LogUtil.setDebugs(true);
            okHttpBuilder.addInterceptor(new LoggingInterceptor());
            okHttpBuilder.addNetworkInterceptor(new NetworkInterceptor());
        }
        if (this.mNetonConfig.isRequestCache()) {
            try {
                if (!TextUtils.isEmpty(this.mNetonConfig.getCacheDirectory())) {
                    this.mFile = new File(this.mNetonConfig.getCacheDirectory());
                }
                if (this.mFile == null || !this.mFile.exists()) {
                    this.mFile = this.mContext.getCacheDir();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.mFile != null && this.mFile.exists()) {
                okHttpBuilder.cache(new Cache(this.mFile, 1010241024L));
            }
        }
        if (this.mNetonConfig.isCookie()) {
            okHttpBuilder.cookieJar(new CookiesManager(context));
        }
        if (!this.mNetonConfig.isVerify()) {
            okHttpBuilder.sslSocketFactory(TrustAllCertification.createSSLSocketFactory());
            okHttpBuilder.hostnameVerifier(new TrustAllCertification.TrustAllHostnameVerifier());
        } else {
            if (this.mNetonConfig.isPersistSession() && context != null) {
                sSLSessionCache = new SSLSessionCache(context);
            }
            try {
                X509TrustManager systemDefaultTrustManager = NetonSslSocketFactory.systemDefaultTrustManager();
                okHttpBuilder.sslSocketFactory(NetonSslSocketFactory.createNetonSslSocketFactory(systemDefaultTrustManager, sSLSessionCache), systemDefaultTrustManager);
            } catch (KeyManagementException e2) {
                e2.printStackTrace();
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        this.mOkHttpClient = okHttpBuilder.build();
        checkRegionCode();
        Util.getNetonHeader(this.mContext);
    }

    public void checkRegionCode() {
        if (1 == ConfigManager.getInstance().getIntData(Constants.KEY_DNS_MODE, 1) || !TextUtils.isEmpty(ConfigManager.getInstance().getStringData(Constants.KEY_REGIONCODE, BuildConfig.FLAVOR))) {
            return;
        }
        LogUtil.m7847e("checkRegionCode fatal error, exception");
        throw new NetonException("fatal error, exception, please set regionCode when use httpDns !");
    }

    public NetonConfig getNetonConfig() {
        return this.mNetonConfig;
    }

    public OkHttpClient getOkHttpClient() {
        return this.mOkHttpClient;
    }

    public Response process(Request request, boolean z) {
        LogUtil.m7844d("Processor--start process request:" + request + ",notChangeRequest:" + z);
        if (z) {
            return this.mOkHttpClient.newCall(request).execute();
        }
        return process(request);
    }

    public void process(Request request, final Callback callback, boolean z) {
        LogUtil.m7844d("Processor--start process request:" + request + ",notChangeRequest:" + z);
        if (z) {
            this.mOkHttpClient.newCall(request).enqueue(new Callback() { // from class: com.coloros.neton.Processor.1
                @Override // neton.Callback
                public void onFailure(Call call, IOException iOException) {
                    callback.onFailure(call, iOException);
                }

                @Override // neton.Callback
                public void onResponse(Call call, Response response) {
                    callback.onResponse(call, response);
                }
            });
        } else {
            process(request, callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public neton.Response process(neton.Request r17) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.neton.Processor.process(neton.Request):neton.Response");
    }

    public void process(final Request request, final Callback callback) {
        final boolean isHostIp = DnsImp.isHostIp(request.url().host());
        final Retry retry = new Retry();
        if (request.retryTimes() < 0) {
            retry.setRetryCount(isHostIp ? 0 : ConfigManager.getInstance().getIntData(Constants.KEY_RETRY_TIMES, 1));
        } else {
            retry.setRetryCount(isHostIp ? 0 : request.retryTimes());
        }
        retry.setRetryTime(ConfigManager.getInstance().getLongData(Constants.KEY_RETRY_INTERVAL_TIME, 0L).longValue());
        if (retry.getRetryCount() <= 0 && isHttpsLiveOn(request)) {
            retry.setRetryCount(1);
        }
        process(isHostIp, request, callback, new Callback() { // from class: com.coloros.neton.Processor.2
            @Override // neton.Callback
            public void onFailure(Call call, IOException iOException) {
                retry.setRetryCount(retry.getRetryCount() - 1);
                if (retry.getRetryCount() >= 0 && ((iOException instanceof ConnectException) || (iOException instanceof SSLException))) {
                    if (retry.getRetryTime() != 0) {
                        try {
                            Thread.sleep(retry.getRetryTime());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Processor.this.process(isHostIp, request, callback, this);
                        return;
                    } catch (NetonException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                callback.onFailure(call, iOException);
            }

            @Override // neton.Callback
            public void onResponse(Call call, Response response) {
                retry.setRetryCount(retry.getRetryCount() - 1);
                if (retry.getRetryCount() >= 0 && response.code() == 408) {
                    if (retry.getRetryTime() != 0) {
                        try {
                            Thread.sleep(retry.getRetryTime());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Processor.this.process(isHostIp, request, callback, this);
                    return;
                }
                retry.setRetryCount(0);
                callback.onResponse(call, response);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void process(boolean z, final Request request, final Callback callback, final Callback callback2) {
        RequestStatistic requestStatistic = new RequestStatistic(Util.getTraceID(this.mContext));
        Request liveOnRequest = getLiveOnRequest(request);
        IpInfo ipInfo = null;
        if (!z) {
            try {
                ipInfo = getIpInfo(liveOnRequest, requestStatistic);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        final IpInfo ipInfo2 = ipInfo;
        final Request processRequest = getProcessRequest(liveOnRequest, requestStatistic, ipInfo2);
        this.mOkHttpClient.newCall(processRequest).enqueue(new Callback() { // from class: com.coloros.neton.Processor.3
            @Override // neton.Callback
            public void onFailure(Call call, IOException iOException) {
                if (ipInfo2 != null) {
                    ipInfo2.updateFailCount(Processor.this.mContext, 1);
                }
                callback2.onFailure(call, iOException);
                Processor.this.statisticRequest(processRequest, ResponseCode.CODE_6XX_CONNECT_ERROR, iOException.toString());
                if ((iOException instanceof ConnectException) || (iOException instanceof SSLException)) {
                    LiveOnHttpsManager.getInstance().updateLiveOn(request, processRequest, false);
                }
            }

            @Override // neton.Callback
            public void onResponse(Call call, Response response) {
                if (response.isSuccessful()) {
                    callback.onResponse(call, response);
                    Processor.this.statisticRequest(processRequest, response.code(), response.code() == 200 ? BuildConfig.FLAVOR : response.message());
                    DnsManager.getInstance().updateIpInfo(ipInfo2);
                    LiveOnHttpsManager.getInstance().updateLiveOn(request, processRequest, true);
                    return;
                }
                if (ipInfo2 != null) {
                    ipInfo2.updateFailCount(Processor.this.mContext, 1);
                }
                callback2.onResponse(call, response);
                Processor.this.statisticRequest(processRequest, response.code(), response.code() == 200 ? BuildConfig.FLAVOR : response.message());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class Retry {
        private int retryCount;
        private long retryTime;

        private Retry() {
        }

        public long getRetryTime() {
            return this.retryTime;
        }

        public void setRetryTime(long j) {
            this.retryTime = j;
        }

        public synchronized int getRetryCount() {
            return this.retryCount;
        }

        public synchronized void setRetryCount(int i) {
            this.retryCount = i;
        }
    }

    private IpInfo getIpInfo(Request request, RequestStatistic requestStatistic) {
        String unknownHostException;
        requestStatistic.setDnsStartTime(System.currentTimeMillis());
        IpInfo ipInfo = null;
        try {
            IpInfo lookup = DnsManager.getInstance().lookup(request.url().host());
            unknownHostException = BuildConfig.FLAVOR;
            e = null;
            ipInfo = lookup;
        } catch (UnknownHostException e) {
            e = e;
            LogUtil.m7844d("Processor--process--UnknownHostException:" + e.toString());
            unknownHostException = e.toString();
        }
        requestStatistic.setDnsEndTime(System.currentTimeMillis());
        if (ipInfo == null || e != null) {
            statisticRequest(request, ResponseCode.CODE_6XX_DNS_ERROR, unknownHostException);
            if (e != null) {
                throw e;
            }
        }
        return ipInfo;
    }

    public void statisticRequest(final Request request, final int i, final String str) {
        if (this.mNetonConfig != null && !this.mNetonConfig.isStatistics() && !this.mNetonConfig.isTrace() && request.requestStatistic() != null && !TextUtils.isEmpty(request.requestStatistic().getTraceID())) {
            LogUtil.m7844d("statisticRequest--no trace,no statistic");
        } else {
            ThreadPoolUtil.execute(new Runnable() { // from class: com.coloros.neton.Processor.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestStatistic requestStatistic = request.requestStatistic();
                    if (request == null || requestStatistic == null) {
                        return;
                    }
                    requestStatistic.setIp(request.url().m7842ip());
                    requestStatistic.setNetworkType(NetHelper.getNetworkType(Processor.this.mContext));
                    requestStatistic.setUrl(request.url().toString());
                    requestStatistic.setEndTime(System.currentTimeMillis());
                    requestStatistic.setResponseCode(i);
                    requestStatistic.setResponseMessage(str);
                    String httpUrl = request.url().toString();
                    int indexOf = httpUrl.indexOf("?");
                    if (indexOf != -1) {
                        requestStatistic.setServiceMethod(request.method() + " " + httpUrl.substring(0, indexOf));
                    } else {
                        requestStatistic.setServiceMethod(request.method() + " " + httpUrl);
                    }
                    LogUtil.m7844d("statisticRequest--" + requestStatistic.toString());
                    if (Processor.this.mNetonConfig != null && Processor.this.mNetonConfig.isStatistics()) {
                        StatisticUtil.statisticMessage(Processor.this.mContext, requestStatistic);
                    }
                    if (Processor.this.mNetonConfig == null || !Processor.this.mNetonConfig.isTrace()) {
                        return;
                    }
                    StatisticUtil.statisticTrace(Processor.this.mContext, requestStatistic);
                }
            });
        }
    }

    private Request getProcessRequest(Request request, RequestStatistic requestStatistic, IpInfo ipInfo) {
        LogUtil.m7844d("Processor--getProcessRequest--start:".concat(String.valueOf(ipInfo)));
        try {
            HttpUrl.Builder newBuilder = request.url().newBuilder();
            if (ipInfo != null) {
                newBuilder.m7843ip(ipInfo.getIp());
                if (ipInfo.getPort() != -1) {
                    newBuilder.port(ipInfo.getPort());
                }
            } else {
                newBuilder.m7843ip(request.url().host());
            }
            Request.Builder newBuilder2 = request.newBuilder();
            ConfigManager configManager = ConfigManager.getInstance();
            String str = Constants.DEFAULT_ENCYPT_VERSION;
            newBuilder2.header(ENCYPT_HEADER, configManager.getStringData(str, str));
            newBuilder2.header(NETON_HEADER, Util.getNetonHeader(this.mContext));
            if (!TextUtils.isEmpty(requestStatistic.getTraceID())) {
                newBuilder2.header(TRACE_ID, requestStatistic.getTraceID());
                newBuilder2.header(LEVEL, Constants.TRACE_LEVEL_12);
            }
            newBuilder2.requestStatistic(requestStatistic);
            newBuilder2.url(newBuilder.build());
            return newBuilder2.build();
        } catch (NetonException e) {
            LogUtil.m7844d("getProcessRequest--NetonException:" + e.toString());
            return request;
        } catch (Exception e2) {
            LogUtil.m7844d("getProcessRequest--Exception:" + e2.toString());
            return request;
        }
    }

    public Request getLiveOnRequest(Request request) {
        try {
            if (request.url().isHttps()) {
                LiveOnHttps liveOnHttps = LiveOnHttpsManager.getInstance().getLiveOnHttps(request.url());
                LogUtil.m7844d("getLiveOnRequest--liveOnHttps:".concat(String.valueOf(liveOnHttps)));
                if (liveOnHttps != null && !liveOnHttps.isHttpsLiveOn()) {
                    HttpUrl.Builder newBuilder = request.url().newBuilder();
                    newBuilder.scheme("http");
                    newBuilder.host(liveOnHttps.getHttpUrl().host());
                    newBuilder.port(liveOnHttps.getHttpUrl().port());
                    Request.Builder newBuilder2 = request.newBuilder();
                    newBuilder2.url(newBuilder.build());
                    return newBuilder2.build();
                }
            }
        } catch (NetonException e) {
            LogUtil.m7844d("getLiveOnRequest--NetonException:" + e.toString());
        } catch (Exception e2) {
            LogUtil.m7844d("getLiveOnRequest--Exception:" + e2.toString());
        }
        return request;
    }

    public boolean isHttpsLiveOn(Request request) {
        return request.url().isHttps() && LiveOnHttpsManager.getInstance().getLiveOnHttps(request.url()) != null;
    }

    public void cancel(Object obj) {
        for (Call call : this.mOkHttpClient.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call2 : this.mOkHttpClient.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
            }
        }
    }

    public void close() {
        try {
            this.mOkHttpClient.dispatcher().cancelAll();
            this.mOkHttpClient.dispatcher().executorService().shutdown();
            this.mOkHttpClient.connectionPool().evictAll();
            this.mOkHttpClient.cache().close();
            this.mOkHttpClient = null;
            ThreadPoolUtil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
