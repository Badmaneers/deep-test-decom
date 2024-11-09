package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ad */
/* loaded from: classes.dex */
final class C1910ad extends AbstractC1902af<String> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, String str) {
        c2006f.mo6099b(str);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ String mo6058a(C2001a c2001a) {
        EnumC2005e mo6081f = c2001a.mo6081f();
        if (mo6081f == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        if (mo6081f == EnumC2005e.BOOLEAN) {
            return Boolean.toString(c2001a.mo6084i());
        }
        return c2001a.mo6083h();
    }
}
