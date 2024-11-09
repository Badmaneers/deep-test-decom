package com.color.support.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSimpleLock.java */
/* renamed from: com.color.support.widget.dz */
/* loaded from: classes.dex */
public final class C1465dz implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f7104a;

    /* renamed from: b */
    final /* synthetic */ ColorSimpleLock f7105b;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1465dz(ColorSimpleLock colorSimpleLock, ValueAnimator valueAnimator) {
        this.f7105b = colorSimpleLock;
        this.f7104a = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        boolean z;
        boolean z2;
        ColorSimpleLock.m4719c(this.f7105b);
        this.f7105b.setInternalTranslationX(0.0f);
        this.f7105b.f6536z = false;
        this.f7105b.f6494C = true;
        this.f7104a.start();
        z = this.f7105b.f6503L;
        if (!z) {
            z2 = this.f7105b.f6509R;
            if (z2) {
                ColorSimpleLock.m4727f(this.f7105b);
                this.f7105b.f6509R = false;
                return;
            }
            return;
        }
        ColorSimpleLock.m4728g(this.f7105b);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7105b.setInternalTranslationX(0.0f);
        this.f7105b.f6536z = true;
        this.f7105b.f6494C = false;
        this.f7105b.invalidate();
    }
}
