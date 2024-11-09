package com.color.support.widget;

import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

/* compiled from: ColorOverScroller.java */
/* renamed from: com.color.support.widget.cp */
/* loaded from: classes.dex */
final class C1428cp {

    /* renamed from: p */
    private static float f7041p = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: q */
    private static final float[] f7042q = new float[101];

    /* renamed from: r */
    private static final float[] f7043r = new float[101];

    /* renamed from: a */
    private int f7044a;

    /* renamed from: b */
    private int f7045b;

    /* renamed from: c */
    private int f7046c;

    /* renamed from: d */
    private int f7047d;

    /* renamed from: e */
    private float f7048e;

    /* renamed from: f */
    private float f7049f;

    /* renamed from: g */
    private long f7050g;

    /* renamed from: h */
    private int f7051h;

    /* renamed from: i */
    private int f7052i;

    /* renamed from: j */
    private int f7053j;

    /* renamed from: l */
    private int f7055l;

    /* renamed from: o */
    private float f7058o;

    /* renamed from: m */
    private float f7056m = ViewConfiguration.getScrollFriction() * 2.5f;

    /* renamed from: n */
    private int f7057n = 0;

    /* renamed from: k */
    private boolean f7054k = true;

    /* renamed from: b */
    private static float m4968b(int i) {
        return i > 0 ? -2000.0f : 2000.0f;
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        while (true) {
            float f13 = 1.0f;
            if (i < 100) {
                float f14 = i / 100.0f;
                float f15 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f15 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = f13 - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f16 = (((f4 * 0.175f) + (f2 * 0.35000002f)) * f5) + f6;
                    float f17 = f15;
                    if (Math.abs(f16 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f16 > f14) {
                        f15 = f2;
                    } else {
                        f11 = f2;
                        f15 = f17;
                    }
                    f13 = 1.0f;
                }
                f7042q[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
                float f18 = 1.0f;
                while (true) {
                    f7 = ((f18 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f19 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f19 - f14) >= 1.0E-5d) {
                        if (f19 > f14) {
                            f18 = f7;
                        } else {
                            f12 = f7;
                        }
                        f = 2.0f;
                        f3 = 3.0f;
                    }
                }
                f7043r[i] = (f9 * ((f8 * 0.175f) + (f7 * 0.35000002f))) + f10;
                i++;
            } else {
                float[] fArr = f7042q;
                f7043r[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4981a(float f) {
        this.f7056m = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1428cp(Context context) {
        this.f7058o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m4985b(float f) {
        this.f7045b = this.f7044a + Math.round(f * (this.f7046c - this.f7044a));
    }

    /* renamed from: d */
    private void m4975d(int i, int i2, int i3) {
        float abs = Math.abs((i3 - i) / (i2 - i));
        int i4 = (int) (abs * 100.0f);
        if (i4 < 100) {
            float f = i4 / 100.0f;
            int i5 = i4 + 1;
            float f2 = f7043r[i4];
            this.f7051h = (int) (this.f7051h * (f2 + (((abs - f) / ((i5 / 100.0f) - f)) * (f7043r[i5] - f2))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4983a(int i, int i2, int i3) {
        this.f7054k = false;
        this.f7044a = i;
        this.f7045b = i;
        this.f7046c = i + i2;
        this.f7050g = AnimationUtils.currentAnimationTimeMillis();
        this.f7051h = i3;
        this.f7049f = 0.0f;
        this.f7047d = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4980a() {
        this.f7045b = this.f7046c;
        this.f7054k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4982a(int i) {
        this.f7046c = i;
        this.f7053j = this.f7046c - this.f7044a;
        this.f7054k = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m4987b(int i, int i2, int i3) {
        this.f7054k = true;
        this.f7046c = i;
        this.f7044a = i;
        this.f7045b = i;
        this.f7047d = 0;
        this.f7050g = AnimationUtils.currentAnimationTimeMillis();
        this.f7051h = 0;
        if (i < i2) {
            m4966a(i, i2);
        } else if (i > i3) {
            m4966a(i, i3);
        }
        return !this.f7054k;
    }

    /* renamed from: a */
    private void m4966a(int i, int i2) {
        this.f7054k = false;
        this.f7057n = 1;
        this.f7044a = i;
        this.f7045b = i;
        this.f7046c = i2;
        int i3 = i - i2;
        this.f7049f = m4968b(i3);
        this.f7047d = -i3;
        this.f7055l = Math.abs(i3);
        this.f7051h = (int) (Math.sqrt((i3 * (-2.0d)) / this.f7049f) * 1000.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4984a(int i, int i2, int i3, int i4, int i5) {
        this.f7055l = i5;
        this.f7054k = false;
        this.f7047d = i2;
        this.f7048e = i2;
        this.f7052i = 0;
        this.f7051h = 0;
        this.f7050g = AnimationUtils.currentAnimationTimeMillis();
        this.f7044a = i;
        this.f7045b = i;
        if (i > i4 || i < i3) {
            m4967a(i, i3, i4, i2);
            return;
        }
        this.f7057n = 0;
        double d = 0.0d;
        if (i2 != 0) {
            int exp = (int) (Math.exp(m4970c(i2) / (f7041p - 1.0d)) * 1000.0d);
            this.f7052i = exp;
            this.f7051h = exp;
            d = m4972d(i2);
        }
        this.f7053j = (int) (d * Math.signum(r0));
        this.f7046c = i + this.f7053j;
        if (this.f7046c < i3) {
            m4975d(this.f7044a, this.f7046c, i3);
            this.f7046c = i3;
        }
        if (this.f7046c > i4) {
            m4975d(this.f7044a, this.f7046c, i4);
            this.f7046c = i4;
        }
    }

    /* renamed from: c */
    private double m4970c(int i) {
        return Math.log((Math.abs(i) * 0.35f) / (this.f7056m * this.f7058o));
    }

    /* renamed from: d */
    private double m4972d(int i) {
        return this.f7056m * this.f7058o * Math.exp((f7041p / (f7041p - 1.0d)) * m4970c(i));
    }

    /* renamed from: e */
    private void m4977e(int i, int i2, int i3) {
        this.f7049f = m4968b(i3 == 0 ? i - i2 : i3);
        float f = (-i3) / this.f7049f;
        float f2 = i3;
        float sqrt = (float) Math.sqrt((((((f2 * f2) / 2.0f) / Math.abs(this.f7049f)) + Math.abs(i2 - i)) * 2.0d) / Math.abs(this.f7049f));
        this.f7050g -= (int) ((sqrt - f) * 1000.0f);
        this.f7044a = i2;
        this.f7045b = i2;
        this.f7047d = (int) ((-this.f7049f) * sqrt);
        m4974d();
    }

    /* renamed from: a */
    private void m4967a(int i, int i2, int i3, int i4) {
        if (i > i2 && i < i3) {
            Log.e("ColorOverScroller", "startAfterEdge called from a valid position");
            this.f7054k = true;
            return;
        }
        boolean z = i > i3;
        int i5 = z ? i3 : i2;
        if ((i - i5) * i4 >= 0) {
            m4977e(i, i5, i4);
        } else if (m4972d(i4) > Math.abs(r4)) {
            m4984a(i, i4, z ? i2 : i, z ? i : i3, this.f7055l);
        } else {
            m4966a(i, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m4988c(int i, int i2, int i3) {
        if (this.f7057n == 0) {
            this.f7055l = i3;
            this.f7050g = AnimationUtils.currentAnimationTimeMillis();
            m4967a(i, i2, i2, (int) this.f7048e);
        }
    }

    /* renamed from: d */
    private void m4974d() {
        float f = this.f7047d * this.f7047d;
        float abs = f / (Math.abs(this.f7049f) * 2.0f);
        float signum = Math.signum(this.f7047d);
        if (abs > this.f7055l) {
            this.f7049f = ((-signum) * f) / (this.f7055l * 2.0f);
            abs = this.f7055l;
        }
        this.f7055l = (int) abs;
        this.f7057n = 2;
        int i = this.f7044a;
        if (this.f7047d <= 0) {
            abs = -abs;
        }
        this.f7046c = i + ((int) abs);
        this.f7051h = -((int) ((this.f7047d * 1000.0f) / this.f7049f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m4986b() {
        switch (this.f7057n) {
            case 0:
                if (this.f7051h >= this.f7052i) {
                    return false;
                }
                int i = this.f7046c;
                this.f7044a = i;
                this.f7045b = i;
                this.f7047d = (int) this.f7048e;
                this.f7049f = m4968b(this.f7047d);
                this.f7050g += this.f7051h;
                m4974d();
                break;
            case 1:
                return false;
            case 2:
                this.f7050g += this.f7051h;
                m4966a(this.f7046c, this.f7044a);
                break;
        }
        m4989c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m4989c() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f7050g;
        if (currentAnimationTimeMillis == 0) {
            return this.f7051h > 0;
        }
        if (currentAnimationTimeMillis > this.f7051h) {
            return false;
        }
        double d = 0.0d;
        switch (this.f7057n) {
            case 0:
                float f = ((float) currentAnimationTimeMillis) / this.f7052i;
                int i = (int) (f * 100.0f);
                float f2 = 1.0f;
                float f3 = 0.0f;
                if (i < 100) {
                    float f4 = i / 100.0f;
                    int i2 = i + 1;
                    float f5 = f7042q[i];
                    f3 = (f7042q[i2] - f5) / ((i2 / 100.0f) - f4);
                    f2 = f5 + ((f - f4) * f3);
                }
                d = f2 * this.f7053j;
                this.f7048e = ((f3 * this.f7053j) / this.f7052i) * 1000.0f;
                break;
            case 1:
                float f6 = ((float) currentAnimationTimeMillis) / this.f7051h;
                float f7 = f6 * f6;
                float signum = Math.signum(this.f7047d);
                this.f7048e = signum * this.f7055l * 6.0f * ((-f6) + f7);
                d = this.f7055l * signum * ((3.0f * f7) - ((2.0f * f6) * f7));
                break;
            case 2:
                float f8 = ((float) currentAnimationTimeMillis) / 1000.0f;
                this.f7048e = this.f7047d + (this.f7049f * f8);
                d = (this.f7047d * f8) + (((this.f7049f * f8) * f8) / 2.0f);
                break;
        }
        this.f7045b = this.f7044a + ((int) Math.round(d));
        return true;
    }
}
