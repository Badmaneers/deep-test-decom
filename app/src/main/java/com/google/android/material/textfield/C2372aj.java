package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextInputLayout.java */
/* renamed from: com.google.android.material.textfield.aj */
/* loaded from: classes.dex */
public final class C2372aj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f10536a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2372aj(TextInputLayout textInputLayout) {
        this.f10536a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10536a.f10497c.m7157b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
