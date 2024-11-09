package androidx.core.content.p020a;

import java.lang.reflect.Array;

/* compiled from: GrowingArrayUtils.java */
/* renamed from: androidx.core.content.a.j */
/* loaded from: classes.dex */
final class C0430j {

    /* renamed from: a */
    static final /* synthetic */ boolean f2170a = !C0430j.class.desiredAssertionStatus();

    /* renamed from: a */
    private static int m1522a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: a */
    public static <T> T[] m1524a(T[] tArr, int i, T t) {
        if (!f2170a && i > tArr.length) {
            throw new AssertionError();
        }
        if (i + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m1522a(i));
            System.arraycopy(tArr, 0, r0, 0, i);
            tArr = r0;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: a */
    public static int[] m1523a(int[] iArr, int i, int i2) {
        if (!f2170a && i > iArr.length) {
            throw new AssertionError();
        }
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m1522a(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    private C0430j() {
    }
}
