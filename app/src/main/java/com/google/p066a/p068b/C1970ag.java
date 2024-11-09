package com.google.p066a.p068b;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnsafeAllocator.java */
/* renamed from: com.google.a.b.ag */
/* loaded from: classes.dex */
public final class C1970ag extends AbstractC1968ae {

    /* renamed from: a */
    final /* synthetic */ Method f8817a;

    public C1970ag(Method method) {
        this.f8817a = method;
    }

    @Override // com.google.p066a.p068b.AbstractC1968ae
    /* renamed from: a */
    public final <T> T mo6115a(Class<T> cls) {
        return (T) this.f8817a.invoke(null, cls, Object.class);
    }
}
