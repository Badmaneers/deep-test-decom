package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.cv */
/* loaded from: classes.dex */
public final class C1434cv implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSearchViewAnimate f7070a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1434cv(ColorSearchViewAnimate colorSearchViewAnimate) {
        this.f7070a = colorSearchViewAnimate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7070a.setToolBarAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
