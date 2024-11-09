package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p070c.C1999a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.au */
/* loaded from: classes.dex */
public final class C1927au implements InterfaceC1903ag {

    /* renamed from: a */
    final /* synthetic */ Class f8702a;

    /* renamed from: b */
    final /* synthetic */ Class f8703b;

    /* renamed from: c */
    final /* synthetic */ AbstractC1902af f8704c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1927au(Class cls, Class cls2, AbstractC1902af abstractC1902af) {
        this.f8702a = cls;
        this.f8703b = cls2;
        this.f8704c = abstractC1902af;
    }

    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        Class<? super T> m6165a = c1999a.m6165a();
        if (m6165a == this.f8702a || m6165a == this.f8703b) {
            return this.f8704c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f8703b.getName() + "+" + this.f8702a.getName() + ",adapter=" + this.f8704c + "]";
    }
}
