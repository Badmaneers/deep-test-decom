package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.g */
/* loaded from: classes.dex */
final class C2382g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C2362a f10543a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2382g(C2362a c2362a) {
        this.f10543a = c2362a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10543a.f10573a.setEndIconVisible(false);
    }
}
