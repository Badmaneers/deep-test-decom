package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.dl */
/* loaded from: classes.dex */
public final class C1451dl extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1441db f7094a;

    public C1451dl(C1441db c1441db) {
        this.f7094a = c1441db;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView;
        super.onAnimationEnd(animator);
        imageView = this.f7094a.f7077a.f6467b;
        imageView.setVisibility(0);
    }
}
