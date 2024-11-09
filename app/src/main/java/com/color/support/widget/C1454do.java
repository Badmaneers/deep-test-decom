package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.LinearLayout;

/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.do */
/* loaded from: classes.dex */
public final class C1454do extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1441db f7097a;

    public C1454do(C1441db c1441db) {
        this.f7097a = c1441db;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LinearLayout linearLayout;
        super.onAnimationEnd(animator);
        linearLayout = this.f7097a.f7077a.f6472g;
        linearLayout.setVisibility(8);
    }
}
