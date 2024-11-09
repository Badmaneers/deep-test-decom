package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2027v;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.aj */
/* loaded from: classes.dex */
final class C1916aj extends AbstractC1902af<URI> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ URI mo6058a(C2001a c2001a) {
        return m6065b(c2001a);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, URI uri) {
        URI uri2 = uri;
        c2006f.mo6099b(uri2 == null ? null : uri2.toASCIIString());
    }

    /* renamed from: b */
    private static URI m6065b(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        try {
            String mo6083h = c2001a.mo6083h();
            if ("null".equals(mo6083h)) {
                return null;
            }
            return new URI(mo6083h);
        } catch (URISyntaxException e) {
            throw new C2027v(e);
        }
    }
}
