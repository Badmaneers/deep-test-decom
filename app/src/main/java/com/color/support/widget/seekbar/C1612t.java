package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.t */
/* loaded from: classes.dex */
public final class C1612t implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSeekBar f7726a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1612t(ColorSeekBar colorSeekBar) {
        this.f7726a = colorSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7726a.f7674M = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}
