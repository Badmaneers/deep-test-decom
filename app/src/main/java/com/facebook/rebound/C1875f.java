package com.facebook.rebound;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseSpringSystem.java */
/* renamed from: com.facebook.rebound.f */
/* loaded from: classes.dex */
public class C1875f {

    /* renamed from: c */
    private final AbstractC1884o f8639c;

    /* renamed from: a */
    private final Map<String, C1879j> f8637a = new HashMap();

    /* renamed from: b */
    private final Set<C1879j> f8638b = new CopyOnWriteArraySet();

    /* renamed from: d */
    private final CopyOnWriteArraySet<Object> f8640d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    private boolean f8641e = true;

    public C1875f(AbstractC1884o abstractC1884o) {
        if (abstractC1884o == null) {
            throw new IllegalArgumentException("springLooper is required");
        }
        this.f8639c = abstractC1884o;
        this.f8639c.m6030a(this);
    }

    /* renamed from: a */
    public final C1879j m6006a() {
        C1879j c1879j = new C1879j(this);
        if (this.f8637a.containsKey(c1879j.m6018a())) {
            throw new IllegalArgumentException("spring is already registered");
        }
        this.f8637a.put(c1879j.m6018a(), c1879j);
        return c1879j;
    }

    /* renamed from: a */
    public final void m6007a(double d) {
        Iterator<Object> it = this.f8640d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator<C1879j> it2 = this.f8638b.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            C1879j next = it2.next();
            if (next.m6024f() && next.m6023e()) {
                z = false;
            }
            if (z) {
                next.m6020b(d / 1000.0d);
            } else {
                this.f8638b.remove(next);
            }
        }
        if (this.f8638b.isEmpty()) {
            this.f8641e = true;
        }
        Iterator<Object> it3 = this.f8640d.iterator();
        while (it3.hasNext()) {
            it3.next();
        }
        if (this.f8641e) {
            this.f8639c.mo6000b();
        }
    }

    /* renamed from: a */
    public final void m6008a(String str) {
        C1879j c1879j = this.f8637a.get(str);
        if (c1879j == null) {
            throw new IllegalArgumentException("springId " + str + " does not reference a registered spring");
        }
        this.f8638b.add(c1879j);
        if (this.f8641e) {
            this.f8641e = false;
            this.f8639c.mo5999a();
        }
    }
}
