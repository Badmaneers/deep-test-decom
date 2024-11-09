package com.google.p066a;

import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Gson.java */
/* renamed from: com.google.a.q */
/* loaded from: classes.dex */
public final class C2022q<T> extends AbstractC1902af<T> {

    /* renamed from: a */
    private AbstractC1902af<T> f8947a;

    /* renamed from: a */
    public final void m6222a(AbstractC1902af<T> abstractC1902af) {
        if (this.f8947a != null) {
            throw new AssertionError();
        }
        this.f8947a = abstractC1902af;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final T mo6058a(C2001a c2001a) {
        if (this.f8947a == null) {
            throw new IllegalStateException();
        }
        return this.f8947a.mo6058a(c2001a);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final void mo6059a(C2006f c2006f, T t) {
        if (this.f8947a == null) {
            throw new IllegalStateException();
        }
        this.f8947a.mo6059a(c2006f, t);
    }
}
