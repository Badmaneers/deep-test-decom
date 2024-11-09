package com.color.support.widget;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: SpringOverScroller.java */
/* renamed from: com.color.support.widget.gn */
/* loaded from: classes.dex */
public final class C1556gn extends OverScroller implements InterfaceC1534fs {

    /* renamed from: e */
    private static float f7367e;

    /* renamed from: a */
    private C1558gp f7368a;

    /* renamed from: b */
    private C1558gp f7369b;

    /* renamed from: c */
    private Interpolator f7370c;

    /* renamed from: d */
    private int f7371d;

    @Override // com.color.support.widget.InterfaceC1534fs
    public final void setFinalX(int i) {
    }

    public final void setFinalY(int i) {
    }

    private C1556gn(Context context) {
        super(context, null);
        Display display;
        this.f7371d = 2;
        this.f7368a = new C1558gp();
        this.f7369b = new C1558gp();
        this.f7370c = new InterpolatorC1557go();
        if (Build.VERSION.SDK_INT >= 23 && (display = ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0)) != null) {
            f7367e = Math.round(10000.0f / display.getRefreshRate()) / 10000.0f;
        } else {
            f7367e = 0.016f;
        }
    }

    public C1556gn(Context context, byte b) {
        this(context);
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: a */
    public final void mo4957a(Interpolator interpolator) {
        if (interpolator == null) {
            this.f7370c = new InterpolatorC1557go();
        } else {
            this.f7370c = interpolator;
        }
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final boolean computeScrollOffset() {
        long j;
        int i;
        if (mo4958a()) {
            return false;
        }
        switch (this.f7371d) {
            case 0:
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                j = this.f7368a.f7389p;
                long j2 = currentAnimationTimeMillis - j;
                i = this.f7368a.f7387n;
                if (j2 < i) {
                    float interpolation = this.f7370c.getInterpolation(((float) j2) / i);
                    this.f7368a.m5207a(interpolation);
                    this.f7369b.m5207a(interpolation);
                    return true;
                }
                this.f7368a.m5207a(1.0f);
                this.f7369b.m5207a(1.0f);
                abortAnimation();
                return true;
            case 1:
                if (this.f7368a.m5216f() || this.f7369b.m5216f()) {
                    return true;
                }
                abortAnimation();
                return true;
            default:
                return true;
        }
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: a */
    public final boolean mo4958a() {
        return this.f7368a.m5215e() && this.f7369b.m5215e() && this.f7371d != 0;
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: b */
    public final int mo4959b() {
        return (int) Math.round(this.f7368a.m5206a());
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: c */
    public final int mo4960c() {
        return (int) Math.round(this.f7369b.m5206a());
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: d */
    public final int mo4961d() {
        return (int) this.f7368a.m5213c();
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: e */
    public final int mo4962e() {
        return (int) this.f7369b.m5213c();
    }

    @Override // android.widget.OverScroller
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i2 <= i8 && i2 >= i7) {
            fling(i, i2, i3, i4, i5, i6, i7, i8);
            return;
        }
        springBack(i, i2, i5, i6, i7, i8);
    }

    @Override // android.widget.OverScroller
    public final boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean m5210a = this.f7368a.m5210a(i, i3, i4);
        boolean m5210a2 = this.f7369b.m5210a(i2, i5, i6);
        if (m5210a || m5210a2) {
            this.f7371d = 1;
        }
        return m5210a || m5210a2;
    }

    @Override // android.widget.OverScroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.f7371d = 0;
        this.f7368a.m5212b(i, i3, i5);
        this.f7369b.m5212b(i2, i4, i5);
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void abortAnimation() {
        this.f7371d = 2;
        this.f7368a.m5214d();
        this.f7369b.m5214d();
    }

    public final boolean isScrollingInDirection(float f, float f2) {
        double d;
        double d2;
        double d3;
        double d4;
        d = this.f7368a.f7385l;
        d2 = this.f7368a.f7384k;
        int i = (int) (d - d2);
        d3 = this.f7369b.f7385l;
        d4 = this.f7369b.f7384k;
        return !isFinished() && Math.signum(f) == Math.signum((float) i) && Math.signum(f2) == Math.signum((float) ((int) (d3 - d4)));
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.f7369b.m5208a(i);
        springBack(0, i, 0, 0, 0, 0);
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.f7368a.m5208a(i);
        springBack(i, 0, 0, 0, 0, 0);
    }

    @Override // android.widget.OverScroller
    public final float getCurrVelocity() {
        double m5211b = this.f7368a.m5211b();
        double m5211b2 = this.f7369b.m5211b();
        return (int) Math.sqrt((m5211b * m5211b) + (m5211b2 * m5211b2));
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: f */
    public final float mo4963f() {
        return (float) this.f7368a.m5211b();
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: g */
    public final float mo4964g() {
        return (float) this.f7369b.m5211b();
    }

    /* renamed from: a */
    public final void m5192a(float f) {
        C1559gq c1559gq;
        c1559gq = this.f7368a.f7378e;
        c1559gq.f7396b = f;
    }

    /* renamed from: b */
    public final void m5193b(float f) {
        C1559gq c1559gq;
        c1559gq = this.f7369b.f7378e;
        c1559gq.f7396b = f;
    }

    /* renamed from: c */
    public final void m5194c(float f) {
        this.f7368a.f7394u = f;
        this.f7369b.f7394u = f;
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f7371d = 1;
        this.f7368a.m5209a(i, i3);
        this.f7369b.m5209a(i2, i4);
    }
}
