package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p068b.C1973b;
import com.google.p066a.p068b.C1977f;
import com.google.p066a.p070c.C1999a;
import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: MapTypeAdapterFactory.java */
/* renamed from: com.google.a.b.a.k */
/* loaded from: classes.dex */
public final class C1948k implements InterfaceC1903ag {

    /* renamed from: a */
    private final C1977f f8729a;

    /* renamed from: b */
    private final boolean f8730b = false;

    public C1948k(C1977f c1977f) {
        this.f8729a = c1977f;
    }

    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        Type m6166b = c1999a.m6166b();
        if (!Map.class.isAssignableFrom(c1999a.m6165a())) {
            return null;
        }
        Type[] m6128b = C1973b.m6128b(m6166b, C1973b.m6126b(m6166b));
        Type type = m6128b[0];
        return new C1949l(this, c2015j, m6128b[0], (type == Boolean.TYPE || type == Boolean.class) ? C1962y.f8783f : c2015j.m6218a((C1999a) C1999a.m6164a(type)), m6128b[1], c2015j.m6218a((C1999a) C1999a.m6164a(m6128b[1])), this.f8729a.m6136a(c1999a));
    }
}
