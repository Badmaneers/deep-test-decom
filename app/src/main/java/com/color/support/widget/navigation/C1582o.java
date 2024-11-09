package com.color.support.widget.navigation;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: ColorTextScale.java */
/* renamed from: com.color.support.widget.navigation.o */
/* loaded from: classes.dex */
final class C1582o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextView f7515a;

    /* renamed from: b */
    final /* synthetic */ C1581n f7516b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1582o(C1581n c1581n, TextView textView) {
        this.f7516b = c1581n;
        this.f7515a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f7515a.setScaleX(floatValue);
        this.f7515a.setScaleY(floatValue);
    }
}
