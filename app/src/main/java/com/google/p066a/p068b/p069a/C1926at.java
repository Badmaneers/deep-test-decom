package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p070c.C1999a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.at */
/* loaded from: classes.dex */
public final class C1926at implements InterfaceC1903ag {

    /* renamed from: a */
    final /* synthetic */ Class f8700a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1902af f8701b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1926at(Class cls, AbstractC1902af abstractC1902af) {
        this.f8700a = cls;
        this.f8701b = abstractC1902af;
    }

    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        if (c1999a.m6165a() == this.f8700a) {
            return this.f8701b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f8700a.getName() + ",adapter=" + this.f8701b + "]";
    }
}
