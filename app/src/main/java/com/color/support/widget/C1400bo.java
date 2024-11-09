package com.color.support.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorLockPatternView.java */
/* renamed from: com.color.support.widget.bo */
/* loaded from: classes.dex */
public final class C1400bo extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1405bt f6969a;

    /* renamed from: b */
    final /* synthetic */ ColorLockPatternView f6970b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1400bo(ColorLockPatternView colorLockPatternView, C1405bt c1405bt) {
        this.f6970b = colorLockPatternView;
        this.f6969a = c1405bt;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6969a.f6987h = null;
    }
}
