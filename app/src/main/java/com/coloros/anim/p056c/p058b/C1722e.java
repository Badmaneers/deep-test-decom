package com.coloros.anim.p056c.p058b;

import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1649j;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1705c;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;
import java.util.List;

/* compiled from: GradientStroke.java */
/* renamed from: com.coloros.anim.c.b.e */
/* loaded from: classes.dex */
public final class C1722e implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8140a;

    /* renamed from: b */
    private final int f8141b;

    /* renamed from: c */
    private final C1705c f8142c;

    /* renamed from: d */
    private final C1706d f8143d;

    /* renamed from: e */
    private final C1708f f8144e;

    /* renamed from: f */
    private final C1708f f8145f;

    /* renamed from: g */
    private final C1704b f8146g;

    /* renamed from: h */
    private final EnumC1738u f8147h;

    /* renamed from: i */
    private final EnumC1739v f8148i;

    /* renamed from: j */
    private final float f8149j;

    /* renamed from: k */
    private final List<C1704b> f8150k;

    /* renamed from: l */
    private final C1704b f8151l;

    /* renamed from: m */
    private final boolean f8152m;

    public C1722e(String str, int i, C1705c c1705c, C1706d c1706d, C1708f c1708f, C1708f c1708f2, C1704b c1704b, EnumC1738u enumC1738u, EnumC1739v enumC1739v, float f, List<C1704b> list, C1704b c1704b2, boolean z) {
        this.f8140a = str;
        this.f8141b = i;
        this.f8142c = c1705c;
        this.f8143d = c1706d;
        this.f8144e = c1708f;
        this.f8145f = c1708f2;
        this.f8146g = c1704b;
        this.f8147h = enumC1738u;
        this.f8148i = enumC1739v;
        this.f8149j = f;
        this.f8150k = list;
        this.f8151l = c1704b2;
        this.f8152m = z;
    }

    /* renamed from: a */
    public final String m5660a() {
        return this.f8140a;
    }

    /* renamed from: b */
    public final int m5661b() {
        return this.f8141b;
    }

    /* renamed from: c */
    public final C1705c m5662c() {
        return this.f8142c;
    }

    /* renamed from: d */
    public final C1706d m5663d() {
        return this.f8143d;
    }

    /* renamed from: e */
    public final C1708f m5664e() {
        return this.f8144e;
    }

    /* renamed from: f */
    public final C1708f m5665f() {
        return this.f8145f;
    }

    /* renamed from: g */
    public final C1704b m5666g() {
        return this.f8146g;
    }

    /* renamed from: h */
    public final EnumC1738u m5667h() {
        return this.f8147h;
    }

    /* renamed from: i */
    public final EnumC1739v m5668i() {
        return this.f8148i;
    }

    /* renamed from: j */
    public final List<C1704b> m5669j() {
        return this.f8150k;
    }

    /* renamed from: k */
    public final C1704b m5670k() {
        return this.f8151l;
    }

    /* renamed from: l */
    public final float m5671l() {
        return this.f8149j;
    }

    /* renamed from: m */
    public final boolean m5672m() {
        return this.f8152m;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("GradientStroke to GradientStrokeContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1649j(c1698b, abstractC1743a, this);
    }
}
