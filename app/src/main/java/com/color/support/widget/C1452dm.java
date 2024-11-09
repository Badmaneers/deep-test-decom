package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.dm */
/* loaded from: classes.dex */
public final class C1452dm extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1441db f7095a;

    public C1452dm(C1441db c1441db) {
        this.f7095a = c1441db;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView;
        super.onAnimationEnd(animator);
        imageView = this.f7095a.f7077a.f6467b;
        imageView.setVisibility(8);
    }
}
