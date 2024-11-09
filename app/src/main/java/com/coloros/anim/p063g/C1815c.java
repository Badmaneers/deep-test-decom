package com.coloros.anim.p063g;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.coloros.anim.C1638a;

/* compiled from: Keyframe.java */
/* renamed from: com.coloros.anim.g.c */
/* loaded from: classes.dex */
public class C1815c<T> {

    /* renamed from: a */
    public final T f8422a;

    /* renamed from: b */
    public final Interpolator f8423b;

    /* renamed from: c */
    public final float f8424c;

    /* renamed from: d */
    public T f8425d;

    /* renamed from: e */
    public Float f8426e;

    /* renamed from: f */
    public PointF f8427f;

    /* renamed from: g */
    public PointF f8428g;

    /* renamed from: h */
    private final C1638a f8429h;

    /* renamed from: i */
    private float f8430i;

    /* renamed from: j */
    private float f8431j;

    /* renamed from: k */
    private int f8432k;

    /* renamed from: l */
    private int f8433l;

    /* renamed from: m */
    private float f8434m;

    /* renamed from: n */
    private float f8435n;

    public C1815c(C1638a c1638a, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f8427f = null;
        this.f8428g = null;
        this.f8430i = -3987645.8f;
        this.f8431j = -3987645.8f;
        this.f8432k = 784923401;
        this.f8433l = 784923401;
        this.f8434m = Float.MIN_VALUE;
        this.f8435n = Float.MIN_VALUE;
        this.f8429h = c1638a;
        this.f8422a = t;
        this.f8425d = t2;
        this.f8423b = interpolator;
        this.f8424c = f;
        this.f8426e = f2;
    }

    public C1815c(T t) {
        this.f8427f = null;
        this.f8428g = null;
        this.f8430i = -3987645.8f;
        this.f8431j = -3987645.8f;
        this.f8432k = 784923401;
        this.f8433l = 784923401;
        this.f8434m = Float.MIN_VALUE;
        this.f8435n = Float.MIN_VALUE;
        this.f8429h = null;
        this.f8422a = t;
        this.f8425d = t;
        this.f8423b = null;
        this.f8424c = Float.MIN_VALUE;
        this.f8426e = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: c */
    public final float m5913c() {
        if (this.f8429h == null) {
            return 0.0f;
        }
        if (this.f8434m == Float.MIN_VALUE) {
            this.f8434m = (this.f8424c - this.f8429h.m5471g()) / this.f8429h.m5478n();
        }
        return this.f8434m;
    }

    /* renamed from: d */
    public final float m5914d() {
        if (this.f8429h == null) {
            return 1.0f;
        }
        if (this.f8435n == Float.MIN_VALUE) {
            if (this.f8426e == null) {
                this.f8435n = 1.0f;
            } else {
                this.f8435n = m5913c() + ((this.f8426e.floatValue() - this.f8424c) / this.f8429h.m5478n());
            }
        }
        return this.f8435n;
    }

    /* renamed from: e */
    public final boolean m5915e() {
        return this.f8423b == null;
    }

    /* renamed from: a */
    public final boolean m5912a(float f) {
        return f >= m5913c() && f < m5914d();
    }

    /* renamed from: f */
    public final float m5916f() {
        if (this.f8430i == -3987645.8f) {
            this.f8430i = ((Float) this.f8422a).floatValue();
        }
        return this.f8430i;
    }

    /* renamed from: g */
    public final float m5917g() {
        if (this.f8431j == -3987645.8f) {
            this.f8431j = ((Float) this.f8425d).floatValue();
        }
        return this.f8431j;
    }

    /* renamed from: h */
    public final int m5918h() {
        if (this.f8432k == 784923401) {
            this.f8432k = ((Integer) this.f8422a).intValue();
        }
        return this.f8432k;
    }

    /* renamed from: i */
    public final int m5919i() {
        if (this.f8433l == 784923401) {
            this.f8433l = ((Integer) this.f8425d).intValue();
        }
        return this.f8433l;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f8422a + ", endValue=" + this.f8425d + ", startFrame=" + this.f8424c + ", endFrame=" + this.f8426e + ", interpolator=" + this.f8423b + '}';
    }
}
