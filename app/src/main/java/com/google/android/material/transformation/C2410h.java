package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FabTransformationScrimBehavior.java */
/* renamed from: com.google.android.material.transformation.h */
/* loaded from: classes.dex */
final class C2410h extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f10636a;

    /* renamed from: b */
    final /* synthetic */ View f10637b;

    /* renamed from: c */
    final /* synthetic */ FabTransformationScrimBehavior f10638c;

    public C2410h(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
        this.f10638c = fabTransformationScrimBehavior;
        this.f10636a = z;
        this.f10637b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f10636a) {
            this.f10637b.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f10636a) {
            return;
        }
        this.f10637b.setVisibility(4);
    }
}
