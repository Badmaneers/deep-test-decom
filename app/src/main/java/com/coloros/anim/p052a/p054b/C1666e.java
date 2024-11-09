package com.coloros.anim.p052a.p054b;

import com.coloros.anim.p056c.p058b.C1720c;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* renamed from: com.coloros.anim.a.b.e */
/* loaded from: classes.dex */
public final class C1666e extends AbstractC1668g<C1720c> {

    /* renamed from: c */
    private final C1720c f7993c;

    public C1666e(List<C1815c<C1720c>> list) {
        super(list);
        C1720c c1720c = list.get(0).f8422a;
        int m5651c = c1720c != null ? c1720c.m5651c() : 0;
        this.f7993c = new C1720c(new float[m5651c], new int[m5651c]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.coloros.anim.p052a.p054b.AbstractC1662a
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Object mo5507a(C1815c c1815c, float f) {
        this.f7993c.m5648a((C1720c) c1815c.f8422a, (C1720c) c1815c.f8425d, f);
        return this.f7993c;
    }
}
