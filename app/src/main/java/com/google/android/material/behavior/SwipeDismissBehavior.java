package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.AbstractC0391c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0483d;
import androidx.customview.p027a.AbstractC0593l;
import androidx.customview.p027a.C0590i;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0391c<V> {

    /* renamed from: a */
    C0590i f9129a;

    /* renamed from: b */
    InterfaceC2069d f9130b;

    /* renamed from: g */
    private boolean f9135g;

    /* renamed from: i */
    private boolean f9137i;

    /* renamed from: h */
    private float f9136h = 0.0f;

    /* renamed from: c */
    int f9131c = 2;

    /* renamed from: d */
    float f9132d = 0.5f;

    /* renamed from: e */
    float f9133e = 0.0f;

    /* renamed from: f */
    float f9134f = 0.5f;

    /* renamed from: j */
    private final AbstractC0593l f9138j = new C2067b(this);

    /* renamed from: a */
    public static float m6389a(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public boolean mo6392a(View view) {
        return true;
    }

    /* renamed from: a */
    public final void m6391a(InterfaceC2069d interfaceC2069d) {
        this.f9130b = interfaceC2069d;
    }

    /* renamed from: b */
    public final void m6393b() {
        this.f9131c = 0;
    }

    /* renamed from: c */
    public final void m6394c() {
        this.f9133e = m6388a(0.1f);
    }

    /* renamed from: d */
    public final void m6395d() {
        this.f9134f = m6388a(0.6f);
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    public final boolean mo1414a(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean mo1414a = super.mo1414a(coordinatorLayout, (CoordinatorLayout) v, i);
        if (C0538w.m1876g(v) == 0) {
            C0538w.m1840a((View) v, 1);
            C0538w.m1862b((View) v, 1048576);
            if (mo6392a(v)) {
                C0538w.m1848a(v, C0483d.f2319u, new C2068c(this));
            }
        }
        return mo1414a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1418a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            boolean r0 = r4.f9135g
            int r1 = r7.getActionMasked()
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L21
            switch(r1) {
                case 0: goto Le;
                case 1: goto L21;
                default: goto Ld;
            }
        Ld:
            goto L23
        Le:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r6 = r5.m1402a(r6, r0, r1)
            r4.f9135g = r6
            boolean r0 = r4.f9135g
            goto L23
        L21:
            r4.f9135g = r3
        L23:
            if (r0 == 0) goto L45
            androidx.customview.a.i r6 = r4.f9129a
            if (r6 != 0) goto L3e
            boolean r6 = r4.f9137i
            if (r6 == 0) goto L36
            float r6 = r4.f9136h
            androidx.customview.a.l r0 = r4.f9138j
            androidx.customview.a.i r5 = androidx.customview.p027a.C0590i.m2104a(r5, r6, r0)
            goto L3c
        L36:
            androidx.customview.a.l r6 = r4.f9138j
            androidx.customview.a.i r5 = androidx.customview.p027a.C0590i.m2105a(r5, r6)
        L3c:
            r4.f9129a = r5
        L3e:
            androidx.customview.a.i r4 = r4.f9129a
            boolean r4 = r4.m2126a(r7)
            return r4
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.mo1418a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.AbstractC0391c
    /* renamed from: b */
    public final boolean mo1423b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f9129a == null) {
            return false;
        }
        this.f9129a.m2131b(motionEvent);
        return true;
    }

    /* renamed from: a */
    public static float m6388a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    /* renamed from: a */
    public static int m6390a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
