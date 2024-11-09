package com.color.support.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSimpleLock.java */
/* renamed from: com.color.support.widget.du */
/* loaded from: classes.dex */
public final class C1460du implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ColorSimpleLock f7099a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1460du(ColorSimpleLock colorSimpleLock) {
        this.f7099a = colorSimpleLock;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7099a.f6535y = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        Animator animator2;
        Animator animator3;
        Animator animator4;
        this.f7099a.f6535y = true;
        this.f7099a.invalidate();
        z = this.f7099a.f6494C;
        if (z) {
            animator2 = this.f7099a.f6497F;
            if (animator2 != null) {
                animator4 = this.f7099a.f6497F;
                if (animator4.isRunning()) {
                    this.f7099a.f6535y = false;
                    return;
                }
            }
            ColorSimpleLock.m4719c(this.f7099a);
            this.f7099a.f6497F = this.f7099a.m4734a();
            animator3 = this.f7099a.f6497F;
            animator3.start();
            this.f7099a.f6509R = true;
        }
    }
}
