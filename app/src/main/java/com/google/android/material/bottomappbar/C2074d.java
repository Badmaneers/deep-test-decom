package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.d */
/* loaded from: classes.dex */
final class C2074d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar f9176a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2074d(BottomAppBar bottomAppBar) {
        this.f9176a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9176a.m6422m();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar.m6425n(this.f9176a);
    }
}
