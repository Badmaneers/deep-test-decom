package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ah */
/* loaded from: classes.dex */
final class C1914ah extends AbstractC1902af<StringBuffer> {
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, StringBuffer stringBuffer) {
        StringBuffer stringBuffer2 = stringBuffer;
        c2006f.mo6099b(stringBuffer2 == null ? null : stringBuffer2.toString());
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ StringBuffer mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        return new StringBuffer(c2001a.mo6083h());
    }
}
