package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bq */
/* loaded from: classes.dex */
public final class C1402bq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1405bt f6973a;

    /* renamed from: b */
    final /* synthetic */ ColorLockPatternView f6974b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1402bq(ColorLockPatternView colorLockPatternView, C1405bt c1405bt) {
        this.f6974b = colorLockPatternView;
        this.f6973a = c1405bt;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6973a.f6991l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6974b.invalidate();
    }
}
