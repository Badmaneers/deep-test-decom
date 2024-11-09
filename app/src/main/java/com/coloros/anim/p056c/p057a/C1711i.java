package com.coloros.anim.p056c.p057a;

import android.graphics.PointF;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1675n;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* renamed from: com.coloros.anim.c.a.i */
/* loaded from: classes.dex */
public final class C1711i implements InterfaceC1715m<PointF, PointF> {

    /* renamed from: a */
    private final C1704b f8096a;

    /* renamed from: b */
    private final C1704b f8097b;

    public C1711i(C1704b c1704b, C1704b c1704b2) {
        this.f8096a = c1704b;
        this.f8097b = c1704b2;
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: c */
    public final List<C1815c<PointF>> mo5630c() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: b */
    public final boolean mo5629b() {
        return this.f8096a.mo5629b() && this.f8097b.mo5629b();
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: a */
    public final AbstractC1662a<PointF, PointF> mo5628a() {
        if (C1806b.f8391d) {
            C1806b.m5866b("AnimatableSplitDimensionPathValue create SplitDimensionPathKeyframeAnimation.");
        }
        return new C1675n(this.f8096a.mo5628a(), this.f8097b.mo5628a());
    }
}
