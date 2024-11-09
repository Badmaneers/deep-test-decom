package neton;

import android.support.v4.media.session.PlaybackStateCompat;
import com.coloros.neton.NetonException;
import com.coloros.neton.ProgressCallBack;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import neton.MultipartBody;
import neton.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* loaded from: classes.dex */
public abstract class RequestBody {
    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink);

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(Map<String, Object> map, ProgressCallBack progressCallBack) {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (!(obj instanceof File)) {
                builder.addFormDataPart(str, obj.toString());
            } else {
                File file = (File) obj;
                builder.addFormDataPart(str, file.getName(), new RequestBody() { // from class: neton.RequestBody.1
                    final /* synthetic */ ProgressCallBack val$callBack;
                    final /* synthetic */ File val$file;

                    C24871(File file2, ProgressCallBack progressCallBack2) {
                        r1 = file2;
                        r2 = progressCallBack2;
                    }

                    @Override // neton.RequestBody
                    public final MediaType contentType() {
                        return MediaType.parse(MediaType.OCTET_STREAM);
                    }

                    @Override // neton.RequestBody
                    public final long contentLength() {
                        return r1.length();
                    }

                    @Override // neton.RequestBody
                    public final void writeTo(BufferedSink bufferedSink) {
                        try {
                            Source source = Okio.source(r1);
                            Buffer buffer = new Buffer();
                            long contentLength = contentLength();
                            long j = 0;
                            while (true) {
                                long read = source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                                if (read == -1) {
                                    return;
                                }
                                bufferedSink.write(buffer, read);
                                j += read;
                                if (r2 != null) {
                                    r2.onProgress(contentLength, j);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
        return builder.build();
    }

    /* renamed from: neton.RequestBody$1 */
    /* loaded from: classes.dex */
    public final class C24871 extends RequestBody {
        final /* synthetic */ ProgressCallBack val$callBack;
        final /* synthetic */ File val$file;

        C24871(File file2, ProgressCallBack progressCallBack2) {
            r1 = file2;
            r2 = progressCallBack2;
        }

        @Override // neton.RequestBody
        public final MediaType contentType() {
            return MediaType.parse(MediaType.OCTET_STREAM);
        }

        @Override // neton.RequestBody
        public final long contentLength() {
            return r1.length();
        }

        @Override // neton.RequestBody
        public final void writeTo(BufferedSink bufferedSink) {
            try {
                Source source = Okio.source(r1);
                Buffer buffer = new Buffer();
                long contentLength = contentLength();
                long j = 0;
                while (true) {
                    long read = source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                    if (read == -1) {
                        return;
                    }
                    bufferedSink.write(buffer, read);
                    j += read;
                    if (r2 != null) {
                        r2.onProgress(contentLength, j);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static RequestBody create(Map<String, Object> map) {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (!(obj instanceof File)) {
                builder.addFormDataPart(str, obj.toString());
            } else {
                File file = (File) obj;
                builder.addFormDataPart(str, file.getName(), create(MediaType.parse(MediaType.OCTET_STREAM), file));
            }
        }
        return builder.build();
    }

    /* renamed from: neton.RequestBody$2 */
    /* loaded from: classes.dex */
    final class C24882 extends RequestBody {
        final /* synthetic */ ByteString val$content;

        C24882(ByteString byteString) {
            r2 = byteString;
        }

        @Override // neton.RequestBody
        public final MediaType contentType() {
            return MediaType.this;
        }

        @Override // neton.RequestBody
        public final long contentLength() {
            return r2.size();
        }

        @Override // neton.RequestBody
        public final void writeTo(BufferedSink bufferedSink) {
            bufferedSink.write(r2);
        }
    }

    public static RequestBody create(MediaType mediaType, ByteString byteString) {
        return new RequestBody() { // from class: neton.RequestBody.2
            final /* synthetic */ ByteString val$content;

            C24882(ByteString byteString2) {
                r2 = byteString2;
            }

            @Override // neton.RequestBody
            public final MediaType contentType() {
                return MediaType.this;
            }

            @Override // neton.RequestBody
            public final long contentLength() {
                return r2.size();
            }

            @Override // neton.RequestBody
            public final void writeTo(BufferedSink bufferedSink) {
                bufferedSink.write(r2);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    /* renamed from: neton.RequestBody$3 */
    /* loaded from: classes.dex */
    public final class C24893 extends RequestBody {
        final /* synthetic */ int val$byteCount;
        final /* synthetic */ byte[] val$content;
        final /* synthetic */ int val$offset;

        C24893(int i, byte[] bArr, int i2) {
            r2 = i;
            r3 = bArr;
            r4 = i2;
        }

        @Override // neton.RequestBody
        public final MediaType contentType() {
            return MediaType.this;
        }

        @Override // neton.RequestBody
        public final long contentLength() {
            return r2;
        }

        @Override // neton.RequestBody
        public final void writeTo(BufferedSink bufferedSink) {
            bufferedSink.write(r3, r4, r2);
        }
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NetonException(new NullPointerException("content == null"));
        }
        Util.checkOffsetAndCount(bArr.length, i, i2);
        return new RequestBody() { // from class: neton.RequestBody.3
            final /* synthetic */ int val$byteCount;
            final /* synthetic */ byte[] val$content;
            final /* synthetic */ int val$offset;

            C24893(int i22, byte[] bArr2, int i3) {
                r2 = i22;
                r3 = bArr2;
                r4 = i3;
            }

            @Override // neton.RequestBody
            public final MediaType contentType() {
                return MediaType.this;
            }

            @Override // neton.RequestBody
            public final long contentLength() {
                return r2;
            }

            @Override // neton.RequestBody
            public final void writeTo(BufferedSink bufferedSink) {
                bufferedSink.write(r3, r4, r2);
            }
        };
    }

    /* renamed from: neton.RequestBody$4 */
    /* loaded from: classes.dex */
    public final class C24904 extends RequestBody {
        final /* synthetic */ File val$file;

        C24904(File file) {
            r2 = file;
        }

        @Override // neton.RequestBody
        public final MediaType contentType() {
            return MediaType.this;
        }

        @Override // neton.RequestBody
        public final long contentLength() {
            return r2.length();
        }

        @Override // neton.RequestBody
        public final void writeTo(BufferedSink bufferedSink) {
            Source source = null;
            try {
                Source source2 = Okio.source(r2);
                try {
                    bufferedSink.writeAll(source2);
                    Util.closeQuietly(source2);
                } catch (Throwable th) {
                    th = th;
                    source = source2;
                    Util.closeQuietly(source);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static RequestBody create(MediaType mediaType, File file) {
        if (file == null) {
            throw new NetonException(new NullPointerException("content == null"));
        }
        return new RequestBody() { // from class: neton.RequestBody.4
            final /* synthetic */ File val$file;

            C24904(File file2) {
                r2 = file2;
            }

            @Override // neton.RequestBody
            public final MediaType contentType() {
                return MediaType.this;
            }

            @Override // neton.RequestBody
            public final long contentLength() {
                return r2.length();
            }

            @Override // neton.RequestBody
            public final void writeTo(BufferedSink bufferedSink) {
                Source source = null;
                try {
                    Source source2 = Okio.source(r2);
                    try {
                        bufferedSink.writeAll(source2);
                        Util.closeQuietly(source2);
                    } catch (Throwable th) {
                        th = th;
                        source = source2;
                        Util.closeQuietly(source);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        };
    }

    public String toString() {
        try {
            return "RequestBody{contentType:" + contentType() + ",length:" + contentLength() + "}";
        } catch (IOException unused) {
            return super.toString();
        }
    }
}
