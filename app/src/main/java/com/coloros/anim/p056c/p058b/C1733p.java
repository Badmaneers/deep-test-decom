package com.coloros.anim.p056c.p058b;

import android.graphics.Path;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1647h;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1703a;
import com.coloros.anim.p056c.p057a.C1706d;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: ShapeFill.java */
/* renamed from: com.coloros.anim.c.b.p */
/* loaded from: classes.dex */
public final class C1733p implements InterfaceC1719b {

    /* renamed from: a */
    private final boolean f8200a;

    /* renamed from: b */
    private final Path.FillType f8201b;

    /* renamed from: c */
    private final String f8202c;

    /* renamed from: d */
    private final C1703a f8203d;

    /* renamed from: e */
    private final C1706d f8204e;

    /* renamed from: f */
    private final boolean f8205f;

    public C1733p(String str, boolean z, Path.FillType fillType, C1703a c1703a, C1706d c1706d, boolean z2) {
        this.f8202c = str;
        this.f8200a = z;
        this.f8201b = fillType;
        this.f8203d = c1703a;
        this.f8204e = c1706d;
        this.f8205f = z2;
    }

    /* renamed from: a */
    public final String m5707a() {
        return this.f8202c;
    }

    /* renamed from: b */
    public final C1703a m5708b() {
        return this.f8203d;
    }

    /* renamed from: c */
    public final C1706d m5709c() {
        return this.f8204e;
    }

    /* renamed from: d */
    public final Path.FillType m5710d() {
        return this.f8201b;
    }

    /* renamed from: e */
    public final boolean m5711e() {
        return this.f8205f;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("ShapeFill to FillContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1647h(c1698b, abstractC1743a, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f8200a + '}';
    }
}
