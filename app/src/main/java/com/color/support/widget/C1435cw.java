package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.cw */
/* loaded from: classes.dex */
public final class C1435cw extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ColorSearchViewAnimate f7071a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1435cw(ColorSearchViewAnimate colorSearchViewAnimate) {
        this.f7071a = colorSearchViewAnimate;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f7071a.setToolBarChildVisibility(8);
        ColorSearchViewAnimate.m4685e(this.f7071a);
        this.f7071a.m4692i();
    }
}
