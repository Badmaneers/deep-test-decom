package neton.internal.http;

import com.coloros.neton.NetonException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import neton.Call;
import neton.Connection;
import neton.EventListener;
import neton.Interceptor;
import neton.Request;
import neton.Response;
import neton.internal.Util;
import neton.internal.connection.RealConnection;
import neton.internal.connection.StreamAllocation;

/* loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private final Call call;
    private int calls;
    private final int connectTimeout;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final HttpCodec httpCodec;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeout;
    private final Request request;
    private final StreamAllocation streamAllocation;
    private final int writeTimeout;

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection, int i, Request request, Call call, EventListener eventListener, int i2, int i3, int i4) {
        this.interceptors = list;
        this.connection = realConnection;
        this.streamAllocation = streamAllocation;
        this.httpCodec = httpCodec;
        this.index = i;
        this.request = request;
        this.call = call;
        this.eventListener = eventListener;
        this.connectTimeout = i2;
        this.readTimeout = i3;
        this.writeTimeout = i4;
    }

    @Override // neton.Interceptor.Chain
    public final Connection connection() {
        return this.connection;
    }

    @Override // neton.Interceptor.Chain
    public final int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    @Override // neton.Interceptor.Chain
    public final Interceptor.Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, Util.checkDuration("timeout", i, timeUnit), this.readTimeout, this.writeTimeout);
    }

    @Override // neton.Interceptor.Chain
    public final int readTimeoutMillis() {
        return this.readTimeout;
    }

    @Override // neton.Interceptor.Chain
    public final Interceptor.Chain withReadTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, this.connectTimeout, Util.checkDuration("timeout", i, timeUnit), this.writeTimeout);
    }

    @Override // neton.Interceptor.Chain
    public final int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    @Override // neton.Interceptor.Chain
    public final Interceptor.Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, this.connectTimeout, this.readTimeout, Util.checkDuration("timeout", i, timeUnit));
    }

    public final StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }

    public final HttpCodec httpStream() {
        return this.httpCodec;
    }

    public final Call call() {
        return this.call;
    }

    public final EventListener eventListener() {
        return this.eventListener;
    }

    @Override // neton.Interceptor.Chain
    public final Request request() {
        return this.request;
    }

    @Override // neton.Interceptor.Chain
    public final Response proceed(Request request) {
        return proceed(request, this.streamAllocation, this.httpCodec, this.connection);
    }

    public final Response proceed(Request request, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection) {
        if (this.index >= this.interceptors.size()) {
            throw new AssertionError();
        }
        this.calls++;
        if (this.httpCodec != null && !this.connection.supportsUrl(request.url())) {
            throw new NetonException(new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port"));
        }
        if (this.httpCodec != null && this.calls > 1) {
            throw new NetonException(new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once"));
        }
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.interceptors, streamAllocation, httpCodec, realConnection, this.index + 1, request, this.call, this.eventListener, this.connectTimeout, this.readTimeout, this.writeTimeout);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response intercept = interceptor.intercept(realInterceptorChain);
        if (httpCodec != null && this.index + 1 < this.interceptors.size() && realInterceptorChain.calls != 1) {
            throw new NetonException(new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once"));
        }
        if (intercept == null) {
            throw new NetonException(new NullPointerException("interceptor " + interceptor + " returned null"));
        }
        if (intercept.body() != null) {
            return intercept;
        }
        throw new NetonException(new IllegalStateException("interceptor " + interceptor + " returned a response with no body"));
    }
}
