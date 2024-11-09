package neton.client.Utils;

import com.coloros.neton.BuildConfig;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class MD5Tools {
    public static String calcMD5(String str) {
        return calcMD5(str.getBytes(Charset.defaultCharset()));
    }

    public static String calcMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toString(i, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
