package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.s */
/* loaded from: classes.dex */
public final class C1611s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSeekBar f7725a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1611s(ColorSeekBar colorSeekBar) {
        this.f7725a = colorSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ColorSeekBar colorSeekBar = this.f7725a;
        f = this.f7725a.f7692l;
        float f7 = 1.0f - animatedFraction;
        f2 = this.f7725a.f7691k;
        f3 = this.f7725a.f7692l;
        colorSeekBar.f7700t = f + (((f2 * 1.417f) - f3) * f7);
        ColorSeekBar colorSeekBar2 = this.f7725a;
        f4 = this.f7725a.f7670I;
        f5 = this.f7725a.f7669H;
        f6 = this.f7725a.f7670I;
        colorSeekBar2.f7671J = f4 + (f7 * ((f5 * 1.722f) - f6));
        this.f7725a.invalidate();
    }
}
