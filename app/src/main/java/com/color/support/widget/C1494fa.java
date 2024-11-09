package com.color.support.widget;

import android.animation.ValueAnimator;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorEditTextHelper.java */
/* renamed from: com.color.support.widget.fa */
/* loaded from: classes.dex */
public final class C1494fa implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1490ex f7155a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1494fa(C1490ex c1490ex) {
        this.f7155a = c1490ex;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        EditText editText;
        z = this.f7155a.f7146q;
        if (z) {
            this.f7155a.f7148s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        editText = this.f7155a.f7131b;
        editText.invalidate();
    }
}
