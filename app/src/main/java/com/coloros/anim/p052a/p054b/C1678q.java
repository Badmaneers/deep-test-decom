package com.coloros.anim.p052a.p054b;

import com.coloros.anim.p063g.C1813a;
import com.coloros.anim.p063g.C1814b;
import com.coloros.anim.p063g.C1815c;
import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.q */
/* loaded from: classes.dex */
public final class C1678q<K, A> extends AbstractC1662a<K, A> {

    /* renamed from: c */
    private final C1813a<A> f8024c;

    /* renamed from: d */
    private final A f8025d;

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: f */
    final float mo5516f() {
        return 1.0f;
    }

    public C1678q(C1814b<A> c1814b) {
        this(c1814b, null);
    }

    public C1678q(C1814b<A> c1814b, A a2) {
        super(Collections.emptyList());
        this.f8024c = new C1813a<>();
        m5511a(c1814b);
        this.f8025d = a2;
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: b */
    public final void mo5512b() {
        if (this.f7983b != null) {
            super.mo5512b();
        }
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: g */
    public final A mo5517g() {
        return this.f7983b.m5910a(0.0f, 0.0f, this.f8025d, this.f8025d, m5518h(), m5518h(), m5518h());
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    final A mo5507a(C1815c<K> c1815c, float f) {
        return mo5517g();
    }
}
