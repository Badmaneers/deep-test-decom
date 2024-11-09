package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
public final class C0405c {

    /* renamed from: g */
    private static final Handler f2126g = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    protected static final Class<?> f2120a = m1463d();

    /* renamed from: b */
    protected static final Field f2121b = m1459b();

    /* renamed from: c */
    protected static final Field f2122c = m1461c();

    /* renamed from: d */
    protected static final Method f2123d = m1455a(f2120a);

    /* renamed from: e */
    protected static final Method f2124e = m1460b(f2120a);

    /* renamed from: f */
    protected static final Method f2125f = m1462c(f2120a);

    /* renamed from: a */
    public static boolean m1457a(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m1456a() && f2125f == null) {
            return false;
        }
        if (f2124e == null && f2123d == null) {
            return false;
        }
        try {
            Object obj2 = f2122c.get(activity);
            if (obj2 == null || (obj = f2121b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0409g c0409g = new C0409g(activity);
            application.registerActivityLifecycleCallbacks(c0409g);
            f2126g.post(new RunnableC0406d(c0409g, obj2));
            try {
                if (m1456a()) {
                    f2125f.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f2126g.post(new RunnableC0407e(application, c0409g));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m1458a(Object obj, Activity activity) {
        try {
            Object obj2 = f2122c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f2126g.postAtFrontOfQueue(new RunnableC0408f(f2121b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: a */
    private static Method m1455a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Method m1460b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m1456a() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }

    /* renamed from: c */
    private static Method m1462c(Class<?> cls) {
        if (!m1456a() || cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m1459b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Field m1461c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m1463d() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }
}
