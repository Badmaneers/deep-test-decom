package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1898ab;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ac */
/* loaded from: classes.dex */
final class C1909ac extends AbstractC1902af<Character> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, Character ch) {
        Character ch2 = ch;
        c2006f.mo6099b(ch2 == null ? null : String.valueOf(ch2));
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Character mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        String mo6083h = c2001a.mo6083h();
        if (mo6083h.length() != 1) {
            throw new C1898ab("Expecting character, got: ".concat(String.valueOf(mo6083h)));
        }
        return Character.valueOf(mo6083h.charAt(0));
    }
}
