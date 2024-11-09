package com.color.support.widget;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSimpleLock.java */
/* renamed from: com.color.support.widget.dw */
/* loaded from: classes.dex */
public final class C1462dw implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ColorSimpleLock f7101a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1462dw(ColorSimpleLock colorSimpleLock) {
        this.f7101a = colorSimpleLock;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7101a.f6534x = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7101a.f6534x = true;
        this.f7101a.invalidate();
    }
}
