package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.AbstractC2026u;
import com.google.p066a.C2024s;
import com.google.p066a.C2028w;
import com.google.p066a.C2029x;
import com.google.p066a.C2031z;
import com.google.p066a.p068b.C1989r;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import java.util.Iterator;
import java.util.Map;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.a.b.a.ar */
/* loaded from: classes.dex */
final class C1924ar extends AbstractC1902af<AbstractC2026u> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2026u mo6058a(C2001a c2001a) {
        switch (c2001a.mo6081f()) {
            case NUMBER:
                return new C2031z(new C1989r(c2001a.mo6083h()));
            case BOOLEAN:
                return new C2031z(Boolean.valueOf(c2001a.mo6084i()));
            case STRING:
                return new C2031z(c2001a.mo6083h());
            case NULL:
                c2001a.mo6085j();
                return C2028w.f8949a;
            case BEGIN_ARRAY:
                C2024s c2024s = new C2024s();
                c2001a.mo6076a();
                while (c2001a.mo6080e()) {
                    c2024s.m6225a(mo6058a(c2001a));
                }
                c2001a.mo6077b();
                return c2024s;
            case BEGIN_OBJECT:
                C2029x c2029x = new C2029x();
                c2001a.mo6078c();
                while (c2001a.mo6080e()) {
                    c2029x.m6232a(c2001a.mo6082g(), mo6058a(c2001a));
                }
                c2001a.mo6079d();
                return c2029x;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6059a(C2006f c2006f, AbstractC2026u abstractC2026u) {
        if (abstractC2026u == null || (abstractC2026u instanceof C2028w)) {
            c2006f.mo6103f();
            return;
        }
        if (abstractC2026u instanceof C2031z) {
            C2031z m6231g = abstractC2026u.m6231g();
            if (m6231g.m6238i()) {
                c2006f.mo6094a(m6231g.mo6224a());
                return;
            } else if (m6231g.m6237h()) {
                c2006f.mo6096a(m6231g.mo6230f());
                return;
            } else {
                c2006f.mo6099b(m6231g.mo6226b());
                return;
            }
        }
        boolean z = abstractC2026u instanceof C2024s;
        if (z) {
            c2006f.mo6098b();
            if (z) {
                Iterator<AbstractC2026u> it = ((C2024s) abstractC2026u).iterator();
                while (it.hasNext()) {
                    mo6059a(c2006f, it.next());
                }
                c2006f.mo6100c();
                return;
            }
            throw new IllegalStateException("This is not a JSON Array.");
        }
        boolean z2 = abstractC2026u instanceof C2029x;
        if (z2) {
            c2006f.mo6101d();
            if (z2) {
                for (Map.Entry<String, AbstractC2026u> entry : ((C2029x) abstractC2026u).m6233h()) {
                    c2006f.mo6095a(entry.getKey());
                    mo6059a(c2006f, entry.getValue());
                }
                c2006f.mo6102e();
                return;
            }
            throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(abstractC2026u)));
        }
        throw new IllegalArgumentException("Couldn't write " + abstractC2026u.getClass());
    }
}
