package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.cx */
/* loaded from: classes.dex */
public final class C1436cx extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ColorSearchViewAnimate f7072a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1436cx(ColorSearchViewAnimate colorSearchViewAnimate) {
        this.f7072a = colorSearchViewAnimate;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f7072a.setVisibility(8);
    }
}
