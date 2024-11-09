package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
final class C0910o extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0912q f3715a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f3716b;

    /* renamed from: c */
    final /* synthetic */ View f3717c;

    /* renamed from: d */
    final /* synthetic */ C0903h f3718d;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0910o(C0903h c0903h, C0912q c0912q, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3718d = c0903h;
        this.f3715a = c0912q;
        this.f3716b = viewPropertyAnimator;
        this.f3717c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3716b.setListener(null);
        this.f3717c.setAlpha(1.0f);
        this.f3717c.setTranslationX(0.0f);
        this.f3717c.setTranslationY(0.0f);
        this.f3718d.m3051f(this.f3715a.f3723a);
        this.f3718d.f3690g.remove(this.f3715a.f3723a);
        this.f3718d.m3316c();
    }
}
