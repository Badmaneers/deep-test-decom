package androidx.core.p024g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPropertyAnimatorCompat.java */
/* renamed from: androidx.core.g.ai */
/* loaded from: classes.dex */
public final class C0508ai extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0511al f2349a;

    /* renamed from: b */
    final /* synthetic */ View f2350b;

    /* renamed from: c */
    final /* synthetic */ C0507ah f2351c;

    public C0508ai(C0507ah c0507ah, InterfaceC0511al interfaceC0511al, View view) {
        this.f2351c = c0507ah;
        this.f2349a = interfaceC0511al;
        this.f2350b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2349a.mo758c(this.f2350b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2349a.mo170b(this.f2350b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2349a.mo169a(this.f2350b);
    }
}
