package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSectionSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.k */
/* loaded from: classes.dex */
public final class C1603k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSectionSeekBar f7717a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1603k(ColorSectionSeekBar colorSectionSeekBar) {
        this.f7717a = colorSectionSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7717a.f7629J = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}
