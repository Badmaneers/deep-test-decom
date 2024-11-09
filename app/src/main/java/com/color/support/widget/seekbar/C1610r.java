package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.r */
/* loaded from: classes.dex */
public final class C1610r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSeekBar f7724a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1610r(ColorSeekBar colorSeekBar) {
        this.f7724a = colorSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        this.f7724a.f7675N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ColorSeekBar colorSeekBar = this.f7724a;
        f = this.f7724a.f7697q;
        f2 = this.f7724a.f7697q;
        f3 = this.f7724a.f7697q;
        colorSeekBar.f7699s = f + (((f2 * 2.667f) - f3) * animatedFraction);
        ColorSeekBar colorSeekBar2 = this.f7724a;
        f4 = this.f7724a.f7691k;
        f5 = this.f7724a.f7691k;
        f6 = this.f7724a.f7691k;
        colorSeekBar2.f7700t = f4 + (((f5 * 1.417f) - f6) * animatedFraction);
        ColorSeekBar colorSeekBar3 = this.f7724a;
        f7 = this.f7724a.f7669H;
        f8 = this.f7724a.f7669H;
        f9 = this.f7724a.f7669H;
        colorSeekBar3.f7671J = f7 + (animatedFraction * ((f8 * 1.722f) - f9));
        this.f7724a.invalidate();
    }
}
