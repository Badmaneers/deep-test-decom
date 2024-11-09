package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1898ab;
import com.google.p066a.p068b.C1989r;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ab */
/* loaded from: classes.dex */
final class C1908ab extends AbstractC1902af<Number> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6059a(C2006f c2006f, Number number) {
        c2006f.mo6094a(number);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Number mo6058a(C2001a c2001a) {
        EnumC2005e mo6081f = c2001a.mo6081f();
        int i = C1931ay.f8710a[mo6081f.ordinal()];
        if (i == 1) {
            return new C1989r(c2001a.mo6083h());
        }
        if (i == 4) {
            c2001a.mo6085j();
            return null;
        }
        throw new C1898ab("Expecting number, got: ".concat(String.valueOf(mo6081f)));
    }
}
