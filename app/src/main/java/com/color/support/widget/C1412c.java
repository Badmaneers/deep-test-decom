package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAutoCompleteTextView.java */
/* renamed from: com.color.support.widget.c */
/* loaded from: classes.dex */
public final class C1412c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorAutoCompleteTextView f7005a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1412c(ColorAutoCompleteTextView colorAutoCompleteTextView) {
        this.f7005a = colorAutoCompleteTextView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1563j c1563j;
        c1563j = this.f7005a.f5873a;
        c1563j.m5256b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
