package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSectionSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.j */
/* loaded from: classes.dex */
public final class C1602j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSectionSeekBar f7716a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1602j(ColorSectionSeekBar colorSectionSeekBar) {
        this.f7716a = colorSectionSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ColorSectionSeekBar colorSectionSeekBar = this.f7716a;
        i = this.f7716a.f7645j;
        float f = 1.0f - animatedFraction;
        i2 = this.f7716a.f7644i;
        i3 = this.f7716a.f7645j;
        colorSectionSeekBar.f7653r = i + (((i2 * 1.417f) - i3) * f);
        ColorSectionSeekBar colorSectionSeekBar2 = this.f7716a;
        i4 = this.f7716a.f7651p;
        i5 = this.f7716a.f7650o;
        i6 = this.f7716a.f7651p;
        colorSectionSeekBar2.f7652q = i4 + (f * ((i5 * 1.722f) - i6));
        this.f7716a.invalidate();
    }
}
