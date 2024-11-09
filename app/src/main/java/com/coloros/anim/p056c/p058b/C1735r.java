package com.coloros.anim.p056c.p058b;

import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1659t;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1710h;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: ShapePath.java */
/* renamed from: com.coloros.anim.c.b.r */
/* loaded from: classes.dex */
public final class C1735r implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8209a;

    /* renamed from: b */
    private final int f8210b;

    /* renamed from: c */
    private final C1710h f8211c;

    /* renamed from: d */
    private final boolean f8212d;

    public C1735r(String str, int i, C1710h c1710h, boolean z) {
        this.f8209a = str;
        this.f8210b = i;
        this.f8211c = c1710h;
        this.f8212d = z;
    }

    /* renamed from: a */
    public final String m5715a() {
        return this.f8209a;
    }

    /* renamed from: b */
    public final C1710h m5716b() {
        return this.f8211c;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("ShapePath to ShapeContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1659t(c1698b, abstractC1743a, this);
    }

    /* renamed from: c */
    public final boolean m5717c() {
        return this.f8212d;
    }

    public final String toString() {
        return "ShapePath{name=" + this.f8209a + ", index=" + this.f8210b + '}';
    }
}
