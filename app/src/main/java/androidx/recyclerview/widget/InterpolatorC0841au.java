package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.au */
/* loaded from: classes.dex */
final class InterpolatorC0841au implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
