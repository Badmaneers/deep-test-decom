package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink) {
        if (sink == null) {
            throw new NullPointerException("sink == null");
        }
        this.sink = sink;
    }

    @Override // okio.BufferedSink, okio.BufferedSource
    public final Buffer buffer() {
        return this.buffer;
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(buffer, j);
        emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(ByteString byteString) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(byteString);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8(String str) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeUtf8(str);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8(String str, int i, int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeUtf8(str, i, i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8CodePoint(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeUtf8CodePoint(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeString(String str, Charset charset) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeString(str, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeString(String str, int i, int i2, Charset charset) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeString(str, i, i2, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] bArr) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(bArr);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] bArr, int i, int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.write(bArr, i, i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final long writeAll(Source source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(Source source, long j) {
        while (j > 0) {
            long read = source.read(this.buffer, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
            emitCompleteSegments();
        }
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeByte(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeByte(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShort(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeShort(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShortLe(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeShortLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeInt(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeInt(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeIntLe(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeIntLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeLong(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeLongLe(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeLongLe(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeDecimalLong(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeDecimalLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeHexadecimalUnsignedLong(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.buffer.writeHexadecimalUnsignedLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public final BufferedSink emitCompleteSegments() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            this.sink.write(this.buffer, completeSegmentByteCount);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink emit() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        long size = this.buffer.size();
        if (size > 0) {
            this.sink.write(this.buffer, size);
        }
        return this;
    }

    /* renamed from: okio.RealBufferedSink$1 */
    /* loaded from: classes.dex */
    class C25371 extends OutputStream {
        C25371() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            if (RealBufferedSink.this.closed) {
                throw new IOException("closed");
            }
            RealBufferedSink.this.buffer.writeByte((int) ((byte) i));
            RealBufferedSink.this.emitCompleteSegments();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            if (RealBufferedSink.this.closed) {
                throw new IOException("closed");
            }
            RealBufferedSink.this.buffer.write(bArr, i, i2);
            RealBufferedSink.this.emitCompleteSegments();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            if (RealBufferedSink.this.closed) {
                return;
            }
            RealBufferedSink.this.flush();
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            RealBufferedSink.this.close();
        }

        public String toString() {
            return RealBufferedSink.this + ".outputStream()";
        }
    }

    @Override // okio.BufferedSink
    public final OutputStream outputStream() {
        return new OutputStream() { // from class: okio.RealBufferedSink.1
            C25371() {
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                if (RealBufferedSink.this.closed) {
                    throw new IOException("closed");
                }
                RealBufferedSink.this.buffer.writeByte((int) ((byte) i));
                RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                if (RealBufferedSink.this.closed) {
                    throw new IOException("closed");
                }
                RealBufferedSink.this.buffer.write(bArr, i, i2);
                RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                if (RealBufferedSink.this.closed) {
                    return;
                }
                RealBufferedSink.this.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                RealBufferedSink.this.close();
            }

            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }
        };
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.buffer.size > 0) {
            this.sink.write(this.buffer, this.buffer.size);
        }
        this.sink.flush();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        Throwable th = null;
        try {
            if (this.buffer.size > 0) {
                this.sink.write(this.buffer, this.buffer.size);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            Util.sneakyRethrow(th);
        }
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.sink.timeout();
    }

    public final String toString() {
        return "buffer(" + this.sink + ")";
    }
}
