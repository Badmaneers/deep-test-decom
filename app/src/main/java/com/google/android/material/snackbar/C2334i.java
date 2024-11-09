package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.i */
/* loaded from: classes.dex */
public final class C2334i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10316a;

    /* renamed from: b */
    private int f10317b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2334i(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10316a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        z = BaseTransientBottomBar.f10271d;
        if (z) {
            C0538w.m1869c((View) this.f10316a.f10274b, intValue - this.f10317b);
        } else {
            this.f10316a.f10274b.setTranslationY(intValue);
        }
        this.f10317b = intValue;
    }
}
