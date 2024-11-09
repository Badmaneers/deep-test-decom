package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomAppBar.java */
/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes.dex */
public final class C2071a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar f9173a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2071a(BottomAppBar bottomAppBar) {
        this.f9173a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i;
        boolean z;
        BottomAppBar bottomAppBar = this.f9173a;
        i = this.f9173a.f9154l;
        z = this.f9173a.f9162t;
        bottomAppBar.m6400a(i, z);
    }
}
