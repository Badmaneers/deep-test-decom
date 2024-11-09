package androidx.customview.p027a;

import android.view.animation.Interpolator;

/* compiled from: ViewDragHelper.java */
/* renamed from: androidx.customview.a.j */
/* loaded from: classes.dex */
final class InterpolatorC0591j implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
