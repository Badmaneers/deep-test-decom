package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1898ab;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ba */
/* loaded from: classes.dex */
final class C1934ba extends AbstractC1902af<Number> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Number mo6058a(C2001a c2001a) {
        return m6068b(c2001a);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6059a(C2006f c2006f, Number number) {
        c2006f.mo6094a(number);
    }

    /* renamed from: b */
    private static Number m6068b(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        try {
            return Byte.valueOf((byte) c2001a.mo6088m());
        } catch (NumberFormatException e) {
            throw new C1898ab(e);
        }
    }
}
