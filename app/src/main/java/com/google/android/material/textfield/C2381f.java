package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes.dex */
final class C2381f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C2362a f10542a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2381f(C2362a c2362a) {
        this.f10542a = c2362a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10542a.f10573a.setEndIconVisible(true);
    }
}
