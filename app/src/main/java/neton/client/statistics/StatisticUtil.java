package neton.client.statistics;

import android.content.Context;
import android.text.TextUtils;
import com.coloros.neton.BuildConfig;
import com.coloros.neton.NetonClient;
import com.coloros.neton.NetonException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import neton.CacheControl;
import neton.MediaType;
import neton.Request;
import neton.RequestBody;
import neton.Timeout;
import neton.client.Utils.ApkInfoUtil;
import neton.client.Utils.AppSecurityUtils;
import neton.client.Utils.ClientIdUtils;
import neton.client.Utils.LogUtil;
import neton.client.Utils.ModeUtil;
import neton.client.Utils.NetHelper;
import neton.client.config.ConfigManager;
import neton.client.config.Constants;
import okio.BufferedSink;

/* loaded from: classes.dex */
public class StatisticUtil {
    public static final String EVENT_ID_MESSAGE = "netton";
    public static final String LOGTAG_APP = "10001";

    public static void statisticMessage(Context context, RequestStatistic requestStatistic) {
        HashMap hashMap = new HashMap();
        hashMap.put(RequestStatistic.TRACE_ID, requestStatistic.getTraceID());
        hashMap.put(RequestStatistic.REQUEST_URL, requestStatistic.getUrl());
        hashMap.put("ip", requestStatistic.getIp());
        StringBuilder sb = new StringBuilder();
        sb.append(requestStatistic.getStartTime());
        hashMap.put(RequestStatistic.START_TIME, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(requestStatistic.getDnsStartTime());
        hashMap.put("dnsStartTime", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(requestStatistic.getDnsStartTime());
        hashMap.put("dnsStartTime", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(requestStatistic.getNetworkRequestStartTime());
        hashMap.put(RequestStatistic.NETWORK_REQUEST_START_TIME, sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(requestStatistic.getStartSslTime());
        hashMap.put(RequestStatistic.START_SSL_TIME, sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(requestStatistic.getEndSslTime());
        hashMap.put(RequestStatistic.END_SSL_TIME, sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(requestStatistic.getEndTime());
        hashMap.put(RequestStatistic.END_TIME, sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(requestStatistic.getResponseCode());
        hashMap.put(RequestStatistic.RESPONSE_CODE, sb8.toString());
        hashMap.put(RequestStatistic.RESPONSE_MESSAGE, requestStatistic.getResponseMessage());
        hashMap.put(RequestStatistic.NETWORK_TYPE, requestStatistic.getNetworkType());
        hashMap.put(RequestStatistic.SERVICE_METHOD, requestStatistic.getServiceMethod());
        LogUtil.m7844d("StatisticUtil--statisticMessage--logMap:".concat(String.valueOf(hashMap)));
        Statistics.onCommon(context, LOGTAG_APP, EVENT_ID_MESSAGE, hashMap, false);
    }

    public static void statisticTrace(Context context, RequestStatistic requestStatistic) {
        String str;
        if (requestStatistic == null || TextUtils.isEmpty(requestStatistic.getTraceID()) || !NetHelper.getNetworkAccess(context)) {
            return;
        }
        if (ModeUtil.getMode() == 0) {
            str = ConfigManager.getInstance().getStringData(Constants.KEY_TRACE_URL, ApkInfoUtil.isRegionCN() ? Constants.DEFAULT_TRACE_URL : Constants.DEFAULT_FOREIGN_TRACE_URL);
        } else {
            str = Constants.DEFAULT_TEST_TRACE_URL;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        try {
            LogUtil.m7847e("statisticTrace,url=" + str + ",response:" + NetonClient.getProcessor().process(new Request.Builder().url(str).post(new RequestBody() { // from class: neton.client.statistics.StatisticUtil.1
                final /* synthetic */ Context val$context;
                final /* synthetic */ RequestStatistic val$requestStatistic;

                C25011(Context context2, RequestStatistic requestStatistic2) {
                    r1 = context2;
                    r2 = requestStatistic2;
                }

                @Override // neton.RequestBody
                public final MediaType contentType() {
                    return MediaType.parse(MediaType.OCTET_STREAM);
                }

                @Override // neton.RequestBody
                public final void writeTo(BufferedSink bufferedSink) {
                    StatisticUtil.write(r1, new DataOutputStream(bufferedSink.outputStream()), r2);
                }
            }).timeout(new Timeout(3000, 10000, 10000)).cacheControl(CacheControl.FORCE_NETWORK).header("Content-Type", MediaType.OCTET_STREAM).header("t", valueOf).header("s", AppSecurityUtils.getHmacSHA1(valueOf.getBytes(Charset.defaultCharset()), "snake_sdk")).build(), true));
        } catch (NetonException e) {
            LogUtil.m7847e("statisticTrace--NetonException:" + e.toString());
        } catch (IOException e2) {
            LogUtil.m7847e("statisticTrace--IOException:" + e2.toString());
        } catch (Exception e3) {
            LogUtil.m7847e("statisticTrace--Exception:" + e3.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: neton.client.statistics.StatisticUtil$1 */
    /* loaded from: classes.dex */
    public final class C25011 extends RequestBody {
        final /* synthetic */ Context val$context;
        final /* synthetic */ RequestStatistic val$requestStatistic;

        C25011(Context context2, RequestStatistic requestStatistic2) {
            r1 = context2;
            r2 = requestStatistic2;
        }

        @Override // neton.RequestBody
        public final MediaType contentType() {
            return MediaType.parse(MediaType.OCTET_STREAM);
        }

        @Override // neton.RequestBody
        public final void writeTo(BufferedSink bufferedSink) {
            StatisticUtil.write(r1, new DataOutputStream(bufferedSink.outputStream()), r2);
        }
    }

    static void write(Context context, DataOutputStream dataOutputStream, RequestStatistic requestStatistic) {
        if (requestStatistic == null) {
            return;
        }
        dataOutputStream.writeByte(32);
        if (requestStatistic.getServiceMethod() == null || requestStatistic.getResponseCode() == 0) {
            LogUtil.m7844d("statisticTrace-write error");
            return;
        }
        dataOutputStream.writeUTF(requestStatistic.getTraceID());
        dataOutputStream.writeUTF(requestStatistic.getServiceMethod());
        dataOutputStream.writeUTF("neton_" + context.getPackageName());
        dataOutputStream.writeUTF(requestStatistic.getIp());
        dataOutputStream.writeLong(requestStatistic.getStartTime());
        dataOutputStream.writeLong(requestStatistic.getDnsStartTime());
        dataOutputStream.writeLong(requestStatistic.getDnsEndTime());
        dataOutputStream.writeLong(requestStatistic.getNetworkRequestStartTime());
        dataOutputStream.writeLong(requestStatistic.getStartSslTime());
        dataOutputStream.writeLong(requestStatistic.getEndSslTime());
        dataOutputStream.writeLong(requestStatistic.getEndTime());
        dataOutputStream.writeUTF("imei=" + ClientIdUtils.getClientId(context) + "&appVersion=" + ApkInfoUtil.getVersionName(context) + "&model=" + ApkInfoUtil.getModel());
        StringBuilder sb = new StringBuilder();
        sb.append(requestStatistic.getResponseCode());
        dataOutputStream.writeUTF(sb.toString());
        if (requestStatistic.getResponseCode() == 200) {
            dataOutputStream.writeUTF(BuildConfig.FLAVOR);
        } else {
            dataOutputStream.writeUTF(requestStatistic.getResponseMessage());
        }
        dataOutputStream.flush();
    }
}
