package neton.internal.ws;

import android.support.v4.media.session.PlaybackStateCompat;
import com.coloros.neton.NetonException;
import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* loaded from: classes.dex */
final class WebSocketWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    boolean activeWriter;
    final Buffer buffer = new Buffer();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    final byte[] maskBuffer;
    final byte[] maskKey;
    final Random random;
    final BufferedSink sink;
    boolean writerClosed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketWriter(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            throw new NetonException(new NullPointerException("sink == null"));
        }
        if (random == null) {
            throw new NetonException(new NullPointerException("random == null"));
        }
        this.isClient = z;
        this.sink = bufferedSink;
        this.random = random;
        this.maskKey = z ? new byte[4] : null;
        this.maskBuffer = z ? new byte[8192] : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writePing(ByteString byteString) {
        synchronized (this) {
            writeControlFrameSynchronized(9, byteString);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writePong(ByteString byteString) {
        synchronized (this) {
            writeControlFrameSynchronized(10, byteString);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeClose(int i, ByteString byteString) {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        synchronized (this) {
            try {
                try {
                    writeControlFrameSynchronized(8, byteString2);
                } finally {
                    this.writerClosed = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void writeControlFrameSynchronized(int i, ByteString byteString) {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new NetonException(new IllegalArgumentException("Payload size must be less than or equal to 125"));
        }
        this.sink.writeByte(i | 128);
        if (this.isClient) {
            this.sink.writeByte(size | 128);
            this.random.nextBytes(this.maskKey);
            this.sink.write(this.maskKey);
            byte[] byteArray = byteString.toByteArray();
            WebSocketProtocol.toggleMask(byteArray, byteArray.length, this.maskKey, 0L);
            this.sink.write(byteArray);
        } else {
            this.sink.writeByte(size);
            this.sink.write(byteString);
        }
        this.sink.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Sink newMessageSink(int i, long j) {
        if (this.activeWriter) {
            throw new NetonException(new IllegalStateException("Another message writer is active. Did you call close()?"));
        }
        this.activeWriter = true;
        this.frameSink.formatOpcode = i;
        this.frameSink.contentLength = j;
        this.frameSink.isFirstFrame = true;
        this.frameSink.closed = false;
        return this.frameSink;
    }

    final void writeMessageFrameSynchronized(int i, long j, boolean z, boolean z2) {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.sink.writeByte(i);
        int i2 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sink.writeByte(i2 | ((int) j));
        } else if (j <= 65535) {
            this.sink.writeByte(i2 | 126);
            this.sink.writeShort((int) j);
        } else {
            this.sink.writeByte(i2 | 127);
            this.sink.writeLong(j);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            this.sink.write(this.maskKey);
            long j2 = 0;
            while (j2 < j) {
                int read = this.buffer.read(this.maskBuffer, 0, (int) Math.min(j, this.maskBuffer.length));
                if (read == -1) {
                    throw new AssertionError();
                }
                long j3 = read;
                WebSocketProtocol.toggleMask(this.maskBuffer, j3, this.maskKey, j2);
                this.sink.write(this.maskBuffer, 0, read);
                j2 += j3;
            }
        } else {
            this.sink.write(this.buffer, j);
        }
        this.sink.emit();
    }

    /* loaded from: classes.dex */
    final class FrameSink implements Sink {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        @Override // okio.Sink
        public final void write(Buffer buffer, long j) {
            if (this.closed) {
                throw new IOException("closed");
            }
            WebSocketWriter.this.buffer.write(buffer, j);
            boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.size() > this.contentLength - PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            long completeSegmentByteCount = WebSocketWriter.this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount <= 0 || z) {
                return;
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, completeSegmentByteCount, this.isFirstFrame, false);
            }
            this.isFirstFrame = false;
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            if (this.closed) {
                throw new IOException("closed");
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, WebSocketWriter.this.buffer.size(), this.isFirstFrame, false);
            }
            this.isFirstFrame = false;
        }

        @Override // okio.Sink
        public final Timeout timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                throw new IOException("closed");
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, WebSocketWriter.this.buffer.size(), this.isFirstFrame, true);
            }
            this.closed = true;
            WebSocketWriter.this.activeWriter = false;
        }
    }
}
