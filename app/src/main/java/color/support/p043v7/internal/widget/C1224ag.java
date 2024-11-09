package color.support.p043v7.internal.widget;

import android.animation.ValueAnimator;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.ag */
/* loaded from: classes.dex */
final class C1224ag implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1256w f5216a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1224ag(C1256w c1256w) {
        this.f5216a = c1256w;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ColorSpinner.m4043a(this.f5216a.f5279b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
