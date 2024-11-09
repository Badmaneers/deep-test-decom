package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpandableTransformationBehavior.java */
/* renamed from: com.google.android.material.transformation.b */
/* loaded from: classes.dex */
public final class C2404b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ExpandableTransformationBehavior f10622a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2404b(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f10622a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ExpandableTransformationBehavior.m7695a(this.f10622a);
    }
}
