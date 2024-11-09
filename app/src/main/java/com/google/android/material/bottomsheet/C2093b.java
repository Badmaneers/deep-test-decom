package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import com.google.android.material.p082k.C2295h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetBehavior.java */
/* renamed from: com.google.android.material.bottomsheet.b */
/* loaded from: classes.dex */
public final class C2093b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BottomSheetBehavior f9303a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2093b(BottomSheetBehavior bottomSheetBehavior) {
        this.f9303a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2295h c2295h;
        C2295h c2295h2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c2295h = this.f9303a.f9278i;
        if (c2295h != null) {
            c2295h2 = this.f9303a.f9278i;
            c2295h2.m7286p(floatValue);
        }
    }
}
