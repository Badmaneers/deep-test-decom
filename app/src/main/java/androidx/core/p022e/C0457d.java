package androidx.core.p022e;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ICUCompat.java */
/* renamed from: androidx.core.e.d */
/* loaded from: classes.dex */
public final class C0457d {

    /* renamed from: a */
    private static Method f2242a;

    /* renamed from: b */
    private static Method f2243b;

    static {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f2242a = cls.getMethod("getScript", String.class);
                    f2243b = cls.getMethod("addLikelySubtags", String.class);
                    return;
                }
                return;
            } catch (Exception e) {
                f2242a = null;
                f2243b = null;
                Log.w("ICUCompat", e);
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f2243b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    public static String m1593a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f2243b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String m1594b = m1594b(locale);
        if (m1594b != null) {
            return m1592a(m1594b);
        }
        return null;
    }

    /* renamed from: a */
    private static String m1592a(String str) {
        try {
            if (f2242a != null) {
                return (String) f2242a.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: b */
    private static String m1594b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f2243b != null) {
                return (String) f2243b.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }
}
