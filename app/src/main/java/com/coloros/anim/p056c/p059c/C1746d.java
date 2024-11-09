package com.coloros.anim.p056c.p059c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.coloros.anim.C1638a;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1678q;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositionLayer.java */
/* renamed from: com.coloros.anim.c.c.d */
/* loaded from: classes.dex */
public final class C1746d extends AbstractC1743a {

    /* renamed from: e */
    private final List<AbstractC1743a> f8272e;

    /* renamed from: f */
    private final RectF f8273f;

    /* renamed from: g */
    private final RectF f8274g;

    /* renamed from: h */
    private AbstractC1662a<Float, Float> f8275h;

    public C1746d(C1698b c1698b, C1749g c1749g, List<C1749g> list, C1638a c1638a) {
        super(c1698b, c1749g);
        AbstractC1743a abstractC1743a;
        AbstractC1743a c1753k;
        this.f8272e = new ArrayList();
        this.f8273f = new RectF();
        this.f8274g = new RectF();
        C1704b m5776u = c1749g.m5776u();
        if (m5776u != null) {
            if (C1806b.f8391d) {
                C1806b.m5866b("CompositionLayer::create timeRemapping animation, this = " + c1749g.m5761f());
            }
            this.f8275h = m5776u.mo5628a();
            m5748a(this.f8275h);
            this.f8275h.m5510a(this);
        } else {
            this.f8275h = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(c1638a.m5474j().size());
        int size = list.size() - 1;
        AbstractC1743a abstractC1743a2 = null;
        while (true) {
            if (size >= 0) {
                C1749g c1749g2 = list.get(size);
                if (C1806b.f8391d) {
                    C1806b.m5866b("CompositionLayer::i = " + size + "; lm.type = " + c1749g2.m5766k() + "; lm.name = " + c1749g2.m5761f() + "; lm.id = " + c1749g2.m5760e());
                }
                switch (c1749g2.m5766k()) {
                    case SHAPE:
                        c1753k = new C1753k(c1698b, c1749g2);
                        break;
                    case PRE_COMP:
                        c1753k = new C1746d(c1698b, c1749g2, c1638a.m5464b(c1749g2.m5762g()), c1638a);
                        break;
                    case SOLID:
                        c1753k = new C1754l(c1698b, c1749g2);
                        break;
                    case IMAGE:
                        c1753k = new C1748f(c1698b, c1749g2);
                        break;
                    case NULL:
                        c1753k = new C1752j(c1698b, c1749g2);
                        break;
                    case TEXT:
                        c1753k = new C1755m(c1698b, c1749g2);
                        break;
                    default:
                        C1692an.m5563b("Unknown layer type " + c1749g2.m5766k());
                        c1753k = null;
                        break;
                }
                if (c1753k != null) {
                    longSparseArray.put(c1753k.f8248c.m5760e(), c1753k);
                    if (abstractC1743a2 != null) {
                        abstractC1743a2.m5749a(c1753k);
                        abstractC1743a2 = null;
                    } else {
                        this.f8272e.add(0, c1753k);
                        switch (c1749g2.m5767l()) {
                            case ADD:
                            case INVERT:
                                abstractC1743a2 = c1753k;
                                break;
                        }
                    }
                }
                size--;
            } else {
                for (int i = 0; i < longSparseArray.size(); i++) {
                    AbstractC1743a abstractC1743a3 = (AbstractC1743a) longSparseArray.get(longSparseArray.keyAt(i));
                    if (abstractC1743a3 != null && (abstractC1743a = (AbstractC1743a) longSparseArray.get(abstractC1743a3.f8248c.m5768m())) != null) {
                        abstractC1743a3.m5752b(abstractC1743a);
                    }
                }
                return;
            }
        }
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a
    /* renamed from: b */
    final void mo5751b(Canvas canvas, Matrix matrix, int i) {
        C1692an.m5564c("CompositionLayer#draw");
        canvas.save();
        this.f8274g.set(0.0f, 0.0f, this.f8248c.m5763h(), this.f8248c.m5764i());
        matrix.mapRect(this.f8274g);
        for (int size = this.f8272e.size() - 1; size >= 0; size--) {
            if (!this.f8274g.isEmpty() ? canvas.clipRect(this.f8274g) : true) {
                this.f8272e.get(size).mo5481a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C1692an.m5565d("CompositionLayer#draw");
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        super.mo5482a(rectF, matrix, z);
        for (int size = this.f8272e.size() - 1; size >= 0; size--) {
            this.f8273f.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f8272e.get(size).mo5482a(this.f8273f, this.f8246a, true);
            rectF.union(this.f8273f);
        }
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a
    /* renamed from: a */
    public final void mo5747a(float f) {
        super.mo5747a(f);
        if (this.f8275h != null) {
            f = (this.f8275h.mo5517g().floatValue() * 1000.0f) / this.f8247b.m5612q().m5470f();
        }
        if (this.f8248c.m5757b() != 0.0f) {
            f /= this.f8248c.m5757b();
        }
        float m5758c = f - this.f8248c.m5758c();
        for (int size = this.f8272e.size() - 1; size >= 0; size--) {
            this.f8272e.get(size).mo5747a(m5758c);
        }
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a
    /* renamed from: b */
    protected final void mo5753b(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        for (int i2 = 0; i2 < this.f8272e.size(); i2++) {
            this.f8272e.get(i2).mo5483a(c1762g, i, list, c1762g2);
        }
    }

    @Override // com.coloros.anim.p056c.p059c.AbstractC1743a, com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        super.mo5484a((C1746d) t, (C1814b<C1746d>) c1814b);
        if (t == InterfaceC1828t.f8480y) {
            if (c1814b == null) {
                this.f8275h = null;
            } else {
                this.f8275h = new C1678q(c1814b);
                m5748a(this.f8275h);
            }
        }
    }
}
