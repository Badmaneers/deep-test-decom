package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.net.InetAddress;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.al */
/* loaded from: classes.dex */
final class C1918al extends AbstractC1902af<InetAddress> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, InetAddress inetAddress) {
        InetAddress inetAddress2 = inetAddress;
        c2006f.mo6099b(inetAddress2 == null ? null : inetAddress2.getHostAddress());
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ InetAddress mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        return InetAddress.getByName(c2001a.mo6083h());
    }
}
