package com.google.android.material.tabs;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes.dex */
public final class C2350a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TabLayout f10396a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2350a(TabLayout tabLayout) {
        this.f10396a = tabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10396a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
