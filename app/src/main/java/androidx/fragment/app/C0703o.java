package androidx.fragment.app;

import androidx.p011b.C0328n;
import java.lang.reflect.InvocationTargetException;

/* compiled from: FragmentFactory.java */
/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public class C0703o {

    /* renamed from: a */
    private static final C0328n<String, Class<?>> f2978a = new C0328n<>();

    /* renamed from: d */
    private static Class<?> m2467d(ClassLoader classLoader, String str) {
        Class<?> cls = f2978a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f2978a.put(str, cls2);
        return cls2;
    }

    /* renamed from: a */
    public static boolean m2465a(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m2467d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static Class<? extends Fragment> m2466b(ClassLoader classLoader, String str) {
        try {
            return m2467d(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0697i("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new C0697i("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* renamed from: c */
    public Fragment mo2468c(ClassLoader classLoader, String str) {
        try {
            return m2466b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C0697i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0697i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0697i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0697i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
