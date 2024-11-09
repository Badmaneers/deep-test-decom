package androidx.core.widget;

import android.view.animation.AnimationUtils;
import neton.client.Utils.ResponseCode;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoScrollHelper.java */
/* renamed from: androidx.core.widget.b */
/* loaded from: classes.dex */
public final class C0564b {

    /* renamed from: a */
    private int f2499a;

    /* renamed from: b */
    private int f2500b;

    /* renamed from: c */
    private float f2501c;

    /* renamed from: d */
    private float f2502d;

    /* renamed from: j */
    private float f2508j;

    /* renamed from: k */
    private int f2509k;

    /* renamed from: e */
    private long f2503e = Long.MIN_VALUE;

    /* renamed from: i */
    private long f2507i = -1;

    /* renamed from: f */
    private long f2504f = 0;

    /* renamed from: g */
    private int f2505g = 0;

    /* renamed from: h */
    private int f2506h = 0;

    /* renamed from: a */
    public final void m2025a() {
        this.f2499a = ResponseCode.CODE_5XX_INTERNAL_SERVER_ERROR;
    }

    /* renamed from: b */
    public final void m2027b() {
        this.f2500b = ResponseCode.CODE_5XX_INTERNAL_SERVER_ERROR;
    }

    /* renamed from: c */
    public final void m2028c() {
        this.f2503e = AnimationUtils.currentAnimationTimeMillis();
        this.f2507i = -1L;
        this.f2504f = this.f2503e;
        this.f2508j = 0.5f;
        this.f2505g = 0;
        this.f2506h = 0;
    }

    /* renamed from: d */
    public final void m2029d() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f2509k = AbstractViewOnTouchListenerC0563a.m2018a((int) (currentAnimationTimeMillis - this.f2503e), this.f2500b);
        this.f2508j = m2024a(currentAnimationTimeMillis);
        this.f2507i = currentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m2030e() {
        return this.f2507i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2507i + ((long) this.f2509k);
    }

    /* renamed from: a */
    private float m2024a(long j) {
        if (j < this.f2503e) {
            return 0.0f;
        }
        if (this.f2507i < 0 || j < this.f2507i) {
            return AbstractViewOnTouchListenerC0563a.m2015a(((float) (j - this.f2503e)) / this.f2499a, 0.0f, 1.0f) * 0.5f;
        }
        return (1.0f - this.f2508j) + (this.f2508j * AbstractViewOnTouchListenerC0563a.m2015a(((float) (j - this.f2507i)) / this.f2509k, 0.0f, 1.0f));
    }

    /* renamed from: f */
    public final void m2031f() {
        if (this.f2504f == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float m2024a = m2024a(currentAnimationTimeMillis);
        long j = currentAnimationTimeMillis - this.f2504f;
        this.f2504f = currentAnimationTimeMillis;
        float f = ((float) j) * (((-4.0f) * m2024a * m2024a) + (m2024a * 4.0f));
        this.f2505g = (int) (this.f2501c * f);
        this.f2506h = (int) (f * this.f2502d);
    }

    /* renamed from: a */
    public final void m2026a(float f, float f2) {
        this.f2501c = f;
        this.f2502d = f2;
    }

    /* renamed from: g */
    public final int m2032g() {
        return (int) (this.f2501c / Math.abs(this.f2501c));
    }

    /* renamed from: h */
    public final int m2033h() {
        return (int) (this.f2502d / Math.abs(this.f2502d));
    }

    /* renamed from: i */
    public final int m2034i() {
        return this.f2506h;
    }
}
