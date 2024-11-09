package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSimpleLock.java */
/* renamed from: com.color.support.widget.dt */
/* loaded from: classes.dex */
public final class C1459dt implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSimpleLock f7098a;

    public C1459dt(ColorSimpleLock colorSimpleLock) {
        this.f7098a = colorSimpleLock;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7098a.setOpacity(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f7098a.invalidate();
    }
}
