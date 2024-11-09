package com.color.support.widget.seekbar;

import android.animation.ValueAnimator;

/* compiled from: ColorSeekBar.java */
/* renamed from: com.color.support.widget.seekbar.u */
/* loaded from: classes.dex */
final class C1613u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorSeekBar f7727a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1613u(ColorSeekBar colorSeekBar) {
        this.f7727a = colorSeekBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7727a.f7699s = ((Float) valueAnimator.getAnimatedValue("progress")).floatValue();
        this.f7727a.f7700t = ((Float) valueAnimator.getAnimatedValue("radiusIn")).floatValue();
        this.f7727a.f7671J = ((Float) valueAnimator.getAnimatedValue("radiusOut")).floatValue();
        this.f7727a.f7674M = ((Integer) valueAnimator.getAnimatedValue("thumbShadowRadius")).intValue();
        this.f7727a.f7675N = ((Float) valueAnimator.getAnimatedValue("backgroundRadius")).floatValue();
        this.f7727a.invalidate();
    }
}
