package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.u */
/* loaded from: classes.dex */
final class C2396u extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C2387l f10571a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2396u(C2387l c2387l) {
        this.f10571a = c2387l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        ValueAnimator valueAnimator;
        CheckableImageButton checkableImageButton = this.f10571a.f10575c;
        z = this.f10571a.f10554i;
        checkableImageButton.setChecked(z);
        valueAnimator = this.f10571a.f10560o;
        valueAnimator.start();
    }
}
