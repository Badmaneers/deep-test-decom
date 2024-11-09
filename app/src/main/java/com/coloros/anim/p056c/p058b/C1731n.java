package com.coloros.anim.p056c.p058b;

import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1658s;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1714l;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: Repeater.java */
/* renamed from: com.coloros.anim.c.b.n */
/* loaded from: classes.dex */
public final class C1731n implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8192a;

    /* renamed from: b */
    private final C1704b f8193b;

    /* renamed from: c */
    private final C1704b f8194c;

    /* renamed from: d */
    private final C1714l f8195d;

    /* renamed from: e */
    private final boolean f8196e;

    public C1731n(String str, C1704b c1704b, C1704b c1704b2, C1714l c1714l, boolean z) {
        this.f8192a = str;
        this.f8193b = c1704b;
        this.f8194c = c1704b2;
        this.f8195d = c1714l;
        this.f8196e = z;
    }

    /* renamed from: a */
    public final String m5698a() {
        return this.f8192a;
    }

    /* renamed from: b */
    public final C1704b m5699b() {
        return this.f8193b;
    }

    /* renamed from: c */
    public final C1704b m5700c() {
        return this.f8194c;
    }

    /* renamed from: d */
    public final C1714l m5701d() {
        return this.f8195d;
    }

    /* renamed from: e */
    public final boolean m5702e() {
        return this.f8196e;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (C1806b.f8391d) {
            C1806b.m5866b("Repeater to RepeaterContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1658s(c1698b, abstractC1743a, this);
    }
}
