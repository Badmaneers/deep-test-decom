package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1898ab;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.math.BigDecimal;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ae */
/* loaded from: classes.dex */
final class C1911ae extends AbstractC1902af<BigDecimal> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ BigDecimal mo6058a(C2001a c2001a) {
        return m6063b(c2001a);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6059a(C2006f c2006f, BigDecimal bigDecimal) {
        c2006f.mo6094a(bigDecimal);
    }

    /* renamed from: b */
    private static BigDecimal m6063b(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        try {
            return new BigDecimal(c2001a.mo6083h());
        } catch (NumberFormatException e) {
            throw new C1898ab(e);
        }
    }
}
