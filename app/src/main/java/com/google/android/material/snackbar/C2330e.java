package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.e */
/* loaded from: classes.dex */
public final class C2330e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10309a;

    public C2330e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10309a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f10309a.f10274b.setScaleX(floatValue);
        this.f10309a.f10274b.setScaleY(floatValue);
    }
}
