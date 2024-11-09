package com.coloros.anim.p056c.p058b;

import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1660u;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1703a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* renamed from: com.coloros.anim.c.b.s */
/* loaded from: classes.dex */
public final class C1736s implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8213a;

    /* renamed from: b */
    private final C1704b f8214b;

    /* renamed from: c */
    private final List<C1704b> f8215c;

    /* renamed from: d */
    private final C1703a f8216d;

    /* renamed from: e */
    private final C1706d f8217e;

    /* renamed from: f */
    private final C1704b f8218f;

    /* renamed from: g */
    private final EnumC1738u f8219g;

    /* renamed from: h */
    private final EnumC1739v f8220h;

    /* renamed from: i */
    private final float f8221i;

    /* renamed from: j */
    private final boolean f8222j;

    public C1736s(String str, C1704b c1704b, List<C1704b> list, C1703a c1703a, C1706d c1706d, C1704b c1704b2, EnumC1738u enumC1738u, EnumC1739v enumC1739v, float f, boolean z) {
        this.f8213a = str;
        this.f8214b = c1704b;
        this.f8215c = list;
        this.f8216d = c1703a;
        this.f8217e = c1706d;
        this.f8218f = c1704b2;
        this.f8219g = enumC1738u;
        this.f8220h = enumC1739v;
        this.f8221i = f;
        this.f8222j = z;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("ShapeStroke to StrokeContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1660u(c1698b, abstractC1743a, this);
    }

    /* renamed from: a */
    public final String m5718a() {
        return this.f8213a;
    }

    /* renamed from: b */
    public final C1703a m5719b() {
        return this.f8216d;
    }

    /* renamed from: c */
    public final C1706d m5720c() {
        return this.f8217e;
    }

    /* renamed from: d */
    public final C1704b m5721d() {
        return this.f8218f;
    }

    /* renamed from: e */
    public final List<C1704b> m5722e() {
        return this.f8215c;
    }

    /* renamed from: f */
    public final C1704b m5723f() {
        return this.f8214b;
    }

    /* renamed from: g */
    public final EnumC1738u m5724g() {
        return this.f8219g;
    }

    /* renamed from: h */
    public final EnumC1739v m5725h() {
        return this.f8220h;
    }

    /* renamed from: i */
    public final float m5726i() {
        return this.f8221i;
    }

    /* renamed from: j */
    public final boolean m5727j() {
        return this.f8222j;
    }
}
