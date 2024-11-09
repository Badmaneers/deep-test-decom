package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FabTransformationBehavior.java */
/* renamed from: com.google.android.material.transformation.d */
/* loaded from: classes.dex */
final class C2406d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f10627a;

    /* renamed from: b */
    final /* synthetic */ FabTransformationBehavior f10628b;

    public C2406d(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f10628b = fabTransformationBehavior;
        this.f10627a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10627a.invalidate();
    }
}
