package neton.internal.http1;

import com.coloros.neton.NetonException;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import neton.Headers;
import neton.HttpUrl;
import neton.OkHttpClient;
import neton.Request;
import neton.Response;
import neton.ResponseBody;
import neton.client.config.Constants;
import neton.internal.Internal;
import neton.internal.Util;
import neton.internal.connection.RealConnection;
import neton.internal.connection.StreamAllocation;
import neton.internal.http.HttpCodec;
import neton.internal.http.HttpHeaders;
import neton.internal.http.RealResponseBody;
import neton.internal.http.RequestLine;
import neton.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* loaded from: classes.dex */
public final class Http1Codec implements HttpCodec {
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    final BufferedSink sink;
    final BufferedSource source;
    int state = 0;
    final StreamAllocation streamAllocation;

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation;
        this.source = bufferedSource;
        this.sink = bufferedSink;
    }

    @Override // neton.internal.http.HttpCodec
    public final Sink createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new NetonException(new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!"));
    }

    @Override // neton.internal.http.HttpCodec
    public final void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // neton.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }

    @Override // neton.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        return new RealResponseBody(response.headers(), Okio.buffer(getTransferStream(response)));
    }

    private Source getTransferStream(Response response) {
        if (!HttpHeaders.hasBody(response)) {
            return newFixedLengthSource(0L);
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return newChunkedSource(response.request().url());
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return newFixedLengthSource(contentLength);
        }
        return newUnknownLengthSource();
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // neton.internal.http.HttpCodec
    public final void flushRequest() {
        this.sink.flush();
    }

    @Override // neton.internal.http.HttpCodec
    public final void finishRequest() {
        this.sink.flush();
    }

    public final void writeRequest(Headers headers, String str) {
        if (this.state != 0) {
            throw new NetonException(new IllegalStateException("state: " + this.state));
        }
        this.sink.writeUtf8(str).writeUtf8("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.writeUtf8(headers.name(i)).writeUtf8(": ").writeUtf8(headers.value(i)).writeUtf8("\r\n");
        }
        this.sink.writeUtf8("\r\n");
        this.state = 1;
    }

    @Override // neton.internal.http.HttpCodec
    public final Response.Builder readResponseHeaders(boolean z) {
        if (this.state != 1 && this.state != 3) {
            throw new NetonException(new IllegalStateException("state: " + this.state));
        }
        try {
            StatusLine parse = StatusLine.parse(this.source.readUtf8LineStrict());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
            if (z && parse.code == 100) {
                return null;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
            iOException.initCause(e);
            throw iOException;
        }
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readUtf8LineStrict = this.source.readUtf8LineStrict();
            if (readUtf8LineStrict.length() != 0) {
                Internal.instance.addLenient(builder, readUtf8LineStrict);
            } else {
                return builder.build();
            }
        }
    }

    public final Sink newChunkedSink() {
        if (this.state != 1) {
            throw new NetonException(new IllegalStateException("state: " + this.state));
        }
        this.state = 2;
        return new ChunkedSink();
    }

    public final Sink newFixedLengthSink(long j) {
        if (this.state != 1) {
            throw new NetonException(new IllegalStateException("state: " + this.state));
        }
        this.state = 2;
        return new FixedLengthSink(j);
    }

    public final Source newFixedLengthSource(long j) {
        if (this.state != 4) {
            throw new NetonException(new IllegalStateException("state: " + this.state));
        }
        this.state = 5;
        return new FixedLengthSource(j);
    }

    public final Source newChunkedSource(HttpUrl httpUrl) {
        if (this.state != 4) {
            throw new NetonException(new IllegalStateException("state: " + this.state));
        }
        this.state = 5;
        return new ChunkedSource(httpUrl);
    }

    public final Source newUnknownLengthSource() {
        if (this.state != 4) {
            throw new NetonException(new IllegalStateException("state: " + this.state));
        }
        if (this.streamAllocation == null) {
            throw new NetonException(new IllegalStateException("streamAllocation == null"));
        }
        this.state = 5;
        this.streamAllocation.noNewStreams();
        return new UnknownLengthSource();
    }

    final void detachTimeout(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class FixedLengthSink implements Sink {
        private long bytesRemaining;
        private boolean closed;
        private final ForwardingTimeout timeout;

        FixedLengthSink(long j) {
            this.timeout = new ForwardingTimeout(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j;
        }

        @Override // okio.Sink
        public final Timeout timeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public final void write(Buffer buffer, long j) {
            if (this.closed) {
                throw new NetonException(new IllegalStateException("closed"));
            }
            Util.checkOffsetAndCount(buffer.size(), 0L, j);
            if (j > this.bytesRemaining) {
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j);
            }
            Http1Codec.this.sink.write(buffer, j);
            this.bytesRemaining -= j;
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.bytesRemaining > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class ChunkedSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        ChunkedSink() {
            this.timeout = new ForwardingTimeout(Http1Codec.this.sink.timeout());
        }

        @Override // okio.Sink
        public final Timeout timeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public final void write(Buffer buffer, long j) {
            if (this.closed) {
                throw new NetonException(new IllegalStateException("closed"));
            }
            if (j == 0) {
                return;
            }
            Http1Codec.this.sink.writeHexadecimalUnsignedLong(j);
            Http1Codec.this.sink.writeUtf8("\r\n");
            Http1Codec.this.sink.write(buffer, j);
            Http1Codec.this.sink.writeUtf8("\r\n");
        }

        @Override // okio.Sink, java.io.Flushable
        public final synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1Codec.this.sink.writeUtf8("0\r\n\r\n");
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class AbstractSource implements Source {
        protected boolean closed;
        protected final ForwardingTimeout timeout;

        private AbstractSource() {
            this.timeout = new ForwardingTimeout(Http1Codec.this.source.timeout());
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            try {
                return Http1Codec.this.source.read(buffer, j);
            } catch (IOException e) {
                endOfInput(false, e);
                throw e;
            }
        }

        protected final void endOfInput(boolean z, IOException iOException) {
            if (Http1Codec.this.state == 6) {
                return;
            }
            if (Http1Codec.this.state != 5) {
                throw new NetonException(new IllegalStateException("state: " + Http1Codec.this.state));
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 6;
            if (Http1Codec.this.streamAllocation != null) {
                Http1Codec.this.streamAllocation.eventListener.responseBodyEnd(Http1Codec.this.streamAllocation.call, iOException);
                Http1Codec.this.streamAllocation.streamFinished(!z, Http1Codec.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (this.bytesRemaining == 0) {
                endOfInput(true, null);
            }
        }

        @Override // neton.internal.http1.Http1Codec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new NetonException(new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j))));
            }
            if (this.closed) {
                throw new NetonException(new IllegalStateException("closed"));
            }
            if (this.bytesRemaining == 0) {
                return -1L;
            }
            long read = super.read(buffer, Math.min(this.bytesRemaining, j));
            if (read == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
            this.bytesRemaining -= read;
            if (this.bytesRemaining == 0) {
                endOfInput(true, null);
            }
            return read;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
            this.url = httpUrl;
        }

        @Override // neton.internal.http1.Http1Codec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new NetonException(new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j))));
            }
            if (this.closed) {
                throw new NetonException(new IllegalStateException("closed"));
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            if (this.bytesRemainingInChunk == 0 || this.bytesRemainingInChunk == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long read = super.read(buffer, Math.min(j, this.bytesRemainingInChunk));
            if (read == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
            this.bytesRemainingInChunk -= read;
            return read;
        }

        private void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.readHexadecimalUnsignedLong();
                String trim = Http1Codec.this.source.readUtf8LineStrict().trim();
                if (this.bytesRemainingInChunk < 0 || !(trim.isEmpty() || trim.startsWith(Constants.SPLITER))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        @Override // neton.internal.http1.Http1Codec.AbstractSource, okio.Source
        public long read(Buffer buffer, long j) {
            if (j < 0) {
                throw new NetonException(new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j))));
            }
            if (this.closed) {
                throw new NetonException(new IllegalStateException("closed"));
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long read = super.read(buffer, j);
            if (read != -1) {
                return read;
            }
            this.inputExhausted = true;
            endOfInput(true, null);
            return -1L;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                endOfInput(false, null);
            }
            this.closed = true;
        }
    }
}
