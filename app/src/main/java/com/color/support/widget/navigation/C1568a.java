package com.color.support.widget.navigation;

import android.animation.Animator;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorNavigationItemView.java */
/* renamed from: com.color.support.widget.navigation.a */
/* loaded from: classes.dex */
public final class C1568a implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ColorNavigationItemView f7507a;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1568a(ColorNavigationItemView colorNavigationItemView) {
        this.f7507a = colorNavigationItemView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        textView = this.f7507a.f7449f;
        textView.setAlpha(1.0f);
    }
}
