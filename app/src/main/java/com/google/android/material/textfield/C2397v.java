package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.v */
/* loaded from: classes.dex */
public final class C2397v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C2387l f10572a;

    public C2397v(C2387l c2387l) {
        this.f10572a = c2387l;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10572a.f10575c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
