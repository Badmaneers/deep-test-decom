package com.google.p066a.p071d;

import com.google.p066a.p068b.AbstractC1988q;
import com.google.p066a.p068b.p069a.C1944g;

/* compiled from: JsonReader.java */
/* renamed from: com.google.a.d.b */
/* loaded from: classes.dex */
final class C2002b extends AbstractC1988q {
    @Override // com.google.p066a.p068b.AbstractC1988q
    /* renamed from: a */
    public final void mo6148a(C2001a c2001a) {
        EnumC2005e enumC2005e;
        int m6188r;
        int m6189s;
        String str;
        if (c2001a instanceof C1944g) {
            ((C1944g) c2001a).m6090o();
            return;
        }
        c2001a.mo6081f();
        enumC2005e = c2001a.f8892l;
        if (enumC2005e == EnumC2005e.NAME) {
            str = c2001a.f8893m;
            c2001a.f8894n = str;
            C2001a.m6184e(c2001a);
            c2001a.f8892l = EnumC2005e.STRING;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected a name but was ");
        sb.append(c2001a.mo6081f());
        sb.append("  at line ");
        m6188r = c2001a.m6188r();
        sb.append(m6188r);
        sb.append(" column ");
        m6189s = c2001a.m6189s();
        sb.append(m6189s);
        throw new IllegalStateException(sb.toString());
    }
}
