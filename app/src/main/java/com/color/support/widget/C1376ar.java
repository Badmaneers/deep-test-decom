package com.color.support.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorInstallLoadProgress.java */
/* renamed from: com.color.support.widget.ar */
/* loaded from: classes.dex */
public final class C1376ar implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ boolean f6935a;

    /* renamed from: b */
    final /* synthetic */ ColorInstallLoadProgress f6936b;

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
    public C1376ar(ColorInstallLoadProgress colorInstallLoadProgress, boolean z) {
        this.f6936b = colorInstallLoadProgress;
        this.f6935a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f6935a) {
            super/*com.color.support.widget.ColorLoadProgress*/.performClick();
        }
    }
}
