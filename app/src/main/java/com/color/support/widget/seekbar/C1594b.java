package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAbsorbSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.b */
/* loaded from: classes.dex */
public final class C1594b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorAbsorbSeekBar f7708a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1594b(ColorAbsorbSeekBar colorAbsorbSeekBar) {
        this.f7708a = colorAbsorbSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        this.f7708a.f7588H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ColorAbsorbSeekBar colorAbsorbSeekBar = this.f7708a;
        i = this.f7708a.f7602i;
        i2 = this.f7708a.f7602i;
        i3 = this.f7708a.f7602i;
        colorAbsorbSeekBar.f7610q = i + (((i2 * 1.417f) - i3) * animatedFraction);
        ColorAbsorbSeekBar colorAbsorbSeekBar2 = this.f7708a;
        f = this.f7708a.f7607n;
        f2 = this.f7708a.f7607n;
        f3 = this.f7708a.f7607n;
        colorAbsorbSeekBar2.f7609p = f + (animatedFraction * ((f2 * 1.722f) - f3));
        this.f7708a.invalidate();
    }
}
