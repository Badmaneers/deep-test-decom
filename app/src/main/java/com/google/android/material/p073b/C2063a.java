package com.google.android.material.p073b;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.core.graphics.C0542a;
import com.google.android.material.p079h.C2220c;

/* compiled from: MaterialColors.java */
/* renamed from: com.google.android.material.b.a */
/* loaded from: classes.dex */
public final class C2063a {
    /* renamed from: a */
    public static int m6340a(Context context, int i) {
        TypedValue m7043a = C2220c.m7043a(context, i);
        if (m7043a != null) {
            return m7043a.data;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m6339a(int i, int i2, float f) {
        return C0542a.m1900a(C0542a.m1904b(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
