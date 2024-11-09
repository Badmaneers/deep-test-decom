package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.util.UUID;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.am */
/* loaded from: classes.dex */
final class C1919am extends AbstractC1902af<UUID> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, UUID uuid) {
        UUID uuid2 = uuid;
        c2006f.mo6099b(uuid2 == null ? null : uuid2.toString());
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ UUID mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        return UUID.fromString(c2001a.mo6083h());
    }
}
