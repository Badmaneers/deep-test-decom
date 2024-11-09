package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ExtendedFloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.g */
/* loaded from: classes.dex */
public final class C2197g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2191ah f9750a;

    /* renamed from: b */
    final /* synthetic */ AbstractC2202l f9751b;

    /* renamed from: c */
    final /* synthetic */ ExtendedFloatingActionButton f9752c;

    /* renamed from: d */
    private boolean f9753d;

    public C2197g(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC2191ah interfaceC2191ah, AbstractC2202l abstractC2202l) {
        this.f9752c = extendedFloatingActionButton;
        this.f9750a = interfaceC2191ah;
        this.f9751b = abstractC2202l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9750a.mo6977a(animator);
        this.f9753d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9753d = true;
        this.f9750a.mo6982e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9750a.mo6981d();
    }
}
