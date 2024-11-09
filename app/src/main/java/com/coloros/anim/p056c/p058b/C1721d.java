package com.coloros.anim.p056c.p058b;

import android.graphics.Path;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1648i;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1705c;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p057a.C1708f;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: GradientFill.java */
/* renamed from: com.coloros.anim.c.b.d */
/* loaded from: classes.dex */
public final class C1721d implements InterfaceC1719b {

    /* renamed from: a */
    private final int f8130a;

    /* renamed from: b */
    private final Path.FillType f8131b;

    /* renamed from: c */
    private final C1705c f8132c;

    /* renamed from: d */
    private final C1706d f8133d;

    /* renamed from: e */
    private final C1708f f8134e;

    /* renamed from: f */
    private final C1708f f8135f;

    /* renamed from: g */
    private final String f8136g;

    /* renamed from: h */
    private final C1704b f8137h = null;

    /* renamed from: i */
    private final C1704b f8138i = null;

    /* renamed from: j */
    private final boolean f8139j;

    public C1721d(String str, int i, Path.FillType fillType, C1705c c1705c, C1706d c1706d, C1708f c1708f, C1708f c1708f2, boolean z) {
        this.f8130a = i;
        this.f8131b = fillType;
        this.f8132c = c1705c;
        this.f8133d = c1706d;
        this.f8134e = c1708f;
        this.f8135f = c1708f2;
        this.f8136g = str;
        this.f8139j = z;
    }

    /* renamed from: a */
    public final String m5652a() {
        return this.f8136g;
    }

    /* renamed from: b */
    public final int m5653b() {
        return this.f8130a;
    }

    /* renamed from: c */
    public final Path.FillType m5654c() {
        return this.f8131b;
    }

    /* renamed from: d */
    public final C1705c m5655d() {
        return this.f8132c;
    }

    /* renamed from: e */
    public final C1706d m5656e() {
        return this.f8133d;
    }

    /* renamed from: f */
    public final C1708f m5657f() {
        return this.f8134e;
    }

    /* renamed from: g */
    public final C1708f m5658g() {
        return this.f8135f;
    }

    /* renamed from: h */
    public final boolean m5659h() {
        return this.f8139j;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("GradientFill to GradientFillContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1648i(c1698b, abstractC1743a, this);
    }
}
