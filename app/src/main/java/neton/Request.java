package neton;

import com.coloros.neton.NetonException;
import java.net.URL;
import java.util.List;
import neton.Headers;
import neton.client.statistics.RequestStatistic;
import neton.internal.Util;
import neton.internal.http.HttpMethod;

/* loaded from: classes.dex */
public final class Request {
    final RequestBody body;
    private volatile CacheControl cacheControl;
    private final Headers headers;
    private final String method;
    private final RequestStatistic requestStatistic;
    private final int retryTimes;
    private final Object tag;
    private final Timeout timeout;
    private final HttpUrl url;

    /* synthetic */ Request(Builder builder, C24861 c24861) {
        this(builder);
    }

    private Request(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.tag = builder.tag != null ? builder.tag : this;
        this.timeout = builder.timeout;
        this.requestStatistic = builder.requestStatistic;
        this.retryTimes = builder.retryTimes;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final String method() {
        return this.method;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final String header(String str) {
        return this.headers.get(str);
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    public final RequestBody body() {
        return this.body;
    }

    public final Object tag() {
        return this.tag;
    }

    public final Builder newBuilder() {
        return new Builder();
    }

    public final Timeout timeout() {
        return this.timeout;
    }

    public final int retryTimes() {
        return this.retryTimes;
    }

    public final RequestStatistic requestStatistic() {
        return this.requestStatistic;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.cacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.parse(this.headers);
        this.cacheControl = parse;
        return parse;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", tag=");
        sb.append(this.tag != this ? this.tag : null);
        sb.append('}');
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private RequestStatistic requestStatistic;
        private int retryTimes;
        private Object tag;
        private Timeout timeout;
        private HttpUrl url;

        /* synthetic */ Builder(Request request, C24861 c24861) {
            this(request);
        }

        public Builder() {
            this.retryTimes = -1;
            this.method = HttpMethod.GET;
            this.headers = new Headers.Builder();
        }

        private Builder(Request request) {
            this.retryTimes = -1;
            this.url = request.url;
            this.method = request.method;
            this.body = request.body;
            this.tag = request.tag;
            this.headers = request.headers.newBuilder();
            this.timeout = request.timeout;
            this.requestStatistic = request.requestStatistic;
            this.retryTimes = request.retryTimes;
        }

        public Builder url(HttpUrl httpUrl) {
            if (httpUrl == null) {
                throw new NetonException(new NullPointerException("url == null"));
            }
            this.url = httpUrl;
            return this;
        }

        public Builder url(String str) {
            if (str == null) {
                throw new NetonException(new NullPointerException("url == null"));
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            HttpUrl parse = HttpUrl.parse(str);
            if (parse == null) {
                throw new NetonException(new IllegalArgumentException("unexpected url: ".concat(String.valueOf(str))));
            }
            return url(parse);
        }

        public Builder url(URL url) {
            if (url == null) {
                throw new NetonException(new NullPointerException("url == null"));
            }
            HttpUrl httpUrl = HttpUrl.get(url);
            if (httpUrl == null) {
                throw new NetonException(new IllegalArgumentException("unexpected url: ".concat(String.valueOf(url))));
            }
            return url(httpUrl);
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        public Builder headers(Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder cacheControl(CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.isEmpty() ? removeHeader("Cache-Control") : header("Cache-Control", cacheControl2);
        }

        public Builder get() {
            return method(HttpMethod.GET, null);
        }

        public Builder head() {
            return method(HttpMethod.HEAD, null);
        }

        public Builder post(RequestBody requestBody) {
            return method(HttpMethod.POST, requestBody);
        }

        public Builder delete(RequestBody requestBody) {
            return method(HttpMethod.DELETE, requestBody);
        }

        public Builder delete() {
            return delete(Util.EMPTY_REQUEST);
        }

        public Builder put(RequestBody requestBody) {
            return method(HttpMethod.PUT, requestBody);
        }

        public Builder patch(RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        public Builder retryTimes(int i) {
            this.retryTimes = i;
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            if (str == null) {
                throw new NetonException(new NullPointerException("method == null"));
            }
            if (str.length() == 0) {
                throw new NetonException(new IllegalArgumentException("method.length() == 0"));
            }
            if (requestBody != null && !HttpMethod.permitsRequestBody(str)) {
                throw new NetonException(new IllegalArgumentException("method " + str + " must not have a request body."));
            }
            if (requestBody == null && HttpMethod.requiresRequestBody(str)) {
                throw new NetonException(new IllegalArgumentException("method " + str + " must have a request body."));
            }
            this.method = str;
            this.body = requestBody;
            return this;
        }

        public Builder tag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder timeout(Timeout timeout) {
            if (timeout != null) {
                this.timeout = timeout;
            }
            return this;
        }

        public Builder requestStatistic(RequestStatistic requestStatistic) {
            if (requestStatistic != null) {
                this.requestStatistic = requestStatistic;
            }
            return this;
        }

        public Request build() {
            if (this.url == null) {
                throw new NetonException(new IllegalStateException("url == null"));
            }
            return new Request(this);
        }
    }
}
