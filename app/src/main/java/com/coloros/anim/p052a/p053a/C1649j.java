package com.coloros.anim.p052a.p053a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p056c.p058b.C1720c;
import com.coloros.anim.p056c.p058b.C1722e;
import com.coloros.anim.p056c.p058b.C1723f;
import com.coloros.anim.p056c.p059c.AbstractC1743a;

/* compiled from: GradientStrokeContent.java */
/* renamed from: com.coloros.anim.a.a.j */
/* loaded from: classes.dex */
public final class C1649j extends AbstractC1640a {

    /* renamed from: b */
    private final String f7911b;

    /* renamed from: c */
    private final boolean f7912c;

    /* renamed from: d */
    private final LongSparseArray<LinearGradient> f7913d;

    /* renamed from: e */
    private final LongSparseArray<RadialGradient> f7914e;

    /* renamed from: f */
    private final RectF f7915f;

    /* renamed from: g */
    private final int f7916g;

    /* renamed from: h */
    private final int f7917h;

    /* renamed from: i */
    private final AbstractC1662a<C1720c, C1720c> f7918i;

    /* renamed from: j */
    private final AbstractC1662a<PointF, PointF> f7919j;

    /* renamed from: k */
    private final AbstractC1662a<PointF, PointF> f7920k;

    public C1649j(C1698b c1698b, AbstractC1743a abstractC1743a, C1722e c1722e) {
        super(c1698b, abstractC1743a, c1722e.m5667h().m5728a(), c1722e.m5668i().m5729a(), c1722e.m5671l(), c1722e.m5663d(), c1722e.m5666g(), c1722e.m5669j(), c1722e.m5670k());
        this.f7913d = new LongSparseArray<>();
        this.f7914e = new LongSparseArray<>();
        this.f7915f = new RectF();
        this.f7911b = c1722e.m5660a();
        this.f7916g = c1722e.m5661b();
        this.f7912c = c1722e.m5672m();
        this.f7917h = (int) (c1698b.m5612q().m5470f() / 32.0f);
        this.f7918i = c1722e.m5662c().mo5628a();
        this.f7918i.m5510a(this);
        abstractC1743a.m5748a(this.f7918i);
        this.f7919j = c1722e.m5664e().mo5628a();
        this.f7919j.m5510a(this);
        abstractC1743a.m5748a(this.f7919j);
        this.f7920k = c1722e.m5665f().mo5628a();
        this.f7920k.m5510a(this);
        abstractC1743a.m5748a(this.f7920k);
    }

    @Override // com.coloros.anim.p052a.p053a.AbstractC1640a, com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public final void mo5481a(Canvas canvas, Matrix matrix, int i) {
        if (this.f7912c) {
            return;
        }
        mo5482a(this.f7915f, matrix, false);
        if (this.f7916g == C1723f.f8153a) {
            Paint paint = this.f7849a;
            long m5497c = m5497c();
            LinearGradient linearGradient = this.f7913d.get(m5497c);
            if (linearGradient == null) {
                PointF mo5517g = this.f7919j.mo5517g();
                PointF mo5517g2 = this.f7920k.mo5517g();
                C1720c mo5517g3 = this.f7918i.mo5517g();
                LinearGradient linearGradient2 = new LinearGradient((int) (this.f7915f.left + (this.f7915f.width() / 2.0f) + mo5517g.x), (int) (this.f7915f.top + (this.f7915f.height() / 2.0f) + mo5517g.y), (int) (this.f7915f.left + (this.f7915f.width() / 2.0f) + mo5517g2.x), (int) (this.f7915f.top + (this.f7915f.height() / 2.0f) + mo5517g2.y), mo5517g3.m5650b(), mo5517g3.m5649a(), Shader.TileMode.CLAMP);
                this.f7913d.put(m5497c, linearGradient2);
                linearGradient = linearGradient2;
            }
            paint.setShader(linearGradient);
        } else {
            Paint paint2 = this.f7849a;
            long m5497c2 = m5497c();
            RadialGradient radialGradient = this.f7914e.get(m5497c2);
            if (radialGradient == null) {
                PointF mo5517g4 = this.f7919j.mo5517g();
                PointF mo5517g5 = this.f7920k.mo5517g();
                C1720c mo5517g6 = this.f7918i.mo5517g();
                int[] m5650b = mo5517g6.m5650b();
                float[] m5649a = mo5517g6.m5649a();
                RadialGradient radialGradient2 = new RadialGradient((int) (this.f7915f.left + (this.f7915f.width() / 2.0f) + mo5517g4.x), (int) (this.f7915f.top + (this.f7915f.height() / 2.0f) + mo5517g4.y), (float) Math.hypot(((int) ((this.f7915f.left + (this.f7915f.width() / 2.0f)) + mo5517g5.x)) - r8, ((int) ((this.f7915f.top + (this.f7915f.height() / 2.0f)) + mo5517g5.y)) - r2), m5650b, m5649a, Shader.TileMode.CLAMP);
                this.f7914e.put(m5497c2, radialGradient2);
                radialGradient = radialGradient2;
            }
            paint2.setShader(radialGradient);
        }
        super.mo5481a(canvas, matrix, i);
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: b */
    public final String mo5490b() {
        return this.f7911b;
    }

    /* renamed from: c */
    private int m5497c() {
        int round = Math.round(this.f7919j.m5518h() * this.f7917h);
        int round2 = Math.round(this.f7920k.m5518h() * this.f7917h);
        int round3 = Math.round(this.f7918i.m5518h() * this.f7917h);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
