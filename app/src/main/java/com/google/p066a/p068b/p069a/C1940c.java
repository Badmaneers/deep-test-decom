package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p068b.C1973b;
import com.google.p066a.p068b.C1977f;
import com.google.p066a.p070c.C1999a;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: CollectionTypeAdapterFactory.java */
/* renamed from: com.google.a.b.a.c */
/* loaded from: classes.dex */
public final class C1940c implements InterfaceC1903ag {

    /* renamed from: a */
    private final C1977f f8713a;

    public C1940c(C1977f c1977f) {
        this.f8713a = c1977f;
    }

    @Override // com.google.p066a.InterfaceC1903ag
    /* renamed from: a */
    public final <T> AbstractC1902af<T> mo6060a(C2015j c2015j, C1999a<T> c1999a) {
        Type m6166b = c1999a.m6166b();
        Class<? super T> m6165a = c1999a.m6165a();
        if (!Collection.class.isAssignableFrom(m6165a)) {
            return null;
        }
        Type m6121a = C1973b.m6121a(m6166b, (Class<?>) m6165a);
        return new C1941d(this, c2015j, m6121a, c2015j.m6218a((C1999a) C1999a.m6164a(m6121a)), this.f8713a.m6136a(c1999a));
    }
}
