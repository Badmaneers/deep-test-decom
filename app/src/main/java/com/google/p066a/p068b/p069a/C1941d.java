package com.google.p066a.p068b.p069a;

import com.google.p066a.AbstractC1902af;
import com.google.p066a.C2015j;
import com.google.p066a.p068b.InterfaceC1990s;
import com.google.p066a.p071d.C2001a;
import com.google.p066a.p071d.C2006f;
import com.google.p066a.p071d.EnumC2005e;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionTypeAdapterFactory.java */
/* renamed from: com.google.a.b.a.d */
/* loaded from: classes.dex */
final class C1941d<E> extends AbstractC1902af<Collection<E>> {

    /* renamed from: a */
    final /* synthetic */ C1940c f8714a;

    /* renamed from: b */
    private final AbstractC1902af<E> f8715b;

    /* renamed from: c */
    private final InterfaceC1990s<? extends Collection<E>> f8716c;

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ void mo6059a(C2006f c2006f, Object obj) {
        Collection collection = (Collection) obj;
        if (collection == null) {
            c2006f.mo6103f();
            return;
        }
        c2006f.mo6098b();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            this.f8715b.mo6059a(c2006f, it.next());
        }
        c2006f.mo6100c();
    }

    public C1941d(C1940c c1940c, C2015j c2015j, Type type, AbstractC1902af<E> abstractC1902af, InterfaceC1990s<? extends Collection<E>> interfaceC1990s) {
        this.f8714a = c1940c;
        this.f8715b = new C1961x(c2015j, abstractC1902af, type);
        this.f8716c = interfaceC1990s;
    }

    @Override // com.google.p066a.AbstractC1902af
    /* renamed from: a */
    public final /* synthetic */ Object mo6058a(C2001a c2001a) {
        if (c2001a.mo6081f() == EnumC2005e.NULL) {
            c2001a.mo6085j();
            return null;
        }
        Collection<E> mo6137a = this.f8716c.mo6137a();
        c2001a.mo6076a();
        while (c2001a.mo6080e()) {
            mo6137a.add(this.f8715b.mo6058a(c2001a));
        }
        c2001a.mo6077b();
        return mo6137a;
    }
}
