package com.color.support.widget;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLoadingView.java */
/* renamed from: com.color.support.widget.bi */
/* loaded from: classes.dex */
public final class C1394bi implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    WeakReference<ColorLoadingView> f6959a;

    public C1394bi(ColorLoadingView colorLoadingView) {
        this.f6959a = new WeakReference<>(colorLoadingView);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        valueAnimator.getAnimatedFraction();
        ColorLoadingView colorLoadingView = this.f6959a.get();
        if (colorLoadingView != null) {
            colorLoadingView.invalidate();
        }
    }
}
