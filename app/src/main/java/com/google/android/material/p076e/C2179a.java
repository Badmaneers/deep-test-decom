package com.google.android.material.p076e;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0542a;
import com.google.android.material.R;
import com.google.android.material.p073b.C2063a;
import com.google.android.material.p079h.C2220c;

/* compiled from: ElevationOverlayProvider.java */
/* renamed from: com.google.android.material.e.a */
/* loaded from: classes.dex */
public final class C2179a {

    /* renamed from: a */
    private final boolean f9675a;

    /* renamed from: b */
    private final int f9676b;

    /* renamed from: c */
    private final int f9677c;

    /* renamed from: d */
    private final float f9678d;

    public C2179a(Context context) {
        this.f9675a = C2220c.m7044a(context, R.attr.elevationOverlayEnabled, false);
        this.f9676b = C2063a.m6340a(context, R.attr.elevationOverlayColor);
        this.f9677c = C2063a.m6340a(context, R.attr.colorSurface);
        this.f9678d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final int m6909a(int i, float f) {
        if (this.f9675a) {
            if (C0542a.m1904b(i, 255) == this.f9677c) {
                float f2 = 0.0f;
                if (this.f9678d > 0.0f && f > 0.0f) {
                    f2 = Math.min(((((float) Math.log1p(f / this.f9678d)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                }
                return C0542a.m1904b(C2063a.m6339a(C0542a.m1904b(i, 255), this.f9676b, f2), Color.alpha(i));
            }
        }
        return i;
    }

    /* renamed from: a */
    public final boolean m6910a() {
        return this.f9675a;
    }
}
