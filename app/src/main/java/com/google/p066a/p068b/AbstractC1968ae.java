package com.google.p066a.p068b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* renamed from: com.google.a.b.ae */
/* loaded from: classes.dex */
public abstract class AbstractC1968ae {
    /* renamed from: a */
    public abstract <T> T mo6115a(Class<T> cls);

    /* renamed from: a */
    public static AbstractC1968ae m6114a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C1969af(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    return new C1970ag(declaredMethod);
                } catch (Exception unused2) {
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod2.setAccessible(true);
                    int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                    Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod3.setAccessible(true);
                    return new C1971ah(declaredMethod3, intValue);
                }
            } catch (Exception unused3) {
                return new C1972ai();
            }
        }
    }
}
