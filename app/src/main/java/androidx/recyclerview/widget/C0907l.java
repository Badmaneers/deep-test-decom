package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
final class C0907l extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AbstractC0879ce f3701a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f3702b;

    /* renamed from: c */
    final /* synthetic */ View f3703c;

    /* renamed from: d */
    final /* synthetic */ C0903h f3704d;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C0907l(C0903h c0903h, AbstractC0879ce abstractC0879ce, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3704d = c0903h;
        this.f3701a = abstractC0879ce;
        this.f3702b = viewPropertyAnimator;
        this.f3703c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3702b.setListener(null);
        this.f3703c.setAlpha(1.0f);
        this.f3704d.m3051f(this.f3701a);
        this.f3704d.f3689f.remove(this.f3701a);
        this.f3704d.m3316c();
    }
}
