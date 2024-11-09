package com.coloros.anim.p052a.p054b;

import com.coloros.anim.p063g.C1814b;
import com.coloros.anim.p063g.C1815c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC1662a<K, A> {

    /* renamed from: b */
    protected C1814b<A> f7983b;

    /* renamed from: c */
    private final List<? extends C1815c<K>> f7984c;

    /* renamed from: f */
    private C1815c<K> f7987f;

    /* renamed from: g */
    private C1815c<K> f7988g;

    /* renamed from: a */
    final List<InterfaceC1663b> f7982a = new ArrayList(1);

    /* renamed from: d */
    private boolean f7985d = false;

    /* renamed from: e */
    private float f7986e = 0.0f;

    /* renamed from: h */
    private float f7989h = -1.0f;

    /* renamed from: i */
    private A f7990i = null;

    /* renamed from: j */
    private float f7991j = -1.0f;

    /* renamed from: k */
    private float f7992k = -1.0f;

    /* renamed from: a */
    abstract A mo5507a(C1815c<K> c1815c, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1662a(List<? extends C1815c<K>> list) {
        this.f7984c = list;
    }

    /* renamed from: a */
    public final void m5508a() {
        this.f7985d = true;
    }

    /* renamed from: a */
    public final void m5510a(InterfaceC1663b interfaceC1663b) {
        this.f7982a.add(interfaceC1663b);
    }

    /* renamed from: b */
    public void mo5512b() {
        for (int i = 0; i < this.f7982a.size(); i++) {
            this.f7982a.get(i).mo5480a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final C1815c<K> m5513c() {
        if (this.f7987f != null && this.f7987f.m5912a(this.f7986e)) {
            return this.f7987f;
        }
        C1815c<K> c1815c = this.f7984c.get(this.f7984c.size() - 1);
        if (this.f7986e < c1815c.m5913c()) {
            for (int size = this.f7984c.size() - 1; size >= 0; size--) {
                c1815c = this.f7984c.get(size);
                if (c1815c.m5912a(this.f7986e)) {
                    break;
                }
            }
        }
        this.f7987f = c1815c;
        return c1815c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final float m5514d() {
        if (this.f7985d) {
            return 0.0f;
        }
        C1815c<K> m5513c = m5513c();
        if (m5513c.m5915e()) {
            return 0.0f;
        }
        return (this.f7986e - m5513c.m5913c()) / (m5513c.m5914d() - m5513c.m5913c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final float m5515e() {
        C1815c<K> m5513c = m5513c();
        if (m5513c.m5915e()) {
            return 0.0f;
        }
        return m5513c.f8423b.getInterpolation(m5514d());
    }

    /* renamed from: i */
    private float m5506i() {
        if (this.f7991j == -1.0f) {
            this.f7991j = this.f7984c.isEmpty() ? 0.0f : this.f7984c.get(0).m5913c();
        }
        return this.f7991j;
    }

    /* renamed from: f */
    float mo5516f() {
        if (this.f7992k == -1.0f) {
            this.f7992k = this.f7984c.isEmpty() ? 1.0f : this.f7984c.get(this.f7984c.size() - 1).m5914d();
        }
        return this.f7992k;
    }

    /* renamed from: g */
    public A mo5517g() {
        C1815c<K> m5513c = m5513c();
        float m5515e = m5515e();
        if (this.f7983b == null && m5513c == this.f7988g && this.f7989h == m5515e) {
            return this.f7990i;
        }
        this.f7988g = m5513c;
        this.f7989h = m5515e;
        A mo5507a = mo5507a(m5513c, m5515e);
        this.f7990i = mo5507a;
        return mo5507a;
    }

    /* renamed from: h */
    public final float m5518h() {
        return this.f7986e;
    }

    /* renamed from: a */
    public void mo5509a(float f) {
        if (this.f7984c.isEmpty()) {
            return;
        }
        C1815c<K> m5513c = m5513c();
        if (f < m5506i()) {
            f = m5506i();
        } else if (f > mo5516f()) {
            f = mo5516f();
        }
        if (f == this.f7986e) {
            return;
        }
        this.f7986e = f;
        C1815c<K> m5513c2 = m5513c();
        if (m5513c == m5513c2 && m5513c2.m5915e()) {
            return;
        }
        mo5512b();
    }

    /* renamed from: a */
    public final void m5511a(C1814b<A> c1814b) {
        if (this.f7983b != null) {
            this.f7983b.m5911a(null);
        }
        this.f7983b = c1814b;
        if (c1814b != null) {
            c1814b.m5911a(this);
        }
    }
}
