package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.C2128i;
import com.google.android.material.circularreveal.InterfaceC2124e;

/* compiled from: FabTransformationBehavior.java */
/* renamed from: com.google.android.material.transformation.f */
/* loaded from: classes.dex */
final class C2408f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2124e f10632a;

    /* renamed from: b */
    final /* synthetic */ FabTransformationBehavior f10633b;

    public C2408f(FabTransformationBehavior fabTransformationBehavior, InterfaceC2124e interfaceC2124e) {
        this.f10633b = fabTransformationBehavior;
        this.f10632a = interfaceC2124e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2128i revealInfo = this.f10632a.getRevealInfo();
        revealInfo.f9529c = Float.MAX_VALUE;
        this.f10632a.setRevealInfo(revealInfo);
    }
}
