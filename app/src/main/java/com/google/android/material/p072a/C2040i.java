package com.google.android.material.p072a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming.java */
/* renamed from: com.google.android.material.a.i */
/* loaded from: classes.dex */
public final class C2040i {

    /* renamed from: a */
    private long f8988a;

    /* renamed from: b */
    private long f8989b;

    /* renamed from: c */
    private TimeInterpolator f8990c;

    /* renamed from: d */
    private int f8991d;

    /* renamed from: e */
    private int f8992e;

    public C2040i(long j) {
        this.f8988a = 0L;
        this.f8989b = 300L;
        this.f8990c = null;
        this.f8991d = 0;
        this.f8992e = 1;
        this.f8988a = j;
        this.f8989b = 150L;
    }

    private C2040i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f8988a = 0L;
        this.f8989b = 300L;
        this.f8990c = null;
        this.f8991d = 0;
        this.f8992e = 1;
        this.f8988a = j;
        this.f8989b = j2;
        this.f8990c = timeInterpolator;
    }

    /* renamed from: a */
    public final long m6258a() {
        return this.f8988a;
    }

    /* renamed from: b */
    public final long m6260b() {
        return this.f8989b;
    }

    /* renamed from: c */
    public final TimeInterpolator m6261c() {
        return this.f8990c != null ? this.f8990c : C2032a.f8974b;
    }

    /* renamed from: a */
    public static C2040i m6257a(ValueAnimator valueAnimator) {
        long startDelay = valueAnimator.getStartDelay();
        long duration = valueAnimator.getDuration();
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            interpolator = C2032a.f8974b;
        } else if (interpolator instanceof AccelerateInterpolator) {
            interpolator = C2032a.f8975c;
        } else if (interpolator instanceof DecelerateInterpolator) {
            interpolator = C2032a.f8976d;
        }
        C2040i c2040i = new C2040i(startDelay, duration, interpolator);
        c2040i.f8991d = valueAnimator.getRepeatCount();
        c2040i.f8992e = valueAnimator.getRepeatMode();
        return c2040i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2040i)) {
            return false;
        }
        C2040i c2040i = (C2040i) obj;
        if (this.f8988a == c2040i.f8988a && this.f8989b == c2040i.f8989b && this.f8991d == c2040i.f8991d && this.f8992e == c2040i.f8992e) {
            return m6261c().getClass().equals(c2040i.m6261c().getClass());
        }
        return false;
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f8988a + " duration: " + this.f8989b + " interpolator: " + m6261c().getClass() + " repeatCount: " + this.f8991d + " repeatMode: " + this.f8992e + "}\n";
    }

    /* renamed from: a */
    public final void m6259a(Animator animator) {
        animator.setStartDelay(this.f8988a);
        animator.setDuration(this.f8989b);
        animator.setInterpolator(m6261c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f8991d);
            valueAnimator.setRepeatMode(this.f8992e);
        }
    }

    public final int hashCode() {
        return (((((((((int) (this.f8988a ^ (this.f8988a >>> 32))) * 31) + ((int) (this.f8989b ^ (this.f8989b >>> 32)))) * 31) + m6261c().getClass().hashCode()) * 31) + this.f8991d) * 31) + this.f8992e;
    }
}
