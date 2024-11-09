package com.color.support.widget.navigation;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorNavigationView.java */
/* renamed from: com.color.support.widget.navigation.i */
/* loaded from: classes.dex */
public final class C1576i implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ColorNavigationView f7514a;

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
    public C1576i(ColorNavigationView colorNavigationView) {
        this.f7514a = colorNavigationView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC1577j interfaceC1577j;
        InterfaceC1577j unused;
        interfaceC1577j = this.f7514a.f7499o;
        if (interfaceC1577j != null) {
            unused = this.f7514a.f7499o;
        }
    }
}
