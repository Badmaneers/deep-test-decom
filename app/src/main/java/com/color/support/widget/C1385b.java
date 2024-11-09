package com.color.support.widget;

import android.animation.ValueAnimator;

/* compiled from: ColorAutoCompleteTextView.java */
/* renamed from: com.color.support.widget.b */
/* loaded from: classes.dex */
final class C1385b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorAutoCompleteTextView f6954a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1385b(ColorAutoCompleteTextView colorAutoCompleteTextView) {
        this.f6954a = colorAutoCompleteTextView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6954a.f5867G = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f6954a.invalidate();
    }
}
