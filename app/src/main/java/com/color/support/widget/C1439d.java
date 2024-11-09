package com.color.support.widget;

import android.animation.ValueAnimator;

/* compiled from: ColorButton.java */
/* renamed from: com.color.support.widget.d */
/* loaded from: classes.dex */
final class C1439d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorButton f7075a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1439d(ColorButton colorButton) {
        this.f7075a = colorButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        this.f7075a.f5914q = ((Float) valueAnimator.getAnimatedValue("brightnessHolder")).floatValue();
        float floatValue = ((Float) valueAnimator.getAnimatedValue("narrowHolderY")).floatValue();
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue("narrowHolderX")).floatValue();
        float floatValue3 = ((Float) valueAnimator.getAnimatedValue("narrowHolderFont")).floatValue();
        z = this.f7075a.f5913p;
        if (!z && floatValue < this.f7075a.getMeasuredHeight() * 0.005f && floatValue2 < this.f7075a.getMeasuredWidth() * 0.005f) {
            floatValue = this.f7075a.getMeasuredHeight() * 0.005f;
            floatValue2 = this.f7075a.getMeasuredWidth() * 0.005f;
        }
        this.f7075a.f5916s = (int) (floatValue2 + 0.5d);
        this.f7075a.f5915r = (int) (floatValue + 0.5d);
        this.f7075a.f5917t = floatValue3;
        this.f7075a.invalidate();
    }
}
