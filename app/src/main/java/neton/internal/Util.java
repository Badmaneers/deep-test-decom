package neton.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.coloros.neton.NetonException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import neton.HttpUrl;
import neton.MediaType;
import neton.RequestBody;
import neton.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;

/* loaded from: classes.dex */
public final class Util {
    public static RequestBody EMPTY_REQUEST;
    public static ResponseBody EMPTY_RESPONSE;
    public static final Comparator<String> NATURAL_ORDER;
    public static final TimeZone UTC;
    private static final Charset UTF_16_BE;
    private static final ByteString UTF_16_BE_BOM;
    private static final Charset UTF_16_LE;
    private static final ByteString UTF_16_LE_BOM;
    private static final Charset UTF_32_BE;
    private static final ByteString UTF_32_BE_BOM;
    private static final Charset UTF_32_LE;
    private static final ByteString UTF_32_LE_BOM;
    public static final Charset UTF_8;
    private static final ByteString UTF_8_BOM;
    private static final Pattern VERIFY_AS_IP_ADDRESS;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    static {
        try {
            EMPTY_RESPONSE = ResponseBody.create((MediaType) null, EMPTY_BYTE_ARRAY);
            EMPTY_REQUEST = RequestBody.create((MediaType) null, EMPTY_BYTE_ARRAY);
        } catch (NetonException e) {
            e.printStackTrace();
        }
        UTF_8_BOM = ByteString.decodeHex("efbbbf");
        UTF_16_BE_BOM = ByteString.decodeHex("feff");
        UTF_16_LE_BOM = ByteString.decodeHex("fffe");
        UTF_32_BE_BOM = ByteString.decodeHex("0000ffff");
        UTF_32_LE_BOM = ByteString.decodeHex("ffff0000");
        UTF_8 = Charset.forName("UTF-8");
        UTF_16_BE = Charset.forName("UTF-16BE");
        UTF_16_LE = Charset.forName("UTF-16LE");
        UTF_32_BE = Charset.forName("UTF-32BE");
        UTF_32_LE = Charset.forName("UTF-32LE");
        UTC = TimeZone.getTimeZone("GMT");
        NATURAL_ORDER = new Comparator<String>() { // from class: neton.internal.Util.1
            C25031() {
            }

            @Override // java.util.Comparator
            public final int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        };
        VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: neton.internal.Util$1 */
    /* loaded from: classes.dex */
    final class C25031 implements Comparator<String> {
        C25031() {
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    private Util() {
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new NetonException(new ArrayIndexOutOfBoundsException());
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!isAndroidGetsocknameError(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean discard(Source source, int i, TimeUnit timeUnit) {
        try {
            return skipAll(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean skipAll(Source source, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                buffer.clear();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return true;
            }
            source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return false;
            }
            source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: neton.internal.Util$2 */
    /* loaded from: classes.dex */
    public final class ThreadFactoryC25042 implements ThreadFactory {
        final /* synthetic */ boolean val$daemon;
        final /* synthetic */ String val$name;

        ThreadFactoryC25042(String str, boolean z) {
            r1 = str;
            r2 = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, r1);
            thread.setDaemon(r2);
            return thread;
        }
    }

    public static ThreadFactory threadFactory(String str, boolean z) {
        return new ThreadFactory() { // from class: neton.internal.Util.2
            final /* synthetic */ boolean val$daemon;
            final /* synthetic */ String val$name;

            ThreadFactoryC25042(String str2, boolean z2) {
                r1 = str2;
                r2 = z2;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, r1);
                thread.setDaemon(r2);
                return thread;
            }
        };
    }

    public static String[] intersect(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean nonEmptyIntersection(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String hostHeader(HttpUrl httpUrl, boolean z) {
        String host;
        if (httpUrl.host().contains(":")) {
            host = "[" + httpUrl.host() + "]";
        } else {
            host = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ":" + httpUrl.port();
    }

    public static String toHumanReadableAscii(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt > 31 && codePointAt < 127) {
                i += Character.charCount(codePointAt);
            } else {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    buffer.writeUtf8CodePoint((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i += Character.charCount(codePointAt2);
                }
                return buffer.readUtf8();
            }
        }
        return str;
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int indexOf(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static String[] concat(String[] strArr, String str) {
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static int skipLeadingAsciiWhitespace(String str, int i, int i2) {
        while (i < i2) {
            switch (str.charAt(i)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    i++;
                default:
                    return i;
            }
        }
        return i2;
    }

    public static int skipTrailingAsciiWhitespace(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            switch (str.charAt(i3)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                default:
                    return i3 + 1;
            }
        }
        return i;
    }

    public static String trimSubstring(String str, int i, int i2) {
        int skipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, i, i2);
        return str.substring(skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, i2));
    }

    public static int delimiterOffset(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int delimiterOffset(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String domainToAscii(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean containsInvalidHostnameAsciiCodes(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int indexOfControlOrNonAscii(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static boolean verifyAsIpAddress(String str) {
        return VERIFY_AS_IP_ADDRESS.matcher(str).matches();
    }

    public static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset bomAwareCharset(BufferedSource bufferedSource, Charset charset) {
        if (bufferedSource.rangeEquals(0L, UTF_8_BOM)) {
            bufferedSource.skip(UTF_8_BOM.size());
            return UTF_8;
        }
        if (bufferedSource.rangeEquals(0L, UTF_16_BE_BOM)) {
            bufferedSource.skip(UTF_16_BE_BOM.size());
            return UTF_16_BE;
        }
        if (bufferedSource.rangeEquals(0L, UTF_16_LE_BOM)) {
            bufferedSource.skip(UTF_16_LE_BOM.size());
            return UTF_16_LE;
        }
        if (bufferedSource.rangeEquals(0L, UTF_32_BE_BOM)) {
            bufferedSource.skip(UTF_32_BE_BOM.size());
            return UTF_32_BE;
        }
        if (!bufferedSource.rangeEquals(0L, UTF_32_LE_BOM)) {
            return charset;
        }
        bufferedSource.skip(UTF_32_LE_BOM.size());
        return UTF_32_LE;
    }

    public static int checkDuration(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new NetonException(new IllegalArgumentException(str + " < 0"));
        }
        if (timeUnit == null) {
            throw new NetonException(new NullPointerException("unit == null"));
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new NetonException(new IllegalArgumentException(str + " too large."));
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new NetonException(new IllegalArgumentException(str + " too small."));
    }
}
