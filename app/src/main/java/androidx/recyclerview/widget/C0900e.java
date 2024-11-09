package androidx.recyclerview.widget;

/* compiled from: ChildHelper.java */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
final class C0900e {

    /* renamed from: a */
    long f3675a = 0;

    /* renamed from: b */
    C0900e f3676b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3300a(int i) {
        while (i >= 64) {
            this.m3299a();
            this = this.f3676b;
            i -= 64;
        }
        this.f3675a |= 1 << i;
    }

    /* renamed from: a */
    private void m3299a() {
        if (this.f3676b == null) {
            this.f3676b = new C0900e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3302b(int i) {
        while (i >= 64) {
            if (this.f3676b == null) {
                return;
            }
            this = this.f3676b;
            i -= 64;
        }
        this.f3675a &= ~(1 << i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m3303c(int i) {
        while (i >= 64) {
            this.m3299a();
            this = this.f3676b;
            i -= 64;
        }
        return ((1 << i) & this.f3675a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3301a(int i, boolean z) {
        while (true) {
            if (i >= 64) {
                this.m3299a();
                this = this.f3676b;
                i -= 64;
            } else {
                boolean z2 = (this.f3675a & Long.MIN_VALUE) != 0;
                long j = (1 << i) - 1;
                this.f3675a = (this.f3675a & j) | (((~j) & this.f3675a) << 1);
                if (z) {
                    this.m3300a(i);
                } else {
                    this.m3302b(i);
                }
                if (!z2 && this.f3676b == null) {
                    return;
                }
                this.m3299a();
                this = this.f3676b;
                i = 0;
                z = z2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m3304d(int i) {
        while (i >= 64) {
            this.m3299a();
            this = this.f3676b;
            i -= 64;
        }
        long j = 1 << i;
        boolean z = (this.f3675a & j) != 0;
        this.f3675a &= ~j;
        long j2 = j - 1;
        this.f3675a = (this.f3675a & j2) | Long.rotateRight((~j2) & this.f3675a, 1);
        if (this.f3676b != null) {
            if (this.f3676b.m3303c(0)) {
                this.m3300a(63);
            }
            this.f3676b.m3304d(0);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m3305e(int i) {
        if (this.f3676b == null) {
            if (i >= 64) {
                return Long.bitCount(this.f3675a);
            }
            return Long.bitCount(((1 << i) - 1) & this.f3675a);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f3675a);
        }
        return this.f3676b.m3305e(i - 64) + Long.bitCount(this.f3675a);
    }

    public final String toString() {
        if (this.f3676b == null) {
            return Long.toBinaryString(this.f3675a);
        }
        return this.f3676b.toString() + "xx" + Long.toBinaryString(this.f3675a);
    }
}
