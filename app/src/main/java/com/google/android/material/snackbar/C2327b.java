package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: classes.dex */
public final class C2327b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10305a;

    public C2327b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10305a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10305a.m7445b();
    }
}
