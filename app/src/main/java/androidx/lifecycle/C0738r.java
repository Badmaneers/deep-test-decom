package androidx.lifecycle;

import com.coloros.neton.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Lifecycling.java */
/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public final class C0738r {

    /* renamed from: a */
    private static Map<Class, Integer> f3087a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends InterfaceC0726f>>> f3088b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC0731k m2628a(Object obj) {
        boolean z = obj instanceof InterfaceC0731k;
        boolean z2 = obj instanceof InterfaceC0724d;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((InterfaceC0724d) obj, (InterfaceC0731k) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((InterfaceC0724d) obj, null);
        }
        if (z) {
            return (InterfaceC0731k) obj;
        }
        Class<?> cls = obj.getClass();
        if (m2630b(cls) == 2) {
            List<Constructor<? extends InterfaceC0726f>> list = f3088b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(m2627a(list.get(0), obj));
            }
            InterfaceC0726f[] interfaceC0726fArr = new InterfaceC0726f[list.size()];
            for (int i = 0; i < list.size(); i++) {
                interfaceC0726fArr[i] = m2627a(list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC0726fArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: a */
    private static InterfaceC0726f m2627a(Constructor<? extends InterfaceC0726f> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    private static Constructor<? extends InterfaceC0726f> m2629a(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : BuildConfig.FLAVOR;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String str = canonicalName.replace(".", "_") + "_LifecycleAdapter";
            if (!name.isEmpty()) {
                str = name + "." + str;
            }
            Constructor declaredConstructor = Class.forName(str).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m2630b(Class<?> cls) {
        Integer num = f3087a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m2631c = m2631c(cls);
        f3087a.put(cls, Integer.valueOf(m2631c));
        return m2631c;
    }

    /* renamed from: c */
    private static int m2631c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0726f> m2629a = m2629a(cls);
        if (m2629a != null) {
            f3088b.put(cls, Collections.singletonList(m2629a));
            return 2;
        }
        if (C0715a.f3056a.m2597a(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (m2632d(superclass)) {
            if (m2630b(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f3088b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (m2632d(cls2)) {
                if (m2630b(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f3088b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3088b.put(cls, arrayList);
        return 2;
    }

    /* renamed from: d */
    private static boolean m2632d(Class<?> cls) {
        return cls != null && InterfaceC0732l.class.isAssignableFrom(cls);
    }
}
