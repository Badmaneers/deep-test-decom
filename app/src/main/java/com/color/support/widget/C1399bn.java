package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bn */
/* loaded from: classes.dex */
public final class C1399bn implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1405bt f6963a;

    /* renamed from: b */
    final /* synthetic */ float f6964b;

    /* renamed from: c */
    final /* synthetic */ float f6965c;

    /* renamed from: d */
    final /* synthetic */ float f6966d;

    /* renamed from: e */
    final /* synthetic */ float f6967e;

    /* renamed from: f */
    final /* synthetic */ ColorLockPatternView f6968f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1399bn(ColorLockPatternView colorLockPatternView, C1405bt c1405bt, float f, float f2, float f3, float f4) {
        this.f6968f = colorLockPatternView;
        this.f6963a = c1405bt;
        this.f6964b = f;
        this.f6965c = f2;
        this.f6966d = f3;
        this.f6967e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = 1.0f - floatValue;
        this.f6963a.f6985f = (this.f6964b * f) + (this.f6965c * floatValue);
        this.f6963a.f6986g = (f * this.f6966d) + (floatValue * this.f6967e);
        this.f6968f.invalidate();
    }
}
