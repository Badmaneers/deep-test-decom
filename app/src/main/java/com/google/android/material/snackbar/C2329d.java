package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes.dex */
public final class C2329d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10308a;

    public C2329d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10308a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10308a.f10274b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
