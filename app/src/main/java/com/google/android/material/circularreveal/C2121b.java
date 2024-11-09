package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularRevealCompat.java */
/* renamed from: com.google.android.material.circularreveal.b */
/* loaded from: classes.dex */
final class C2121b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2124e f9510a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2121b(InterfaceC2124e interfaceC2124e) {
        this.f9510a = interfaceC2124e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9510a.mo6768a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9510a.mo6770b();
    }
}
