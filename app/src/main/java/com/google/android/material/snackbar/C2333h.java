package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.h */
/* loaded from: classes.dex */
public final class C2333h extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f10314a;

    /* renamed from: b */
    final /* synthetic */ BaseTransientBottomBar f10315b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2333h(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f10315b = baseTransientBottomBar;
        this.f10314a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        InterfaceC2344s interfaceC2344s;
        interfaceC2344s = this.f10315b.f10277h;
        interfaceC2344s.mo7451b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10315b.m7446c();
    }
}
