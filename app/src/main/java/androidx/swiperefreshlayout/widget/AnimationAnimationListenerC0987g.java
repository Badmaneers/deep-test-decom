package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeRefreshLayout.java */
/* renamed from: androidx.swiperefreshlayout.widget.g */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0987g implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f4068a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC0987g(SwipeRefreshLayout swipeRefreshLayout) {
        this.f4068a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f4068a.f4005b) {
            this.f4068a.f4014k.setAlpha(255);
            this.f4068a.f4014k.start();
            this.f4068a.f4006c = this.f4068a.f4008e.getTop();
            return;
        }
        this.f4068a.m3450a();
    }
}
