package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;
import androidx.core.p024g.C0538w;
import androidx.customview.p027a.AbstractC0593l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeDismissBehavior.java */
/* renamed from: com.google.android.material.behavior.b */
/* loaded from: classes.dex */
public final class C2067b extends AbstractC0593l {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f9140a;

    /* renamed from: b */
    private int f9141b;

    /* renamed from: c */
    private int f9142c = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2067b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f9140a = swipeDismissBehavior;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final boolean mo2146b(View view, int i) {
        return (this.f9142c == -1 || this.f9142c == i) && this.f9140a.mo6392a(view);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2143a(View view, int i) {
        this.f9142c = i;
        this.f9141b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2140a(int i) {
        if (this.f9140a.f9130b != null) {
            this.f9140a.f9130b.mo6396a(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:            if (java.lang.Math.abs(r8.getLeft() - r7.f9141b) >= java.lang.Math.round(r8.getWidth() * r7.f9140a.f9132d)) goto L29;     */
    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2142a(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            r10 = -1
            r7.f9142c = r10
            int r10 = r8.getWidth()
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3f
            int r4 = androidx.core.p024g.C0538w.m1878h(r8)
            if (r4 != r3) goto L16
            r4 = r3
            goto L17
        L16:
            r4 = r2
        L17:
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r7.f9140a
            int r5 = r5.f9131c
            r6 = 2
            if (r5 != r6) goto L1f
            goto L5a
        L1f:
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r7.f9140a
            int r5 = r5.f9131c
            if (r5 != 0) goto L2f
            if (r4 == 0) goto L2c
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L5c
            goto L5a
        L2c:
            if (r1 <= 0) goto L5c
            goto L5a
        L2f:
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r7.f9140a
            int r5 = r5.f9131c
            if (r5 != r3) goto L5c
            if (r4 == 0) goto L3a
            if (r1 <= 0) goto L5c
            goto L5a
        L3a:
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L5c
            goto L5a
        L3f:
            int r9 = r8.getLeft()
            int r0 = r7.f9141b
            int r9 = r9 - r0
            int r0 = r8.getWidth()
            float r0 = (float) r0
            com.google.android.material.behavior.SwipeDismissBehavior r1 = r7.f9140a
            float r1 = r1.f9132d
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r9 = java.lang.Math.abs(r9)
            if (r9 < r0) goto L5c
        L5a:
            r9 = r3
            goto L5d
        L5c:
            r9 = r2
        L5d:
            if (r9 == 0) goto L70
            int r9 = r8.getLeft()
            int r0 = r7.f9141b
            if (r9 >= r0) goto L6b
            int r9 = r7.f9141b
            int r9 = r9 - r10
            goto L6e
        L6b:
            int r9 = r7.f9141b
            int r9 = r9 + r10
        L6e:
            r2 = r3
            goto L72
        L70:
            int r9 = r7.f9141b
        L72:
            com.google.android.material.behavior.SwipeDismissBehavior r10 = r7.f9140a
            androidx.customview.a.i r10 = r10.f9129a
            int r0 = r8.getTop()
            boolean r9 = r10.m2125a(r9, r0)
            if (r9 == 0) goto L8b
            com.google.android.material.behavior.e r9 = new com.google.android.material.behavior.e
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r7.f9140a
            r9.<init>(r7, r8, r2)
            androidx.core.p024g.C0538w.m1852a(r8, r9)
            return
        L8b:
            if (r2 == 0) goto L9a
            com.google.android.material.behavior.SwipeDismissBehavior r9 = r7.f9140a
            com.google.android.material.behavior.d r9 = r9.f9130b
            if (r9 == 0) goto L9a
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r7.f9140a
            com.google.android.material.behavior.d r7 = r7.f9130b
            r7.mo6397a(r8)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.C2067b.mo2142a(android.view.View, float, float):void");
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final int mo2138a(View view) {
        return view.getWidth();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: c */
    public final int mo2147c(View view, int i) {
        int width;
        int width2;
        boolean z = C0538w.m1878h(view) == 1;
        if (this.f9140a.f9131c == 0) {
            if (z) {
                width = this.f9141b - view.getWidth();
                width2 = this.f9141b;
            } else {
                width = this.f9141b;
                width2 = this.f9141b + view.getWidth();
            }
        } else if (this.f9140a.f9131c != 1) {
            width = this.f9141b - view.getWidth();
            width2 = this.f9141b + view.getWidth();
        } else if (z) {
            width = this.f9141b;
            width2 = this.f9141b + view.getWidth();
        } else {
            width = this.f9141b - view.getWidth();
            width2 = this.f9141b;
        }
        return SwipeDismissBehavior.m6390a(width, i, width2);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: d */
    public final int mo2148d(View view, int i) {
        return view.getTop();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2144a(View view, int i, int i2) {
        float width = this.f9141b + (view.getWidth() * this.f9140a.f9133e);
        float width2 = this.f9141b + (view.getWidth() * this.f9140a.f9134f);
        float f = i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.m6388a(1.0f - SwipeDismissBehavior.m6389a(width, width2, f)));
        }
    }
}
