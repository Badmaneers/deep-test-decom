package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.InterfaceC1903ag;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: ArrayTypeAdapter.java */
/* renamed from: com.google.a.b.a.a */
/* loaded from: classes.dex */
public final class C1906a<E> extends AbstractC1902af<Object> {

    /* renamed from: a */
    public static final InterfaceC1903ag f8695a = new C1933b();

    /* renamed from: b */
    private final Class<E> f8696b;

    /* renamed from: c */
    private final AbstractC1902af<E> f8697c;

    public C1906a(C2015j c2015j, AbstractC1902af<E> abstractC1902af, Class<E> cls) {
        this.f8697c = new C1961x(c2015j, abstractC1902af, cls);
        this.f8696b = cls;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final Object mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c2001a.mo6076a();
        while (c2001a.mo6080e()) {
            arrayList.add(this.f8697c.mo6058a(c2001a));
        }
        c2001a.mo6077b();
        Object newInstance = Array.newInstance((Class<?>) this.f8696b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final void mo6059a(C2006f c2006f, Object obj) {
        if (obj == null) {
            c2006f.mo6103f();
            return;
        }
        c2006f.mo6098b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f8697c.mo6059a(c2006f, Array.get(obj, i));
        }
        c2006f.mo6100c();
    }
}
