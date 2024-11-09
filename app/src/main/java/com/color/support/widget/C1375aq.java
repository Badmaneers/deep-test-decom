package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorInstallLoadProgress.java */
/* renamed from: com.color.support.widget.aq */
/* loaded from: classes.dex */
public final class C1375aq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorInstallLoadProgress f6934a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1375aq(ColorInstallLoadProgress colorInstallLoadProgress) {
        this.f6934a = colorInstallLoadProgress;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6934a.f6079q = ((Integer) valueAnimator.getAnimatedValue("widthHolder")).intValue();
        this.f6934a.f6080r = ((Integer) valueAnimator.getAnimatedValue("heightHolder")).intValue();
        this.f6934a.f6064N = ((Float) valueAnimator.getAnimatedValue("brightnessHolder")).floatValue();
        this.f6934a.invalidate();
    }
}
