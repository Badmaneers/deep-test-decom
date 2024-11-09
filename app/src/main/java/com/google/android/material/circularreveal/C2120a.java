package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;

/* compiled from: CircularRevealCompat.java */
/* renamed from: com.google.android.material.circularreveal.a */
/* loaded from: classes.dex */
public final class C2120a {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Animator m6773a(InterfaceC2124e interfaceC2124e, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC2124e, (Property<InterfaceC2124e, V>) C2126g.f9525a, (TypeEvaluator) C2125f.f9523a, (Object[]) new C2128i[]{new C2128i(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C2128i revealInfo = interfaceC2124e.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC2124e, (int) f, (int) f2, revealInfo.f9529c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    /* renamed from: a */
    public static Animator.AnimatorListener m6772a(InterfaceC2124e interfaceC2124e) {
        return new C2121b(interfaceC2124e);
    }
}
