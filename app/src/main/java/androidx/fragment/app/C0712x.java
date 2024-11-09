package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public final class C0712x extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f3026a;

    /* renamed from: b */
    final /* synthetic */ View f3027b;

    /* renamed from: c */
    final /* synthetic */ Fragment f3028c;

    /* renamed from: d */
    final /* synthetic */ LayoutInflaterFactory2C0707s f3029d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0712x(LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f3029d = layoutInflaterFactory2C0707s;
        this.f3026a = viewGroup;
        this.f3027b = view;
        this.f3028c = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3026a.endViewTransition(this.f3027b);
        Animator m2272Z = this.f3028c.m2272Z();
        this.f3028c.m2277a((Animator) null);
        if (m2272Z == null || this.f3026a.indexOfChild(this.f3027b) >= 0) {
            return;
        }
        this.f3029d.m2541a(this.f3028c, this.f3028c.m2287aa(), 0, 0, false);
    }
}
