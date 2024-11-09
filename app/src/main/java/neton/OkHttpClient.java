package neton;

import com.coloros.neton.NetonException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import neton.Call;
import neton.EventListener;
import neton.Headers;
import neton.Response;
import neton.WebSocket;
import neton.internal.Internal;
import neton.internal.Util;
import neton.internal.cache.InternalCache;
import neton.internal.connection.RealConnection;
import neton.internal.connection.RouteDatabase;
import neton.internal.connection.StreamAllocation;
import neton.internal.platform.Platform;
import neton.internal.tls.CertificateChainCleaner;
import neton.internal.tls.OkHostnameVerifier;
import neton.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    final Authenticator authenticator;
    final Cache cache;
    final CertificateChainCleaner certificateChainCleaner;
    final CertificatePinner certificatePinner;
    final int connectTimeout;
    final ConnectionPool connectionPool;
    final List<ConnectionSpec> connectionSpecs;
    final CookieJar cookieJar;
    final Dispatcher dispatcher;
    final Dns dns;
    final EventListener.Factory eventListenerFactory;
    final boolean followRedirects;
    final boolean followSslRedirects;
    final HostnameVerifier hostnameVerifier;
    final List<Interceptor> interceptors;
    final InternalCache internalCache;
    final List<Interceptor> networkInterceptors;
    final int pingInterval;
    final List<Protocol> protocols;
    final Proxy proxy;
    final Authenticator proxyAuthenticator;
    final ProxySelector proxySelector;
    final int readTimeout;
    final boolean retryOnConnectionFailure;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;
    final Timeout timeout;
    final int writeTimeout;
    static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableList(Protocol.HTTP_2, Protocol.HTTP_1_1);
    static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableList(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    static {
        Internal.instance = new Internal() { // from class: neton.OkHttpClient.1
            C24851() {
            }

            @Override // neton.internal.Internal
            public final void addLenient(Headers.Builder builder, String str) {
                builder.addLenient(str);
            }

            @Override // neton.internal.Internal
            public final void addLenient(Headers.Builder builder, String str, String str2) {
                builder.addLenient(str, str2);
            }

            @Override // neton.internal.Internal
            public final void setCache(Builder builder, InternalCache internalCache) {
                builder.setInternalCache(internalCache);
            }

            @Override // neton.internal.Internal
            public final boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
                return connectionPool.connectionBecameIdle(realConnection);
            }

            @Override // neton.internal.Internal
            public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
                return connectionPool.get(address, streamAllocation, route);
            }

            @Override // neton.internal.Internal
            public final boolean equalsNonHost(Address address, Address address2) {
                return address.equalsNonHost(address2);
            }

            @Override // neton.internal.Internal
            public final Socket deduplicate(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
                return connectionPool.deduplicate(address, streamAllocation);
            }

            @Override // neton.internal.Internal
            public final void put(ConnectionPool connectionPool, RealConnection realConnection) {
                connectionPool.put(realConnection);
            }

            @Override // neton.internal.Internal
            public final RouteDatabase routeDatabase(ConnectionPool connectionPool) {
                return connectionPool.routeDatabase;
            }

            @Override // neton.internal.Internal
            public final int code(Response.Builder builder) {
                return builder.code;
            }

            @Override // neton.internal.Internal
            public final void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
                connectionSpec.apply(sSLSocket, z);
            }

            @Override // neton.internal.Internal
            public final HttpUrl getHttpUrlChecked(String str) {
                return HttpUrl.getChecked(str);
            }

            @Override // neton.internal.Internal
            public final StreamAllocation streamAllocation(Call call) {
                return ((RealCall) call).streamAllocation();
            }

            @Override // neton.internal.Internal
            public final Call newWebSocketCall(OkHttpClient okHttpClient, Request request) {
                return RealCall.newRealCall(okHttpClient, request, true);
            }
        };
    }

    /* renamed from: neton.OkHttpClient$1 */
    /* loaded from: classes.dex */
    final class C24851 extends Internal {
        C24851() {
        }

        @Override // neton.internal.Internal
        public final void addLenient(Headers.Builder builder, String str) {
            builder.addLenient(str);
        }

        @Override // neton.internal.Internal
        public final void addLenient(Headers.Builder builder, String str, String str2) {
            builder.addLenient(str, str2);
        }

        @Override // neton.internal.Internal
        public final void setCache(Builder builder, InternalCache internalCache) {
            builder.setInternalCache(internalCache);
        }

        @Override // neton.internal.Internal
        public final boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
            return connectionPool.connectionBecameIdle(realConnection);
        }

        @Override // neton.internal.Internal
        public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
            return connectionPool.get(address, streamAllocation, route);
        }

        @Override // neton.internal.Internal
        public final boolean equalsNonHost(Address address, Address address2) {
            return address.equalsNonHost(address2);
        }

        @Override // neton.internal.Internal
        public final Socket deduplicate(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
            return connectionPool.deduplicate(address, streamAllocation);
        }

        @Override // neton.internal.Internal
        public final void put(ConnectionPool connectionPool, RealConnection realConnection) {
            connectionPool.put(realConnection);
        }

        @Override // neton.internal.Internal
        public final RouteDatabase routeDatabase(ConnectionPool connectionPool) {
            return connectionPool.routeDatabase;
        }

        @Override // neton.internal.Internal
        public final int code(Response.Builder builder) {
            return builder.code;
        }

        @Override // neton.internal.Internal
        public final void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
            connectionSpec.apply(sSLSocket, z);
        }

        @Override // neton.internal.Internal
        public final HttpUrl getHttpUrlChecked(String str) {
            return HttpUrl.getChecked(str);
        }

        @Override // neton.internal.Internal
        public final StreamAllocation streamAllocation(Call call) {
            return ((RealCall) call).streamAllocation();
        }

        @Override // neton.internal.Internal
        public final Call newWebSocketCall(OkHttpClient okHttpClient, Request request) {
            return RealCall.newRealCall(okHttpClient, request, true);
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }

    OkHttpClient(Builder builder) {
        boolean z;
        this.dispatcher = builder.dispatcher;
        this.proxy = builder.proxy;
        this.protocols = builder.protocols;
        this.connectionSpecs = builder.connectionSpecs;
        this.interceptors = Util.immutableList(builder.interceptors);
        this.networkInterceptors = Util.immutableList(builder.networkInterceptors);
        this.eventListenerFactory = builder.eventListenerFactory;
        this.proxySelector = builder.proxySelector;
        this.cookieJar = builder.cookieJar;
        this.cache = builder.cache;
        this.internalCache = builder.internalCache;
        this.socketFactory = builder.socketFactory;
        Iterator<ConnectionSpec> it = this.connectionSpecs.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                z = (z || it.next().isTls()) ? true : z;
            }
        }
        if (builder.sslSocketFactory != null || !z) {
            this.sslSocketFactory = builder.sslSocketFactory;
            this.certificateChainCleaner = builder.certificateChainCleaner;
        } else {
            X509TrustManager systemDefaultTrustManager = systemDefaultTrustManager();
            this.sslSocketFactory = systemDefaultSslSocketFactory(systemDefaultTrustManager);
            this.certificateChainCleaner = CertificateChainCleaner.get(systemDefaultTrustManager);
        }
        this.hostnameVerifier = builder.hostnameVerifier;
        this.certificatePinner = builder.certificatePinner.withCertificateChainCleaner(this.certificateChainCleaner);
        this.proxyAuthenticator = builder.proxyAuthenticator;
        this.authenticator = builder.authenticator;
        this.connectionPool = builder.connectionPool;
        this.dns = builder.dns;
        this.followSslRedirects = builder.followSslRedirects;
        this.followRedirects = builder.followRedirects;
        this.retryOnConnectionFailure = builder.retryOnConnectionFailure;
        this.connectTimeout = builder.connectTimeout;
        this.readTimeout = builder.readTimeout;
        this.writeTimeout = builder.writeTimeout;
        this.pingInterval = builder.pingInterval;
        this.timeout = builder.timeout;
    }

    private X509TrustManager systemDefaultTrustManager() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new NetonException(new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers)));
            }
            return (X509TrustManager) trustManagers[0];
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private SSLSocketFactory systemDefaultSslSocketFactory(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    public int readTimeoutMillis() {
        return this.readTimeout;
    }

    public int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    public int pingIntervalMillis() {
        return this.pingInterval;
    }

    public Timeout timeout() {
        return this.timeout;
    }

    public Proxy proxy() {
        return this.proxy;
    }

    public ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public CookieJar cookieJar() {
        return this.cookieJar;
    }

    public Cache cache() {
        return this.cache;
    }

    public InternalCache internalCache() {
        return this.cache != null ? this.cache.internalCache : this.internalCache;
    }

    public Dns dns() {
        return this.dns;
    }

    public SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public Authenticator authenticator() {
        return this.authenticator;
    }

    public Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public boolean followRedirects() {
        return this.followRedirects;
    }

    public boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public List<Protocol> protocols() {
        return this.protocols;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @Override // neton.Call.Factory
    public Call newCall(Request request) {
        return RealCall.newRealCall(this, request, false);
    }

    @Override // neton.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        RealWebSocket realWebSocket = new RealWebSocket(request, webSocketListener, new Random());
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    /* loaded from: classes.dex */
    public final class Builder {
        Authenticator authenticator;
        Cache cache;
        CertificateChainCleaner certificateChainCleaner;
        CertificatePinner certificatePinner;
        int connectTimeout;
        ConnectionPool connectionPool;
        List<ConnectionSpec> connectionSpecs;
        CookieJar cookieJar;
        Dispatcher dispatcher;
        Dns dns;
        EventListener.Factory eventListenerFactory;
        boolean followRedirects;
        boolean followSslRedirects;
        HostnameVerifier hostnameVerifier;
        final List<Interceptor> interceptors;
        InternalCache internalCache;
        final List<Interceptor> networkInterceptors;
        int pingInterval;
        List<Protocol> protocols;
        Proxy proxy;
        Authenticator proxyAuthenticator;
        ProxySelector proxySelector;
        int readTimeout;
        boolean retryOnConnectionFailure;
        SocketFactory socketFactory;
        SSLSocketFactory sslSocketFactory;
        Timeout timeout;
        int writeTimeout;

        public Builder() {
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.dispatcher = new Dispatcher();
            this.protocols = OkHttpClient.DEFAULT_PROTOCOLS;
            this.connectionSpecs = OkHttpClient.DEFAULT_CONNECTION_SPECS;
            this.eventListenerFactory = EventListener.factory(EventListener.NONE);
            this.proxySelector = ProxySelector.getDefault();
            this.cookieJar = CookieJar.NO_COOKIES;
            this.socketFactory = SocketFactory.getDefault();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.proxyAuthenticator = Authenticator.NONE;
            this.authenticator = Authenticator.NONE;
            try {
                this.connectionPool = new ConnectionPool();
            } catch (NetonException unused) {
            }
            this.dns = Dns.SYSTEM;
            this.followSslRedirects = true;
            this.followRedirects = true;
            this.retryOnConnectionFailure = true;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.pingInterval = 0;
            this.timeout = new Timeout(this.connectTimeout, this.readTimeout, this.writeTimeout);
        }

        Builder(OkHttpClient okHttpClient) {
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.dispatcher = okHttpClient.dispatcher;
            this.proxy = okHttpClient.proxy;
            this.protocols = okHttpClient.protocols;
            this.connectionSpecs = okHttpClient.connectionSpecs;
            this.interceptors.addAll(okHttpClient.interceptors);
            this.networkInterceptors.addAll(okHttpClient.networkInterceptors);
            this.eventListenerFactory = okHttpClient.eventListenerFactory;
            this.proxySelector = okHttpClient.proxySelector;
            this.cookieJar = okHttpClient.cookieJar;
            this.internalCache = okHttpClient.internalCache;
            this.cache = okHttpClient.cache;
            this.socketFactory = okHttpClient.socketFactory;
            this.sslSocketFactory = okHttpClient.sslSocketFactory;
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner;
            this.hostnameVerifier = okHttpClient.hostnameVerifier;
            this.certificatePinner = okHttpClient.certificatePinner;
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator;
            this.authenticator = okHttpClient.authenticator;
            this.connectionPool = okHttpClient.connectionPool;
            this.dns = okHttpClient.dns;
            this.followSslRedirects = okHttpClient.followSslRedirects;
            this.followRedirects = okHttpClient.followRedirects;
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure;
            this.connectTimeout = okHttpClient.connectTimeout;
            this.readTimeout = okHttpClient.readTimeout;
            this.writeTimeout = okHttpClient.writeTimeout;
            this.pingInterval = okHttpClient.pingInterval;
            this.timeout = okHttpClient.timeout;
        }

        public final Builder connectTimeout(long j, TimeUnit timeUnit) {
            this.connectTimeout = Util.checkDuration("timeout", j, timeUnit);
            this.timeout = new Timeout(this.connectTimeout, this.readTimeout, this.writeTimeout);
            return this;
        }

        public final Builder readTimeout(long j, TimeUnit timeUnit) {
            this.readTimeout = Util.checkDuration("timeout", j, timeUnit);
            this.timeout = new Timeout(this.connectTimeout, this.readTimeout, this.writeTimeout);
            return this;
        }

        public final Builder writeTimeout(long j, TimeUnit timeUnit) {
            this.writeTimeout = Util.checkDuration("timeout", j, timeUnit);
            this.timeout = new Timeout(this.connectTimeout, this.readTimeout, this.writeTimeout);
            return this;
        }

        public final Builder pingInterval(long j, TimeUnit timeUnit) {
            this.pingInterval = Util.checkDuration("interval", j, timeUnit);
            return this;
        }

        public final Builder timeout(Timeout timeout) {
            this.timeout = timeout;
            this.connectTimeout = timeout.getConnectTimeout();
            this.readTimeout = timeout.getReadTimeout();
            this.writeTimeout = timeout.getWriteTimeout();
            return this;
        }

        public final Builder proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            if (cookieJar == null) {
                throw new NetonException(new NullPointerException("cookieJar == null"));
            }
            this.cookieJar = cookieJar;
            return this;
        }

        final void setInternalCache(InternalCache internalCache) {
            this.internalCache = internalCache;
            this.cache = null;
        }

        public final Builder cache(Cache cache) {
            this.cache = cache;
            this.internalCache = null;
            return this;
        }

        public final Builder dns(Dns dns) {
            if (dns == null) {
                throw new NetonException(new NullPointerException("dns == null"));
            }
            this.dns = dns;
            return this;
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new NetonException(new NullPointerException("socketFactory == null"));
            }
            this.socketFactory = socketFactory;
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                throw new NetonException(new NullPointerException("sslSocketFactory == null"));
            }
            X509TrustManager trustManager = Platform.get().trustManager(sSLSocketFactory);
            if (trustManager == null) {
                throw new NetonException(new IllegalStateException("Unable to extract the trust manager on " + Platform.get() + ", sslSocketFactory is " + sSLSocketFactory.getClass()));
            }
            this.sslSocketFactory = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.get(trustManager);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NetonException(new NullPointerException("sslSocketFactory == null"));
            }
            if (x509TrustManager == null) {
                throw new NetonException(new NullPointerException("trustManager == null"));
            }
            this.sslSocketFactory = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.get(x509TrustManager);
            return this;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NetonException(new NullPointerException("hostnameVerifier == null"));
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            if (certificatePinner == null) {
                throw new NetonException(new NullPointerException("certificatePinner == null"));
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final Builder authenticator(Authenticator authenticator) {
            if (authenticator == null) {
                throw new NetonException(new NullPointerException("authenticator == null"));
            }
            this.authenticator = authenticator;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator) {
            if (authenticator == null) {
                throw new NetonException(new NullPointerException("proxyAuthenticator == null"));
            }
            this.proxyAuthenticator = authenticator;
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            if (connectionPool == null) {
                throw new NetonException(new NullPointerException("connectionPool == null"));
            }
            this.connectionPool = connectionPool;
            return this;
        }

        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            if (dispatcher == null) {
                throw new NetonException(new IllegalArgumentException("dispatcher == null"));
            }
            this.dispatcher = dispatcher;
            return this;
        }

        public final Builder protocols(List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.contains(Protocol.HTTP_1_1)) {
                throw new NetonException(new IllegalArgumentException("protocols doesn't contain http/1.1: ".concat(String.valueOf(arrayList))));
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                throw new NetonException(new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(arrayList))));
            }
            if (arrayList.contains(null)) {
                throw new NetonException(new IllegalArgumentException("protocols must not contain null"));
            }
            arrayList.remove(Protocol.SPDY_3);
            this.protocols = Collections.unmodifiableList(arrayList);
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            this.connectionSpecs = Util.immutableList(list);
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            if (eventListener == null) {
                throw new NetonException(new NullPointerException("eventListener == null"));
            }
            this.eventListenerFactory = EventListener.factory(eventListener);
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            if (factory == null) {
                throw new NetonException(new NullPointerException("eventListenerFactory == null"));
            }
            this.eventListenerFactory = factory;
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }
    }
}
