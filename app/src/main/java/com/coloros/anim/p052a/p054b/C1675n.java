package com.coloros.anim.p052a.p054b;

import android.graphics.PointF;
import com.coloros.anim.p063g.C1815c;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.n */
/* loaded from: classes.dex */
public final class C1675n extends AbstractC1662a<PointF, PointF> {

    /* renamed from: c */
    private final PointF f8007c;

    /* renamed from: d */
    private final AbstractC1662a<Float, Float> f8008d;

    /* renamed from: e */
    private final AbstractC1662a<Float, Float> f8009e;

    public C1675n(AbstractC1662a<Float, Float> abstractC1662a, AbstractC1662a<Float, Float> abstractC1662a2) {
        super(Collections.emptyList());
        this.f8007c = new PointF();
        this.f8008d = abstractC1662a;
        this.f8009e = abstractC1662a2;
        mo5509a(m5518h());
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    public final void mo5509a(float f) {
        this.f8008d.mo5509a(f);
        this.f8009e.mo5509a(f);
        this.f8007c.set(this.f8008d.mo5517g().floatValue(), this.f8009e.mo5517g().floatValue());
        for (int i = 0; i < this.f7982a.size(); i++) {
            this.f7982a.get(i).mo5480a();
        }
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    final /* bridge */ /* synthetic */ PointF mo5507a(C1815c<PointF> c1815c, float f) {
        return this.f8007c;
    }

    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ PointF mo5517g() {
        return this.f8007c;
    }
}
