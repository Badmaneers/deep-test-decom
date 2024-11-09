package color.support.p043v7.widget.pageindicator;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorPageIndicator.java */
/* renamed from: color.support.v7.widget.pageindicator.a */
/* loaded from: classes.dex */
public final class C1290a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorPageIndicator f5493a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1290a(ColorPageIndicator colorPageIndicator) {
        this.f5493a = colorPageIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF rectF;
        int i;
        float f6;
        RectF rectF2;
        int i2;
        boolean z2;
        RectF rectF3;
        RectF rectF4;
        boolean z3;
        RectF rectF5;
        RectF rectF6;
        RectF rectF7;
        int i3;
        RectF rectF8;
        int i4;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z = this.f5493a.f5486t;
        if (z) {
            return;
        }
        f = this.f5493a.f5479m;
        f2 = this.f5493a.f5481o;
        float f7 = f - f2;
        f3 = this.f5493a.f5480n;
        f4 = this.f5493a.f5482p;
        float f8 = f3 - f4;
        f5 = this.f5493a.f5479m;
        float f9 = f5 - (f7 * floatValue);
        rectF = this.f5493a.f5462A;
        float f10 = rectF.right;
        i = this.f5493a.f5467a;
        if (f9 > f10 - i) {
            rectF8 = this.f5493a.f5462A;
            float f11 = rectF8.right;
            i4 = this.f5493a.f5467a;
            f9 = f11 - i4;
        }
        f6 = this.f5493a.f5480n;
        float f12 = f6 - (f8 * floatValue);
        rectF2 = this.f5493a.f5462A;
        float f13 = rectF2.left;
        i2 = this.f5493a.f5467a;
        if (f12 < f13 + i2) {
            rectF7 = this.f5493a.f5462A;
            float f14 = rectF7.left;
            i3 = this.f5493a.f5467a;
            f12 = i3 + f14;
        }
        z2 = this.f5493a.f5488v;
        if (!z2) {
            z3 = this.f5493a.f5483q;
            if (z3) {
                rectF6 = this.f5493a.f5462A;
                rectF6.right = f12;
            } else {
                rectF5 = this.f5493a.f5462A;
                rectF5.left = f9;
            }
        } else {
            rectF3 = this.f5493a.f5462A;
            rectF3.left = f9;
            rectF4 = this.f5493a.f5462A;
            rectF4.right = f12;
        }
        this.f5493a.invalidate();
    }
}
