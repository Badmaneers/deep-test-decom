package com.color.support.widget.floatingbutton;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.i */
/* loaded from: classes.dex */
public final class C1514i implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ObjectAnimator f7248a;

    /* renamed from: b */
    final /* synthetic */ ColorFloatingButton f7249b;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1514i(ColorFloatingButton colorFloatingButton, ObjectAnimator objectAnimator) {
        this.f7249b = colorFloatingButton;
        this.f7248a = objectAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShapeableImageView shapeableImageView;
        shapeableImageView = this.f7249b.f7181e;
        shapeableImageView.setClickable(false);
        this.f7248a.start();
    }
}
