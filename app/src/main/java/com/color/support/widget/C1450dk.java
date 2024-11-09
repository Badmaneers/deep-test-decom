package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.dk */
/* loaded from: classes.dex */
public final class C1450dk extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1441db f7093a;

    public C1450dk(C1441db c1441db) {
        this.f7093a = c1441db;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView;
        super.onAnimationEnd(animator);
        imageView = this.f7093a.f7077a.f6467b;
        imageView.setVisibility(4);
    }
}
