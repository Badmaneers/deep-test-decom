package com.coloros.anim.p063g;

import com.coloros.anim.p052a.p054b.AbstractC1662a;

/* compiled from: EffectiveValueCallback.java */
/* renamed from: com.coloros.anim.g.b */
/* loaded from: classes.dex */
public final class C1814b<T> {

    /* renamed from: a */
    protected T f8419a;

    /* renamed from: b */
    private final C1813a<T> f8420b;

    /* renamed from: c */
    private AbstractC1662a<?, ?> f8421c;

    public C1814b() {
        this.f8420b = new C1813a<>();
        this.f8419a = null;
    }

    public C1814b(T t) {
        this.f8420b = new C1813a<>();
        this.f8419a = null;
        this.f8419a = t;
    }

    /* renamed from: a */
    public final T m5910a(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.f8420b.m5909a(f, f2, t, t2, f3, f4, f5);
        return this.f8419a;
    }

    /* renamed from: a */
    public final void m5911a(AbstractC1662a<?, ?> abstractC1662a) {
        this.f8421c = abstractC1662a;
    }
}
