package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateListAnimator.java */
/* renamed from: com.google.android.material.internal.ac */
/* loaded from: classes.dex */
public final class C2234ac extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C2233ab f9907a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2234ac(C2233ab c2233ab) {
        this.f9907a = c2233ab;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f9907a.f9903a == animator) {
            this.f9907a.f9903a = null;
        }
    }
}
