package neton;

import com.coloros.neton.BuildConfig;
import com.coloros.neton.NetonException;
import java.io.IOException;
import java.util.ArrayList;
import neton.internal.NamedRunnable;
import neton.internal.cache.CacheInterceptor;
import neton.internal.connection.ConnectInterceptor;
import neton.internal.connection.StreamAllocation;
import neton.internal.http.BridgeInterceptor;
import neton.internal.http.CallServerInterceptor;
import neton.internal.http.RealInterceptorChain;
import neton.internal.http.RetryAndFollowUpInterceptor;
import neton.internal.platform.Platform;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RealCall implements Call {
    final OkHttpClient client;
    private EventListener eventListener;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        RealCall realCall = new RealCall(okHttpClient, request, z);
        realCall.eventListener = okHttpClient.eventListenerFactory().create(realCall);
        return realCall;
    }

    @Override // neton.Call
    public final Request request() {
        return this.originalRequest;
    }

    @Override // neton.Call
    public final Response execute() {
        synchronized (this) {
            if (this.executed) {
                throw new NetonException(new IllegalStateException("Already Executed"));
            }
            this.executed = true;
        }
        captureCallStackTrace();
        this.eventListener.fetchStart(this);
        try {
            try {
                if (this.originalRequest.requestStatistic() != null) {
                    this.originalRequest.requestStatistic().setNetworkRequestStartTime(System.currentTimeMillis());
                }
                this.client.dispatcher().executed(this);
                Response responseWithInterceptorChain = getResponseWithInterceptorChain();
                if (responseWithInterceptorChain == null) {
                    throw new IOException("Canceled");
                }
                this.eventListener.fetchEnd(this, null);
                return responseWithInterceptorChain;
            } catch (IOException e) {
                this.eventListener.fetchEnd(this, e);
                throw e;
            }
        } finally {
            this.client.dispatcher().finished(this);
        }
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    @Override // neton.Call
    public final void enqueue(Callback callback) {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        captureCallStackTrace();
        this.eventListener.fetchStart(this);
        this.client.dispatcher().enqueue(new AsyncCall(callback));
    }

    @Override // neton.Call
    public final void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    @Override // neton.Call
    public final synchronized boolean isExecuted() {
        return this.executed;
    }

    @Override // neton.Call
    public final boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    @Override // neton.Call
    public final RealCall clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class AsyncCall extends NamedRunnable {
        private final Callback responseCallback;

        AsyncCall(Callback callback) {
            super("OkHttp %s", RealCall.this.redactedUrl());
            this.responseCallback = callback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String host() {
            return RealCall.this.originalRequest.url().host();
        }

        final Request request() {
            return RealCall.this.originalRequest;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final RealCall get() {
            return RealCall.this;
        }

        @Override // neton.internal.NamedRunnable
        protected final void execute() {
            Response responseWithInterceptorChain;
            boolean z = false;
            try {
                try {
                    if (RealCall.this.originalRequest.requestStatistic() != null) {
                        RealCall.this.originalRequest.requestStatistic().setNetworkRequestStartTime(System.currentTimeMillis());
                    }
                    responseWithInterceptorChain = RealCall.this.getResponseWithInterceptorChain();
                } finally {
                    RealCall.this.client.dispatcher().finished(this);
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                if (RealCall.this.retryAndFollowUpInterceptor.isCanceled()) {
                    this.responseCallback.onFailure(RealCall.this, new IOException("Canceled"));
                } else {
                    this.responseCallback.onResponse(RealCall.this, responseWithInterceptorChain);
                }
                RealCall.this.eventListener.fetchEnd(RealCall.this, null);
            } catch (IOException e2) {
                z = true;
                e = e2;
                if (!z) {
                    RealCall.this.eventListener.fetchEnd(RealCall.this, e);
                    this.responseCallback.onFailure(RealCall.this, e);
                } else {
                    Platform.get().log(4, "Callback failure for " + RealCall.this.toLoggableString(), e);
                }
            }
        }
    }

    final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : BuildConfig.FLAVOR);
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl());
        return sb.toString();
    }

    final String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    final Response getResponseWithInterceptorChain() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        Timeout timeout = this.originalRequest.timeout() != null ? this.originalRequest.timeout() : this.client.timeout();
        return new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, timeout.getConnectTimeout(), timeout.getReadTimeout(), timeout.getWriteTimeout()).proceed(this.originalRequest);
    }
}
