package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorInstallLoadProgress.java */
/* renamed from: com.color.support.widget.ap */
/* loaded from: classes.dex */
public final class C1374ap implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorInstallLoadProgress f6933a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1374ap(ColorInstallLoadProgress colorInstallLoadProgress) {
        this.f6933a = colorInstallLoadProgress;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6933a.f6088z = ((Integer) valueAnimator.getAnimatedValue("circleRadiusHolder")).intValue();
        this.f6933a.f6064N = ((Float) valueAnimator.getAnimatedValue("circleBrightnessHolder")).floatValue();
        this.f6933a.invalidate();
    }
}
