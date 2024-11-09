package com.coloros.anim.p052a.p053a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.C1639a;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1678q;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p058b.C1720c;
import com.coloros.anim.p056c.p058b.C1721d;
import com.coloros.anim.p056c.p058b.C1723f;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent.java */
/* renamed from: com.coloros.anim.a.a.i */
/* loaded from: classes.dex */
public final class C1648i implements InterfaceC1645f, InterfaceC1651l, InterfaceC1663b {

    /* renamed from: a */
    private final String f7893a;

    /* renamed from: b */
    private final boolean f7894b;

    /* renamed from: c */
    private final AbstractC1743a f7895c;

    /* renamed from: d */
    private final LongSparseArray<LinearGradient> f7896d = new LongSparseArray<>();

    /* renamed from: e */
    private final LongSparseArray<RadialGradient> f7897e = new LongSparseArray<>();

    /* renamed from: f */
    private final Matrix f7898f = new Matrix();

    /* renamed from: g */
    private final Path f7899g = new Path();

    /* renamed from: h */
    private final Paint f7900h = new C1639a(1);

    /* renamed from: i */
    private final RectF f7901i = new RectF();

    /* renamed from: j */
    private final List<InterfaceC1654o> f7902j = new ArrayList();

    /* renamed from: k */
    private final int f7903k;

    /* renamed from: l */
    private final AbstractC1662a<C1720c, C1720c> f7904l;

    /* renamed from: m */
    private final AbstractC1662a<Integer, Integer> f7905m;

    /* renamed from: n */
    private final AbstractC1662a<PointF, PointF> f7906n;

    /* renamed from: o */
    private final AbstractC1662a<PointF, PointF> f7907o;

    /* renamed from: p */
    private final C1698b f7908p;

    /* renamed from: q */
    private final int f7909q;

    /* renamed from: r */
    private AbstractC1662a<ColorFilter, ColorFilter> f7910r;

    public C1648i(C1698b c1698b, AbstractC1743a abstractC1743a, C1721d c1721d) {
        this.f7895c = abstractC1743a;
        this.f7893a = c1721d.m5652a();
        this.f7894b = c1721d.m5659h();
        this.f7908p = c1698b;
        this.f7903k = c1721d.m5653b();
        this.f7899g.setFillType(c1721d.m5654c());
        this.f7909q = (int) (c1698b.m5612q().m5470f() / 32.0f);
        this.f7904l = c1721d.m5655d().mo5628a();
        this.f7904l.m5510a(this);
        abstractC1743a.m5748a(this.f7904l);
        this.f7905m = c1721d.m5656e().mo5628a();
        this.f7905m.m5510a(this);
        abstractC1743a.m5748a(this.f7905m);
        this.f7906n = c1721d.m5657f().mo5628a();
        this.f7906n.m5510a(this);
        abstractC1743a.m5748a(this.f7906n);
        this.f7907o = c1721d.m5658g().mo5628a();
        this.f7907o.m5510a(this);
        abstractC1743a.m5748a(this.f7907o);
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7908p.invalidateSelf();
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC1643d interfaceC1643d = list2.get(i);
            if (interfaceC1643d instanceof InterfaceC1654o) {
                this.f7902j.add((InterfaceC1654o) interfaceC1643d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5481a(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradient;
        if (this.f7894b) {
            return;
        }
        C1692an.m5564c("GradientFillContent#draw");
        this.f7899g.reset();
        for (int i2 = 0; i2 < this.f7902j.size(); i2++) {
            this.f7899g.addPath(this.f7902j.get(i2).mo5495e(), matrix);
        }
        this.f7899g.computeBounds(this.f7901i, false);
        if (this.f7903k == C1723f.f8153a) {
            long m5496c = m5496c();
            radialGradient = this.f7896d.get(m5496c);
            if (radialGradient == null) {
                PointF mo5517g = this.f7906n.mo5517g();
                PointF mo5517g2 = this.f7907o.mo5517g();
                C1720c mo5517g3 = this.f7904l.mo5517g();
                LinearGradient linearGradient = new LinearGradient(mo5517g.x, mo5517g.y, mo5517g2.x, mo5517g2.y, mo5517g3.m5650b(), mo5517g3.m5649a(), Shader.TileMode.CLAMP);
                this.f7896d.put(m5496c, linearGradient);
                radialGradient = linearGradient;
            }
        } else {
            long m5496c2 = m5496c();
            radialGradient = this.f7897e.get(m5496c2);
            if (radialGradient == null) {
                PointF mo5517g4 = this.f7906n.mo5517g();
                PointF mo5517g5 = this.f7907o.mo5517g();
                C1720c mo5517g6 = this.f7904l.mo5517g();
                int[] m5650b = mo5517g6.m5650b();
                float[] m5649a = mo5517g6.m5649a();
                float f = mo5517g4.x;
                float f2 = mo5517g4.y;
                float hypot = (float) Math.hypot(mo5517g5.x - f, mo5517g5.y - f2);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, hypot, m5650b, m5649a, Shader.TileMode.CLAMP);
                this.f7897e.put(m5496c2, radialGradient);
            }
        }
        this.f7898f.set(matrix);
        radialGradient.setLocalMatrix(this.f7898f);
        this.f7900h.setShader(radialGradient);
        if (this.f7910r != null) {
            this.f7900h.setColorFilter(this.f7910r.mo5517g());
        }
        this.f7900h.setAlpha(C1810f.m5894a((int) ((((i / 255.0f) * this.f7905m.mo5517g().intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f7899g, this.f7900h);
        C1692an.m5565d("GradientFillContent#draw");
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5482a(RectF rectF, Matrix matrix, boolean z) {
        this.f7899g.reset();
        for (int i = 0; i < this.f7902j.size(); i++) {
            this.f7899g.addPath(this.f7902j.get(i).mo5495e(), matrix);
        }
        this.f7899g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7893a;
    }

    /* renamed from: c */
    private int m5496c() {
        int round = Math.round(this.f7906n.m5518h() * this.f7909q);
        int round2 = Math.round(this.f7907o.m5518h() * this.f7909q);
        int round3 = Math.round(this.f7904l.m5518h() * this.f7909q);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        C1810f.m5898a(c1762g, i, list, c1762g2, this);
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final <T> void mo5484a(T t, C1814b<T> c1814b) {
        if (t == InterfaceC1828t.f8481z) {
            if (c1814b == null) {
                this.f7910r = null;
                return;
            }
            this.f7910r = new C1678q(c1814b);
            this.f7910r.m5510a(this);
            this.f7895c.m5748a(this.f7910r);
        }
    }
}
