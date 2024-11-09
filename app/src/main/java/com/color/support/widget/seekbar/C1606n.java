package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* compiled from: ColorSectionSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.n */
/* loaded from: classes.dex */
final class C1606n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSectionSeekBar f7720a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1606n(ColorSectionSeekBar colorSectionSeekBar) {
        this.f7720a = colorSectionSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int m5371c;
        this.f7720a.f7652q = ((Float) valueAnimator.getAnimatedValue("radiusOut")).floatValue();
        this.f7720a.f7653r = ((Float) valueAnimator.getAnimatedValue("radiusIn")).floatValue();
        this.f7720a.f7629J = ((Integer) valueAnimator.getAnimatedValue("thumbShadowRadius")).intValue();
        this.f7720a.f7625F = ((Float) valueAnimator.getAnimatedValue("backgroundRadius")).floatValue();
        this.f7720a.invalidate();
        if (valueAnimator.getAnimatedFraction() == 1.0f) {
            ColorSectionSeekBar colorSectionSeekBar = this.f7720a;
            f = this.f7720a.f7659x;
            m5371c = colorSectionSeekBar.m5371c(f);
            this.f7720a.m5368b(m5371c);
        }
    }
}
