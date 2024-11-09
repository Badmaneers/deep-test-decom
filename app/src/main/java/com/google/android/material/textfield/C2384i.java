package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.i */
/* loaded from: classes.dex */
final class C2384i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C2362a f10545a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2384i(C2362a c2362a) {
        this.f10545a = c2362a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f10545a.f10575c.setScaleX(floatValue);
        this.f10545a.f10575c.setScaleY(floatValue);
    }
}
