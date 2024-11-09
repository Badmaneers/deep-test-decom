package com.coloros.anim.p056c.p057a;

import com.coloros.anim.p052a.p054b.AbstractC1662a;
import com.coloros.anim.p052a.p054b.C1673l;
import com.coloros.anim.p062f.C1806b;
import com.coloros.anim.p063g.C1815c;
import com.coloros.anim.p063g.C1816d;
import java.util.List;

/* compiled from: AnimatableScaleValue.java */
/* renamed from: com.coloros.anim.c.a.g */
/* loaded from: classes.dex */
public final class C1709g extends AbstractC1716n<C1816d, C1816d> {
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

    C1709g() {
        this(new C1816d(1.0f, 1.0f));
    }

    private C1709g(C1816d c1816d) {
        super(c1816d);
    }

    public C1709g(List<C1815c<C1816d>> list) {
        super((List) list);
    }

    @Override // com.coloros.anim.p056c.p057a.InterfaceC1715m
    /* renamed from: a */
    public final AbstractC1662a<C1816d, C1816d> mo5628a() {
        if (C1806b.f8391d) {
            C1806b.m5866b("AnimatableScaleValue create ScaleKeyframeAnimation, keyframes is :" + toString());
        }
        return new C1673l(this.f8111a);
    }
}
