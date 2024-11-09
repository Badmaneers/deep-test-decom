package com.color.support.widget.floatingbutton;

import android.animation.Animator;
import com.color.support.widget.floatingbutton.ColorFloatingButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFloatingButton.java */
/* renamed from: com.color.support.widget.floatingbutton.e */
/* loaded from: classes.dex */
public final class C1510e implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ColorFloatingButton f7235a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1510e(ColorFloatingButton colorFloatingButton) {
        this.f7235a = colorFloatingButton;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ColorFloatingButton.InstanceState instanceState;
        Runnable runnable;
        instanceState = this.f7235a.f7178b;
        instanceState.f7204b = true;
        ColorFloatingButton colorFloatingButton = this.f7235a;
        runnable = this.f7235a.f7185i;
        colorFloatingButton.removeCallbacks(runnable);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ColorFloatingButton.InstanceState instanceState;
        instanceState = this.f7235a.f7178b;
        instanceState.f7204b = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Runnable runnable;
        ColorFloatingButton colorFloatingButton = this.f7235a;
        runnable = this.f7235a.f7185i;
        colorFloatingButton.removeCallbacks(runnable);
    }
}
