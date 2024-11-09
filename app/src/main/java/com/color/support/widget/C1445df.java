package com.color.support.widget;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.color.support.widget.ColorSearchViewAnimate;

/* compiled from: ColorSearchViewAnimate.java */
/* renamed from: com.color.support.widget.df */
/* loaded from: classes.dex */
public final class C1445df implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1441db f7088a;

    public C1445df(C1441db c1441db) {
        this.f7088a = c1441db;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ColorSearchViewAnimate.SearchCancelButton searchCancelButton;
        ImageView imageView;
        InterfaceC1455dp interfaceC1455dp;
        InterfaceC1455dp unused;
        searchCancelButton = this.f7088a.f7077a.f6470e;
        searchCancelButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        imageView = this.f7088a.f7077a.f6471f;
        imageView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        interfaceC1455dp = this.f7088a.f7077a.f6476k;
        if (interfaceC1455dp != null) {
            unused = this.f7088a.f7077a.f6476k;
        }
    }
}
