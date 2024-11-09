package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorInstallLoadProgress.java */
/* renamed from: com.color.support.widget.ao */
/* loaded from: classes.dex */
public final class C1373ao implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorInstallLoadProgress f6932a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1373ao(ColorInstallLoadProgress colorInstallLoadProgress) {
        this.f6932a = colorInstallLoadProgress;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6932a.f6079q = ((Integer) valueAnimator.getAnimatedValue("widthHolder")).intValue();
        this.f6932a.f6080r = ((Integer) valueAnimator.getAnimatedValue("heightHolder")).intValue();
        this.f6932a.f6064N = ((Float) valueAnimator.getAnimatedValue("brightnessHolder")).floatValue();
        this.f6932a.invalidate();
    }
}
