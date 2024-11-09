package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.br */
/* loaded from: classes.dex */
public final class C1403br implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1405bt f6975a;

    /* renamed from: b */
    final /* synthetic */ ColorLockPatternView f6976b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1403br(ColorLockPatternView colorLockPatternView, C1405bt c1405bt) {
        this.f6976b = colorLockPatternView;
        this.f6975a = c1405bt;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6975a.f6990k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
