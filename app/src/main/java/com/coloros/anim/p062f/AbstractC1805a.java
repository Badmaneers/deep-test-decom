package com.coloros.anim.p062f;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseAnimator.java */
/* renamed from: com.coloros.anim.f.a */
/* loaded from: classes.dex */
public abstract class AbstractC1805a extends ValueAnimator {

    /* renamed from: a */
    private final Set<ValueAnimator.AnimatorUpdateListener> f8386a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set<Animator.AnimatorListener> f8387b = new CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("EffectiveAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("EffectiveAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("EffectiveAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("EffectiveAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8386a.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8386a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f8386a.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f8387b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f8387b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f8387b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5861a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f8387b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5860a() {
        Iterator<Animator.AnimatorListener> it = this.f8387b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m5863b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f8387b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m5862b() {
        Iterator<Animator.AnimatorListener> it = this.f8387b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m5864c() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f8386a.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }
}
