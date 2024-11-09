package com.color.support.widget;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ColorOverScroller.java */
/* renamed from: com.color.support.widget.cn */
/* loaded from: classes.dex */
public final class C1426cn extends OverScroller implements InterfaceC1534fs {

    /* renamed from: d */
    private static final Interpolator f7036d = new InterpolatorC1427co();

    /* renamed from: a */
    private C1428cp f7037a;

    /* renamed from: b */
    private C1428cp f7038b;

    /* renamed from: c */
    private Interpolator f7039c;

    /* renamed from: e */
    private int f7040e;

    public C1426cn(Context context) {
        this(context, (byte) 0);
    }

    private C1426cn(Context context, byte b) {
        super(context, null);
        this.f7037a = new C1428cp(context);
        this.f7038b = new C1428cp(context);
        this.f7039c = f7036d;
    }

    /* renamed from: a */
    public final void m4956a(float f) {
        this.f7037a.m4981a(f);
        this.f7038b.m4981a(f);
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: a */
    public final void mo4957a(Interpolator interpolator) {
        if (interpolator == null) {
            this.f7039c = f7036d;
        } else {
            this.f7039c = interpolator;
        }
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final boolean computeScrollOffset() {
        long j;
        int i;
        boolean z;
        boolean z2;
        if (mo4958a()) {
            return false;
        }
        switch (this.f7040e) {
            case 0:
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                j = this.f7037a.f7050g;
                long j2 = currentAnimationTimeMillis - j;
                i = this.f7037a.f7051h;
                if (j2 < i) {
                    float interpolation = this.f7039c.getInterpolation(((float) j2) / i);
                    this.f7037a.m4985b(interpolation);
                    this.f7038b.m4985b(interpolation);
                    return true;
                }
                abortAnimation();
                return true;
            case 1:
                z = this.f7037a.f7054k;
                if (!z && !this.f7037a.m4989c() && !this.f7037a.m4986b()) {
                    this.f7037a.m4980a();
                }
                z2 = this.f7038b.f7054k;
                if (z2 || this.f7038b.m4989c() || this.f7038b.m4986b()) {
                    return true;
                }
                this.f7038b.m4980a();
                return true;
            default:
                return true;
        }
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: a */
    public final boolean mo4958a() {
        boolean z;
        boolean z2;
        z = this.f7037a.f7054k;
        if (!z) {
            return false;
        }
        z2 = this.f7038b.f7054k;
        return z2;
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: b */
    public final int mo4959b() {
        int i;
        i = this.f7037a.f7045b;
        return i;
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: c */
    public final int mo4960c() {
        int i;
        i = this.f7038b.f7045b;
        return i;
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: d */
    public final int mo4961d() {
        int i;
        i = this.f7037a.f7046c;
        return i;
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: e */
    public final int mo4962e() {
        int i;
        i = this.f7038b.f7046c;
        return i;
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    public final void setFinalX(int i) {
        if (i == -1) {
            return;
        }
        this.f7037a.m4982a(i);
    }

    public final void setFinalY(int i) {
        if (i == -1) {
            return;
        }
        this.f7038b.m4982a(i);
    }

    @Override // android.widget.OverScroller
    public final boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean m4987b = this.f7037a.m4987b(i, i3, i4);
        boolean m4987b2 = this.f7038b.m4987b(i2, i5, i6);
        if (m4987b || m4987b2) {
            this.f7040e = 1;
        }
        return m4987b || m4987b2;
    }

    @Override // android.widget.OverScroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.f7040e = 0;
        this.f7037a.m4983a(i, i3, i5);
        this.f7038b.m4983a(i2, i4, i5);
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void abortAnimation() {
        this.f7037a.m4980a();
        this.f7038b.m4980a();
    }

    public final boolean isScrollingInDirection(float f, float f2) {
        int i;
        int i2;
        int i3;
        int i4;
        i = this.f7037a.f7046c;
        i2 = this.f7037a.f7044a;
        int i5 = i - i2;
        i3 = this.f7038b.f7046c;
        i4 = this.f7038b.f7044a;
        return !mo4958a() && Math.signum(f) == Math.signum((float) i5) && Math.signum(f2) == Math.signum((float) (i3 - i4));
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.f7038b.m4988c(i, i2, i3);
        springBack(0, i, 0, 0, 0, 0);
    }

    @Override // android.widget.OverScroller, com.color.support.widget.InterfaceC1534fs
    public final void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.f7037a.m4988c(i, i2, i3);
        springBack(i, 0, 0, 0, 0, 0);
    }

    @Override // android.widget.OverScroller
    public final float getCurrVelocity() {
        float f;
        float f2;
        f = this.f7037a.f7048e;
        f2 = this.f7038b.f7048e;
        return (float) Math.hypot(f, f2);
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: f */
    public final float mo4963f() {
        float f;
        f = this.f7037a.f7048e;
        return f;
    }

    @Override // com.color.support.widget.InterfaceC1534fs
    /* renamed from: g */
    public final float mo4964g() {
        float f;
        f = this.f7038b.f7048e;
        return f;
    }

    @Override // android.widget.OverScroller
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i2 <= i8 && i2 >= i7) {
            this.f7040e = 1;
            this.f7037a.m4984a(i, i3, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0);
            this.f7038b.m4984a(i2, i4, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0);
            return;
        }
        springBack(i, i2, i5, i6, i7, i8);
    }
}
