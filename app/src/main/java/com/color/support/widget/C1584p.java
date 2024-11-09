package com.color.support.widget;

import android.animation.ValueAnimator;

/* compiled from: ColorEditText.java */
/* renamed from: com.color.support.widget.p */
/* loaded from: classes.dex */
final class C1584p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorEditText f7517a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1584p(ColorEditText colorEditText) {
        this.f7517a = colorEditText;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7517a.f6005W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f7517a.invalidate();
    }
}
