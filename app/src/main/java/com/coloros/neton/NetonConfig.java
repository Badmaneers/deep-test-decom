package com.coloros.neton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import neton.HttpUrl;
import neton.OkHttpClient;
import neton.Timeout;

/* loaded from: classes.dex */
public class NetonConfig {
    public static final int DEFAULT_INT = -1;
    private String cacheDirectory;
    private int dnsMode;
    private boolean isCookie;
    private boolean isDebug;
    private boolean isPersistSession;
    private boolean isRequestCache;
    private boolean isStatistics;
    private boolean isTrace;
    private boolean isVerify;
    private Map<String, String> liveOnHttpsMap;
    private long liveOnTime;
    private int mode;
    private OkHttpClient.Builder okHttpBuilder;
    private String regionCode;
    private long retryIntervalTime;
    private int retryTimes;
    private int sessionCacheSize;
    private int sessionTimeout;
    private Timeout timeout;
    private int traceHit;

    private NetonConfig(Builder builder) {
        this.isVerify = true;
        this.isRequestCache = true;
        this.isPersistSession = true;
        this.isStatistics = false;
        this.isDebug = false;
        this.isTrace = false;
        this.isCookie = true;
        this.timeout = null;
        this.okHttpBuilder = null;
        this.cacheDirectory = null;
        this.dnsMode = -1;
        this.retryTimes = -1;
        this.retryIntervalTime = -1L;
        this.traceHit = -1;
        this.sessionTimeout = -1;
        this.sessionCacheSize = -1;
        this.liveOnHttpsMap = null;
        this.liveOnTime = -1L;
        this.mode = -1;
        this.regionCode = null;
        this.isVerify = builder.isVerify;
        this.isRequestCache = builder.isRequestCache;
        this.cacheDirectory = builder.cacheDirectory;
        this.isPersistSession = builder.isPersistSession;
        this.isStatistics = builder.isStatistics;
        this.dnsMode = builder.dnsMode;
        this.retryTimes = builder.retryTimes;
        this.retryIntervalTime = builder.retryIntervalTime;
        this.traceHit = builder.traceHit;
        this.isDebug = builder.isDebug;
        this.isTrace = builder.isTrace;
        this.sessionTimeout = builder.sessionTimeout;
        this.sessionCacheSize = builder.sessionCacheSize;
        this.okHttpBuilder = builder.okHttpBuilder;
        this.isCookie = builder.isCookie;
        this.timeout = builder.timeout;
        this.liveOnHttpsMap = builder.liveOnHttpsMap;
        this.liveOnTime = builder.liveOnTime;
        this.mode = builder.mode;
        this.regionCode = builder.regionCode;
    }

    public OkHttpClient.Builder okHttpBuilder() {
        return this.okHttpBuilder;
    }

    public boolean isVerify() {
        return this.isVerify;
    }

    public boolean isRequestCache() {
        return this.isRequestCache;
    }

    public String getCacheDirectory() {
        return this.cacheDirectory;
    }

    public boolean isPersistSession() {
        return this.isPersistSession;
    }

    public boolean isStatistics() {
        return this.isStatistics;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public boolean isTrace() {
        return this.isTrace;
    }

    public boolean isCookie() {
        return this.isCookie;
    }

    public Timeout timeout() {
        return this.timeout;
    }

    public int getSessionTimeout() {
        return this.sessionTimeout;
    }

    public int getRetryTimes() {
        return this.retryTimes;
    }

    public long getRetryIntervalTime() {
        return this.retryIntervalTime;
    }

    public int getTraceHit() {
        return this.traceHit;
    }

    public int getDnsMode() {
        return this.dnsMode;
    }

    public int getSessionCacheSize() {
        return this.sessionCacheSize;
    }

    public Map<String, String> getLiveOnHttpsMap() {
        return this.liveOnHttpsMap;
    }

    public long getLiveOnTime() {
        return this.liveOnTime;
    }

    public int getMode() {
        return this.mode;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    /* loaded from: classes.dex */
    public final class Builder {
        private String cacheDirectory;
        private int dnsMode;
        private boolean isCookie;
        private boolean isDebug;
        private boolean isPersistSession;
        private boolean isRequestCache;
        private boolean isStatistics;
        private boolean isTrace;
        private boolean isVerify;
        private Map<String, String> liveOnHttpsMap;
        private long liveOnTime;
        private int mode;
        private OkHttpClient.Builder okHttpBuilder;
        private String regionCode;
        private long retryIntervalTime;
        private int retryTimes;
        private int sessionCacheSize;
        private int sessionTimeout;
        private Timeout timeout;
        private int traceHit;

        public Builder() {
            this.isVerify = true;
            this.isRequestCache = false;
            this.cacheDirectory = null;
            this.isPersistSession = true;
            this.isStatistics = false;
            this.isDebug = false;
            this.isTrace = true;
            this.isCookie = true;
            this.timeout = null;
            this.okHttpBuilder = null;
            this.dnsMode = -1;
            this.retryTimes = -1;
            this.retryIntervalTime = -1L;
            this.traceHit = -1;
            this.sessionTimeout = -1;
            this.sessionCacheSize = -1;
            this.liveOnHttpsMap = null;
            this.liveOnTime = -1L;
            this.mode = -1;
            this.regionCode = null;
        }

        public Builder(NetonConfig netonConfig) {
            this.isVerify = true;
            this.isRequestCache = false;
            this.cacheDirectory = null;
            this.isPersistSession = true;
            this.isStatistics = false;
            this.isDebug = false;
            this.isTrace = true;
            this.isCookie = true;
            this.timeout = null;
            this.okHttpBuilder = null;
            this.dnsMode = -1;
            this.retryTimes = -1;
            this.retryIntervalTime = -1L;
            this.traceHit = -1;
            this.sessionTimeout = -1;
            this.sessionCacheSize = -1;
            this.liveOnHttpsMap = null;
            this.liveOnTime = -1L;
            this.mode = -1;
            this.regionCode = null;
            this.isRequestCache = netonConfig.isRequestCache;
            this.isVerify = netonConfig.isVerify;
            this.isPersistSession = netonConfig.isPersistSession;
            this.isStatistics = netonConfig.isStatistics;
            this.dnsMode = netonConfig.dnsMode;
            this.retryIntervalTime = netonConfig.retryIntervalTime;
            this.retryTimes = netonConfig.retryTimes;
            this.traceHit = netonConfig.traceHit;
            this.isDebug = netonConfig.isDebug;
            this.isTrace = netonConfig.isTrace;
            this.isCookie = netonConfig.isCookie;
            this.sessionTimeout = netonConfig.sessionTimeout;
            this.sessionCacheSize = netonConfig.sessionCacheSize;
            this.okHttpBuilder = netonConfig.okHttpBuilder;
            this.timeout = netonConfig.timeout;
            this.liveOnHttpsMap = netonConfig.liveOnHttpsMap;
            this.liveOnTime = netonConfig.liveOnTime;
            this.mode = netonConfig.mode;
            this.regionCode = netonConfig.regionCode;
        }

        public final Builder okHttpBuilder(OkHttpClient.Builder builder) {
            this.okHttpBuilder = builder;
            return this;
        }

        public final Builder timeout(Timeout timeout) {
            this.timeout = timeout;
            return this;
        }

        @Deprecated
        public final Builder verify(boolean z) {
            this.isVerify = z;
            return this;
        }

        public final Builder requestCache(boolean z) {
            this.isRequestCache = z;
            return this;
        }

        public final Builder cacheDirectory(String str) {
            this.cacheDirectory = str;
            return this;
        }

        public final Builder cookie(boolean z) {
            this.isCookie = z;
            return this;
        }

        public final Builder persistSession(boolean z) {
            this.isPersistSession = z;
            return this;
        }

        public final Builder statistics(boolean z) {
            this.isStatistics = z;
            return this;
        }

        public final Builder debug(boolean z) {
            this.isDebug = z;
            return this;
        }

        public final Builder dnsMode(int i) {
            this.dnsMode = i;
            return this;
        }

        public final Builder sessionTimeout(int i) {
            this.sessionTimeout = i;
            return this;
        }

        public final Builder sessionCacheSize(int i) {
            this.sessionCacheSize = i;
            return this;
        }

        public final Builder retryTimes(int i) {
            this.retryTimes = i;
            return this;
        }

        public final Builder trace(boolean z) {
            this.isTrace = z;
            return this;
        }

        public final Builder retryIntervalTime(long j) {
            this.retryIntervalTime = j;
            return this;
        }

        @Deprecated
        public final Builder traceHit(int i) {
            this.traceHit = i;
            return this;
        }

        public final Builder liveOnHttpsMap(Map<String, String> map) {
            this.liveOnHttpsMap = map;
            return this;
        }

        public final Builder liveOnHttpsMap(List<String> list) {
            if (list != null && !list.isEmpty()) {
                this.liveOnHttpsMap = new HashMap();
            }
            for (String str : list) {
                HttpUrl parse = HttpUrl.parse(str);
                if (parse == null) {
                    this.liveOnHttpsMap.put(str, str);
                } else {
                    this.liveOnHttpsMap.put(str, parse.host());
                }
            }
            return this;
        }

        public final Builder liveOnHttpsMap(String... strArr) {
            if (strArr != null && strArr.length > 0) {
                liveOnHttpsMap(Arrays.asList(strArr));
            }
            return this;
        }

        public final Builder liveOnTime(long j) {
            this.liveOnTime = j;
            return this;
        }

        public final Builder mode(int i) {
            this.mode = i;
            return this;
        }

        public final Builder regionCode(String str) {
            this.regionCode = str;
            return this;
        }

        public final NetonConfig build() {
            return new NetonConfig(this);
        }
    }
}
