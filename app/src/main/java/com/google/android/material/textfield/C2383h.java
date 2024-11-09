package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.h */
/* loaded from: classes.dex */
public final class C2383h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C2362a f10544a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2383h(C2362a c2362a) {
        this.f10544a = c2362a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10544a.f10575c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
