package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorInstallLoadProgress.java */
/* renamed from: com.color.support.widget.as */
/* loaded from: classes.dex */
public final class C1377as implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorInstallLoadProgress f6937a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1377as(ColorInstallLoadProgress colorInstallLoadProgress) {
        this.f6937a = colorInstallLoadProgress;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6937a.f6088z = ((Integer) valueAnimator.getAnimatedValue("circleRadiusHolder")).intValue();
        this.f6937a.f6064N = ((Float) valueAnimator.getAnimatedValue("circleBrightnessHolder")).floatValue();
        this.f6937a.invalidate();
    }
}
