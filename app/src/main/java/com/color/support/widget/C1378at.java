package com.color.support.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorInstallLoadProgress.java */
/* renamed from: com.color.support.widget.at */
/* loaded from: classes.dex */
public final class C1378at implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ boolean f6938a;

    /* renamed from: b */
    final /* synthetic */ ColorInstallLoadProgress f6939b;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1378at(ColorInstallLoadProgress colorInstallLoadProgress, boolean z) {
        this.f6939b = colorInstallLoadProgress;
        this.f6938a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f6938a) {
            super/*com.color.support.widget.ColorLoadProgress*/.performClick();
        }
    }
}
