package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.net.URL;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ai */
/* loaded from: classes.dex */
final class C1915ai extends AbstractC1902af<URL> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, URL url) {
        URL url2 = url;
        c2006f.mo6099b(url2 == null ? null : url2.toExternalForm());
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ URL mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        String mo6083h = c2001a.mo6083h();
        if ("null".equals(mo6083h)) {
            return null;
        }
        return new URL(mo6083h);
    }
}
