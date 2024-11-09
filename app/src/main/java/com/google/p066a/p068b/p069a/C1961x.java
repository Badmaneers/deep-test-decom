package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.p070c.C1999a;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* renamed from: com.google.a.b.a.x */
/* loaded from: classes.dex */
public final class C1961x<T> extends AbstractC1902af<T> {

    /* renamed from: a */
    private final C2015j f8757a;

    /* renamed from: b */
    private final AbstractC1902af<T> f8758b;

    /* renamed from: c */
    private final Type f8759c;

    public C1961x(C2015j c2015j, AbstractC1902af<T> abstractC1902af, Type type) {
        this.f8757a = c2015j;
        this.f8758b = abstractC1902af;
        this.f8759c = type;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final T mo6058a(C2001a c2001a) {
        return this.f8758b.mo6058a(c2001a);
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final void mo6059a(C2006f c2006f, T t) {
        AbstractC1902af<T> abstractC1902af = this.f8758b;
        Type type = this.f8759c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f8759c) {
            abstractC1902af = this.f8757a.m6218a((C1999a) C1999a.m6164a(type));
            if ((abstractC1902af instanceof C1955r) && !(this.f8758b instanceof C1955r)) {
                abstractC1902af = this.f8758b;
            }
        }
        abstractC1902af.mo6059a(c2006f, t);
    }
}
