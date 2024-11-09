package com.color.support.widget.floatingbutton;

import android.animation.Animator;
import com.color.support.widget.floatingbutton.ColorFloatingButton;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.f */
/* loaded from: classes.dex */
public final class C1511f implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButton f7236a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1511f(ColorFloatingButton colorFloatingButton) {
        this.f7236a = colorFloatingButton;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ShapeableImageView shapeableImageView;
        ColorFloatingButton.InstanceState instanceState;
        Runnable runnable;
        shapeableImageView = this.f7236a.f7181e;
        shapeableImageView.setClickable(false);
        instanceState = this.f7236a.f7178b;
        instanceState.f7204b = true;
        ColorFloatingButton colorFloatingButton = this.f7236a;
        runnable = this.f7236a.f7185i;
        colorFloatingButton.postDelayed(runnable, 5000L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        ColorFloatingButton.InstanceState instanceState;
        shapeableImageView = this.f7236a.f7181e;
        shapeableImageView.setClickable(true);
        shapeableImageView2 = this.f7236a.f7181e;
        shapeableImageView2.setVisibility(0);
        instanceState = this.f7236a.f7178b;
        instanceState.f7204b = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Runnable runnable;
        ShapeableImageView shapeableImageView;
        ColorFloatingButton colorFloatingButton = this.f7236a;
        runnable = this.f7236a.f7185i;
        colorFloatingButton.removeCallbacks(runnable);
        shapeableImageView = this.f7236a.f7181e;
        shapeableImageView.setVisibility(8);
    }
}
