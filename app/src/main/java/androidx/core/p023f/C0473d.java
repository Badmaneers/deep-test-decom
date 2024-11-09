package androidx.core.p023f;

/* compiled from: Pair.java */
/* renamed from: androidx.core.f.d */
/* loaded from: classes.dex */
public final class C0473d<F, S> {

    /* renamed from: a */
    public final F f2273a;

    /* renamed from: b */
    public final S f2274b;

    public C0473d(F f, S s) {
        this.f2273a = f;
        this.f2274b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0473d)) {
            return false;
        }
        C0473d c0473d = (C0473d) obj;
        return C0472c.m1615a(c0473d.f2273a, this.f2273a) && C0472c.m1615a(c0473d.f2274b, this.f2274b);
    }

    public final int hashCode() {
        return (this.f2273a == null ? 0 : this.f2273a.hashCode()) ^ (this.f2274b != null ? this.f2274b.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f2273a) + " " + String.valueOf(this.f2274b) + "}";
    }

    /* renamed from: a */
    public static <A, B> C0473d<A, B> m1616a(A a2, B b) {
        return new C0473d<>(a2, b);
    }
}
