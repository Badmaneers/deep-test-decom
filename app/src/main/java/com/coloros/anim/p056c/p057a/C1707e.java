package com.coloros.anim.p056c.p057a;

import android.graphics.PointF;
import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1671j;
import com.coloros.anim.p052a.p054b.C1672k;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1815c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* renamed from: com.coloros.anim.c.a.e */
/* loaded from: classes.dex */
public final class C1707e implements InterfaceC1715m<PointF, PointF> {

    /* renamed from: a */
    private final List<C1815c<PointF>> f8095a;

    public C1707e() {
        this.f8095a = Collections.singletonList(new C1815c(new PointF(0.0f, 0.0f)));
    }

    public C1707e(List<C1815c<PointF>> list) {
        this.f8095a = list;
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: c */
    public final List<C1815c<PointF>> mo5630c() {
        return this.f8095a;
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: b */
    public final boolean mo5629b() {
        return this.f8095a.size() == 1 && this.f8095a.get(0).m5915e();
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: a */
    public final AbstractC1662a<PointF, PointF> mo5628a() {
        if (this.f8095a.get(0).m5915e()) {
            if (C1806b.f8391d) {
                C1806b.m5866b("AnimatablePathValue.create PointKeyframeAnimation, keyframes is :" + toString());
            }
            return new C1672k(this.f8095a);
        }
        if (C1806b.f8391d) {
            C1806b.m5866b("AnimatablePathValue.create PathKeyframeAnimation, keyframes is :" + toString());
        }
        return new C1671j(this.f8095a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f8095a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f8095a.toArray()));
        }
        return sb.toString();
    }
}
