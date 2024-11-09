package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.f */
/* loaded from: classes.dex */
public final class C2331f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10310a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2331f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10310a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        InterfaceC2344s interfaceC2344s;
        interfaceC2344s = this.f10310a.f10277h;
        interfaceC2344s.mo7450a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10310a.m7445b();
    }
}
