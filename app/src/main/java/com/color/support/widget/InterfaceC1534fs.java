package com.color.support.widget;

import android.view.animation.Interpolator;

/* compiled from: IOverScroller.java */
/* renamed from: com.color.support.widget.fs */
/* loaded from: classes.dex */
public interface InterfaceC1534fs {
    /* renamed from: a */
    void mo4957a(Interpolator interpolator);

    /* renamed from: a */
    boolean mo4958a();

    void abortAnimation();

    /* renamed from: b */
    int mo4959b();

    /* renamed from: c */
    int mo4960c();

    boolean computeScrollOffset();

    /* renamed from: d */
    int mo4961d();

    /* renamed from: e */
    int mo4962e();

    /* renamed from: f */
    float mo4963f();

    void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    /* renamed from: g */
    float mo4964g();

    void notifyHorizontalEdgeReached(int i, int i2, int i3);

    void notifyVerticalEdgeReached(int i, int i2, int i3);

    void setFinalX(int i);

    void startScroll(int i, int i2, int i3, int i4, int i5);
}
