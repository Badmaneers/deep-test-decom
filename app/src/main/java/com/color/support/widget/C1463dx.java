package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSimpleLock.java */
/* renamed from: com.color.support.widget.dx */
/* loaded from: classes.dex */
public final class C1463dx implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSimpleLock f7102a;

    public C1463dx(ColorSimpleLock colorSimpleLock) {
        this.f7102a = colorSimpleLock;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7102a.setInternalTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f7102a.invalidate();
    }
}
