package com.color.support.widget;

import java.lang.reflect.Array;

/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bs */
/* loaded from: classes.dex */
public final class C1404bs {

    /* renamed from: a */
    private static final C1404bs[][] f6977a;

    /* renamed from: b */
    private final int f6978b;

    /* renamed from: c */
    private final int f6979c;

    private C1404bs(int i, int i2) {
        m4919b(i, i2);
        this.f6978b = i;
        this.f6979c = i2;
    }

    /* renamed from: a */
    public final int m4920a() {
        return this.f6978b;
    }

    /* renamed from: b */
    public final int m4921b() {
        return this.f6979c;
    }

    /* renamed from: a */
    public static C1404bs m4917a(int i, int i2) {
        m4919b(i, i2);
        return f6977a[i][i2];
    }

    /* renamed from: b */
    private static void m4919b(int i, int i2) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("row must be in range 0-2");
        }
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException("column must be in range 0-2");
        }
    }

    public final String toString() {
        return "(row=" + this.f6978b + ",clmn=" + this.f6979c + ")";
    }

    static {
        C1404bs[][] c1404bsArr = (C1404bs[][]) Array.newInstance((Class<?>) C1404bs.class, 3, 3);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                c1404bsArr[i][i2] = new C1404bs(i, i2);
            }
        }
        f6977a = c1404bsArr;
    }
}
