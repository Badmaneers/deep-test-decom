package androidx.core.widget;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: AutoScrollHelper.java */
/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0563a implements View.OnTouchListener {

    /* renamed from: r */
    private static final int f2481r = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    final View f2483b;

    /* renamed from: c */
    boolean f2484c;

    /* renamed from: d */
    boolean f2485d;

    /* renamed from: e */
    boolean f2486e;

    /* renamed from: g */
    private Runnable f2488g;

    /* renamed from: j */
    private int f2491j;

    /* renamed from: k */
    private int f2492k;

    /* renamed from: o */
    private boolean f2496o;

    /* renamed from: p */
    private boolean f2497p;

    /* renamed from: q */
    private boolean f2498q;

    /* renamed from: a */
    final C0564b f2482a = new C0564b();

    /* renamed from: f */
    private final Interpolator f2487f = new AccelerateInterpolator();

    /* renamed from: h */
    private float[] f2489h = {0.0f, 0.0f};

    /* renamed from: i */
    private float[] f2490i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private float[] f2493l = {0.0f, 0.0f};

    /* renamed from: m */
    private float[] f2494m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f2495n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m2015a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m2018a(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public abstract void mo2021a(int i);

    /* renamed from: b */
    public abstract boolean mo2023b(int i);

    public AbstractViewOnTouchListenerC0563a(View view) {
        this.f2483b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = i / 1000.0f;
        this.f2495n[0] = f;
        this.f2495n[1] = f;
        float f2 = i2 / 1000.0f;
        this.f2494m[0] = f2;
        this.f2494m[1] = f2;
        this.f2491j = 1;
        this.f2490i[0] = Float.MAX_VALUE;
        this.f2490i[1] = Float.MAX_VALUE;
        this.f2489h[0] = 0.2f;
        this.f2489h[1] = 0.2f;
        this.f2493l[0] = 0.001f;
        this.f2493l[1] = 0.001f;
        this.f2492k = f2481r;
        this.f2482a.m2025a();
        this.f2482a.m2027b();
    }

    /* renamed from: a */
    public final AbstractViewOnTouchListenerC0563a m2020a(boolean z) {
        if (this.f2497p && !z) {
            m2019b();
        }
        this.f2497p = z;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2497p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lf;
                case 2: goto L17;
                case 3: goto Lf;
                default: goto Le;
            }
        Le:
            goto L77
        Lf:
            r5.m2019b()
            goto L77
        L13:
            r5.f2485d = r2
            r5.f2496o = r1
        L17:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2483b
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2017a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2483b
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2017a(r2, r7, r6, r3)
            androidx.core.widget.b r7 = r5.f2482a
            r7.m2026a(r0, r6)
            boolean r6 = r5.f2486e
            if (r6 != 0) goto L77
            boolean r6 = r5.m2022a()
            if (r6 == 0) goto L77
            java.lang.Runnable r6 = r5.f2488g
            if (r6 != 0) goto L59
            androidx.core.widget.c r6 = new androidx.core.widget.c
            r6.<init>(r5)
            r5.f2488g = r6
        L59:
            r5.f2486e = r2
            r5.f2484c = r2
            boolean r6 = r5.f2496o
            if (r6 != 0) goto L70
            int r6 = r5.f2492k
            if (r6 <= 0) goto L70
            android.view.View r6 = r5.f2483b
            java.lang.Runnable r7 = r5.f2488g
            int r0 = r5.f2492k
            long r3 = (long) r0
            androidx.core.p024g.C0538w.m1853a(r6, r7, r3)
            goto L75
        L70:
            java.lang.Runnable r6 = r5.f2488g
            r6.run()
        L75:
            r5.f2496o = r2
        L77:
            boolean r6 = r5.f2498q
            if (r6 == 0) goto L80
            boolean r5 = r5.f2486e
            if (r5 == 0) goto L80
            return r2
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractViewOnTouchListenerC0563a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m2022a() {
        C0564b c0564b = this.f2482a;
        int m2033h = c0564b.m2033h();
        c0564b.m2032g();
        return m2033h != 0 && mo2023b(m2033h);
    }

    /* renamed from: b */
    private void m2019b() {
        if (this.f2484c) {
            this.f2486e = false;
        } else {
            this.f2482a.m2029d();
        }
    }

    /* renamed from: a */
    private float m2017a(int i, float f, float f2, float f3) {
        float m2016a = m2016a(this.f2489h[i], f2, this.f2490i[i], f);
        if (m2016a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f2493l[i];
        float f5 = this.f2494m[i];
        float f6 = this.f2495n[i];
        float f7 = f4 * f3;
        if (m2016a > 0.0f) {
            return m2015a(m2016a * f7, f5, f6);
        }
        return -m2015a((-m2016a) * f7, f5, f6);
    }

    /* renamed from: a */
    private float m2016a(float f, float f2, float f3, float f4) {
        float interpolation;
        float m2015a = m2015a(f * f2, 0.0f, f3);
        float m2014a = m2014a(f2 - f4, m2015a) - m2014a(f4, m2015a);
        if (m2014a < 0.0f) {
            interpolation = -this.f2487f.getInterpolation(-m2014a);
        } else {
            if (m2014a <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2487f.getInterpolation(m2014a);
        }
        return m2015a(interpolation, -1.0f, 1.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private float m2014a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f2491j) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f2486e && this.f2491j == 1) {
                        return 1.0f;
                    }
                }
                return 0.0f;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }
}
