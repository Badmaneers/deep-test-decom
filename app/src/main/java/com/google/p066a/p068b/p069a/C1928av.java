package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.av */
/* loaded from: classes.dex */
final class C1928av extends AbstractC1902af<Boolean> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null) {
            c2006f.mo6103f();
        } else {
            c2006f.mo6096a(bool2.booleanValue());
        }
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Boolean mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        if (c2001a.mo6081f() == EnumC2005e.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(c2001a.mo6083h()));
        }
        return Boolean.valueOf(c2001a.mo6084i());
    }
}
