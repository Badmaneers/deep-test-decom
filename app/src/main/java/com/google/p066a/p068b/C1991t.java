package com.google.p066a.p068b;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Primitives.java */
/* renamed from: com.google.a.b.t */
/* loaded from: classes.dex */
public final class C1991t {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f8857a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f8858b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m6150a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m6150a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m6150a(hashMap, hashMap2, Character.TYPE, Character.class);
        m6150a(hashMap, hashMap2, Double.TYPE, Double.class);
        m6150a(hashMap, hashMap2, Float.TYPE, Float.class);
        m6150a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m6150a(hashMap, hashMap2, Long.TYPE, Long.class);
        m6150a(hashMap, hashMap2, Short.TYPE, Short.class);
        m6150a(hashMap, hashMap2, Void.TYPE, Void.class);
        f8857a = Collections.unmodifiableMap(hashMap);
        f8858b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m6150a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m6151a(Type type) {
        return f8857a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m6149a(Class<T> cls) {
        Class<T> cls2 = (Class) f8857a.get(C1905a.m6061a(cls));
        return cls2 == null ? cls : cls2;
    }
}
