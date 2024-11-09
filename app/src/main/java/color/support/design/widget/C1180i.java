package color.support.design.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.i */
/* loaded from: classes.dex */
public final class C1180i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextView f4789a;

    /* renamed from: b */
    final /* synthetic */ ArgbEvaluator f4790b;

    /* renamed from: c */
    final /* synthetic */ C1186o f4791c;

    /* renamed from: d */
    final /* synthetic */ int f4792d;

    /* renamed from: e */
    final /* synthetic */ int f4793e;

    /* renamed from: f */
    final /* synthetic */ int f4794f;

    /* renamed from: g */
    final /* synthetic */ int f4795g;

    /* renamed from: h */
    final /* synthetic */ int f4796h;

    /* renamed from: i */
    final /* synthetic */ int f4797i;

    /* renamed from: j */
    final /* synthetic */ C1179h f4798j;

    public C1180i(C1179h c1179h, TextView textView, ArgbEvaluator argbEvaluator, C1186o c1186o, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f4798j = c1179h;
        this.f4789a = textView;
        this.f4790b = argbEvaluator;
        this.f4791c = c1186o;
        this.f4792d = i;
        this.f4793e = i2;
        this.f4794f = i3;
        this.f4795g = i4;
        this.f4796h = i5;
        this.f4797i = i6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        TextView textView;
        int i3;
        int i4;
        int i5;
        int i6;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        TextView textView2 = this.f4789a;
        ArgbEvaluator argbEvaluator = this.f4790b;
        i = this.f4798j.f4775c.f4701p;
        Integer valueOf = Integer.valueOf(i);
        i2 = this.f4798j.f4775c.f4702q;
        textView2.setTextColor(((Integer) argbEvaluator.evaluate(animatedFraction, valueOf, Integer.valueOf(i2))).intValue());
        textView = this.f4791c.f4823c;
        ArgbEvaluator argbEvaluator2 = this.f4790b;
        i3 = this.f4798j.f4775c.f4702q;
        Integer valueOf2 = Integer.valueOf(i3);
        i4 = this.f4798j.f4775c.f4701p;
        textView.setTextColor(((Integer) argbEvaluator2.evaluate(animatedFraction, valueOf2, Integer.valueOf(i4))).intValue());
        double d = animatedFraction;
        if (d <= 0.5d) {
            float f = animatedFraction * 2.0f;
            int i7 = (int) (this.f4792d + (((this.f4793e - this.f4794f) - this.f4792d) * (1.0f - f)));
            i5 = (int) (this.f4794f + ((this.f4795g - this.f4794f) * f));
            i6 = i7 + i5;
        } else {
            float f2 = (float) ((d - 0.5d) * 2.0d);
            int i8 = (int) (this.f4792d + (((this.f4796h - this.f4797i) - this.f4792d) * f2));
            i5 = (int) (this.f4795g + ((this.f4797i - this.f4795g) * f2));
            i6 = i8 + i5;
        }
        this.f4798j.m3912a(i5, i6);
    }
}
