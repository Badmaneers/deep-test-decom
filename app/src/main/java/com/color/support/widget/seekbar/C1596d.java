package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAbsorbSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.d */
/* loaded from: classes.dex */
public final class C1596d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorAbsorbSeekBar f7710a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1596d(ColorAbsorbSeekBar colorAbsorbSeekBar) {
        this.f7710a = colorAbsorbSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7710a.f7589I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}
