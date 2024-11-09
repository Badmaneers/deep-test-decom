package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.util.Locale;
import java.util.StringTokenizer;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.aq */
/* loaded from: classes.dex */
final class C1923aq extends AbstractC1902af<Locale> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, Locale locale) {
        Locale locale2 = locale;
        c2006f.mo6099b(locale2 == null ? null : locale2.toString());
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Locale mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(c2001a.mo6083h(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (nextToken2 == null && nextToken3 == null) {
            return new Locale(nextToken);
        }
        if (nextToken3 == null) {
            return new Locale(nextToken, nextToken2);
        }
        return new Locale(nextToken, nextToken2, nextToken3);
    }
}
