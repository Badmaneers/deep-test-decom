package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSimpleLock.java */
/* renamed from: com.color.support.widget.dy */
/* loaded from: classes.dex */
public final class C1464dy implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSimpleLock f7103a;

    public C1464dy(ColorSimpleLock colorSimpleLock) {
        this.f7103a = colorSimpleLock;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7103a.setInternalTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
