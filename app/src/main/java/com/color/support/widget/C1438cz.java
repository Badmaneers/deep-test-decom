package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.cz */
/* loaded from: classes.dex */
public final class C1438cz extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ColorSearchViewAnimate f7074a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1438cz(ColorSearchViewAnimate colorSearchViewAnimate) {
        this.f7074a = colorSearchViewAnimate;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ColorSearchViewAnimate.m4685e(this.f7074a);
        ColorSearchViewAnimate.m4689g(this.f7074a);
    }
}
