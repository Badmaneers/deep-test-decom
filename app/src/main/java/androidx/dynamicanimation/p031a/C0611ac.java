package androidx.dynamicanimation.p031a;

/* compiled from: SpringForce.java */
/* renamed from: androidx.dynamicanimation.a.ac */
/* loaded from: classes.dex */
public final class C0611ac {

    /* renamed from: a */
    double f2649a;

    /* renamed from: b */
    double f2650b;

    /* renamed from: c */
    private boolean f2651c;

    /* renamed from: d */
    private double f2652d;

    /* renamed from: e */
    private double f2653e;

    /* renamed from: f */
    private double f2654f;

    /* renamed from: g */
    private double f2655g;

    /* renamed from: h */
    private double f2656h;

    /* renamed from: i */
    private double f2657i;

    /* renamed from: j */
    private final C0634x f2658j;

    public C0611ac() {
        this.f2649a = Math.sqrt(1500.0d);
        this.f2650b = 0.5d;
        this.f2651c = false;
        this.f2657i = Double.MAX_VALUE;
        this.f2658j = new C0634x();
    }

    public C0611ac(float f) {
        this.f2649a = Math.sqrt(1500.0d);
        this.f2650b = 0.5d;
        this.f2651c = false;
        this.f2657i = Double.MAX_VALUE;
        this.f2658j = new C0634x();
        this.f2657i = f;
    }

    /* renamed from: a */
    public final C0611ac m2191a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f2649a = Math.sqrt(f);
        this.f2651c = false;
        return this;
    }

    /* renamed from: b */
    public final C0611ac m2195b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f2650b = f;
        this.f2651c = false;
        return this;
    }

    /* renamed from: c */
    public final C0611ac m2196c(float f) {
        this.f2657i = f;
        return this;
    }

    /* renamed from: a */
    public final float m2190a() {
        return (float) this.f2657i;
    }

    /* renamed from: a */
    public final boolean m2194a(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f2653e && ((double) Math.abs(f - ((float) this.f2657i))) < this.f2652d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2193a(double d) {
        this.f2652d = Math.abs(d);
        this.f2653e = this.f2652d * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0634x m2192a(double d, double d2, long j) {
        double pow;
        double pow2;
        if (!this.f2651c) {
            if (this.f2657i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            if (this.f2650b > 1.0d) {
                this.f2654f = ((-this.f2650b) * this.f2649a) + (this.f2649a * Math.sqrt((this.f2650b * this.f2650b) - 1.0d));
                this.f2655g = ((-this.f2650b) * this.f2649a) - (this.f2649a * Math.sqrt((this.f2650b * this.f2650b) - 1.0d));
            } else if (this.f2650b >= 0.0d && this.f2650b < 1.0d) {
                this.f2656h = this.f2649a * Math.sqrt(1.0d - (this.f2650b * this.f2650b));
            }
            this.f2651c = true;
        }
        double d3 = j / 1000.0d;
        double d4 = d - this.f2657i;
        if (this.f2650b > 1.0d) {
            double d5 = d4 - (((this.f2655g * d4) - d2) / (this.f2655g - this.f2654f));
            double d6 = ((this.f2655g * d4) - d2) / (this.f2655g - this.f2654f);
            pow = (Math.pow(2.718281828459045d, this.f2655g * d3) * d5) + (Math.pow(2.718281828459045d, this.f2654f * d3) * d6);
            pow2 = (d5 * this.f2655g * Math.pow(2.718281828459045d, this.f2655g * d3)) + (d6 * this.f2654f * Math.pow(2.718281828459045d, this.f2654f * d3));
        } else if (this.f2650b == 1.0d) {
            double d7 = d2 + (this.f2649a * d4);
            double d8 = d4 + (d7 * d3);
            double pow3 = Math.pow(2.718281828459045d, (-this.f2649a) * d3) * d8;
            double pow4 = (d7 * Math.pow(2.718281828459045d, (-this.f2649a) * d3)) + (d8 * Math.pow(2.718281828459045d, (-this.f2649a) * d3) * (-this.f2649a));
            pow = pow3;
            pow2 = pow4;
        } else {
            double d9 = (1.0d / this.f2656h) * ((this.f2650b * this.f2649a * d4) + d2);
            pow = Math.pow(2.718281828459045d, (-this.f2650b) * this.f2649a * d3) * ((Math.cos(this.f2656h * d3) * d4) + (Math.sin(this.f2656h * d3) * d9));
            pow2 = ((-this.f2649a) * pow * this.f2650b) + (Math.pow(2.718281828459045d, (-this.f2650b) * this.f2649a * d3) * (((-this.f2656h) * d4 * Math.sin(this.f2656h * d3)) + (this.f2656h * d9 * Math.cos(this.f2656h * d3))));
        }
        this.f2658j.f2694a = (float) (pow + this.f2657i);
        this.f2658j.f2695b = (float) pow2;
        return this.f2658j;
    }
}
