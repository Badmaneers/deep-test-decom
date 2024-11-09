package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bl */
/* loaded from: classes.dex */
public final class C1397bl implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorLockPatternView f6961a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1397bl(ColorLockPatternView colorLockPatternView) {
        this.f6961a = colorLockPatternView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1405bt[][] c1405btArr;
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                c1405btArr = this.f6961a.f6207a;
                C1405bt c1405bt = c1405btArr[i][i2];
                c1405bt.f6990k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1405bt.f6992m = c1405bt.f6990k <= 0.1f;
            }
        }
        this.f6961a.invalidate();
    }
}
