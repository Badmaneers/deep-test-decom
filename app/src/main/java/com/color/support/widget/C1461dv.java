package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSimpleLock.java */
/* renamed from: com.color.support.widget.dv */
/* loaded from: classes.dex */
public final class C1461dv implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSimpleLock f7100a;

    public C1461dv(ColorSimpleLock colorSimpleLock) {
        this.f7100a = colorSimpleLock;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7100a.setOpacity(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f7100a.invalidate();
    }
}
