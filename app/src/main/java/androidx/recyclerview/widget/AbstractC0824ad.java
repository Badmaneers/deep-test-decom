package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* compiled from: GridLayoutManager.java */
/* renamed from: androidx.recyclerview.widget.ad */
/* loaded from: classes.dex */
public abstract class AbstractC0824ad {

    /* renamed from: a */
    final SparseIntArray f3456a = new SparseIntArray();

    /* renamed from: b */
    final SparseIntArray f3457b = new SparseIntArray();

    /* renamed from: c */
    private boolean f3458c = false;

    /* renamed from: d */
    private boolean f3459d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m2935b(int i, int i2) {
        if (!this.f3458c) {
            return mo2932a(i, i2);
        }
        int i3 = this.f3456a.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int mo2932a = mo2932a(i, i2);
        this.f3456a.put(i, mo2932a);
        return mo2932a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m2936c(int i, int i2) {
        if (!this.f3459d) {
            return m2934d(i, i2);
        }
        int i3 = this.f3457b.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int m2934d = m2934d(i, i2);
        this.f3457b.put(i, m2934d);
        return m2934d;
    }

    /* renamed from: a */
    public int mo2932a(int i, int i2) {
        int i3;
        int i4;
        int m2933a;
        if (1 == i2) {
            return 0;
        }
        if (!this.f3458c || (m2933a = m2933a(this.f3456a, i)) < 0) {
            i3 = 0;
            i4 = 0;
        } else {
            i3 = this.f3456a.get(m2933a) + 1;
            i4 = m2933a + 1;
        }
        while (i4 < i) {
            i3++;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = 1;
            }
            i4++;
        }
        if (i3 + 1 <= i2) {
            return i3;
        }
        return 0;
    }

    /* renamed from: a */
    private static int m2933a(SparseIntArray sparseIntArray, int i) {
        int size = sparseIntArray.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (sparseIntArray.keyAt(i3) < i) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        int i4 = i2 - 1;
        if (i4 < 0 || i4 >= sparseIntArray.size()) {
            return -1;
        }
        return sparseIntArray.keyAt(i4);
    }

    /* renamed from: d */
    private int m2934d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int m2933a;
        if (!this.f3459d || (m2933a = m2933a(this.f3457b, i)) == -1) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            i4 = this.f3457b.get(m2933a);
            i5 = m2933a + 1;
            i3 = m2935b(m2933a, i2) + 1;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            }
        }
        while (i5 < i) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
            i5++;
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }
}
