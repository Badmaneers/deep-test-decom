package com.google.p066a;

import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Gson.java */
/* renamed from: com.google.a.p */
/* loaded from: classes.dex */
public final class C2021p extends AbstractC1902af<Number> {

    /* renamed from: a */
    final /* synthetic */ C2015j f8946a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2021p(C2015j c2015j) {
        this.f8946a = c2015j;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, Number number) {
        Number number2 = number;
        if (number2 == null) {
            c2006f.mo6103f();
        } else {
            c2006f.mo6099b(number2.toString());
        }
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Number mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        return Long.valueOf(c2001a.mo6087l());
    }
}
