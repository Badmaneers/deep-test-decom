package com.coloros.anim.p056c.p058b;

import com.coloros.anim.C1692an;
import com.coloros.anim.C1698b;
import com.coloros.anim.p052a.p053a.C1652m;
import com.coloros.anim.p052a.p053a.InterfaceC1643d;
import com.coloros.anim.p056c.p059c.AbstractC1743a;
import com.coloros.anim.p062f.C1806b;

/* compiled from: MergePaths.java */
/* renamed from: com.coloros.anim.c.b.i */
/* loaded from: classes.dex */
public final class C1726i implements InterfaceC1719b {

    /* renamed from: a */
    private final String f8164a;

    /* renamed from: b */
    private final EnumC1727j f8165b;

    /* renamed from: c */
    private final boolean f8166c;

    public C1726i(String str, EnumC1727j enumC1727j, boolean z) {
        this.f8164a = str;
        this.f8165b = enumC1727j;
        this.f8166c = z;
    }

    /* renamed from: a */
    public final String m5678a() {
        return this.f8164a;
    }

    /* renamed from: b */
    public final EnumC1727j m5679b() {
        return this.f8165b;
    }

    /* renamed from: c */
    public final boolean m5680c() {
        return this.f8166c;
    }

    @Override // com.coloros.anim.p056c.p058b.InterfaceC1719b
    /* renamed from: a */
    public final InterfaceC1643d mo5632a(C1698b c1698b, AbstractC1743a abstractC1743a) {
        if (!c1698b.m5582a()) {
            C1692an.m5563b("Animation contains merge paths but they are disabled.");
            return null;
        }
        if (C1806b.f8391d) {
            C1806b.m5866b("MergePaths to MergePathsContent, layer = ".concat(String.valueOf(abstractC1743a)));
        }
        return new C1652m(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f8165b + '}';
    }
}
