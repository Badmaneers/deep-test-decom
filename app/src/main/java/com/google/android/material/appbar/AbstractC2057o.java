package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p018b.C0418a;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderBehavior.java */
/* renamed from: com.google.android.material.appbar.o */
/* loaded from: classes.dex */
public abstract class AbstractC2057o<V extends View> extends C2060r<V> {

    /* renamed from: a */
    OverScroller f9071a;

    /* renamed from: b */
    private Runnable f9072b;

    /* renamed from: c */
    private boolean f9073c;

    /* renamed from: d */
    private int f9074d;

    /* renamed from: e */
    private int f9075e;

    /* renamed from: f */
    private int f9076f;

    /* renamed from: g */
    private VelocityTracker f9077g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6305c(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: c */
    boolean mo6306c() {
        return false;
    }

    public AbstractC2057o() {
        this.f9074d = -1;
        this.f9076f = -1;
    }

    public AbstractC2057o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9074d = -1;
        this.f9076f = -1;
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1418a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f9076f < 0) {
            this.f9076f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f9073c) {
            if (this.f9074d == -1 || (findPointerIndex = motionEvent.findPointerIndex(this.f9074d)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f9075e) > this.f9076f) {
                this.f9075e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f9074d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            this.f9073c = mo6306c() && coordinatorLayout.m1402a(v, x, y2);
            if (this.f9073c) {
                this.f9075e = y2;
                this.f9074d = motionEvent.getPointerId(0);
                if (this.f9077g == null) {
                    this.f9077g = VelocityTracker.obtain();
                }
                if (this.f9071a != null && !this.f9071a.isFinished()) {
                    this.f9071a.abortAnimation();
                    return true;
                }
            }
        }
        if (this.f9077g != null) {
            this.f9077g.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1423b(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC2057o.mo1423b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a_ */
    public final int m6323a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo6294a(coordinatorLayout, (CoordinatorLayout) v, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    int mo6294a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int m1478a;
        int d = mo6308d();
        if (i2 == 0 || d < i2 || d > i3 || d == (m1478a = C0418a.m1478a(i, i2, i3))) {
            return 0;
        }
        mo6307a(m1478a);
        return d - m1478a;
    }

    /* renamed from: b */
    int mo6303b() {
        return mo6308d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m6324b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo6294a(coordinatorLayout, (CoordinatorLayout) v, mo6303b() - i, i2, i3);
    }

    /* renamed from: b */
    int mo6304b(V v) {
        return -v.getHeight();
    }

    /* renamed from: a */
    int mo6293a(V v) {
        return v.getHeight();
    }
}
