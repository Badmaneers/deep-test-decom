package androidx.p011b;

/* compiled from: ContainerHelpers.java */
/* renamed from: androidx.b.e */
/* loaded from: classes.dex */
final class C0322e {

    /* renamed from: a */
    static final int[] f1473a = new int[0];

    /* renamed from: b */
    static final long[] f1474b = new long[0];

    /* renamed from: c */
    static final Object[] f1475c = new Object[0];

    /* renamed from: c */
    private static int m1029c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m1024a(int i) {
        return m1029c(i * 4) / 4;
    }

    /* renamed from: b */
    public static int m1028b(int i) {
        return m1029c(i * 8) / 8;
    }

    /* renamed from: a */
    public static boolean m1027a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m1025a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m1026a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
