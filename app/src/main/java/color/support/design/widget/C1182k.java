package color.support.design.widget;

import android.animation.ValueAnimator;

/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.k */
/* loaded from: classes.dex */
public final class C1182k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ int f4801a;

    /* renamed from: b */
    final /* synthetic */ int f4802b;

    /* renamed from: c */
    final /* synthetic */ int f4803c;

    /* renamed from: d */
    final /* synthetic */ int f4804d;

    /* renamed from: e */
    final /* synthetic */ C1179h f4805e;

    public C1182k(C1179h c1179h, int i, int i2, int i3, int i4) {
        this.f4805e = c1179h;
        this.f4801a = i;
        this.f4802b = i2;
        this.f4803c = i3;
        this.f4804d = i4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f4805e.m3912a(C1163a.m3866a(this.f4801a, this.f4802b, animatedFraction), C1163a.m3866a(this.f4803c, this.f4804d, animatedFraction));
    }
}
