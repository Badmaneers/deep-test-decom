package com.color.support.widget;

import android.view.animation.Interpolator;

/* compiled from: ColorOverScroller.java */
/* renamed from: com.color.support.widget.co */
/* loaded from: classes.dex */
final class InterpolatorC1427co implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
