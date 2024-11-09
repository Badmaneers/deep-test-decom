package com.google.p066a.p068b;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnsafeAllocator.java */
/* renamed from: com.google.a.b.af */
/* loaded from: classes.dex */
public final class C1969af extends AbstractC1968ae {

    /* renamed from: a */
    final /* synthetic */ Method f8815a;

    /* renamed from: b */
    final /* synthetic */ Object f8816b;

    public C1969af(Method method, Object obj) {
        this.f8815a = method;
        this.f8816b = obj;
    }

    @Override // com.google.p066a.p068b.AbstractC1968ae
    /* renamed from: a */
    public final <T> T mo6115a(Class<T> cls) {
        return (T) this.f8815a.invoke(this.f8816b, cls);
    }
}
