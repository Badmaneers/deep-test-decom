package com.google.android.material.appbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollapsingToolbarLayout.java */
/* renamed from: com.google.android.material.appbar.l */
/* loaded from: classes.dex */
public final class C2054l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f9067a;

    public C2054l(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f9067a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9067a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
