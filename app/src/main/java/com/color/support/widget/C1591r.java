package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorEditText.java */
/* renamed from: com.color.support.widget.r */
/* loaded from: classes.dex */
public final class C1591r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorEditText f7575a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1591r(ColorEditText colorEditText) {
        this.f7575a = colorEditText;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1563j c1563j;
        c1563j = this.f7575a.f6006a;
        c1563j.m5256b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
