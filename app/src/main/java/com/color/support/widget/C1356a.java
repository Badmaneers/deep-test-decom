package com.color.support.widget;

import android.animation.ValueAnimator;

/* compiled from: ColorAutoCompleteTextView.java */
/* renamed from: com.color.support.widget.a */
/* loaded from: classes.dex */
final class C1356a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorAutoCompleteTextView f6881a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1356a(ColorAutoCompleteTextView colorAutoCompleteTextView) {
        this.f6881a = colorAutoCompleteTextView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6881a.f5868H = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f6881a.invalidate();
    }
}
