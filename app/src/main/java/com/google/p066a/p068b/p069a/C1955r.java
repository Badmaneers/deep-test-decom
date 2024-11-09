package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C1898ab;
import com.google.p066a.p068b.InterfaceC1990s;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* renamed from: com.google.a.b.a.r */
/* loaded from: classes.dex */
public final class C1955r<T> extends AbstractC1902af<T> {

    /* renamed from: a */
    final /* synthetic */ C1953p f8747a;

    /* renamed from: b */
    private final InterfaceC1990s<T> f8748b;

    /* renamed from: c */
    private final Map<String, AbstractC1956s> f8749c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1955r(C1953p c1953p, InterfaceC1990s interfaceC1990s, Map map, byte b) {
        this(c1953p, interfaceC1990s, map);
    }

    private C1955r(C1953p c1953p, InterfaceC1990s<T> interfaceC1990s, Map<String, AbstractC1956s> map) {
        this.f8747a = c1953p;
        this.f8748b = interfaceC1990s;
        this.f8749c = map;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final T mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        T mo6137a = this.f8748b.mo6137a();
        try {
            c2001a.mo6078c();
            while (c2001a.mo6080e()) {
                AbstractC1956s abstractC1956s = this.f8749c.get(c2001a.mo6082g());
                if (abstractC1956s != null && abstractC1956s.f8752i) {
                    abstractC1956s.mo6107a(c2001a, mo6137a);
                }
                c2001a.mo6089n();
            }
            c2001a.mo6079d();
            return mo6137a;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (IllegalStateException e2) {
            throw new C1898ab(e2);
        }
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final void mo6059a(C2006f c2006f, T t) {
        if (t == null) {
            c2006f.mo6103f();
            return;
        }
        c2006f.mo6101d();
        try {
            for (AbstractC1956s abstractC1956s : this.f8749c.values()) {
                if (abstractC1956s.f8751h) {
                    c2006f.mo6095a(abstractC1956s.f8750g);
                    abstractC1956s.mo6108a(c2006f, t);
                }
            }
            c2006f.mo6102e();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
