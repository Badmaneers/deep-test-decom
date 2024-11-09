package com.color.support.widget.popupwindow;

import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorPopupListWindow.java */
/* renamed from: com.color.support.widget.popupwindow.b */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC1586b implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnLayoutChangeListenerC1585a f7552a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnimationAnimationListenerC1586b(ViewOnLayoutChangeListenerC1585a viewOnLayoutChangeListenerC1585a) {
        this.f7552a = viewOnLayoutChangeListenerC1585a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f7552a.f7524C = true;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f7552a.m5326c();
        this.f7552a.f7524C = false;
    }
}
