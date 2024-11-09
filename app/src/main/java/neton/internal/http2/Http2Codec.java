package neton.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import neton.Headers;
import neton.Interceptor;
import neton.OkHttpClient;
import neton.Protocol;
import neton.Request;
import neton.Response;
import neton.ResponseBody;
import neton.client.dns.DnsInfo;
import neton.internal.Internal;
import neton.internal.Util;
import neton.internal.connection.StreamAllocation;
import neton.internal.http.HttpCodec;
import neton.internal.http.RealResponseBody;
import neton.internal.http.RequestLine;
import neton.internal.http.StatusLine;
import okio.Buffer;
import okio.ByteString;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* loaded from: classes.dex */
public final class Http2Codec implements HttpCodec {
    private final Interceptor.Chain chain;
    private final OkHttpClient client;
    private final Http2Connection connection;
    private Http2Stream stream;
    final StreamAllocation streamAllocation;
    private static final ByteString CONNECTION = ByteString.encodeUtf8("connection");
    private static final ByteString HOST = ByteString.encodeUtf8(DnsInfo.HOST);
    private static final ByteString KEEP_ALIVE = ByteString.encodeUtf8("keep-alive");
    private static final ByteString PROXY_CONNECTION = ByteString.encodeUtf8("proxy-connection");
    private static final ByteString TRANSFER_ENCODING = ByteString.encodeUtf8("transfer-encoding");

    /* renamed from: TE */
    private static final ByteString f10849TE = ByteString.encodeUtf8("te");
    private static final ByteString ENCODING = ByteString.encodeUtf8("encoding");
    private static final ByteString UPGRADE = ByteString.encodeUtf8("upgrade");
    private static final List<ByteString> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f10849TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY);
    private static final List<ByteString> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f10849TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    public Http2Codec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation, Http2Connection http2Connection) {
        this.client = okHttpClient;
        this.chain = chain;
        this.streamAllocation = streamAllocation;
        this.connection = http2Connection;
    }

    @Override // neton.internal.http.HttpCodec
    public final Sink createRequestBody(Request request, long j) {
        return this.stream.getSink();
    }

    @Override // neton.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) {
        if (this.stream != null) {
            return;
        }
        this.stream = this.connection.newStream(http2HeadersList(request), request.body() != null);
        this.stream.readTimeout().timeout(this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.stream.writeTimeout().timeout(this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // neton.internal.http.HttpCodec
    public final void flushRequest() {
        this.connection.flush();
    }

    @Override // neton.internal.http.HttpCodec
    public final void finishRequest() {
        this.stream.getSink().close();
    }

    @Override // neton.internal.http.HttpCodec
    public final Response.Builder readResponseHeaders(boolean z) {
        Response.Builder readHttp2HeadersList = readHttp2HeadersList(this.stream.takeResponseHeaders());
        if (z && Internal.instance.code(readHttp2HeadersList) == 100) {
            return null;
        }
        return readHttp2HeadersList;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        String header = request.header("Host");
        if (header != null) {
            arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
        }
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            ByteString encodeUtf8 = ByteString.encodeUtf8(headers.name(i).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(encodeUtf8)) {
                arrayList.add(new Header(encodeUtf8, headers.value(i)));
            }
        }
        return arrayList;
    }

    public static Response.Builder readHttp2HeadersList(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        Headers.Builder builder2 = builder;
        StatusLine statusLine = null;
        for (int i = 0; i < size; i++) {
            Header header = list.get(i);
            if (header == null) {
                if (statusLine != null && statusLine.code == 100) {
                    builder2 = new Headers.Builder();
                    statusLine = null;
                }
            } else {
                ByteString byteString = header.name;
                String utf8 = header.value.utf8();
                if (byteString.equals(Header.RESPONSE_STATUS)) {
                    statusLine = StatusLine.parse("HTTP/1.1 ".concat(String.valueOf(utf8)));
                } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(byteString)) {
                    Internal.instance.addLenient(builder2, byteString.utf8(), utf8);
                }
            }
        }
        if (statusLine == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        return new Response.Builder().protocol(Protocol.HTTP_2).code(statusLine.code).message(statusLine.message).headers(builder2.build());
    }

    @Override // neton.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        return new RealResponseBody(response.headers(), Okio.buffer(new StreamFinishingSource(this.stream.getSource())));
    }

    @Override // neton.internal.http.HttpCodec
    public final void cancel() {
        if (this.stream != null) {
            this.stream.closeLater(ErrorCode.CANCEL);
        }
    }

    /* loaded from: classes.dex */
    class StreamFinishingSource extends ForwardingSource {
        boolean completed;

        StreamFinishingSource(Source source) {
            super(source);
            this.completed = false;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) {
            try {
                return delegate().read(buffer, j);
            } catch (IOException e) {
                endOfInput(e);
                throw e;
            }
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            endOfInput(null);
        }

        private void endOfInput(IOException iOException) {
            if (this.completed) {
                return;
            }
            this.completed = true;
            Http2Codec.this.streamAllocation.eventListener.responseBodyEnd(Http2Codec.this.streamAllocation.call, iOException);
            Http2Codec.this.streamAllocation.streamFinished(false, Http2Codec.this);
        }
    }
}
