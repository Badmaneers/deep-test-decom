package com.coloros.anim.p056c.p058b;

import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1661v;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: ShapeTrimPath.java */
/* renamed from: com.coloros.anim.c.b.w */
/* loaded from: classes.dex */
public final class C1740w implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8233a;

    /* renamed from: b */
    private final int f8234b;

    /* renamed from: c */
    private final C1704b f8235c;

    /* renamed from: d */
    private final C1704b f8236d;

    /* renamed from: e */
    private final C1704b f8237e;

    /* renamed from: f */
    private final boolean f8238f;

    public C1740w(String str, int i, C1704b c1704b, C1704b c1704b2, C1704b c1704b3, boolean z) {
        this.f8233a = str;
        this.f8234b = i;
        this.f8235c = c1704b;
        this.f8236d = c1704b2;
        this.f8237e = c1704b3;
        this.f8238f = z;
    }

    /* renamed from: a */
    public final String m5730a() {
        return this.f8233a;
    }

    /* renamed from: b */
    public final int m5731b() {
        return this.f8234b;
    }

    /* renamed from: c */
    public final C1704b m5732c() {
        return this.f8236d;
    }

    /* renamed from: d */
    public final C1704b m5733d() {
        return this.f8235c;
    }

    /* renamed from: e */
    public final C1704b m5734e() {
        return this.f8237e;
    }

    /* renamed from: f */
    public final boolean m5735f() {
        return this.f8238f;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("ShapeTrimPath to TrimPathContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1661v(abstractC1743a, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f8235c + ", end: " + this.f8236d + ", offset: " + this.f8237e + "}";
    }
}
