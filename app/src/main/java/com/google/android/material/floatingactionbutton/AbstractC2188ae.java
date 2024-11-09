package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: com.google.android.material.floatingactionbutton.ae */
/* loaded from: classes.dex */
public abstract class AbstractC2188ae extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private boolean f9721a;

    /* renamed from: b */
    final /* synthetic */ C2209s f9722b;

    /* renamed from: c */
    private float f9723c;

    /* renamed from: d */
    private float f9724d;

    /* renamed from: a */
    protected abstract float mo6959a();

    private AbstractC2188ae(C2209s c2209s) {
        this.f9722b = c2209s;
    }

    public /* synthetic */ AbstractC2188ae(C2209s c2209s, byte b) {
        this(c2209s);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.f9721a) {
            this.f9723c = this.f9722b.f9785c == null ? 0.0f : this.f9722b.f9785c.m7265S();
            this.f9724d = mo6959a();
            this.f9721a = true;
        }
        this.f9722b.m7025d((int) (this.f9723c + ((this.f9724d - this.f9723c) * valueAnimator.getAnimatedFraction())));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f9722b.m7025d((int) this.f9724d);
        this.f9721a = false;
    }
}
