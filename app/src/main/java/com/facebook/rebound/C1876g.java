package com.facebook.rebound;

/* compiled from: BouncyConversion.java */
/* renamed from: com.facebook.rebound.g */
/* loaded from: classes.dex */
public class C1876g {

    /* renamed from: a */
    static final /* synthetic */ boolean f8642a = !C1876g.class.desiredAssertionStatus();

    /* renamed from: b */
    private final double f8643b;

    /* renamed from: c */
    private final double f8644c;

    /* renamed from: d */
    private final double f8645d = 20.0d;

    /* renamed from: e */
    private final double f8646e = 5.0d;

    /* renamed from: a */
    private static double m6009a(double d, double d2, double d3) {
        return d2 + (d * (d3 - d2));
    }

    public C1876g() {
        double d;
        double m6009a = m6009a(0.14705882352941177d, 0.0d, 0.8d);
        this.f8643b = m6009a(0.5882352941176471d, 0.5d, 200.0d);
        double d2 = this.f8643b;
        if (d2 <= 18.0d) {
            d = ((Math.pow(d2, 3.0d) * 7.0E-4d) - (Math.pow(d2, 2.0d) * 0.031d)) + (d2 * 0.64d) + 1.28d;
        } else if (d2 > 18.0d && d2 <= 44.0d) {
            d = ((Math.pow(d2, 3.0d) * 4.4E-5d) - (Math.pow(d2, 2.0d) * 0.006d)) + (d2 * 0.36d) + 2.0d;
        } else if (d2 <= 44.0d) {
            if (!f8642a) {
                throw new AssertionError();
            }
            d = 0.0d;
        } else {
            d = ((Math.pow(d2, 3.0d) * 4.5E-7d) - (Math.pow(d2, 2.0d) * 3.32E-4d)) + (d2 * 0.1078d) + 5.84d;
        }
        double d3 = (2.0d * m6009a) - (m6009a * m6009a);
        this.f8644c = (0.01d * d3) + ((1.0d - d3) * d);
    }

    /* renamed from: a */
    public final double m6010a() {
        return this.f8643b;
    }

    /* renamed from: b */
    public final double m6011b() {
        return this.f8644c;
    }
}
