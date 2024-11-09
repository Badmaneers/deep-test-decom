package color.support.p043v7.internal.widget;

import android.animation.ValueAnimator;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.aa */
/* loaded from: classes.dex */
final class C1218aa implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1256w f5207a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1218aa(C1256w c1256w) {
        this.f5207a = c1256w;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ColorSpinner.m4043a(this.f5207a.f5279b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
