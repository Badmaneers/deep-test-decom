package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HideBottomViewOnScrollBehavior.java */
/* renamed from: com.google.android.material.behavior.a */
/* loaded from: classes.dex */
public final class C2066a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ HideBottomViewOnScrollBehavior f9139a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2066a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f9139a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideBottomViewOnScrollBehavior.m6385a(this.f9139a);
    }
}
