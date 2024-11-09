package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.AbstractC2026u;
import com.google.p066a.C1898ab;
import com.google.p066a.C2015j;
import com.google.p066a.C2024s;
import com.google.p066a.C2028w;
import com.google.p066a.C2029x;
import com.google.p066a.C2031z;
import com.google.p066a.p068b.AbstractC1988q;
import com.google.p066a.p068b.C1992u;
import com.google.p066a.p068b.InterfaceC1990s;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: MapTypeAdapterFactory.java */
/* renamed from: com.google.a.b.a.l */
/* loaded from: classes.dex */
final class C1949l<K, V> extends AbstractC1902af<Map<K, V>> {

    /* renamed from: a */
    final /* synthetic */ C1948k f8731a;

    /* renamed from: b */
    private final AbstractC1902af<K> f8732b;

    /* renamed from: c */
    private final AbstractC1902af<V> f8733c;

    /* renamed from: d */
    private final InterfaceC1990s<? extends Map<K, V>> f8734d;

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, Object obj) {
        boolean z;
        String str;
        Map map = (Map) obj;
        if (map != null) {
            z = this.f8731a.f8730b;
            if (!z) {
                c2006f.mo6101d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c2006f.mo6095a(String.valueOf(entry.getKey()));
                    this.f8733c.mo6059a(c2006f, entry.getValue());
                }
                c2006f.mo6102e();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z2 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                AbstractC2026u m6057a = this.f8732b.m6057a((AbstractC1902af<K>) entry2.getKey());
                arrayList.add(m6057a);
                arrayList2.add(entry2.getValue());
                z2 |= (m6057a instanceof C2024s) || (m6057a instanceof C2029x);
            }
            if (z2) {
                c2006f.mo6098b();
                while (i < arrayList.size()) {
                    c2006f.mo6098b();
                    C1992u.m6152a((AbstractC2026u) arrayList.get(i), c2006f);
                    this.f8733c.mo6059a(c2006f, arrayList2.get(i));
                    c2006f.mo6100c();
                    i++;
                }
                c2006f.mo6100c();
                return;
            }
            c2006f.mo6101d();
            while (i < arrayList.size()) {
                AbstractC2026u abstractC2026u = (AbstractC2026u) arrayList.get(i);
                if (abstractC2026u instanceof C2031z) {
                    C2031z m6231g = abstractC2026u.m6231g();
                    if (m6231g.m6238i()) {
                        str = String.valueOf(m6231g.mo6224a());
                    } else if (m6231g.m6237h()) {
                        str = Boolean.toString(m6231g.mo6230f());
                    } else if (m6231g.m6239j()) {
                        str = m6231g.mo6226b();
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    if (!(abstractC2026u instanceof C2028w)) {
                        throw new AssertionError();
                    }
                    str = "null";
                }
                c2006f.mo6095a(str);
                this.f8733c.mo6059a(c2006f, arrayList2.get(i));
                i++;
            }
            c2006f.mo6102e();
            return;
        }
        c2006f.mo6103f();
    }

    public C1949l(C1948k c1948k, C2015j c2015j, Type type, AbstractC1902af<K> abstractC1902af, Type type2, AbstractC1902af<V> abstractC1902af2, InterfaceC1990s<? extends Map<K, V>> interfaceC1990s) {
        this.f8731a = c1948k;
        this.f8732b = new C1961x(c2015j, abstractC1902af, type);
        this.f8733c = new C1961x(c2015j, abstractC1902af2, type2);
        this.f8734d = interfaceC1990s;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Object mo6058a(C2001a c2001a) {
        EnumC2005e mo6081f = c2001a.mo6081f();
        if (mo6081f == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        Map<K, V> mo6137a = this.f8734d.mo6137a();
        if (mo6081f == EnumC2005e.BEGIN_ARRAY) {
            c2001a.mo6076a();
            while (c2001a.mo6080e()) {
                c2001a.mo6076a();
                K mo6058a = this.f8732b.mo6058a(c2001a);
                if (mo6137a.put(mo6058a, this.f8733c.mo6058a(c2001a)) != null) {
                    throw new C1898ab("duplicate key: ".concat(String.valueOf(mo6058a)));
                }
                c2001a.mo6077b();
            }
            c2001a.mo6077b();
        } else {
            c2001a.mo6078c();
            while (c2001a.mo6080e()) {
                AbstractC1988q.f8855a.mo6148a(c2001a);
                K mo6058a2 = this.f8732b.mo6058a(c2001a);
                if (mo6137a.put(mo6058a2, this.f8733c.mo6058a(c2001a)) != null) {
                    throw new C1898ab("duplicate key: ".concat(String.valueOf(mo6058a2)));
                }
            }
            c2001a.mo6079d();
        }
        return mo6137a;
    }
}
