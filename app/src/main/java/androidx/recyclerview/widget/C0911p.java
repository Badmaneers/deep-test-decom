package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
final class C0911p extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0912q f3719a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f3720b;

    /* renamed from: c */
    final /* synthetic */ View f3721c;

    /* renamed from: d */
    final /* synthetic */ C0903h f3722d;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0911p(C0903h c0903h, C0912q c0912q, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3722d = c0903h;
        this.f3719a = c0912q;
        this.f3720b = viewPropertyAnimator;
        this.f3721c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3720b.setListener(null);
        this.f3721c.setAlpha(1.0f);
        this.f3721c.setTranslationX(0.0f);
        this.f3721c.setTranslationY(0.0f);
        this.f3722d.m3051f(this.f3719a.f3724b);
        this.f3722d.f3690g.remove(this.f3719a.f3724b);
        this.f3722d.m3316c();
    }
}
