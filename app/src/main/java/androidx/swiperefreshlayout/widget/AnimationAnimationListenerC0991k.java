package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeRefreshLayout.java */
/* renamed from: androidx.swiperefreshlayout.widget.k */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0991k implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f4074a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC0991k(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4074a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f4074a.f4007d) {
            return;
        }
        this.f4074a.m3452a((Animation.AnimationListener) null);
    }
}
