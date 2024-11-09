package com.coloros.anim;

import java.util.Arrays;

/* compiled from: EffectiveAnimationResult.java */
/* renamed from: com.coloros.anim.u */
/* loaded from: classes.dex */
public final class C1829u<V> {

    /* renamed from: a */
    private final V f8482a;

    /* renamed from: b */
    private final Throwable f8483b;

    public C1829u(V v) {
        this.f8482a = v;
        this.f8483b = null;
    }

    public C1829u(Throwable th) {
        this.f8483b = th;
        this.f8482a = null;
    }

    /* renamed from: a */
    public final V m5924a() {
        return this.f8482a;
    }

    /* renamed from: b */
    public final Throwable m5925b() {
        return this.f8483b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1829u)) {
            return false;
        }
        C1829u c1829u = (C1829u) obj;
        if (this.f8482a != null && this.f8482a.equals(c1829u.f8482a)) {
            return true;
        }
        if (this.f8483b == null || c1829u.f8483b == null) {
            return false;
        }
        return this.f8483b.toString().equals(this.f8483b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8482a, this.f8483b});
    }
}
