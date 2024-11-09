package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Source source;

    public RealBufferedSource(Source source) {
        if (source == null) {
            throw new NullPointerException("source == null");
        }
        this.source = source;
    }

    @Override // okio.BufferedSource
    public final Buffer buffer() {
        return this.buffer;
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.buffer.size == 0 && this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.buffer.read(buffer, Math.min(j, this.buffer.size));
    }

    @Override // okio.BufferedSource
    public final boolean exhausted() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.buffer.exhausted() && this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // okio.BufferedSource
    public final void require(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.buffer.size < j) {
            if (this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        require(1L);
        return this.buffer.readByte();
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString() {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString(long j) {
        require(j);
        return this.buffer.readByteString(j);
    }

    @Override // okio.BufferedSource
    public final int select(Options options) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int selectPrefix = this.buffer.selectPrefix(options);
            if (selectPrefix == -1) {
                return -1;
            }
            long size = options.byteStrings[selectPrefix].size();
            if (size <= this.buffer.size) {
                this.buffer.skip(size);
                return selectPrefix;
            }
        } while (this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray() {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray(long j) {
        require(j);
        return this.buffer.readByteArray(j);
    }

    @Override // okio.BufferedSource
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] bArr) {
        try {
            require(bArr.length);
            this.buffer.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.buffer.size > 0) {
                int read = this.buffer.read(bArr, i, (int) this.buffer.size);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public final int read(byte[] bArr, int i, int i2) {
        long j = i2;
        Util.checkOffsetAndCount(bArr.length, i, j);
        if (this.buffer.size == 0 && this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i, (int) Math.min(j, this.buffer.size));
    }

    @Override // okio.BufferedSource
    public final void readFully(Buffer buffer, long j) {
        try {
            require(j);
            this.buffer.readFully(buffer, j);
        } catch (EOFException e) {
            buffer.writeAll(this.buffer);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public final long readAll(Sink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(this.buffer, completeSegmentByteCount);
            }
        }
        if (this.buffer.size() <= 0) {
            return j;
        }
        long size = j + this.buffer.size();
        sink.write(this.buffer, this.buffer.size());
        return size;
    }

    @Override // okio.BufferedSource
    public final String readUtf8() {
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    @Override // okio.BufferedSource
    public final String readUtf8(long j) {
        require(j);
        return this.buffer.readUtf8(j);
    }

    @Override // okio.BufferedSource
    public final String readString(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readString(charset);
    }

    @Override // okio.BufferedSource
    public final String readString(long j, Charset charset) {
        require(j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        return this.buffer.readString(j, charset);
    }

    @Override // okio.BufferedSource
    @Nullable
    public final String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return this.buffer.readUtf8Line(indexOf);
        }
        if (this.buffer.size != 0) {
            return readUtf8(this.buffer.size);
        }
        return null;
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long indexOf = indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return this.buffer.readUtf8Line(indexOf);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && this.buffer.getByte(j2 - 1) == 13 && request(1 + j2) && this.buffer.getByte(j2) == 10) {
            return this.buffer.readUtf8Line(j2);
        }
        Buffer buffer = new Buffer();
        this.buffer.copyTo(buffer, 0L, Math.min(32L, this.buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.buffer.size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public final int readUtf8CodePoint() {
        require(1L);
        byte b = this.buffer.getByte(0L);
        if ((b & 224) == 192) {
            require(2L);
        } else if ((b & 240) == 224) {
            require(3L);
        } else if ((b & 248) == 240) {
            require(4L);
        }
        return this.buffer.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    public final short readShort() {
        require(2L);
        return this.buffer.readShort();
    }

    @Override // okio.BufferedSource
    public final short readShortLe() {
        require(2L);
        return this.buffer.readShortLe();
    }

    @Override // okio.BufferedSource
    public final int readInt() {
        require(4L);
        return this.buffer.readInt();
    }

    @Override // okio.BufferedSource
    public final int readIntLe() {
        require(4L);
        return this.buffer.readIntLe();
    }

    @Override // okio.BufferedSource
    public final long readLong() {
        require(8L);
        return this.buffer.readLong();
    }

    @Override // okio.BufferedSource
    public final long readLongLe() {
        require(8L);
        return this.buffer.readLongLe();
    }

    @Override // okio.BufferedSource
    public final long readDecimalLong() {
        byte b;
        require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            b = this.buffer.getByte(i);
            if ((b < 48 || b > 57) && !(i == 0 && b == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(b)));
        }
        return this.buffer.readDecimalLong();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:            if (r1 == 0) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:            throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long readHexadecimalUnsignedLong() {
        /*
            r6 = this;
            r0 = 1
            r6.require(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L4a
            okio.Buffer r3 = r6.buffer
            long r4 = (long) r1
            byte r3 = r3.getByte(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            r1[r0] = r2
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r6.<init>(r0)
            throw r6
        L4a:
            okio.Buffer r6 = r6.buffer
            long r0 = r6.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.RealBufferedSource.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public final void skip(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.buffer.size == 0 && this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.buffer.size());
            this.buffer.skip(min);
            j -= min;
        }
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b, long j, long j2) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long indexOf = this.buffer.indexOf(b, j, j2);
            if (indexOf != -1) {
                return indexOf;
            }
            long j3 = this.buffer.size;
            if (j3 >= j2 || this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j3);
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final long indexOf(ByteString byteString) {
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public final long indexOf(ByteString byteString, long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.buffer.indexOf(byteString, j);
            if (indexOf != -1) {
                return indexOf;
            }
            long j2 = this.buffer.size;
            if (this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - byteString.size()) + 1);
        }
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(ByteString byteString, long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.buffer.indexOfElement(byteString, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long j2 = this.buffer.size;
            if (this.source.read(this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long j, ByteString byteString) {
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!request(1 + j2) || this.buffer.getByte(j2) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: okio.RealBufferedSource$1 */
    /* loaded from: classes.dex */
    class C25381 extends InputStream {
        C25381() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (RealBufferedSource.this.closed) {
                throw new IOException("closed");
            }
            if (RealBufferedSource.this.buffer.size == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return RealBufferedSource.this.buffer.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (RealBufferedSource.this.closed) {
                throw new IOException("closed");
            }
            Util.checkOffsetAndCount(bArr.length, i, i2);
            if (RealBufferedSource.this.buffer.size == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return RealBufferedSource.this.buffer.read(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public int available() {
            if (RealBufferedSource.this.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(RealBufferedSource.this.buffer.size, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            RealBufferedSource.this.close();
        }

        public String toString() {
            return RealBufferedSource.this + ".inputStream()";
        }
    }

    @Override // okio.BufferedSource
    public final InputStream inputStream() {
        return new InputStream() { // from class: okio.RealBufferedSource.1
            C25381() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                if (RealBufferedSource.this.buffer.size == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return RealBufferedSource.this.buffer.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                Util.checkOffsetAndCount(bArr.length, i, i2);
                if (RealBufferedSource.this.buffer.size == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return RealBufferedSource.this.buffer.read(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int available() {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                return (int) Math.min(RealBufferedSource.this.buffer.size, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                RealBufferedSource.this.close();
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }
        };
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.buffer.clear();
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.source.timeout();
    }

    public final String toString() {
        return "buffer(" + this.source + ")";
    }
}