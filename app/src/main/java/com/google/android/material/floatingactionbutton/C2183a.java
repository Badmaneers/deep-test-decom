package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* compiled from: AnimatorTracker.java */
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes.dex */
final class C2183a {

    /* renamed from: a */
    private Animator f9718a;

    /* renamed from: a */
    public final void m6957a() {
        this.f9718a = null;
    }

    /* renamed from: a */
    public final void m6958a(Animator animator) {
        if (this.f9718a != null) {
            this.f9718a.cancel();
        }
        this.f9718a = animator;
    }
}
