package neton.client.Utils;

import android.os.SystemProperties;
import android.util.Log;

/* loaded from: classes.dex */
public class LogUtil {

    /* renamed from: D */
    private static boolean f10839D = true;

    /* renamed from: E */
    private static boolean f10840E = true;

    /* renamed from: I */
    private static boolean f10841I = false;
    public static final String TAG = "neton---";

    /* renamed from: V */
    private static boolean f10842V = false;

    /* renamed from: W */
    private static boolean f10843W = true;
    private static boolean isDebug = SystemProperties.getBoolean("persist.sys.assert.panic", false);
    private static String seprateor = "-->";
    private static String special = "Neton";

    /* renamed from: e */
    public static void m7849e(String str, Throwable th) {
        if (f10840E) {
            Log.e(str, th.toString());
        }
    }

    /* renamed from: e */
    public static void m7846e(Exception exc) {
        if (f10840E) {
            exc.printStackTrace();
        }
    }

    /* renamed from: v */
    public static void m7853v(String str, String str2) {
        if (f10842V && isDebug) {
            Log.v(str, special + seprateor + str2);
        }
    }

    /* renamed from: d */
    public static void m7845d(String str, String str2) {
        if (f10839D && isDebug) {
            Log.d(str, special + seprateor + str2);
        }
    }

    /* renamed from: i */
    public static void m7851i(String str, String str2) {
        if (f10841I && isDebug) {
            Log.i(str, special + seprateor + str2);
        }
    }

    /* renamed from: w */
    public static void m7855w(String str, String str2) {
        if (f10843W && isDebug) {
            Log.w(str, special + seprateor + str2);
        }
    }

    /* renamed from: e */
    public static void m7848e(String str, String str2) {
        if (f10840E && isDebug) {
            Log.e(str, special + seprateor + str2);
        }
    }

    /* renamed from: v */
    public static void m7852v(String str) {
        if (f10842V && isDebug) {
            Log.v(TAG, special + seprateor + str);
        }
    }

    /* renamed from: d */
    public static void m7844d(String str) {
        if (f10839D && isDebug) {
            Log.d(TAG, special + seprateor + str);
        }
    }

    /* renamed from: i */
    public static void m7850i(String str) {
        if (f10841I && isDebug) {
            Log.i(TAG, special + seprateor + str);
        }
    }

    /* renamed from: w */
    public static void m7854w(String str) {
        if (f10843W && isDebug) {
            Log.w(TAG, special + seprateor + str);
        }
    }

    /* renamed from: e */
    public static void m7847e(String str) {
        if (f10840E && isDebug) {
            Log.e(TAG, special + seprateor + str);
        }
    }

    public static String getSpecial() {
        return special;
    }

    public static void setSpecial(String str) {
        special = str;
    }

    public static boolean isV() {
        return f10842V;
    }

    public static void setV(boolean z) {
        f10842V = z;
    }

    public static boolean isD() {
        return f10839D;
    }

    public static void setD(boolean z) {
        f10839D = z;
    }

    public static boolean isI() {
        return f10841I;
    }

    public static void setI(boolean z) {
        f10841I = z;
    }

    public static boolean isW() {
        return f10843W;
    }

    public static void setW(boolean z) {
        f10843W = z;
    }

    public static boolean isE() {
        return f10840E;
    }

    public static void setE(boolean z) {
        f10840E = z;
    }

    public static void setDebugs(boolean z) {
        isDebug = z;
        if (z) {
            f10842V = true;
            f10839D = true;
            f10841I = true;
            f10843W = true;
            f10840E = true;
            return;
        }
        f10842V = false;
        f10839D = false;
        f10841I = false;
        f10843W = false;
        f10840E = false;
    }

    public static boolean isDebugs() {
        return isDebug;
    }

    public static String getSeprateor() {
        return seprateor;
    }

    public static void setSeprateor(String str) {
        seprateor = str;
    }
}
