package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
public final class C0713y extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f3030a;

    /* renamed from: b */
    final /* synthetic */ View f3031b;

    /* renamed from: c */
    final /* synthetic */ Fragment f3032c;

    /* renamed from: d */
    final /* synthetic */ LayoutInflaterFactory2C0707s f3033d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0713y(LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f3033d = layoutInflaterFactory2C0707s;
        this.f3030a = viewGroup;
        this.f3031b = view;
        this.f3032c = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3030a.endViewTransition(this.f3031b);
        animator.removeListener(this);
        if (this.f3032c.f2748O == null || !this.f3032c.f2741H) {
            return;
        }
        this.f3032c.f2748O.setVisibility(8);
    }
}
