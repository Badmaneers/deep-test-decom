package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: com.google.android.material.floatingactionbutton.t */
/* loaded from: classes.dex */
public final class C2210t extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f9803a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC2186ac f9804b;

    /* renamed from: c */
    final /* synthetic */ C2209s f9805c;

    /* renamed from: d */
    private boolean f9806d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2210t(C2209s c2209s, boolean z, InterfaceC2186ac interfaceC2186ac) {
        this.f9805c = c2209s;
        this.f9803a = z;
        this.f9804b = interfaceC2186ac;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9805c.f9795s.m7075a(0, this.f9803a);
        this.f9805c.f9775D = 1;
        this.f9805c.f9800x = animator;
        this.f9806d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9806d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9805c.f9775D = 0;
        this.f9805c.f9800x = null;
        if (this.f9806d) {
            return;
        }
        this.f9805c.f9795s.m7075a(this.f9803a ? 8 : 4, this.f9803a);
        if (this.f9804b != null) {
            this.f9804b.mo6963b();
        }
    }
}
