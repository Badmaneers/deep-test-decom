package com.color.support.util;

/* compiled from: MathUtils.java */
/* renamed from: com.color.support.util.m */
/* loaded from: classes.dex */
public final class C1348m {
    /* renamed from: a */
    public static int m4406a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }
}
