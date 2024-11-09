package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ClassesInfoCache.java */
/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
final class C0723c {

    /* renamed from: a */
    final int f3066a;

    /* renamed from: b */
    final Method f3067b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0723c(int i, Method method) {
        this.f3066a = i;
        this.f3067b = method;
        this.f3067b.setAccessible(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2607a(InterfaceC0733m interfaceC0733m, EnumC0729i enumC0729i, Object obj) {
        try {
            switch (this.f3066a) {
                case 0:
                    this.f3067b.invoke(obj, new Object[0]);
                    return;
                case 1:
                    this.f3067b.invoke(obj, interfaceC0733m);
                    return;
                case 2:
                    this.f3067b.invoke(obj, interfaceC0733m, enumC0729i);
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("Failed to call observer method", e2.getCause());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0723c c0723c = (C0723c) obj;
        return this.f3066a == c0723c.f3066a && this.f3067b.getName().equals(c0723c.f3067b.getName());
    }

    public final int hashCode() {
        return (this.f3066a * 31) + this.f3067b.getName().hashCode();
    }
}
