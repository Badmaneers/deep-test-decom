package com.coloros.anim.p052a.p054b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.j */
/* loaded from: classes.dex */
public final class C1671j extends AbstractC1668g<PointF> {

    /* renamed from: c */
    private final PointF f7999c;

    /* renamed from: d */
    private final float[] f8000d;

    /* renamed from: e */
    private C1670i f8001e;

    /* renamed from: f */
    private PathMeasure f8002f;

    public C1671j(List<? extends C1815c<PointF>> list) {
        super(list);
        this.f7999c = new PointF();
        this.f8000d = new float[2];
        this.f8002f = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    public final /* synthetic */ Object mo5507a(C1815c c1815c, float f) {
        PointF pointF;
        C1670i c1670i = (C1670i) c1815c;
        Path m5529b = c1670i.m5529b();
        if (m5529b == null) {
            return (PointF) c1815c.f8422a;
        }
        if (this.f7983b != null && (pointF = (PointF) this.f7983b.m5910a(c1670i.f8424c, c1670i.f8426e.floatValue(), c1670i.f8422a, c1670i.f8425d, m5514d(), f, m5518h())) != null) {
            return pointF;
        }
        if (this.f8001e != c1670i) {
            this.f8002f.setPath(m5529b, false);
            this.f8001e = c1670i;
        }
        this.f8002f.getPosTan(f * this.f8002f.getLength(), this.f8000d, null);
        this.f7999c.set(this.f8000d[0], this.f8000d[1]);
        return this.f7999c;
    }
}
