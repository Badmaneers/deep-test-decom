package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBarLayout.java */
/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
public final class C2045c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f9053a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f9054b;

    /* renamed from: c */
    final /* synthetic */ AppBarLayout.BaseBehavior f9055c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2045c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f9055c = baseBehavior;
        this.f9053a = coordinatorLayout;
        this.f9054b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9055c.m6323a_(this.f9053a, this.f9054b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
