package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p068b.C1993v;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* renamed from: com.google.a.b.a.m */
/* loaded from: classes.dex */
public final class C1950m extends AbstractC1902af<Object> {

    /* renamed from: a */
    public static final InterfaceC1903ag f8735a = new C1951n();

    /* renamed from: b */
    private final C2015j f8736b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1950m(C2015j c2015j, byte b) {
        this(c2015j);
    }

    private C1950m(C2015j c2015j) {
        this.f8736b = c2015j;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final Object mo6058a(C2001a c2001a) {
        switch (c2001a.mo6081f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                c2001a.mo6076a();
                while (c2001a.mo6080e()) {
                    arrayList.add(mo6058a(c2001a));
                }
                c2001a.mo6077b();
                return arrayList;
            case BEGIN_OBJECT:
                C1993v c1993v = new C1993v();
                c2001a.mo6078c();
                while (c2001a.mo6080e()) {
                    c1993v.put(c2001a.mo6082g(), mo6058a(c2001a));
                }
                c2001a.mo6079d();
                return c1993v;
            case STRING:
                return c2001a.mo6083h();
            case NUMBER:
                return Double.valueOf(c2001a.mo6086k());
            case BOOLEAN:
                return Boolean.valueOf(c2001a.mo6084i());
            case NULL:
                c2001a.mo6085j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final void mo6059a(C2006f c2006f, Object obj) {
        if (obj == null) {
            c2006f.mo6103f();
            return;
        }
        AbstractC1902af m6219a = this.f8736b.m6219a((Class) obj.getClass());
        if (m6219a instanceof C1950m) {
            c2006f.mo6101d();
            c2006f.mo6102e();
        } else {
            m6219a.mo6059a(c2006f, obj);
        }
    }
}
