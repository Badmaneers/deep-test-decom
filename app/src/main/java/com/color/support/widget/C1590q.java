package com.color.support.widget;

import android.animation.ValueAnimator;

/* compiled from: ColorEditText.java */
/* renamed from: com.color.support.widget.q */
/* loaded from: classes.dex */
final class C1590q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorEditText f7574a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1590q(ColorEditText colorEditText) {
        this.f7574a = colorEditText;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7574a.f6004V = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f7574a.invalidate();
    }
}
