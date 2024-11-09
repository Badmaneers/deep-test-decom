package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p070c.C1999a;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ax */
/* loaded from: classes.dex */
final class C1930ax implements InterfaceC1903ag {

    /* renamed from: a */
    final /* synthetic */ Class f8708a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1902af f8709b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1930ax(Class cls, AbstractC1902af abstractC1902af) {
        this.f8708a = cls;
        this.f8709b = abstractC1902af;
    }

    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        if (this.f8708a.isAssignableFrom(c1999a.m6165a())) {
            return this.f8709b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f8708a.getName() + ",adapter=" + this.f8709b + "]";
    }
}
