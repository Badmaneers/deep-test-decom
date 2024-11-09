package com.coloros.anim.p052a.p054b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p056c.p057a.C1714l;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p063g.C1814b;
import com.coloros.anim.p063g.C1815c;
import com.coloros.anim.p063g.C1816d;
import java.util.Collections;

/* compiled from: TransformKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.p */
/* loaded from: classes.dex */
public final class C1677p {

    /* renamed from: a */
    private final Matrix f8010a = new Matrix();

    /* renamed from: b */
    private final Matrix f8011b;

    /* renamed from: c */
    private final Matrix f8012c;

    /* renamed from: d */
    private final Matrix f8013d;

    /* renamed from: e */
    private final float[] f8014e;

    /* renamed from: f */
    private AbstractC1662a<PointF, PointF> f8015f;

    /* renamed from: g */
    private AbstractC1662a<?, PointF> f8016g;

    /* renamed from: h */
    private AbstractC1662a<C1816d, C1816d> f8017h;

    /* renamed from: i */
    private AbstractC1662a<Float, Float> f8018i;

    /* renamed from: j */
    private AbstractC1662a<Integer, Integer> f8019j;

    /* renamed from: k */
    private C1665d f8020k;

    /* renamed from: l */
    private C1665d f8021l;

    /* renamed from: m */
    private AbstractC1662a<?, Float> f8022m;

    /* renamed from: n */
    private AbstractC1662a<?, Float> f8023n;

    public C1677p(C1714l c1714l) {
        this.f8015f = c1714l.m5633a() == null ? null : c1714l.m5633a().mo5628a();
        this.f8016g = c1714l.m5634b() == null ? null : c1714l.m5634b().mo5628a();
        this.f8017h = c1714l.m5635c() == null ? null : c1714l.m5635c().mo5628a();
        this.f8018i = c1714l.m5636d() == null ? null : c1714l.m5636d().mo5628a();
        this.f8020k = c1714l.m5640h() == null ? null : (C1665d) c1714l.m5640h().mo5628a();
        if (this.f8020k != null) {
            this.f8011b = new Matrix();
            this.f8012c = new Matrix();
            this.f8013d = new Matrix();
            this.f8014e = new float[9];
        } else {
            this.f8011b = null;
            this.f8012c = null;
            this.f8013d = null;
            this.f8014e = null;
        }
        this.f8021l = c1714l.m5641i() == null ? null : (C1665d) c1714l.m5641i().mo5628a();
        if (c1714l.m5637e() != null) {
            this.f8019j = c1714l.m5637e().mo5628a();
        }
        if (c1714l.m5638f() != null) {
            this.f8022m = c1714l.m5638f().mo5628a();
        } else {
            this.f8022m = null;
        }
        if (c1714l.m5639g() != null) {
            this.f8023n = c1714l.m5639g().mo5628a();
        } else {
            this.f8023n = null;
        }
    }

    /* renamed from: a */
    public final void m5534a(AbstractC1743a abstractC1743a) {
        abstractC1743a.m5748a(this.f8019j);
        abstractC1743a.m5748a(this.f8022m);
        abstractC1743a.m5748a(this.f8023n);
        abstractC1743a.m5748a(this.f8015f);
        abstractC1743a.m5748a(this.f8016g);
        abstractC1743a.m5748a(this.f8017h);
        abstractC1743a.m5748a(this.f8018i);
        abstractC1743a.m5748a(this.f8020k);
        abstractC1743a.m5748a(this.f8021l);
    }

    /* renamed from: a */
    public final void m5533a(InterfaceC1663b interfaceC1663b) {
        if (this.f8019j != null) {
            this.f8019j.m5510a(interfaceC1663b);
        }
        if (this.f8022m != null) {
            this.f8022m.m5510a(interfaceC1663b);
        }
        if (this.f8023n != null) {
            this.f8023n.m5510a(interfaceC1663b);
        }
        if (this.f8015f != null) {
            this.f8015f.m5510a(interfaceC1663b);
        }
        if (this.f8016g != null) {
            this.f8016g.m5510a(interfaceC1663b);
        }
        if (this.f8017h != null) {
            this.f8017h.m5510a(interfaceC1663b);
        }
        if (this.f8018i != null) {
            this.f8018i.m5510a(interfaceC1663b);
        }
        if (this.f8020k != null) {
            this.f8020k.m5510a(interfaceC1663b);
        }
        if (this.f8021l != null) {
            this.f8021l.m5510a(interfaceC1663b);
        }
    }

    /* renamed from: a */
    public final void m5532a(float f) {
        if (this.f8019j != null) {
            this.f8019j.mo5509a(f);
        }
        if (this.f8022m != null) {
            this.f8022m.mo5509a(f);
        }
        if (this.f8023n != null) {
            this.f8023n.mo5509a(f);
        }
        if (this.f8015f != null) {
            this.f8015f.mo5509a(f);
        }
        if (this.f8016g != null) {
            this.f8016g.mo5509a(f);
        }
        if (this.f8017h != null) {
            this.f8017h.mo5509a(f);
        }
        if (this.f8018i != null) {
            this.f8018i.mo5509a(f);
        }
        if (this.f8020k != null) {
            this.f8020k.mo5509a(f);
        }
        if (this.f8021l != null) {
            this.f8021l.mo5509a(f);
        }
    }

    /* renamed from: a */
    public final AbstractC1662a<?, Integer> m5531a() {
        return this.f8019j;
    }

    /* renamed from: b */
    public final AbstractC1662a<?, Float> m5537b() {
        return this.f8022m;
    }

    /* renamed from: c */
    public final AbstractC1662a<?, Float> m5538c() {
        return this.f8023n;
    }

    /* renamed from: d */
    public final Matrix m5539d() {
        float m5522i;
        this.f8010a.reset();
        if (this.f8016g != null) {
            PointF mo5517g = this.f8016g.mo5517g();
            if (mo5517g.x != 0.0f || mo5517g.y != 0.0f) {
                this.f8010a.preTranslate(mo5517g.x, mo5517g.y);
            }
        }
        if (this.f8018i != null) {
            if (this.f8018i instanceof C1678q) {
                m5522i = this.f8018i.mo5517g().floatValue();
            } else {
                m5522i = ((C1665d) this.f8018i).m5522i();
            }
            if (m5522i != 0.0f) {
                this.f8010a.preRotate(m5522i);
            }
        }
        if (this.f8020k != null) {
            float cos = this.f8021l == null ? 0.0f : (float) Math.cos(Math.toRadians((-this.f8021l.m5522i()) + 90.0f));
            float sin = this.f8021l == null ? 1.0f : (float) Math.sin(Math.toRadians((-this.f8021l.m5522i()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(this.f8020k.m5522i()));
            m5530e();
            this.f8014e[0] = cos;
            this.f8014e[1] = sin;
            float f = -sin;
            this.f8014e[3] = f;
            this.f8014e[4] = cos;
            this.f8014e[8] = 1.0f;
            this.f8011b.setValues(this.f8014e);
            m5530e();
            this.f8014e[0] = 1.0f;
            this.f8014e[3] = tan;
            this.f8014e[4] = 1.0f;
            this.f8014e[8] = 1.0f;
            this.f8012c.setValues(this.f8014e);
            m5530e();
            this.f8014e[0] = cos;
            this.f8014e[1] = f;
            this.f8014e[3] = sin;
            this.f8014e[4] = cos;
            this.f8014e[8] = 1.0f;
            this.f8013d.setValues(this.f8014e);
            this.f8012c.preConcat(this.f8011b);
            this.f8013d.preConcat(this.f8012c);
            this.f8010a.preConcat(this.f8013d);
        }
        if (this.f8017h != null) {
            C1816d mo5517g2 = this.f8017h.mo5517g();
            if (mo5517g2.m5920a() != 1.0f || mo5517g2.m5922b() != 1.0f) {
                this.f8010a.preScale(mo5517g2.m5920a(), mo5517g2.m5922b());
            }
        }
        if (this.f8015f != null) {
            PointF mo5517g3 = this.f8015f.mo5517g();
            if (mo5517g3.x != 0.0f || mo5517g3.y != 0.0f) {
                this.f8010a.preTranslate(-mo5517g3.x, -mo5517g3.y);
            }
        }
        return this.f8010a;
    }

    /* renamed from: e */
    private void m5530e() {
        for (int i = 0; i < 9; i++) {
            this.f8014e[i] = 0.0f;
        }
    }

    /* renamed from: b */
    public final Matrix m5536b(float f) {
        PointF mo5517g = this.f8016g == null ? null : this.f8016g.mo5517g();
        C1816d mo5517g2 = this.f8017h == null ? null : this.f8017h.mo5517g();
        this.f8010a.reset();
        if (mo5517g != null) {
            this.f8010a.preTranslate(mo5517g.x * f, mo5517g.y * f);
        }
        if (mo5517g2 != null) {
            double d = f;
            this.f8010a.preScale((float) Math.pow(mo5517g2.m5920a(), d), (float) Math.pow(mo5517g2.m5922b(), d));
        }
        if (this.f8018i != null) {
            float floatValue = this.f8018i.mo5517g().floatValue();
            PointF mo5517g3 = this.f8015f != null ? this.f8015f.mo5517g() : null;
            this.f8010a.preRotate(floatValue * f, mo5517g3 == null ? 0.0f : mo5517g3.x, mo5517g3 != null ? mo5517g3.y : 0.0f);
        }
        return this.f8010a;
    }

    /* renamed from: a */
    public final <T> boolean m5535a(T t, C1814b<T> c1814b) {
        if (t == InterfaceC1828t.f8460e) {
            if (this.f8015f == null) {
                this.f8015f = new C1678q(c1814b, new PointF());
                return true;
            }
            this.f8015f.m5511a((C1814b<PointF>) c1814b);
            return true;
        }
        if (t == InterfaceC1828t.f8461f) {
            if (this.f8016g == null) {
                this.f8016g = new C1678q(c1814b, new PointF());
                return true;
            }
            this.f8016g.m5511a((C1814b<PointF>) c1814b);
            return true;
        }
        if (t == InterfaceC1828t.f8464i) {
            if (this.f8017h == null) {
                this.f8017h = new C1678q(c1814b, new C1816d());
                return true;
            }
            this.f8017h.m5511a((C1814b<C1816d>) c1814b);
            return true;
        }
        if (t == InterfaceC1828t.f8465j) {
            if (this.f8018i == null) {
                this.f8018i = new C1678q(c1814b, Float.valueOf(0.0f));
                return true;
            }
            this.f8018i.m5511a((C1814b<Float>) c1814b);
            return true;
        }
        if (t == InterfaceC1828t.f8458c) {
            if (this.f8019j == null) {
                this.f8019j = new C1678q(c1814b, 100);
                return true;
            }
            this.f8019j.m5511a((C1814b<Integer>) c1814b);
            return true;
        }
        if (t == InterfaceC1828t.f8478w && this.f8022m != null) {
            if (this.f8022m == null) {
                this.f8022m = new C1678q(c1814b, 100);
                return true;
            }
            this.f8022m.m5511a((C1814b<Float>) c1814b);
            return true;
        }
        if (t == InterfaceC1828t.f8479x && this.f8023n != null) {
            if (this.f8023n == null) {
                this.f8023n = new C1678q(c1814b, 100);
                return true;
            }
            this.f8023n.m5511a((C1814b<Float>) c1814b);
            return true;
        }
        if (t == InterfaceC1828t.f8466k && this.f8020k != null) {
            if (this.f8020k == null) {
                this.f8020k = new C1665d(Collections.singletonList(new C1815c(Float.valueOf(0.0f))));
            }
            this.f8020k.m5511a(c1814b);
            return true;
        }
        if (t != InterfaceC1828t.f8467l || this.f8021l == null) {
            return false;
        }
        if (this.f8021l == null) {
            this.f8021l = new C1665d(Collections.singletonList(new C1815c(Float.valueOf(0.0f))));
        }
        this.f8021l.m5511a(c1814b);
        return true;
    }
}
