package com.coloros.anim.p056c.p057a;

import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1666e;
import com.coloros.anim.p056c.p058b.C1720c;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: AnimatableGradientColorValue.java */
/* renamed from: com.coloros.anim.c.a.c */
/* loaded from: classes.dex */
public final class C1705c extends AbstractC1716n<C1720c, C1720c> {
    @Override // com.coloros.anim.p056c.p057a.AbstractC1716n, com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo5629b() {
        return super.mo5629b();
    }

    @Override // com.coloros.anim.p056c.p057a.AbstractC1716n, com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ List mo5630c() {
        return super.mo5630c();
    }

    @Override // com.coloros.anim.p056c.p057a.AbstractC1716n
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public C1705c(List<C1815c<C1720c>> list) {
        super((List) list);
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: a */
    public final AbstractC1662a<C1720c, C1720c> mo5628a() {
        if (C1806b.f8391d) {
            C1806b.m5866b("AnimatableGradientColorValue create GradientColorKeyframeAnimation, keyframes is :" + toString());
        }
        return new C1666e(this.f8111a);
    }
}
