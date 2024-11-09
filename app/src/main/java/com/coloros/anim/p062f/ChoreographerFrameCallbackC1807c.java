package com.coloros.anim.p062f;

import android.view.Choreographer;
import com.coloros.anim.C1638a;

/* compiled from: EffectiveValueAnimator.java */
/* renamed from: com.coloros.anim.f.c */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1807c extends AbstractC1805a implements Choreographer.FrameCallback {

    /* renamed from: a */
    protected boolean f8392a = false;

    /* renamed from: b */
    private float f8393b = 1.0f;

    /* renamed from: c */
    private boolean f8394c = false;

    /* renamed from: d */
    private long f8395d = 0;

    /* renamed from: e */
    private float f8396e = 0.0f;

    /* renamed from: f */
    private int f8397f = 0;

    /* renamed from: g */
    private float f8398g = -2.1474836E9f;

    /* renamed from: h */
    private float f8399h = 2.1474836E9f;

    /* renamed from: i */
    private C1638a f8400i;

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(m5877d());
    }

    /* renamed from: d */
    public final float m5877d() {
        if (this.f8400i == null) {
            return 0.0f;
        }
        return (this.f8396e - this.f8400i.m5471g()) / (this.f8400i.m5472h() - this.f8400i.m5471g());
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        if (this.f8400i == null) {
            return 0.0f;
        }
        if (m5869o()) {
            return (m5886m() - this.f8396e) / (m5886m() - m5885l());
        }
        return (this.f8396e - m5885l()) / (m5886m() - m5885l());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.f8400i == null) {
            return 0L;
        }
        return this.f8400i.m5470f();
    }

    /* renamed from: e */
    public final float m5878e() {
        return this.f8396e;
    }

    /* renamed from: a */
    public final void m5873a(int i) {
        float f = i;
        if (this.f8396e == f) {
            return;
        }
        this.f8396e = C1810f.m5899b(f, m5885l(), m5886m());
        this.f8395d = System.nanoTime();
        m5864c();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f8392a;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        m5870p();
        if (this.f8400i == null || !isRunning()) {
            return;
        }
        long nanoTime = System.nanoTime();
        float m5473i = ((float) (nanoTime - this.f8395d)) / (this.f8400i == null ? Float.MAX_VALUE : (1.0E9f / this.f8400i.m5473i()) / Math.abs(this.f8393b));
        float f = this.f8396e;
        if (m5869o()) {
            m5473i = -m5473i;
        }
        this.f8396e = f + m5473i;
        boolean z = !C1810f.m5900c(this.f8396e, m5885l(), m5886m());
        this.f8396e = C1810f.m5899b(this.f8396e, m5885l(), m5886m());
        this.f8395d = nanoTime;
        m5864c();
        if (z) {
            if (getRepeatCount() != -1 && this.f8397f >= getRepeatCount()) {
                this.f8396e = m5886m();
                m5867c(true);
                m5863b(m5869o());
            } else {
                m5860a();
                this.f8397f++;
                if (getRepeatMode() == 2) {
                    this.f8394c = !this.f8394c;
                    m5868n();
                } else {
                    this.f8396e = m5869o() ? m5886m() : m5885l();
                }
                this.f8395d = nanoTime;
            }
        }
        if (this.f8400i != null) {
            if (this.f8396e < this.f8398g || this.f8396e > this.f8399h) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f8398g), Float.valueOf(this.f8399h), Float.valueOf(this.f8396e)));
            }
        }
    }

    /* renamed from: f */
    public final void m5879f() {
        this.f8400i = null;
        this.f8398g = -2.1474836E9f;
        this.f8399h = 2.1474836E9f;
    }

    /* renamed from: a */
    public final void m5874a(C1638a c1638a) {
        boolean z = this.f8400i == null;
        this.f8400i = c1638a;
        if (z) {
            m5872a((int) Math.max(this.f8398g, c1638a.m5471g()), (int) Math.min(this.f8399h, c1638a.m5472h()));
        } else {
            m5872a((int) c1638a.m5471g(), (int) c1638a.m5472h());
        }
        float f = this.f8396e;
        this.f8396e = 0.0f;
        m5873a((int) f);
    }

    /* renamed from: a */
    public final void m5872a(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        float m5471g = this.f8400i == null ? -3.4028235E38f : this.f8400i.m5471g();
        float m5472h = this.f8400i == null ? Float.MAX_VALUE : this.f8400i.m5472h();
        this.f8398g = C1810f.m5899b(f, m5471g, m5472h);
        this.f8399h = C1810f.m5899b(f2, m5471g, m5472h);
        m5873a((int) C1810f.m5899b(this.f8396e, f, f2));
    }

    /* renamed from: g */
    public final float m5880g() {
        return this.f8393b;
    }

    /* renamed from: a */
    public final void m5871a(float f) {
        this.f8393b = f;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f8394c) {
            return;
        }
        this.f8394c = false;
        m5868n();
    }

    /* renamed from: h */
    public final void m5881h() {
        this.f8392a = true;
        m5861a(m5869o());
        m5873a((int) (m5869o() ? m5886m() : m5885l()));
        this.f8395d = System.nanoTime();
        this.f8397f = 0;
        m5870p();
    }

    /* renamed from: k */
    public final void m5884k() {
        this.f8392a = true;
        m5870p();
        this.f8395d = System.nanoTime();
        if (m5869o() && this.f8396e == m5885l()) {
            this.f8396e = m5886m();
        } else {
            if (m5869o() || this.f8396e != m5886m()) {
                return;
            }
            this.f8396e = m5885l();
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        m5862b();
        m5867c(true);
    }

    /* renamed from: l */
    public final float m5885l() {
        if (this.f8400i == null) {
            return 0.0f;
        }
        return this.f8398g == -2.1474836E9f ? this.f8400i.m5471g() : this.f8398g;
    }

    /* renamed from: b */
    public final void m5876b(int i) {
        m5872a(i, (int) this.f8399h);
    }

    /* renamed from: m */
    public final float m5886m() {
        if (this.f8400i == null) {
            return 0.0f;
        }
        return this.f8399h == 2.1474836E9f ? this.f8400i.m5472h() : this.f8399h;
    }

    /* renamed from: b */
    public final void m5875b(float f) {
        m5872a(this.f8398g, f);
    }

    /* renamed from: p */
    private void m5870p() {
        if (isRunning()) {
            m5867c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: c */
    private void m5867c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f8392a = false;
        }
    }

    /* renamed from: n */
    private void m5868n() {
        this.f8393b = -this.f8393b;
    }

    /* renamed from: i */
    public final void m5882i() {
        m5867c(true);
        m5863b(m5869o());
    }

    /* renamed from: j */
    public final void m5883j() {
        m5867c(true);
    }

    /* renamed from: o */
    private boolean m5869o() {
        return this.f8393b < 0.0f;
    }
}
