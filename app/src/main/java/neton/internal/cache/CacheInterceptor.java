package neton.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import neton.Headers;
import neton.Interceptor;
import neton.Protocol;
import neton.Request;
import neton.Response;
import neton.client.Utils.ResponseCode;
import neton.internal.Internal;
import neton.internal.Util;
import neton.internal.cache.CacheStrategy;
import neton.internal.http.HttpHeaders;
import neton.internal.http.HttpMethod;
import neton.internal.http.RealResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* loaded from: classes.dex */
public final class CacheInterceptor implements Interceptor {
    final InternalCache cache;

    public CacheInterceptor(InternalCache internalCache) {
        this.cache = internalCache;
    }

    @Override // neton.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Response response = this.cache != null ? this.cache.get(chain.request()) : null;
        CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).get();
        Request request = cacheStrategy.networkRequest;
        Response response2 = cacheStrategy.cacheResponse;
        if (this.cache != null) {
            this.cache.trackResponse(cacheStrategy);
        }
        if (response != null && response2 == null) {
            Util.closeQuietly(response.body());
        }
        if (request == null && response2 == null) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(ResponseCode.CODE_5XX_GATEWAY_TIMEOUT).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (request == null) {
            return response2.newBuilder().cacheResponse(stripBody(response2)).build();
        }
        try {
            Response proceed = chain.proceed(request);
            if (proceed == null && response != null) {
            }
            if (response2 != null) {
                if (proceed.code() == 304) {
                    Response build = response2.newBuilder().headers(combine(response2.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
                    proceed.body().close();
                    this.cache.trackConditionalCacheHit();
                    this.cache.update(response2, build);
                    return build;
                }
                Util.closeQuietly(response2.body());
            }
            Response build2 = proceed.newBuilder().cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.hasBody(build2) && CacheStrategy.isCacheable(build2, request)) {
                    return cacheWritingResponse(this.cache.put(build2), build2);
                }
                if (HttpMethod.invalidatesCache(request.method())) {
                    try {
                        this.cache.remove(request);
                    } catch (IOException unused) {
                    }
                }
            }
            return build2;
        } finally {
            if (response != null) {
                Util.closeQuietly(response.body());
            }
        }
    }

    private static Response stripBody(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body(null).build();
    }

    private Response cacheWritingResponse(CacheRequest cacheRequest, Response response) {
        Sink body;
        return (cacheRequest == null || (body = cacheRequest.body()) == null) ? response : response.newBuilder().body(new RealResponseBody(response.headers(), Okio.buffer(new Source() { // from class: neton.internal.cache.CacheInterceptor.1
            boolean cacheRequestClosed;
            final /* synthetic */ BufferedSink val$cacheBody;
            final /* synthetic */ CacheRequest val$cacheRequest;
            final /* synthetic */ BufferedSource val$source;

            C25051(BufferedSource bufferedSource, CacheRequest cacheRequest2, BufferedSink bufferedSink) {
                r2 = bufferedSource;
                r3 = cacheRequest2;
                r4 = bufferedSink;
            }

            @Override // okio.Source
            public long read(Buffer buffer, long j) {
                try {
                    long read = r2.read(buffer, j);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            r4.close();
                        }
                        return -1L;
                    }
                    buffer.copyTo(r4.buffer(), buffer.size() - read, read);
                    r4.emitCompleteSegments();
                    return read;
                } catch (IOException e) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        r3.abort();
                    }
                    throw e;
                }
            }

            @Override // okio.Source
            public Timeout timeout() {
                return r2.timeout();
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    r3.abort();
                }
                r2.close();
            }
        }))).build();
    }

    /* renamed from: neton.internal.cache.CacheInterceptor$1 */
    /* loaded from: classes.dex */
    public class C25051 implements Source {
        boolean cacheRequestClosed;
        final /* synthetic */ BufferedSink val$cacheBody;
        final /* synthetic */ CacheRequest val$cacheRequest;
        final /* synthetic */ BufferedSource val$source;

        C25051(BufferedSource bufferedSource, CacheRequest cacheRequest2, BufferedSink bufferedSink) {
            r2 = bufferedSource;
            r3 = cacheRequest2;
            r4 = bufferedSink;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            try {
                long read = r2.read(buffer, j);
                if (read == -1) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        r4.close();
                    }
                    return -1L;
                }
                buffer.copyTo(r4.buffer(), buffer.size() - read, read);
                r4.emitCompleteSegments();
                return read;
            } catch (IOException e) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    r3.abort();
                }
                throw e;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return r2.timeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                r3.abort();
            }
            r2.close();
        }
    }

    private static Headers combine(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if ((!"Warning".equalsIgnoreCase(name) || !value.startsWith("1")) && (!isEndToEnd(name) || headers2.get(name) == null)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String name2 = headers2.name(i2);
            if (!"Content-Length".equalsIgnoreCase(name2) && isEndToEnd(name2)) {
                Internal.instance.addLenient(builder, name2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    static boolean isEndToEnd(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
