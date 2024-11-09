package com.coloros.anim.p052a.p054b;

import android.graphics.PointF;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.k */
/* loaded from: classes.dex */
public final class C1672k extends AbstractC1668g<PointF> {

    /* renamed from: c */
    private final PointF f8003c;

    public C1672k(List<C1815c<PointF>> list) {
        super(list);
        this.f8003c = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    public final /* synthetic */ Object mo5507a(C1815c c1815c, float f) {
        PointF pointF;
        if (c1815c.f8422a == 0 || c1815c.f8425d == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) c1815c.f8422a;
        PointF pointF3 = (PointF) c1815c.f8425d;
        if (this.f7983b != null && (pointF = (PointF) this.f7983b.m5910a(c1815c.f8424c, c1815c.f8426e.floatValue(), pointF2, pointF3, f, m5514d(), m5518h())) != null) {
            return pointF;
        }
        this.f8003c.set(pointF2.x + ((pointF3.x - pointF2.x) * f), pointF2.y + (f * (pointF3.y - pointF2.y)));
        return this.f8003c;
    }
}
