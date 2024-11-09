package com.google.p066a.p068b;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnsafeAllocator.java */
/* renamed from: com.google.a.b.ah */
/* loaded from: classes.dex */
public final class C1971ah extends AbstractC1968ae {

    /* renamed from: a */
    final /* synthetic */ Method f8818a;

    /* renamed from: b */
    final /* synthetic */ int f8819b;

    public C1971ah(Method method, int i) {
        this.f8818a = method;
        this.f8819b = i;
    }

    @Override // com.google.p066a.p068b.AbstractC1968ae
    /* renamed from: a */
    public final <T> T mo6115a(Class<T> cls) {
        return (T) this.f8818a.invoke(null, cls, Integer.valueOf(this.f8819b));
    }
}
