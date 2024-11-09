package neton;

import com.coloros.neton.NetonException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import neton.internal.Util;
import okio.Buffer;
import okio.BufferedSource;

/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    private Reader reader;

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(contentLength)));
        }
        BufferedSource source = source();
        try {
            byte[] readByteArray = source.readByteArray();
            Util.closeQuietly(source);
            if (contentLength == -1 || contentLength == readByteArray.length) {
                return readByteArray;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + readByteArray.length + ") disagree");
        } catch (Throwable th) {
            Util.closeQuietly(source);
            throw th;
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public final String string() {
        BufferedSource source = source();
        try {
            return source.readString(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        Buffer writeString = new Buffer().writeString(str, charset);
        return create(mediaType, writeString.size(), writeString);
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr.length, new Buffer().write(bArr));
    }

    /* renamed from: neton.ResponseBody$1 */
    /* loaded from: classes.dex */
    public final class C24911 extends ResponseBody {
        final /* synthetic */ BufferedSource val$content;
        final /* synthetic */ long val$contentLength;

        C24911(long j, BufferedSource bufferedSource) {
            r2 = j;
            r4 = bufferedSource;
        }

        @Override // neton.ResponseBody
        public final MediaType contentType() {
            return MediaType.this;
        }

        @Override // neton.ResponseBody
        public final long contentLength() {
            return r2;
        }

        @Override // neton.ResponseBody
        public final BufferedSource source() {
            return r4;
        }
    }

    public static ResponseBody create(MediaType mediaType, long j, BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NetonException(new NullPointerException("source == null"));
        }
        return new ResponseBody() { // from class: neton.ResponseBody.1
            final /* synthetic */ BufferedSource val$content;
            final /* synthetic */ long val$contentLength;

            C24911(long j2, BufferedSource bufferedSource2) {
                r2 = j2;
                r4 = bufferedSource2;
            }

            @Override // neton.ResponseBody
            public final MediaType contentType() {
                return MediaType.this;
            }

            @Override // neton.ResponseBody
            public final long contentLength() {
                return r2;
            }

            @Override // neton.ResponseBody
            public final BufferedSource source() {
                return r4;
            }
        };
    }

    /* loaded from: classes.dex */
    final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.bomAwareCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.closed = true;
            if (this.delegate != null) {
                this.delegate.close();
            } else {
                this.source.close();
            }
        }
    }
}
