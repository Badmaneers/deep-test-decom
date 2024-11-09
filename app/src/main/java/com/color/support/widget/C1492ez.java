package com.color.support.widget;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorEditTextHelper.java */
/* renamed from: com.color.support.widget.ez */
/* loaded from: classes.dex */
public final class C1492ez implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1490ex f7153a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1492ez(C1490ex c1490ex) {
        this.f7153a = c1490ex;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7153a.f7147r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
