package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.InterfaceC2124e;

/* compiled from: FabTransformationBehavior.java */
/* renamed from: com.google.android.material.transformation.e */
/* loaded from: classes.dex */
final class C2407e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2124e f10629a;

    /* renamed from: b */
    final /* synthetic */ Drawable f10630b;

    /* renamed from: c */
    final /* synthetic */ FabTransformationBehavior f10631c;

    public C2407e(FabTransformationBehavior fabTransformationBehavior, InterfaceC2124e interfaceC2124e, Drawable drawable) {
        this.f10631c = fabTransformationBehavior;
        this.f10629a = interfaceC2124e;
        this.f10630b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10629a.setCircularRevealOverlayDrawable(this.f10630b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10629a.setCircularRevealOverlayDrawable(null);
    }
}
