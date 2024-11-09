package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAbsorbSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.c */
/* loaded from: classes.dex */
public final class C1595c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorAbsorbSeekBar f7709a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1595c(ColorAbsorbSeekBar colorAbsorbSeekBar) {
        this.f7709a = colorAbsorbSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        float f5;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ColorAbsorbSeekBar colorAbsorbSeekBar = this.f7709a;
        f = this.f7709a.f7603j;
        float f6 = 1.0f - animatedFraction;
        i = this.f7709a.f7602i;
        f2 = this.f7709a.f7603j;
        colorAbsorbSeekBar.f7610q = f + (((i * 1.417f) - f2) * f6);
        ColorAbsorbSeekBar colorAbsorbSeekBar2 = this.f7709a;
        f3 = this.f7709a.f7608o;
        f4 = this.f7709a.f7607n;
        f5 = this.f7709a.f7608o;
        colorAbsorbSeekBar2.f7609p = f3 + (f6 * ((f4 * 1.722f) - f5));
        this.f7709a.invalidate();
    }
}
