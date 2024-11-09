package com.color.support.widget.navigation;

import android.view.animation.Animation;
import com.color.support.widget.ColorHintRedDot;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorNavigationItemView.java */
/* renamed from: com.color.support.widget.navigation.b */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC1569b implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ColorNavigationItemView f7508a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnimationAnimationListenerC1569b(ColorNavigationItemView colorNavigationItemView) {
        this.f7508a = colorNavigationItemView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ColorHintRedDot colorHintRedDot;
        colorHintRedDot = this.f7508a.f7455l;
        colorHintRedDot.setVisibility(8);
    }
}
