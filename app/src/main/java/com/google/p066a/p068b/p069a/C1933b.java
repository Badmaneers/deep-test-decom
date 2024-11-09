package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p068b.C1973b;
import com.google.p066a.p070c.C1999a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: ArrayTypeAdapter.java */
/* renamed from: com.google.a.b.a.b */
/* loaded from: classes.dex */
final class C1933b implements InterfaceC1903ag {
    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        Type m6166b = c1999a.m6166b();
        if (!(m6166b instanceof GenericArrayType) && (!(m6166b instanceof Class) || !((Class) m6166b).isArray())) {
            return null;
        }
        Type m6130d = C1973b.m6130d(m6166b);
        return new C1906a(c2015j, c2015j.m6218a((C1999a) C1999a.m6164a(m6130d)), C1973b.m6126b(m6130d));
    }
}
