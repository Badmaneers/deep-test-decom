package com.color.support.widget;

import android.view.animation.Interpolator;

/* compiled from: SpringOverScroller.java */
/* renamed from: com.color.support.widget.go */
/* loaded from: classes.dex */
final class InterpolatorC1557go implements Interpolator {

    /* renamed from: a */
    private static final float f7372a = 1.0f / m5195a(1.0f);

    /* renamed from: b */
    private static final float f7373b = 1.0f - (f7372a * m5195a(1.0f));

    /* renamed from: a */
    private static float m5195a(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp(-f2)));
        }
        return 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float m5195a = f7372a * m5195a(f);
        return m5195a > 0.0f ? m5195a + f7373b : m5195a;
    }
}
