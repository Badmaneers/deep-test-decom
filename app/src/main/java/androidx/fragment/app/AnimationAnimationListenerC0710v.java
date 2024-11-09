package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: FragmentManagerImpl.java */
/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0710v implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f3022a;

    /* renamed from: b */
    final /* synthetic */ Fragment f3023b;

    /* renamed from: c */
    final /* synthetic */ LayoutInflaterFactory2C0707s f3024c;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC0710v(LayoutInflaterFactory2C0707s layoutInflaterFactory2C0707s, ViewGroup viewGroup, Fragment fragment) {
        this.f3024c = layoutInflaterFactory2C0707s;
        this.f3022a = viewGroup;
        this.f3023b = fragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f3022a.post(new RunnableC0711w(this));
    }
}
