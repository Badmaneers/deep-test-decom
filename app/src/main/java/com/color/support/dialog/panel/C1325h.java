package com.color.support.dialog.panel;

import android.animation.ValueAnimator;
import com.google.android.material.p082k.C2295h;

/* compiled from: ColorGuideBehavior.java */
/* renamed from: com.color.support.dialog.panel.h */
/* loaded from: classes.dex */
final class C1325h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ColorGuideBehavior f5686a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1325h(ColorGuideBehavior colorGuideBehavior) {
        this.f5686a = colorGuideBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2295h c2295h;
        C2295h c2295h2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c2295h = this.f5686a.f5633N;
        if (c2295h != null) {
            c2295h2 = this.f5686a.f5633N;
            c2295h2.m7286p(floatValue);
        }
    }
}
