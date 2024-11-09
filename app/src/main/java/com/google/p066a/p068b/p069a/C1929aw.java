package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p070c.C1999a;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.aw */
/* loaded from: classes.dex */
final class C1929aw implements InterfaceC1903ag {

    /* renamed from: a */
    final /* synthetic */ Class f8705a;

    /* renamed from: b */
    final /* synthetic */ Class f8706b;

    /* renamed from: c */
    final /* synthetic */ AbstractC1902af f8707c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1929aw(Class cls, Class cls2, AbstractC1902af abstractC1902af) {
        this.f8705a = cls;
        this.f8706b = cls2;
        this.f8707c = abstractC1902af;
    }

    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        Class<? super T> m6165a = c1999a.m6165a();
        if (m6165a == this.f8705a || m6165a == this.f8706b) {
            return this.f8707c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f8705a.getName() + "+" + this.f8706b.getName() + ",adapter=" + this.f8707c + "]";
    }
}
