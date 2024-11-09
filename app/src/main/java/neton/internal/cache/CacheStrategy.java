package neton.internal.cache;

import com.coloros.neton.NetonException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import neton.CacheControl;
import neton.Headers;
import neton.Request;
import neton.Response;
import neton.internal.Internal;
import neton.internal.http.HttpDate;
import neton.internal.http.HttpHeaders;

/* loaded from: classes.dex */
public final class CacheStrategy {
    public final Response cacheResponse;
    public final Request networkRequest;

    CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:            if (r3.cacheControl().isPrivate() == false) goto L21;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isCacheable(neton.Response r3, neton.Request r4) {
        /*
            int r0 = r3.code()
            r1 = 0
            switch(r0) {
                case 200: goto L31;
                case 203: goto L31;
                case 204: goto L31;
                case 300: goto L31;
                case 301: goto L31;
                case 302: goto L9;
                case 307: goto L9;
                case 308: goto L31;
                case 404: goto L31;
                case 405: goto L31;
                case 410: goto L31;
                case 414: goto L31;
                case 501: goto L31;
                default: goto L8;
            }
        L8:
            goto L48
        L9:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.header(r0)
            if (r0 != 0) goto L31
            neton.CacheControl r0 = r3.cacheControl()
            int r0 = r0.maxAgeSeconds()
            r2 = -1
            if (r0 != r2) goto L31
            neton.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPublic()
            if (r0 != 0) goto L31
            neton.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPrivate()
            if (r0 != 0) goto L31
            goto L48
        L31:
            neton.CacheControl r3 = r3.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L47
            neton.CacheControl r3 = r4.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L47
            r3 = 1
            return r3
        L47:
            return r1
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: neton.internal.cache.CacheStrategy.isCacheable(neton.Response, neton.Request):boolean");
    }

    /* loaded from: classes.dex */
    public class Factory {
        private int ageSeconds;
        final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        final long nowMillis;
        private long receivedResponseMillis;
        final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public Factory(long j, Request request, Response response) {
            this.ageSeconds = -1;
            this.nowMillis = j;
            this.request = request;
            this.cacheResponse = response;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String name = headers.name(i);
                    String value = headers.value(i);
                    if ("Date".equalsIgnoreCase(name)) {
                        this.servedDate = HttpDate.parse(value);
                        this.servedDateString = value;
                    } else if ("Expires".equalsIgnoreCase(name)) {
                        this.expires = HttpDate.parse(value);
                    } else if ("Last-Modified".equalsIgnoreCase(name)) {
                        this.lastModified = HttpDate.parse(value);
                        this.lastModifiedString = value;
                    } else if ("ETag".equalsIgnoreCase(name)) {
                        this.etag = value;
                    } else if ("Age".equalsIgnoreCase(name)) {
                        this.ageSeconds = HttpHeaders.parseSeconds(value, -1);
                    }
                }
            }
        }

        public CacheStrategy get() {
            CacheStrategy candidate = getCandidate();
            return (candidate.networkRequest == null || !this.request.cacheControl().onlyIfCached()) ? candidate : new CacheStrategy(null, null);
        }

        private CacheStrategy getCandidate() {
            String str;
            String str2;
            Request request;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!CacheStrategy.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl = this.request.cacheControl();
            if (cacheControl.noCache() || hasConditions(this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl2 = this.cacheResponse.cacheControl();
            if (cacheControl2.immutable()) {
                return new CacheStrategy(null, this.cacheResponse);
            }
            long cacheResponseAge = cacheResponseAge();
            long computeFreshnessLifetime = computeFreshnessLifetime();
            if (cacheControl.maxAgeSeconds() != -1) {
                computeFreshnessLifetime = Math.min(computeFreshnessLifetime, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
            }
            long j = 0;
            long millis = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
            if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                j = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
            }
            if (!cacheControl2.noCache()) {
                long j2 = millis + cacheResponseAge;
                if (j2 < j + computeFreshnessLifetime) {
                    Response.Builder newBuilder = this.cacheResponse.newBuilder();
                    if (j2 >= computeFreshnessLifetime) {
                        try {
                            newBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        } catch (NetonException unused) {
                        }
                    }
                    if (cacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
                        try {
                            newBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        } catch (NetonException unused2) {
                        }
                    }
                    return new CacheStrategy(null, newBuilder.build());
                }
            }
            if (this.etag != null) {
                str = "If-None-Match";
                str2 = this.etag;
            } else if (this.lastModified != null) {
                str = "If-Modified-Since";
                str2 = this.lastModifiedString;
            } else if (this.servedDate != null) {
                str = "If-Modified-Since";
                str2 = this.servedDateString;
            } else {
                return new CacheStrategy(this.request, null);
            }
            Headers.Builder newBuilder2 = this.request.headers().newBuilder();
            Internal.instance.addLenient(newBuilder2, str, str2);
            try {
                request = this.request.newBuilder().headers(newBuilder2.build()).build();
            } catch (NetonException e) {
                Request request2 = this.request;
                e.printStackTrace();
                request = request2;
            }
            return new CacheStrategy(request, this.cacheResponse);
        }

        private long computeFreshnessLifetime() {
            if (this.cacheResponse.cacheControl().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            if (this.expires != null) {
                long time = this.expires.getTime() - (this.servedDate != null ? this.servedDate.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.cacheResponse.request().url().query() != null) {
                return 0L;
            }
            long time2 = (this.servedDate != null ? this.servedDate.getTime() : this.sentRequestMillis) - this.lastModified.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private long cacheResponseAge() {
            long max = this.servedDate != null ? Math.max(0L, this.receivedResponseMillis - this.servedDate.getTime()) : 0L;
            if (this.ageSeconds != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(this.ageSeconds));
            }
            return max + (this.receivedResponseMillis - this.sentRequestMillis) + (this.nowMillis - this.receivedResponseMillis);
        }

        private boolean isFreshnessLifetimeHeuristic() {
            return this.cacheResponse.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        private static boolean hasConditions(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }
    }
}
