package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSectionSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.i */
/* loaded from: classes.dex */
public final class C1601i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSectionSeekBar f7715a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1601i(ColorSectionSeekBar colorSectionSeekBar) {
        this.f7715a = colorSectionSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.f7715a.f7625F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ColorSectionSeekBar colorSectionSeekBar = this.f7715a;
        i = this.f7715a.f7644i;
        i2 = this.f7715a.f7644i;
        i3 = this.f7715a.f7644i;
        colorSectionSeekBar.f7653r = i + (((i2 * 1.417f) - i3) * animatedFraction);
        ColorSectionSeekBar colorSectionSeekBar2 = this.f7715a;
        i4 = this.f7715a.f7650o;
        i5 = this.f7715a.f7650o;
        i6 = this.f7715a.f7650o;
        colorSectionSeekBar2.f7652q = i4 + (animatedFraction * ((i5 * 1.722f) - i6));
        this.f7715a.invalidate();
    }
}
