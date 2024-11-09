package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bp */
/* loaded from: classes.dex */
public final class C1401bp implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1405bt f6971a;

    /* renamed from: b */
    final /* synthetic */ ColorLockPatternView f6972b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1401bp(ColorLockPatternView colorLockPatternView, C1405bt c1405bt) {
        this.f6972b = colorLockPatternView;
        this.f6971a = c1405bt;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6971a.f6989j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6972b.invalidate();
    }
}
