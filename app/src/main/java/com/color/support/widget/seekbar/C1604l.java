package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSectionSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.l */
/* loaded from: classes.dex */
public final class C1604l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSectionSeekBar f7718a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1604l(ColorSectionSeekBar colorSectionSeekBar) {
        this.f7718a = colorSectionSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float sectionWidth;
        int i2;
        float f10;
        float sectionWidth2;
        this.f7718a.f7632M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ColorSectionSeekBar colorSectionSeekBar = this.f7718a;
        f = this.f7718a.f7630K;
        f2 = this.f7718a.f7632M;
        f3 = this.f7718a.f7623D;
        colorSectionSeekBar.f7659x = f + (f2 * 0.4f) + (f3 * 0.6f);
        ColorSectionSeekBar colorSectionSeekBar2 = this.f7718a;
        f4 = this.f7718a.f7659x;
        colorSectionSeekBar2.f7621B = f4;
        this.f7718a.invalidate();
        i = this.f7718a.f7640e;
        f5 = this.f7718a.f7622C;
        f6 = this.f7718a.f7630K;
        boolean z = true;
        if (f5 - f6 > 0.0f) {
            f10 = this.f7718a.f7659x;
            sectionWidth2 = this.f7718a.getSectionWidth();
            i = (int) (f10 / sectionWidth2);
        } else {
            f7 = this.f7718a.f7622C;
            f8 = this.f7718a.f7630K;
            if (f7 - f8 < 0.0f) {
                f9 = this.f7718a.f7659x;
                sectionWidth = this.f7718a.getSectionWidth();
                i = (int) Math.ceil(((int) f9) / sectionWidth);
            } else {
                z = false;
            }
        }
        if (this.f7718a.isLayoutRtl() && z) {
            i2 = this.f7718a.f7637b;
            i = i2 - i;
        }
        this.f7718a.m5368b(i);
    }
}
