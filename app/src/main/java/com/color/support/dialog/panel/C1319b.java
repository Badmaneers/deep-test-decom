package com.color.support.dialog.panel;

import android.animation.ValueAnimator;
import com.google.android.material.p082k.C2295h;

/* compiled from: ColorBottomSheetBehavior.java */
/* renamed from: com.color.support.dialog.panel.b */
/* loaded from: classes.dex */
final class C1319b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorBottomSheetBehavior f5675a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1319b(ColorBottomSheetBehavior colorBottomSheetBehavior) {
        this.f5675a = colorBottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2295h c2295h;
        C2295h c2295h2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c2295h = this.f5675a.f5585N;
        if (c2295h != null) {
            c2295h2 = this.f5675a.f5585N;
            c2295h2.m7286p(floatValue);
        }
    }
}
