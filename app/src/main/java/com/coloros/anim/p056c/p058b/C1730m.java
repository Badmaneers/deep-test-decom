package com.coloros.anim.p056c.p058b;

import android.graphics.PointF;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1657r;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p057a.InterfaceC1715m;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: RectangleShape.java */
/* renamed from: com.coloros.anim.c.b.m */
/* loaded from: classes.dex */
public final class C1730m implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8187a;

    /* renamed from: b */
    private final InterfaceC1715m<PointF, PointF> f8188b;

    /* renamed from: c */
    private final C1708f f8189c;

    /* renamed from: d */
    private final C1704b f8190d;

    /* renamed from: e */
    private final boolean f8191e;

    public C1730m(String str, InterfaceC1715m<PointF, PointF> interfaceC1715m, C1708f c1708f, C1704b c1704b, boolean z) {
        this.f8187a = str;
        this.f8188b = interfaceC1715m;
        this.f8189c = c1708f;
        this.f8190d = c1704b;
        this.f8191e = z;
    }

    /* renamed from: a */
    public final String m5693a() {
        return this.f8187a;
    }

    /* renamed from: b */
    public final C1704b m5694b() {
        return this.f8190d;
    }

    /* renamed from: c */
    public final C1708f m5695c() {
        return this.f8189c;
    }

    /* renamed from: d */
    public final InterfaceC1715m<PointF, PointF> m5696d() {
        return this.f8188b;
    }

    /* renamed from: e */
    public final boolean m5697e() {
        return this.f8191e;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("RectangleShape to RectangleContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1657r(c1698b, abstractC1743a, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f8188b + ", size=" + this.f8189c + '}';
    }
}
