package com.coloros.anim.p052a.p053a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.InterfaceC1828t;
import com.coloros.anim.p052a.C1639a;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1665d;
import com.coloros.anim.p052a.p054b.C1667f;
import com.coloros.anim.p052a.p054b.C1678q;
import com.coloros.anim.p052a.p054b.InterfaceC1663b;
import com.coloros.anim.p056c.C1762g;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p058b.C1741x;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1810f;
import com.coloros.anim.p062f.C1811g;
import com.coloros.anim.p063g.C1814b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* renamed from: com.coloros.anim.a.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1640a implements InterfaceC1645f, InterfaceC1651l, InterfaceC1663b {

    /* renamed from: f */
    private final C1698b f7854f;

    /* renamed from: g */
    private final AbstractC1743a f7855g;

    /* renamed from: i */
    private final float[] f7857i;

    /* renamed from: j */
    private final AbstractC1662a<?, Float> f7858j;

    /* renamed from: k */
    private final AbstractC1662a<?, Integer> f7859k;

    /* renamed from: l */
    private final List<AbstractC1662a<?, Float>> f7860l;

    /* renamed from: m */
    private final AbstractC1662a<?, Float> f7861m;

    /* renamed from: n */
    private AbstractC1662a<ColorFilter, ColorFilter> f7862n;

    /* renamed from: a */
    final Paint f7849a = new C1639a(1);

    /* renamed from: b */
    private final PathMeasure f7850b = new PathMeasure();

    /* renamed from: c */
    private final Path f7851c = new Path();

    /* renamed from: d */
    private final Path f7852d = new Path();

    /* renamed from: e */
    private final RectF f7853e = new RectF();

    /* renamed from: h */
    private final List<C1641b> f7856h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1640a(C1698b c1698b, AbstractC1743a abstractC1743a, Paint.Cap cap, Paint.Join join, float f, C1706d c1706d, C1704b c1704b, List<C1704b> list, C1704b c1704b2) {
        this.f7854f = c1698b;
        this.f7855g = abstractC1743a;
        this.f7849a.setStyle(Paint.Style.STROKE);
        this.f7849a.setStrokeCap(cap);
        this.f7849a.setStrokeJoin(join);
        this.f7849a.setStrokeMiter(f);
        this.f7859k = c1706d.mo5628a();
        this.f7858j = c1704b.mo5628a();
        if (c1704b2 == null) {
            this.f7861m = null;
        } else {
            this.f7861m = c1704b2.mo5628a();
        }
        this.f7860l = new ArrayList(list.size());
        this.f7857i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f7860l.add(list.get(i).mo5628a());
        }
        abstractC1743a.m5748a(this.f7859k);
        abstractC1743a.m5748a(this.f7858j);
        for (int i2 = 0; i2 < this.f7860l.size(); i2++) {
            abstractC1743a.m5748a(this.f7860l.get(i2));
        }
        if (this.f7861m != null) {
            abstractC1743a.m5748a(this.f7861m);
        }
        this.f7859k.m5510a(this);
        this.f7858j.m5510a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f7860l.get(i3).m5510a(this);
        }
        if (this.f7861m != null) {
            this.f7861m.m5510a(this);
        }
    }

    @Override // com.coloros.anim.p052a.p054b.InterfaceC1663b
    /* renamed from: a */
    public final void mo5480a() {
        this.f7854f.invalidateSelf();
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1643d
    /* renamed from: a */
    public final void mo5485a(List<InterfaceC1643d> list, List<InterfaceC1643d> list2) {
        List list3;
        C1641b c1641b = null;
        C1661v c1661v = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC1643d interfaceC1643d = list.get(size);
            if (interfaceC1643d instanceof C1661v) {
                C1661v c1661v2 = (C1661v) interfaceC1643d;
                if (c1661v2.m5501c() == C1741x.f8240b) {
                    c1661v = c1661v2;
                }
            }
        }
        if (c1661v != null) {
            c1661v.m5500a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC1643d interfaceC1643d2 = list2.get(size2);
            if (interfaceC1643d2 instanceof C1661v) {
                C1661v c1661v3 = (C1661v) interfaceC1643d2;
                if (c1661v3.m5501c() == C1741x.f8240b) {
                    if (c1641b != null) {
                        this.f7856h.add(c1641b);
                    }
                    C1641b c1641b2 = new C1641b(c1661v3, (byte) 0);
                    c1661v3.m5500a(this);
                    c1641b = c1641b2;
                }
            }
            if (interfaceC1643d2 instanceof InterfaceC1654o) {
                if (c1641b == null) {
                    c1641b = new C1641b(c1661v, (byte) 0);
                }
                list3 = c1641b.f7863a;
                list3.add((InterfaceC1654o) interfaceC1643d2);
            }
        }
        if (c1641b != null) {
            this.f7856h.add(c1641b);
        }
    }

    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    public void mo5481a(Canvas canvas, Matrix matrix, int i) {
        C1661v c1661v;
        List list;
        List list2;
        C1692an.m5564c("StrokeContent#draw");
        this.f7849a.setAlpha(C1810f.m5894a((int) ((((i / 255.0f) * ((C1667f) this.f7859k).m5524i()) / 100.0f) * 255.0f)));
        this.f7849a.setStrokeWidth(((C1665d) this.f7858j).m5522i() * C1811g.m5902a(matrix));
        if (this.f7849a.getStrokeWidth() <= 0.0f) {
            C1692an.m5565d("StrokeContent#draw");
            return;
        }
        C1692an.m5564c("StrokeContent#applyDashPattern");
        if (this.f7860l.isEmpty()) {
            C1692an.m5565d("StrokeContent#applyDashPattern");
        } else {
            float m5902a = C1811g.m5902a(matrix);
            for (int i2 = 0; i2 < this.f7860l.size(); i2++) {
                this.f7857i[i2] = this.f7860l.get(i2).mo5517g().floatValue();
                if (i2 % 2 == 0) {
                    if (this.f7857i[i2] < 1.0f) {
                        this.f7857i[i2] = 1.0f;
                    }
                } else if (this.f7857i[i2] < 0.1f) {
                    this.f7857i[i2] = 0.1f;
                }
                float[] fArr = this.f7857i;
                fArr[i2] = fArr[i2] * m5902a;
            }
            this.f7849a.setPathEffect(new DashPathEffect(this.f7857i, this.f7861m != null ? this.f7861m.mo5517g().floatValue() : 0.0f));
            C1692an.m5565d("StrokeContent#applyDashPattern");
        }
        if (this.f7862n != null) {
            this.f7849a.setColorFilter(this.f7862n.mo5517g());
        }
        for (int i3 = 0; i3 < this.f7856h.size(); i3++) {
            C1641b c1641b = this.f7856h.get(i3);
            c1661v = c1641b.f7864b;
            if (c1661v != null) {
                m5479a(canvas, c1641b, matrix);
            } else {
                C1692an.m5564c("StrokeContent#buildPath");
                this.f7851c.reset();
                list = c1641b.f7863a;
                for (int size = list.size() - 1; size >= 0; size--) {
                    Path path = this.f7851c;
                    list2 = c1641b.f7863a;
                    path.addPath(((InterfaceC1654o) list2.get(size)).mo5495e(), matrix);
                }
                C1692an.m5565d("StrokeContent#buildPath");
                C1692an.m5564c("StrokeContent#drawPath");
                canvas.drawPath(this.f7851c, this.f7849a);
                C1692an.m5565d("StrokeContent#drawPath");
            }
        }
        C1692an.m5565d("StrokeContent#draw");
    }

    /* renamed from: a */
    private void m5479a(Canvas canvas, C1641b c1641b, Matrix matrix) {
        C1661v c1661v;
        List list;
        C1661v c1661v2;
        C1661v c1661v3;
        C1661v c1661v4;
        List list2;
        List list3;
        float f;
        List list4;
        C1692an.m5564c("StrokeContent#applyTrimPath");
        c1661v = c1641b.f7864b;
        if (c1661v == null) {
            C1692an.m5565d("StrokeContent#applyTrimPath");
            return;
        }
        this.f7851c.reset();
        list = c1641b.f7863a;
        for (int size = list.size() - 1; size >= 0; size--) {
            Path path = this.f7851c;
            list4 = c1641b.f7863a;
            path.addPath(((InterfaceC1654o) list4.get(size)).mo5495e(), matrix);
        }
        this.f7850b.setPath(this.f7851c, false);
        float length = this.f7850b.getLength();
        while (this.f7850b.nextContour()) {
            length += this.f7850b.getLength();
        }
        c1661v2 = c1641b.f7864b;
        float floatValue = (c1661v2.m5504f().mo5517g().floatValue() * length) / 360.0f;
        c1661v3 = c1641b.f7864b;
        float floatValue2 = ((c1661v3.m5502d().mo5517g().floatValue() * length) / 100.0f) + floatValue;
        c1661v4 = c1641b.f7864b;
        float floatValue3 = ((c1661v4.m5503e().mo5517g().floatValue() * length) / 100.0f) + floatValue;
        list2 = c1641b.f7863a;
        float f2 = 0.0f;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Path path2 = this.f7852d;
            list3 = c1641b.f7863a;
            path2.set(((InterfaceC1654o) list3.get(size2)).mo5495e());
            this.f7852d.transform(matrix);
            this.f7850b.setPath(this.f7852d, false);
            float length2 = this.f7850b.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f3 = Math.min(f4 / length2, 1.0f);
                    C1811g.m5905a(this.f7852d, f, f3, 0.0f);
                    canvas.drawPath(this.f7852d, this.f7849a);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 <= floatValue3 && floatValue2 < f2) {
                    canvas.drawPath(this.f7852d, this.f7849a);
                } else {
                    f = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    C1811g.m5905a(this.f7852d, f, f3, 0.0f);
                    canvas.drawPath(this.f7852d, this.f7849a);
                }
            }
            f2 += length2;
        }
        C1692an.m5565d("StrokeContent#applyTrimPath");
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0025 */
    @Override // com.coloros.anim.p052a.p053a.InterfaceC1645f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5482a(android.graphics.RectF r6, android.graphics.Matrix r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r8 = "StrokeContent#getBounds"
            com.coloros.anim.C1692an.m5564c(r8)
            android.graphics.Path r8 = r5.f7851c
            r8.reset()
            r8 = 0
            r0 = r8
        Lc:
            java.util.List<com.coloros.anim.a.a.b> r1 = r5.f7856h
            int r1 = r1.size()
            if (r0 >= r1) goto L40
            java.util.List<com.coloros.anim.a.a.b> r1 = r5.f7856h
            java.lang.Object r1 = r1.get(r0)
            com.coloros.anim.a.a.b r1 = (com.coloros.anim.p052a.p053a.C1641b) r1
            r2 = r8
        L1d:
            java.util.List r3 = com.coloros.anim.p052a.p053a.C1641b.m5486a(r1)
            int r3 = r3.size()
            if (r2 >= r3) goto L3d
            android.graphics.Path r3 = r5.f7851c
            java.util.List r4 = com.coloros.anim.p052a.p053a.C1641b.m5486a(r1)
            java.lang.Object r4 = r4.get(r2)
            com.coloros.anim.a.a.o r4 = (com.coloros.anim.p052a.p053a.InterfaceC1654o) r4
            android.graphics.Path r4 = r4.mo5495e()
            r3.addPath(r4, r7)
            int r2 = r2 + 1
            goto L1d
        L3d:
            int r0 = r0 + 1
            goto Lc
        L40:
            android.graphics.Path r7 = r5.f7851c
            android.graphics.RectF r0 = r5.f7853e
            r7.computeBounds(r0, r8)
            com.coloros.anim.a.b.a<?, java.lang.Float> r7 = r5.f7858j
            com.coloros.anim.a.b.d r7 = (com.coloros.anim.p052a.p054b.C1665d) r7
            float r7 = r7.m5522i()
            android.graphics.RectF r8 = r5.f7853e
            android.graphics.RectF r0 = r5.f7853e
            float r0 = r0.left
            r1 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r1
            float r0 = r0 - r7
            android.graphics.RectF r1 = r5.f7853e
            float r1 = r1.top
            float r1 = r1 - r7
            android.graphics.RectF r2 = r5.f7853e
            float r2 = r2.right
            float r2 = r2 + r7
            android.graphics.RectF r3 = r5.f7853e
            float r3 = r3.bottom
            float r3 = r3 + r7
            r8.set(r0, r1, r2, r3)
            android.graphics.RectF r5 = r5.f7853e
            r6.set(r5)
            float r5 = r6.left
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r7
            float r8 = r6.top
            float r8 = r8 - r7
            float r0 = r6.right
            float r0 = r0 + r7
            float r1 = r6.bottom
            float r1 = r1 + r7
            r6.set(r5, r8, r0, r1)
            java.lang.String r5 = "StrokeContent#getBounds"
            com.coloros.anim.C1692an.m5565d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coloros.anim.p052a.p053a.AbstractC1640a.mo5482a(android.graphics.RectF, android.graphics.Matrix, boolean):void");
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public final void mo5483a(C1762g c1762g, int i, List<C1762g> list, C1762g c1762g2) {
        C1810f.m5898a(c1762g, i, list, c1762g2, this);
    }

    @Override // com.coloros.anim.p056c.InterfaceC1763h
    /* renamed from: a */
    public <T> void mo5484a(T t, C1814b<T> c1814b) {
        if (t == InterfaceC1828t.f8459d) {
            this.f7859k.m5511a((C1814b<Integer>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8468m) {
            this.f7858j.m5511a((C1814b<Float>) c1814b);
            return;
        }
        if (t == InterfaceC1828t.f8481z) {
            if (c1814b == null) {
                this.f7862n = null;
                return;
            }
            this.f7862n = new C1678q(c1814b);
            this.f7862n.m5510a(this);
            this.f7855g.m5748a(this.f7862n);
        }
    }
}
