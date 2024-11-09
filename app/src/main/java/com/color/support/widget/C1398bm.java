package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bm */
/* loaded from: classes.dex */
public final class C1398bm extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ColorLockPatternView f6962a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1398bm(ColorLockPatternView colorLockPatternView) {
        this.f6962a = colorLockPatternView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.f6962a.m4537a();
        valueAnimator = this.f6962a.f6202I;
        if (valueAnimator != null) {
            valueAnimator2 = this.f6962a.f6202I;
            valueAnimator2.removeAllListeners();
        }
    }
}
