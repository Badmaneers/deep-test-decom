package androidx.core.p024g;

/* compiled from: NestedScrollingParentHelper.java */
/* renamed from: androidx.core.g.r */
/* loaded from: classes.dex */
public final class C0533r {

    /* renamed from: a */
    private int f2375a;

    /* renamed from: b */
    private int f2376b;

    /* renamed from: a */
    public final void m1809a(int i) {
        m1810a(i, 0);
    }

    /* renamed from: a */
    public final void m1810a(int i, int i2) {
        if (i2 == 1) {
            this.f2376b = i;
        } else {
            this.f2375a = i;
        }
    }

    /* renamed from: a */
    public final int m1808a() {
        return this.f2376b | this.f2375a;
    }

    /* renamed from: b */
    public final void m1811b() {
        m1812b(0);
    }

    /* renamed from: b */
    public final void m1812b(int i) {
        if (i == 1) {
            this.f2376b = 0;
        } else {
            this.f2375a = 0;
        }
    }
}
