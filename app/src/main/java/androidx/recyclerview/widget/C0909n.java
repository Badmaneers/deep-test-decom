package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
final class C0909n extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AbstractC0879ce f3709a;

    /* renamed from: b */
    final /* synthetic */ int f3710b;

    /* renamed from: c */
    final /* synthetic */ View f3711c;

    /* renamed from: d */
    final /* synthetic */ int f3712d;

    /* renamed from: e */
    final /* synthetic */ ViewPropertyAnimator f3713e;

    /* renamed from: f */
    final /* synthetic */ C0903h f3714f;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0909n(C0903h c0903h, AbstractC0879ce abstractC0879ce, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3714f = c0903h;
        this.f3709a = abstractC0879ce;
        this.f3710b = i;
        this.f3711c = view;
        this.f3712d = i2;
        this.f3713e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f3710b != 0) {
            this.f3711c.setTranslationX(0.0f);
        }
        if (this.f3712d != 0) {
            this.f3711c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3713e.setListener(null);
        this.f3714f.m3051f(this.f3709a);
        this.f3714f.f3688e.remove(this.f3709a);
        this.f3714f.m3316c();
    }
}
