package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: TextScale.java */
/* renamed from: com.google.android.material.internal.ak */
/* loaded from: classes.dex */
final class C2242ak implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextView f9930a;

    /* renamed from: b */
    final /* synthetic */ C2241aj f9931b;

    public C2242ak(C2241aj c2241aj, TextView textView) {
        this.f9931b = c2241aj;
        this.f9930a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f9930a.setScaleX(floatValue);
        this.f9930a.setScaleY(floatValue);
    }
}
