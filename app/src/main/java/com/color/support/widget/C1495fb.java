package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorEditTextHelper.java */
/* renamed from: com.color.support.widget.fb */
/* loaded from: classes.dex */
public final class C1495fb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1490ex f7156a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1495fb(C1490ex c1490ex) {
        this.f7156a = c1490ex;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        z = this.f7156a.f7146q;
        if (z) {
            this.f7156a.f7149t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }
}
