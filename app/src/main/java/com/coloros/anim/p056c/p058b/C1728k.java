package com.coloros.anim.p056c.p058b;

import android.graphics.PointF;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1655p;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.InterfaceC1715m;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: PolystarShape.java */
/* renamed from: com.coloros.anim.c.b.k */
/* loaded from: classes.dex */
public final class C1728k implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8173a;

    /* renamed from: b */
    private final EnumC1729l f8174b;

    /* renamed from: c */
    private final C1704b f8175c;

    /* renamed from: d */
    private final InterfaceC1715m<PointF, PointF> f8176d;

    /* renamed from: e */
    private final C1704b f8177e;

    /* renamed from: f */
    private final C1704b f8178f;

    /* renamed from: g */
    private final C1704b f8179g;

    /* renamed from: h */
    private final C1704b f8180h;

    /* renamed from: i */
    private final C1704b f8181i;

    /* renamed from: j */
    private final boolean f8182j;

    public C1728k(String str, EnumC1729l enumC1729l, C1704b c1704b, InterfaceC1715m<PointF, PointF> interfaceC1715m, C1704b c1704b2, C1704b c1704b3, C1704b c1704b4, C1704b c1704b5, C1704b c1704b6, boolean z) {
        this.f8173a = str;
        this.f8174b = enumC1729l;
        this.f8175c = c1704b;
        this.f8176d = interfaceC1715m;
        this.f8177e = c1704b2;
        this.f8178f = c1704b3;
        this.f8179g = c1704b4;
        this.f8180h = c1704b5;
        this.f8181i = c1704b6;
        this.f8182j = z;
    }

    /* renamed from: a */
    public final String m5682a() {
        return this.f8173a;
    }

    /* renamed from: b */
    public final EnumC1729l m5683b() {
        return this.f8174b;
    }

    /* renamed from: c */
    public final C1704b m5684c() {
        return this.f8175c;
    }

    /* renamed from: d */
    public final InterfaceC1715m<PointF, PointF> m5685d() {
        return this.f8176d;
    }

    /* renamed from: e */
    public final C1704b m5686e() {
        return this.f8177e;
    }

    /* renamed from: f */
    public final C1704b m5687f() {
        return this.f8178f;
    }

    /* renamed from: g */
    public final C1704b m5688g() {
        return this.f8179g;
    }

    /* renamed from: h */
    public final C1704b m5689h() {
        return this.f8180h;
    }

    /* renamed from: i */
    public final C1704b m5690i() {
        return this.f8181i;
    }

    /* renamed from: j */
    public final boolean m5691j() {
        return this.f8182j;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("PolystarShape to RepeaterContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1655p(c1698b, abstractC1743a, this);
    }
}
