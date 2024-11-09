package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAbsorbSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.e */
/* loaded from: classes.dex */
public final class C1597e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorAbsorbSeekBar f7711a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1597e(ColorAbsorbSeekBar colorAbsorbSeekBar) {
        this.f7711a = colorAbsorbSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7711a.f7610q = ((Float) valueAnimator.getAnimatedValue("radiusIn")).floatValue();
        this.f7711a.f7609p = ((Float) valueAnimator.getAnimatedValue("radiusOut")).floatValue();
        this.f7711a.f7589I = ((Integer) valueAnimator.getAnimatedValue("thumbShadowRadius")).intValue();
        this.f7711a.f7588H = ((Float) valueAnimator.getAnimatedValue("backgroundRadius")).floatValue();
        this.f7711a.invalidate();
    }
}
