package com.coloros.anim.p056c.p057a;

import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1664c;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1815c;
import java.util.List;

/* compiled from: AnimatableColorValue.java */
/* renamed from: com.coloros.anim.c.a.a */
/* loaded from: classes.dex */
public final class C1703a extends AbstractC1716n<Integer, Integer> {
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

    public C1703a(List<C1815c<Integer>> list) {
        super((List) list);
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: a */
    public final AbstractC1662a<Integer, Integer> mo5628a() {
        if (C1806b.f8391d) {
            C1806b.m5866b("AnimatableColorValue.ColorKeyframeAnimation, keyframes is :" + toString());
        }
        return new C1664c(this.f8111a);
    }
}
