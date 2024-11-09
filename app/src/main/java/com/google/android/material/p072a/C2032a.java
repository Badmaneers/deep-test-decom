package com.google.android.material.p072a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.p028d.p029a.p030a.C0596a;
import androidx.p028d.p029a.p030a.C0597b;
import androidx.p028d.p029a.p030a.C0598c;

/* compiled from: AnimationUtils.java */
/* renamed from: com.google.android.material.a.a */
/* loaded from: classes.dex */
public final class C2032a {

    /* renamed from: a */
    public static final TimeInterpolator f8973a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f8974b = new C0597b();

    /* renamed from: c */
    public static final TimeInterpolator f8975c = new C0596a();

    /* renamed from: d */
    public static final TimeInterpolator f8976d = new C0598c();

    /* renamed from: e */
    public static final TimeInterpolator f8977e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m6240a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m6241a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
