package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import com.google.android.material.p082k.C2295h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBarLayout.java */
/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
public final class C2044b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C2295h f9051a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f9052b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2044b(AppBarLayout appBarLayout, C2295h c2295h) {
        this.f9052b = appBarLayout;
        this.f9051a = c2295h;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9051a.m7288r(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
