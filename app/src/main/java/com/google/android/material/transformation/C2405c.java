package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FabTransformationBehavior.java */
/* renamed from: com.google.android.material.transformation.c */
/* loaded from: classes.dex */
final class C2405c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f10623a;

    /* renamed from: b */
    final /* synthetic */ View f10624b;

    /* renamed from: c */
    final /* synthetic */ View f10625c;

    /* renamed from: d */
    final /* synthetic */ FabTransformationBehavior f10626d;

    public C2405c(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
        this.f10626d = fabTransformationBehavior;
        this.f10623a = z;
        this.f10624b = view;
        this.f10625c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f10623a) {
            this.f10624b.setVisibility(0);
            this.f10625c.setAlpha(0.0f);
            this.f10625c.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f10623a) {
            return;
        }
        this.f10624b.setVisibility(4);
        this.f10625c.setAlpha(1.0f);
        this.f10625c.setVisibility(0);
    }
}
