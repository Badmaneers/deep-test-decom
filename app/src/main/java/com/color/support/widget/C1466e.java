package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorButton.java */
/* renamed from: com.color.support.widget.e */
/* loaded from: classes.dex */
public final class C1466e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorButton f7106a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1466e(ColorButton colorButton) {
        this.f7106a = colorButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7106a.f5914q = ((Float) valueAnimator.getAnimatedValue("brightnessHolder")).floatValue();
        float floatValue = ((Float) valueAnimator.getAnimatedValue("narrowHolderY")).floatValue();
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue("narrowHolderX")).floatValue();
        this.f7106a.f5917t = ((Float) valueAnimator.getAnimatedValue("narrowHolderFont")).floatValue();
        this.f7106a.f5915r = (int) (floatValue + 0.5d);
        this.f7106a.f5916s = (int) (floatValue2 + 0.5d);
        this.f7106a.invalidate();
    }
}
