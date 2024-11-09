package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.c */
/* loaded from: classes.dex */
public final class C2328c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f10306a;

    /* renamed from: b */
    final /* synthetic */ BaseTransientBottomBar f10307b;

    public C2328c(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f10307b = baseTransientBottomBar;
        this.f10306a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10307b.m7446c();
    }
}
