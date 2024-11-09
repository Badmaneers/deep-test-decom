package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.g */
/* loaded from: classes.dex */
public final class C2332g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ int f10311a;

    /* renamed from: b */
    final /* synthetic */ BaseTransientBottomBar f10312b;

    /* renamed from: c */
    private int f10313c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2332g(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f10312b = baseTransientBottomBar;
        this.f10311a = i;
        this.f10313c = this.f10311a;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        z = BaseTransientBottomBar.f10271d;
        if (z) {
            C0538w.m1869c((View) this.f10312b.f10274b, intValue - this.f10313c);
        } else {
            this.f10312b.f10274b.setTranslationY(intValue);
        }
        this.f10313c = intValue;
    }
}
