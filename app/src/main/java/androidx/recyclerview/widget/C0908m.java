package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
final class C0908m extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AbstractC0879ce f3705a;

    /* renamed from: b */
    final /* synthetic */ View f3706b;

    /* renamed from: c */
    final /* synthetic */ ViewPropertyAnimator f3707c;

    /* renamed from: d */
    final /* synthetic */ C0903h f3708d;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0908m(C0903h c0903h, AbstractC0879ce abstractC0879ce, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3708d = c0903h;
        this.f3705a = abstractC0879ce;
        this.f3706b = view;
        this.f3707c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3706b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3707c.setListener(null);
        this.f3708d.m3051f(this.f3705a);
        this.f3708d.f3687d.remove(this.f3705a);
        this.f3708d.m3316c();
    }
}
