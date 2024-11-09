package com.google.p066a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* renamed from: com.google.a.s */
/* loaded from: classes.dex */
public final class C2024s extends AbstractC2026u implements Iterable<AbstractC2026u> {

    /* renamed from: a */
    private final List<AbstractC2026u> f8948a = new ArrayList();

    /* renamed from: a */
    public final void m6225a(AbstractC2026u abstractC2026u) {
        if (abstractC2026u == null) {
            abstractC2026u = C2028w.f8949a;
        }
        this.f8948a.add(abstractC2026u);
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC2026u> iterator() {
        return this.f8948a.iterator();
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: a */
    public final Number mo6224a() {
        if (this.f8948a.size() == 1) {
            return this.f8948a.get(0).mo6224a();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: b */
    public final String mo6226b() {
        if (this.f8948a.size() == 1) {
            return this.f8948a.get(0).mo6226b();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: c */
    public final double mo6227c() {
        if (this.f8948a.size() == 1) {
            return this.f8948a.get(0).mo6227c();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: d */
    public final long mo6228d() {
        if (this.f8948a.size() == 1) {
            return this.f8948a.get(0).mo6228d();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: e */
    public final int mo6229e() {
        if (this.f8948a.size() == 1) {
            return this.f8948a.get(0).mo6229e();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.p066a.AbstractC2026u
    /* renamed from: f */
    public final boolean mo6230f() {
        if (this.f8948a.size() == 1) {
            return this.f8948a.get(0).mo6230f();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C2024s) && ((C2024s) obj).f8948a.equals(this.f8948a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f8948a.hashCode();
    }
}
