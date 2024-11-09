package com.coloros.anim.p056c.p058b;

import android.graphics.PointF;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1646g;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p057a.InterfaceC1715m;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: CircleShape.java */
/* renamed from: com.coloros.anim.c.b.a */
/* loaded from: classes.dex */
public final class C1718a implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8123a;

    /* renamed from: b */
    private final InterfaceC1715m<PointF, PointF> f8124b;

    /* renamed from: c */
    private final C1708f f8125c;

    /* renamed from: d */
    private final boolean f8126d;

    /* renamed from: e */
    private final boolean f8127e;

    public C1718a(String str, InterfaceC1715m<PointF, PointF> interfaceC1715m, C1708f c1708f, boolean z, boolean z2) {
        this.f8123a = str;
        this.f8124b = interfaceC1715m;
        this.f8125c = c1708f;
        this.f8126d = z;
        this.f8127e = z2;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("CircleShape::toContent layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1646g(c1698b, abstractC1743a, this);
    }

    /* renamed from: a */
    public final String m5643a() {
        return this.f8123a;
    }

    /* renamed from: b */
    public final InterfaceC1715m<PointF, PointF> m5644b() {
        return this.f8124b;
    }

    /* renamed from: c */
    public final C1708f m5645c() {
        return this.f8125c;
    }

    /* renamed from: d */
    public final boolean m5646d() {
        return this.f8126d;
    }

    /* renamed from: e */
    public final boolean m5647e() {
        return this.f8127e;
    }
}
