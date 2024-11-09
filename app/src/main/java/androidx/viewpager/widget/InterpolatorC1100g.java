package androidx.viewpager.widget;

import android.view.animation.Interpolator;

/* compiled from: ViewPager.java */
/* renamed from: androidx.viewpager.widget.g */
/* loaded from: classes.dex */
final class InterpolatorC1100g implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
