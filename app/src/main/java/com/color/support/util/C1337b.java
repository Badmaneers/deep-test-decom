package com.color.support.util;

import android.content.Context;
import android.content.res.TypedArray;

/* compiled from: ColorContextUtil.java */
/* renamed from: com.color.support.util.b */
/* loaded from: classes.dex */
public final class C1337b {
    /* renamed from: a */
    public static int m4374a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int color2 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color2;
    }
}
