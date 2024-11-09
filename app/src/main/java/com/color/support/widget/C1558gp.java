package com.color.support.widget;

import android.view.animation.AnimationUtils;

/* compiled from: SpringOverScroller.java */
/* renamed from: com.color.support.widget.gp */
/* loaded from: classes.dex */
final class C1558gp {

    /* renamed from: a */
    private static float f7374a = 1.0f;

    /* renamed from: b */
    private C1560gr f7375b;

    /* renamed from: k */
    private double f7384k;

    /* renamed from: l */
    private double f7385l;

    /* renamed from: m */
    private int f7386m;

    /* renamed from: n */
    private int f7387n;

    /* renamed from: o */
    private int f7388o;

    /* renamed from: p */
    private long f7389p;

    /* renamed from: s */
    private boolean f7392s;

    /* renamed from: t */
    private boolean f7393t;

    /* renamed from: e */
    private C1559gq f7378e = new C1559gq();

    /* renamed from: f */
    private C1559gq f7379f = new C1559gq();

    /* renamed from: g */
    private C1559gq f7380g = new C1559gq();

    /* renamed from: h */
    private float f7381h = 1.06f;

    /* renamed from: i */
    private double f7382i = 100.0d;

    /* renamed from: j */
    private double f7383j = 0.05d;

    /* renamed from: q */
    private int f7390q = 1;

    /* renamed from: r */
    private boolean f7391r = false;

    /* renamed from: u */
    private float f7394u = 2.15f;

    /* renamed from: c */
    private C1560gr f7376c = new C1560gr(this.f7381h, 0.0d);

    /* renamed from: d */
    private C1560gr f7377d = new C1560gr(12.1899995803833d, 16.0d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1558gp() {
        m5201a(this.f7376c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5209a(int i, int i2) {
        this.f7390q = 1;
        f7374a = 1.0f;
        this.f7376c.m5219a(this.f7381h);
        this.f7376c.m5220b(0.0d);
        m5201a(this.f7376c);
        m5200a(i, true);
        double d = i2;
        if (d != this.f7378e.f7396b) {
            this.f7378e.f7396b = d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m5210a(int i, int i2, int i3) {
        m5200a(i, false);
        if (i > i3 || i < i2) {
            if (i > i3) {
                m5199a(i3);
            } else if (i < i2) {
                m5199a(i2);
            }
            this.f7392s = true;
            this.f7377d.m5219a(12.1899995803833d);
            this.f7377d.m5220b(this.f7394u * 16.0f);
            m5201a(this.f7377d);
            return true;
        }
        m5201a(new C1560gr(this.f7381h, 0.0d));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m5212b(int i, int i2, int i3) {
        this.f7386m = i;
        this.f7388o = i + i2;
        this.f7387n = i3;
        this.f7389p = AnimationUtils.currentAnimationTimeMillis();
        m5201a(this.f7376c);
    }

    /* renamed from: a */
    private void m5201a(C1560gr c1560gr) {
        if (c1560gr == null) {
            throw new IllegalArgumentException("springConfig is required");
        }
        this.f7375b = c1560gr;
    }

    /* renamed from: a */
    private void m5200a(double d, boolean z) {
        this.f7384k = d;
        if (!this.f7391r) {
            this.f7379f.f7395a = 0.0d;
            this.f7380g.f7395a = 0.0d;
        }
        this.f7378e.f7395a = d;
        if (z) {
            m5214d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final double m5206a() {
        return this.f7378e.f7395a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final double m5211b() {
        return this.f7378e.f7396b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final double m5213c() {
        return this.f7385l;
    }

    /* renamed from: a */
    private void m5199a(double d) {
        if (this.f7385l == d) {
            return;
        }
        this.f7384k = this.f7378e.f7395a;
        this.f7385l = d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m5214d() {
        this.f7385l = this.f7378e.f7395a;
        this.f7380g.f7395a = this.f7378e.f7395a;
        this.f7378e.f7396b = 0.0d;
        this.f7392s = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m5215e() {
        if (Math.abs(this.f7378e.f7396b) <= this.f7382i) {
            return m5196a(this.f7378e) <= this.f7383j || this.f7375b.f7398b == 0.0d;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5207a(float f) {
        this.f7378e.f7395a = this.f7386m + Math.round(f * (this.f7388o - this.f7386m));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5208a(int i) {
        this.f7378e.f7395a = i;
        this.f7379f.f7395a = 0.0d;
        this.f7379f.f7396b = 0.0d;
        this.f7380g.f7395a = 0.0d;
        this.f7380g.f7396b = 0.0d;
    }

    /* renamed from: a */
    private double m5196a(C1559gq c1559gq) {
        return Math.abs(this.f7385l - c1559gq.f7395a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean m5216f() {
        if (m5215e()) {
            return false;
        }
        double d = this.f7378e.f7395a;
        double d2 = this.f7378e.f7396b;
        double d3 = this.f7380g.f7395a;
        if (!this.f7392s) {
            if (this.f7390q < 60) {
                f7374a += 0.020000001f;
                this.f7375b.f7397a += 0.020000001415610313d;
            } else {
                float f = f7374a;
                f7374a = f - ((f - 0.6f) / 60.0f);
                this.f7375b.f7397a -= (f7374a - 0.6f) / 60.0f;
            }
        } else {
            double m5196a = m5196a(this.f7378e);
            if (!this.f7393t && m5196a < 180.0d) {
                this.f7375b.f7398b += 100.0d;
                this.f7393t = true;
            } else if (m5196a < 2.0d) {
                this.f7378e.f7395a = this.f7385l;
                this.f7393t = false;
                this.f7392s = false;
                return false;
            }
        }
        double d4 = (this.f7375b.f7398b * (this.f7385l - d3)) - (this.f7375b.f7397a * this.f7379f.f7396b);
        double m5191h = ((C1556gn.m5191h() * d4) / 2.0d) + d2;
        double m5191h2 = (this.f7375b.f7398b * (this.f7385l - (((C1556gn.m5191h() * d2) / 2.0d) + d))) - (this.f7375b.f7397a * m5191h);
        double m5191h3 = ((C1556gn.m5191h() * m5191h2) / 2.0d) + d2;
        double m5191h4 = (this.f7375b.f7398b * (this.f7385l - (((C1556gn.m5191h() * m5191h) / 2.0d) + d))) - (this.f7375b.f7397a * m5191h3);
        double m5191h5 = (C1556gn.m5191h() * m5191h3) + d;
        double m5191h6 = (C1556gn.m5191h() * m5191h4) + d2;
        double d5 = (((m5191h + m5191h3) * 2.0d) + d2 + m5191h6) * 0.16699999570846558d;
        double m5191h7 = d2 + ((d4 + ((m5191h2 + m5191h4) * 2.0d) + ((this.f7375b.f7398b * (this.f7385l - m5191h5)) - (this.f7375b.f7397a * m5191h6))) * 0.16699999570846558d * C1556gn.m5191h());
        this.f7380g.f7396b = m5191h6;
        this.f7380g.f7395a = m5191h5;
        this.f7378e.f7396b = m5191h7;
        this.f7378e.f7395a = d + (d5 * C1556gn.m5191h());
        this.f7390q++;
        return true;
    }
}
