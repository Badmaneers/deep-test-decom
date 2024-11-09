package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.dg */
/* loaded from: classes.dex */
public final class C1446dg extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1441db f7089a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1446dg(C1441db c1441db) {
        this.f7089a = c1441db;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        super.onAnimationEnd(animator);
        runnable = this.f7089a.f7082f;
        runnable.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable;
        super.onAnimationStart(animator);
        runnable = this.f7089a.f7081e;
        runnable.run();
    }
}
