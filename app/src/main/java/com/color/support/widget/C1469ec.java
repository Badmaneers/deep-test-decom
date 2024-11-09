package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSlideView.java */
/* renamed from: com.color.support.widget.ec */
/* loaded from: classes.dex */
public final class C1469ec implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSlideView f7115a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1469ec(ColorSlideView colorSlideView) {
        this.f7115a = colorSlideView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7115a.f6600s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}
