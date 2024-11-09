package neton.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import neton.Address;
import neton.Call;
import neton.CertificatePinner;
import neton.Connection;
import neton.ConnectionPool;
import neton.ConnectionSpec;
import neton.EventListener;
import neton.Handshake;
import neton.HttpUrl;
import neton.Interceptor;
import neton.OkHttpClient;
import neton.Protocol;
import neton.Request;
import neton.Response;
import neton.Route;
import neton.client.Utils.LogUtil;
import neton.internal.Internal;
import neton.internal.Util;
import neton.internal.Version;
import neton.internal.http.HttpCodec;
import neton.internal.http.HttpHeaders;
import neton.internal.http1.Http1Codec;
import neton.internal.http2.ErrorCode;
import neton.internal.http2.Http2Codec;
import neton.internal.http2.Http2Connection;
import neton.internal.http2.Http2Stream;
import neton.internal.platform.Platform;
import neton.internal.tls.OkHostnameVerifier;
import neton.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    private static final String ECDHE_ECDSA_128 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256";
    private static final String ECDHE_RSA_128 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256";
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final ConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    public int successCount;
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    public long idleAtNanos = Long.MAX_VALUE;

    public RealConnection(ConnectionPool connectionPool, Route route) {
        this.connectionPool = connectionPool;
        this.route = route;
    }

    public static RealConnection testConnection(ConnectionPool connectionPool, Route route, Socket socket, long j) {
        RealConnection realConnection = new RealConnection(connectionPool, route);
        realConnection.socket = socket;
        realConnection.idleAtNanos = j;
        return realConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void connect(int r16, int r17, int r18, boolean r19, neton.Call r20, neton.EventListener r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: neton.internal.connection.RealConnection.connect(int, int, int, boolean, neton.Call, neton.EventListener):void");
    }

    private void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        for (int i4 = 0; i4 < 21; i4++) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest == null) {
                return;
            }
            Util.closeQuietly(this.rawSocket);
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null, null);
        }
    }

    private void connectSocket(int i, int i2, Call call, EventListener eventListener) {
        Proxy proxy = this.route.proxy();
        this.rawSocket = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? this.route.address().socketFactory().createSocket() : new Socket(proxy);
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        this.rawSocket.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), i);
            try {
                this.source = Okio.buffer(Okio.source(this.rawSocket));
                this.sink = Okio.buffer(Okio.sink(this.rawSocket));
            } catch (NullPointerException e) {
                if (NPE_THROW_WITH_NULL.equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void establishProtocol(ConnectionSpecSelector connectionSpecSelector, Call call, EventListener eventListener) {
        if (this.route.address().sslSocketFactory() == null) {
            this.protocol = Protocol.HTTP_1_1;
            this.socket = this.rawSocket;
            return;
        }
        eventListener.secureConnectStart(call);
        try {
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake, null);
            if (this.protocol == Protocol.HTTP_2) {
                this.socket.setSoTimeout(0);
                this.http2Connection = new Http2Connection.Builder(true).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).build();
                this.http2Connection.start();
            }
        } catch (Exception e) {
            eventListener.secureConnectEnd(call, null, e);
            throw e;
        }
    }

    private void connectTls(ConnectionSpecSelector connectionSpecSelector) {
        SSLSocket sSLSocket;
        Address address = this.route.address();
        try {
            try {
                sSLSocket = (SSLSocket) address.sslSocketFactory().createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
                try {
                    sSLSocket.setEnabledCipherSuites(getNetonCipherSuites(sSLSocket.getEnabledCipherSuites()));
                    ConnectionSpec configureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket);
                    if (configureSecureSocket.supportsTlsExtensions()) {
                        Platform.get().configureTlsExtensions(sSLSocket, address.url().host(), address.protocols());
                    }
                    LogUtil.m7844d("connectTls--startHandshake");
                    if (address.requestStatistic() != null) {
                        address.requestStatistic().setStartSslTime(System.currentTimeMillis());
                    }
                    sSLSocket.startHandshake();
                    Handshake handshake = Handshake.get(sSLSocket.getSession());
                    if (address.requestStatistic() != null) {
                        address.requestStatistic().setEndSslTime(System.currentTimeMillis());
                    }
                    LogUtil.m7844d("connectTls--startHandshake end");
                    if (!address.hostnameVerifier().verify(address.url().host(), sSLSocket.getSession())) {
                        X509Certificate x509Certificate = (X509Certificate) handshake.peerCertificates().get(0);
                        throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified:\n    certificate: " + CertificatePinner.pin(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + OkHostnameVerifier.allSubjectAltNames(x509Certificate));
                    }
                    address.certificatePinner().check(address.url().host(), handshake.peerCertificates());
                    String selectedProtocol = configureSecureSocket.supportsTlsExtensions() ? Platform.get().getSelectedProtocol(sSLSocket) : null;
                    this.socket = sSLSocket;
                    this.source = Okio.buffer(Okio.source(this.socket));
                    this.sink = Okio.buffer(Okio.sink(this.socket));
                    this.handshake = handshake;
                    this.protocol = selectedProtocol != null ? Protocol.get(selectedProtocol) : Protocol.HTTP_1_1;
                    if (sSLSocket != null) {
                        Platform.get().afterHandshake(sSLSocket);
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!Util.isAndroidGetsocknameError(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        Platform.get().afterHandshake(sSLSocket);
                    }
                    Util.closeQuietly((Socket) sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = null;
            }
        } catch (AssertionError e2) {
            e = e2;
        }
    }

    private String[] getNetonCipherSuites(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        if (arrayList.size() > 0) {
            if (arrayList.contains(ECDHE_RSA_128)) {
                arrayList.remove(ECDHE_RSA_128);
                arrayList.add(0, ECDHE_RSA_128);
            }
            if (arrayList.contains(ECDHE_ECDSA_128)) {
                arrayList.remove(ECDHE_ECDSA_128);
                arrayList.add(0, ECDHE_ECDSA_128);
            }
            arrayList.toArray(strArr);
        }
        return strArr;
    }

    private Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) {
        String str = "CONNECT " + Util.hostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            Http1Codec http1Codec = new Http1Codec(null, null, this.source, this.sink);
            this.source.timeout().timeout(i, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout(i2, TimeUnit.MILLISECONDS);
            http1Codec.writeRequest(request.headers(), str);
            http1Codec.finishRequest();
            Response build = http1Codec.readResponseHeaders(false).request(request).build();
            long contentLength = HttpHeaders.contentLength(build);
            if (contentLength == -1) {
                contentLength = 0;
            }
            Source newFixedLengthSource = http1Codec.newFixedLengthSource(contentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
            int code = build.code();
            if (code == 200) {
                if (this.source.buffer().exhausted() && this.sink.buffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (code == 407) {
                Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                if (authenticate == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if ("close".equalsIgnoreCase(build.header("Connection"))) {
                    return authenticate;
                }
                request = authenticate;
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + build.code());
            }
        }
    }

    private Request createTunnelRequest() {
        return new Request.Builder().url(this.route.address().url()).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
    }

    public final boolean isEligible(Address address, Route route) {
        if (this.allocations.size() >= this.allocationLimit || this.noNewStreams || !Internal.instance.equalsNonHost(this.route.address(), address)) {
            return false;
        }
        if (address.url().host().equals(route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || route == null || route.proxy().type() != Proxy.Type.DIRECT || this.route.proxy().type() != Proxy.Type.DIRECT || !this.route.socketAddress().equals(route.socketAddress()) || route.address().hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean supportsUrl(HttpUrl httpUrl) {
        if (httpUrl.port() != this.route.address().url().port()) {
            return false;
        }
        if (httpUrl.host().equals(this.route.address().url().host())) {
            return true;
        }
        return this.handshake != null && OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) this.handshake.peerCertificates().get(0));
    }

    public final HttpCodec newCodec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation) {
        if (this.http2Connection != null) {
            return new Http2Codec(okHttpClient, chain, streamAllocation, this.http2Connection);
        }
        this.socket.setSoTimeout(chain.readTimeoutMillis());
        this.source.timeout().timeout(chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.sink.timeout().timeout(chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new Http1Codec(okHttpClient, streamAllocation, this.source, this.sink);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: neton.internal.connection.RealConnection$1 */
    /* loaded from: classes.dex */
    public class C25101 extends RealWebSocket.Streams {
        final /* synthetic */ StreamAllocation val$streamAllocation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25101(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, StreamAllocation streamAllocation) {
            super(z, bufferedSource, bufferedSink);
            r5 = streamAllocation;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            r5.streamFinished(true, r5.codec());
        }
    }

    public final RealWebSocket.Streams newWebSocketStreams(StreamAllocation streamAllocation) {
        return new RealWebSocket.Streams(true, this.source, this.sink) { // from class: neton.internal.connection.RealConnection.1
            final /* synthetic */ StreamAllocation val$streamAllocation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C25101(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, StreamAllocation streamAllocation2) {
                super(z, bufferedSource, bufferedSink);
                r5 = streamAllocation2;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                r5.streamFinished(true, r5.codec());
            }
        };
    }

    @Override // neton.Connection
    public final Route route() {
        return this.route;
    }

    public final void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    @Override // neton.Connection
    public final Socket socket() {
        return this.socket;
    }

    public final boolean isHealthy(boolean z) {
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        if (this.http2Connection != null) {
            return !this.http2Connection.isShutdown();
        }
        if (z) {
            try {
                int soTimeout = this.socket.getSoTimeout();
                try {
                    this.socket.setSoTimeout(1);
                    return !this.source.exhausted();
                } finally {
                    this.socket.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // neton.internal.http2.Http2Connection.Listener
    public final void onStream(Http2Stream http2Stream) {
        http2Stream.close(ErrorCode.REFUSED_STREAM);
    }

    @Override // neton.internal.http2.Http2Connection.Listener
    public final void onSettings(Http2Connection http2Connection) {
        synchronized (this.connectionPool) {
            this.allocationLimit = http2Connection.maxConcurrentStreams();
        }
    }

    @Override // neton.Connection
    public final Handshake handshake() {
        return this.handshake;
    }

    public final boolean isMultiplexed() {
        return this.http2Connection != null;
    }

    @Override // neton.Connection
    public final Protocol protocol() {
        return this.protocol;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(":");
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        sb.append(this.handshake != null ? this.handshake.cipherSuite() : "none");
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }
}
