package neton;

import java.nio.charset.Charset;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Charset.forName("ISO-8859-1"));
    }

    public static String basic(String str, String str2, Charset charset) {
        return "Basic ".concat(String.valueOf(ByteString.encodeString(str + ":" + str2, charset).base64()));
    }
}
