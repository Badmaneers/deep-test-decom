package neton.internal.http;

import com.coloros.neton.NetonException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import neton.Address;
import neton.Call;
import neton.CertificatePinner;
import neton.EventListener;
import neton.HttpUrl;
import neton.Interceptor;
import neton.OkHttpClient;
import neton.Request;
import neton.Response;
import neton.Route;
import neton.client.Utils.ResponseCode;
import neton.client.statistics.RequestStatistic;
import neton.internal.Util;
import neton.internal.connection.RealConnection;
import neton.internal.connection.RouteException;
import neton.internal.connection.StreamAllocation;
import neton.internal.http2.ConnectionShutdownException;

/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private final boolean forWebSocket;
    private StreamAllocation streamAllocation;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient, boolean z) {
        this.client = okHttpClient;
        this.forWebSocket = z;
    }

    public final void cancel() {
        this.canceled = true;
        StreamAllocation streamAllocation = this.streamAllocation;
        if (streamAllocation != null) {
            streamAllocation.cancel();
        }
    }

    public final boolean isCanceled() {
        return this.canceled;
    }

    public final void setCallStackTrace(Object obj) {
        this.callStackTrace = obj;
    }

    public final StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }

    @Override // neton.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Response proceed;
        Request followUpRequest;
        Request request = chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Call call = realInterceptorChain.call();
        EventListener eventListener = realInterceptorChain.eventListener();
        this.streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(request.requestStatistic(), request.url()), call, eventListener, this.callStackTrace);
        Request request2 = request;
        int i = 0;
        Response response = null;
        while (!this.canceled) {
            try {
                try {
                    proceed = realInterceptorChain.proceed(request2, this.streamAllocation, null, null);
                    if (response != null) {
                        proceed = proceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                    }
                    followUpRequest = followUpRequest(proceed);
                } catch (IOException e) {
                    if (!recover(e, !(e instanceof ConnectionShutdownException), request2)) {
                        throw e;
                    }
                } catch (RouteException e2) {
                    if (!recover(e2.getLastConnectException(), false, request2)) {
                        throw e2.getLastConnectException();
                    }
                }
                if (followUpRequest == null) {
                    if (!this.forWebSocket) {
                        this.streamAllocation.release();
                    }
                    return proceed;
                }
                Util.closeQuietly(proceed.body());
                int i2 = i + 1;
                if (i2 > 20) {
                    this.streamAllocation.release();
                    throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i2)));
                }
                if (followUpRequest.body() instanceof UnrepeatableRequestBody) {
                    this.streamAllocation.release();
                    throw new HttpRetryException("Cannot retry streamed HTTP body", proceed.code());
                }
                if (!sameConnection(proceed, followUpRequest.url())) {
                    this.streamAllocation.release();
                    this.streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(request2.requestStatistic(), followUpRequest.url()), call, eventListener, this.callStackTrace);
                } else if (this.streamAllocation.codec() != null) {
                    throw new NetonException(new IllegalStateException("Closing the body of " + proceed + " didn't close its backing stream. Bad interceptor?"));
                }
                response = proceed;
                request2 = followUpRequest;
                i = i2;
            } catch (Throwable th) {
                this.streamAllocation.streamFailed(null);
                this.streamAllocation.release();
                throw th;
            }
        }
        this.streamAllocation.release();
        throw new IOException("Canceled");
    }

    private Address createAddress(RequestStatistic requestStatistic, HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(requestStatistic, httpUrl.m7842ip(), httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private boolean recover(IOException iOException, boolean z, Request request) {
        this.streamAllocation.streamFailed(iOException);
        if (this.client.retryOnConnectionFailure()) {
            return !(z && (request.body() instanceof UnrepeatableRequestBody)) && isRecoverable(iOException, z) && this.streamAllocation.hasMoreRoutes();
        }
        return false;
    }

    private boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private Request followUpRequest(Response response) {
        String header;
        HttpUrl resolve;
        Proxy proxy;
        if (response == null) {
            throw new NetonException(new IllegalStateException());
        }
        RealConnection connection = this.streamAllocation.connection();
        Route route = connection != null ? connection.route() : null;
        int code = response.code();
        String method = response.request().method();
        switch (code) {
            case ResponseCode.CODE_3XX_MULTIPLE_CHOICES /* 300 */:
            case ResponseCode.CODE_3XX_MOVED_PERMANENTLY /* 301 */:
            case ResponseCode.CODE_3XX_FOUND /* 302 */:
            case ResponseCode.CODE_3XX_SEE_OTHER /* 303 */:
                break;
            case 307:
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                if (!method.equals(HttpMethod.GET) && !method.equals(HttpMethod.HEAD)) {
                    return null;
                }
                break;
            case ResponseCode.CODE_4XX_UNAUTHORIZED /* 401 */:
                return this.client.authenticator().authenticate(route, response);
            case ResponseCode.CODE_4XX_PROXY_AUTHENTICATION_REQUIRED /* 407 */:
                if (route != null) {
                    proxy = route.proxy();
                } else {
                    proxy = this.client.proxy();
                }
                if (proxy.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.client.proxyAuthenticator().authenticate(route, response);
            case ResponseCode.CODE_4XX_REQUEST_TIMEOUT /* 408 */:
                if (!this.client.retryOnConnectionFailure() || (response.request().body() instanceof UnrepeatableRequestBody)) {
                    return null;
                }
                if (response.priorResponse() == null || response.priorResponse().code() != 408) {
                    return response.request();
                }
                return null;
            default:
                return null;
        }
        if (!this.client.followRedirects() || (header = response.header("Location")) == null || (resolve = response.request().url().resolve(header)) == null) {
            return null;
        }
        if (!resolve.scheme().equals(response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            boolean redirectsWithBody = HttpMethod.redirectsWithBody(method);
            if (HttpMethod.redirectsToGet(method)) {
                newBuilder.method(HttpMethod.GET, null);
            } else {
                newBuilder.method(method, redirectsWithBody ? response.request().body() : null);
            }
            if (!redirectsWithBody) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!sameConnection(response, resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private boolean sameConnection(Response response, HttpUrl httpUrl) {
        HttpUrl url = response.request().url();
        return url.host().equals(httpUrl.host()) && url.port() == httpUrl.port() && url.scheme().equals(httpUrl.scheme());
    }
}
