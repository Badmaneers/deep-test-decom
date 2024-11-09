package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
final class C0715a {

    /* renamed from: a */
    static C0715a f3056a = new C0715a();

    /* renamed from: b */
    private final Map<Class, C0722b> f3057b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f3058c = new HashMap();

    C0715a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m2597a(Class cls) {
        Boolean bool = this.f3058c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m2596c = m2596c(cls);
        for (Method method : m2596c) {
            if (((InterfaceC0744x) method.getAnnotation(InterfaceC0744x.class)) != null) {
                m2594a(cls, m2596c);
                return true;
            }
        }
        this.f3058c.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: c */
    private static Method[] m2596c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0722b m2598b(Class cls) {
        C0722b c0722b = this.f3057b.get(cls);
        return c0722b != null ? c0722b : m2594a(cls, null);
    }

    /* renamed from: a */
    private static void m2595a(Map<C0723c, EnumC0729i> map, C0723c c0723c, EnumC0729i enumC0729i, Class cls) {
        EnumC0729i enumC0729i2 = map.get(c0723c);
        if (enumC0729i2 == null || enumC0729i == enumC0729i2) {
            if (enumC0729i2 == null) {
                map.put(c0723c, enumC0729i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0723c.f3067b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0729i2 + ", new value " + enumC0729i);
    }

    /* renamed from: a */
    private C0722b m2594a(Class cls, Method[] methodArr) {
        int i;
        C0722b m2598b;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m2598b = m2598b(superclass)) != null) {
            hashMap.putAll(m2598b.f3065b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0723c, EnumC0729i> entry : m2598b(cls2).f3065b.entrySet()) {
                m2595a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m2596c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0744x interfaceC0744x = (InterfaceC0744x) method.getAnnotation(InterfaceC0744x.class);
            if (interfaceC0744x != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0733m.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0729i m2638a = interfaceC0744x.m2638a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(EnumC0729i.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (m2638a != EnumC0729i.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2595a(hashMap, new C0723c(i, method), m2638a, cls);
                z = true;
            }
        }
        C0722b c0722b = new C0722b(hashMap);
        this.f3057b.put(cls, c0722b);
        this.f3058c.put(cls, Boolean.valueOf(z));
        return c0722b;
    }
}
