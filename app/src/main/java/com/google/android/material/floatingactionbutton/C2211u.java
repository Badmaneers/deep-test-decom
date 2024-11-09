package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: com.google.android.material.floatingactionbutton.u */
/* loaded from: classes.dex */
public final class C2211u extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f9807a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC2186ac f9808b;

    /* renamed from: c */
    final /* synthetic */ C2209s f9809c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2211u(C2209s c2209s, boolean z, InterfaceC2186ac interfaceC2186ac) {
        this.f9809c = c2209s;
        this.f9807a = z;
        this.f9808b = interfaceC2186ac;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9809c.f9795s.m7075a(0, this.f9807a);
        this.f9809c.f9775D = 2;
        this.f9809c.f9800x = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9809c.f9775D = 0;
        this.f9809c.f9800x = null;
        if (this.f9808b != null) {
            this.f9808b.mo6962a();
        }
    }
}
