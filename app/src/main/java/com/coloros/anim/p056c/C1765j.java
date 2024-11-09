package com.coloros.anim.p056c;

import android.util.Pair;

/* compiled from: MutablePair.java */
/* renamed from: com.coloros.anim.c.j */
/* loaded from: classes.dex */
public final class C1765j<T> {

    /* renamed from: a */
    T f8356a;

    /* renamed from: b */
    T f8357b;

    /* renamed from: b */
    private static boolean m5800b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    public final void m5801a(T t, T t2) {
        this.f8356a = t;
        this.f8357b = t2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return m5800b(pair.first, this.f8356a) && m5800b(pair.second, this.f8357b);
    }

    public final int hashCode() {
        return (this.f8356a == null ? 0 : this.f8356a.hashCode()) ^ (this.f8357b != null ? this.f8357b.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f8356a) + " " + String.valueOf(this.f8357b) + "}";
    }
}
