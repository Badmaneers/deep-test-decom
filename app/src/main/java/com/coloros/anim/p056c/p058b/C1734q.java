package com.coloros.anim.p056c.p058b;

import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1644e;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* renamed from: com.coloros.anim.c.b.q */
/* loaded from: classes.dex */
public final class C1734q implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8206a;

    /* renamed from: b */
    private final List<InterfaceC1719b> f8207b;

    /* renamed from: c */
    private final boolean f8208c;

    public C1734q(String str, List<InterfaceC1719b> list, boolean z) {
        this.f8206a = str;
        this.f8207b = list;
        this.f8208c = z;
    }

    /* renamed from: a */
    public final String m5712a() {
        return this.f8206a;
    }

    /* renamed from: b */
    public final List<InterfaceC1719b> m5713b() {
        return this.f8207b;
    }

    /* renamed from: c */
    public final boolean m5714c() {
        return this.f8208c;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("ShapeGroup to ContentGroup, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1644e(c1698b, abstractC1743a, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f8206a + "' Shapes: " + Arrays.toString(this.f8207b.toArray()) + '}';
    }
}
