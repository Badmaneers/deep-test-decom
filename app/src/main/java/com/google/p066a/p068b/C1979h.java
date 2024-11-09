package com.google.p066a.p068b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstructorConstructor.java */
/* renamed from: com.google.a.b.h */
/* loaded from: classes.dex */
public final class C1979h<T> implements InterfaceC1990s<T> {

    /* renamed from: a */
    final /* synthetic */ Constructor f8831a;

    /* renamed from: b */
    final /* synthetic */ C1977f f8832b;

    public C1979h(C1977f c1977f, Constructor constructor) {
        this.f8832b = c1977f;
        this.f8831a = constructor;
    }

    @Override // com.google.p066a.p068b.InterfaceC1990s
    /* renamed from: a */
    public final T mo6137a() {
        try {
            return (T) this.f8831a.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke " + this.f8831a + " with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke " + this.f8831a + " with no args", e3.getTargetException());
        }
    }
}
