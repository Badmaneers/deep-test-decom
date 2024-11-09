package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat.java */
/* renamed from: androidx.core.app.i */
/* loaded from: classes.dex */
final class C0411i {

    /* renamed from: a */
    private static Method f2138a;

    /* renamed from: b */
    private static boolean f2139b;

    /* renamed from: c */
    private static Method f2140c;

    /* renamed from: d */
    private static boolean f2141d;

    /* renamed from: a */
    public static IBinder m1466a(Bundle bundle, String str) {
        if (!f2139b) {
            try {
                Method method = Bundle.class.getMethod("getIBinder", String.class);
                f2138a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
            }
            f2139b = true;
        }
        if (f2138a != null) {
            try {
                return (IBinder) f2138a.invoke(bundle, str);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                f2138a = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m1467a(Bundle bundle, String str, IBinder iBinder) {
        if (!f2141d) {
            try {
                Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f2140c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
            }
            f2141d = true;
        }
        if (f2140c != null) {
            try {
                f2140c.invoke(bundle, str, iBinder);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                f2140c = null;
            }
        }
    }
}
