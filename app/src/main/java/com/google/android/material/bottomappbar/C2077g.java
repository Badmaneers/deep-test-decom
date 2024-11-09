package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.g */
/* loaded from: classes.dex */
public final class C2077g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar f9180a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2077g(BottomAppBar bottomAppBar) {
        this.f9180a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9180a.m6422m();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar.m6425n(this.f9180a);
        BottomAppBar.m6426o(this.f9180a);
    }
}
