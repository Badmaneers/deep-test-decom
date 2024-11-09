package com.google.p066a.p068b;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.p070c.C1999a;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Excluder.java */
/* renamed from: com.google.a.b.p */
/* loaded from: classes.dex */
final class C1987p<T> extends AbstractC1902af<T> {

    /* renamed from: a */
    final /* synthetic */ boolean f8849a;

    /* renamed from: b */
    final /* synthetic */ boolean f8850b;

    /* renamed from: c */
    final /* synthetic */ C2015j f8851c;

    /* renamed from: d */
    final /* synthetic */ C1999a f8852d;

    /* renamed from: e */
    final /* synthetic */ C1986o f8853e;

    /* renamed from: f */
    private AbstractC1902af<T> f8854f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1987p(C1986o c1986o, boolean z, boolean z2, C2015j c2015j, C1999a c1999a) {
        this.f8853e = c1986o;
        this.f8849a = z;
        this.f8850b = z2;
        this.f8851c = c2015j;
        this.f8852d = c1999a;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final T mo6058a(C2001a c2001a) {
        if (this.f8849a) {
            c2001a.mo6089n();
            return null;
        }
        return m6147a().mo6058a(c2001a);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final void mo6059a(C2006f c2006f, T t) {
        if (this.f8850b) {
            c2006f.mo6103f();
        } else {
            m6147a().mo6059a(c2006f, t);
        }
    }

    /* renamed from: a */
    private AbstractC1902af<T> m6147a() {
        AbstractC1902af<T> abstractC1902af = this.f8854f;
        if (abstractC1902af != null) {
            return abstractC1902af;
        }
        AbstractC1902af<T> m6217a = this.f8851c.m6217a(this.f8853e, this.f8852d);
        this.f8854f = m6217a;
        return m6217a;
    }
}
