package androidx.room;

import java.util.Arrays;

/* compiled from: InvalidationTracker.java */
/* renamed from: androidx.room.l */
/* loaded from: classes.dex */
final class C0955l {

    /* renamed from: a */
    final long[] f3901a = new long[1];

    /* renamed from: b */
    final boolean[] f3902b = new boolean[1];

    /* renamed from: c */
    final int[] f3903c = new int[1];

    /* renamed from: d */
    boolean f3904d;

    /* renamed from: e */
    boolean f3905e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0955l() {
        Arrays.fill(this.f3901a, 0L);
        Arrays.fill(this.f3902b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3391a(int... iArr) {
        boolean z;
        synchronized (this) {
            z = false;
            for (int i : iArr) {
                long j = this.f3901a[i];
                this.f3901a[i] = 1 + j;
                if (j == 0) {
                    this.f3904d = true;
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m3394b(int... iArr) {
        boolean z;
        synchronized (this) {
            z = false;
            for (int i : iArr) {
                long j = this.f3901a[i];
                this.f3901a[i] = j - 1;
                if (j == 1) {
                    this.f3904d = true;
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int[] m3392a() {
        synchronized (this) {
            if (this.f3904d && !this.f3905e) {
                int length = this.f3901a.length;
                int i = 0;
                while (true) {
                    int i2 = 1;
                    if (i < length) {
                        boolean z = this.f3901a[i] > 0;
                        if (z != this.f3902b[i]) {
                            int[] iArr = this.f3903c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.f3903c[i] = 0;
                        }
                        this.f3902b[i] = z;
                        i++;
                    } else {
                        this.f3905e = true;
                        this.f3904d = false;
                        return this.f3903c;
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3393b() {
        synchronized (this) {
            this.f3905e = false;
        }
    }
}
