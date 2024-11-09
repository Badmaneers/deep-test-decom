package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.cy */
/* loaded from: classes.dex */
public final class C1437cy implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSearchViewAnimate f7073a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1437cy(ColorSearchViewAnimate colorSearchViewAnimate) {
        this.f7073a = colorSearchViewAnimate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7073a.setToolBarAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
