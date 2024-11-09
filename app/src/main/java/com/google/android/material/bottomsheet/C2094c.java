package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.p018b.C0418a;
import androidx.customview.p027a.AbstractC0593l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetBehavior.java */
/* renamed from: com.google.android.material.bottomsheet.c */
/* loaded from: classes.dex */
public final class C2094c extends AbstractC0593l {

    /* renamed from: a */
    final /* synthetic */ BottomSheetBehavior f9304a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2094c(BottomSheetBehavior bottomSheetBehavior) {
        this.f9304a = bottomSheetBehavior;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final boolean mo2146b(View view, int i) {
        if (this.f9304a.f9292x == 1 || this.f9304a.f9260E) {
            return false;
        }
        if (this.f9304a.f9292x == 3 && this.f9304a.f9259D == i) {
            View view2 = this.f9304a.f9258C != null ? this.f9304a.f9258C.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        return this.f9304a.f9257B != null && this.f9304a.f9257B.get() == view;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2144a(View view, int i, int i2) {
        this.f9304a.m6497d();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2140a(int i) {
        boolean z;
        if (i == 1) {
            z = this.f9304a.f9261F;
            if (z) {
                this.f9304a.m6498d(1);
            }
        }
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2142a(View view, float f, float f2) {
        int i;
        int i2 = 4;
        int i3 = 3;
        if (f2 < 0.0f) {
            if (this.f9304a.f9271b) {
                i = this.f9304a.f9286r;
            } else if (view.getTop() > this.f9304a.f9287s) {
                i = this.f9304a.f9287s;
                i3 = 6;
            } else {
                i = this.f9304a.f9285q;
            }
        } else if (this.f9304a.f9291w && this.f9304a.m6496a(view, f2)) {
            if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                if (!(view.getTop() > (this.f9304a.f9256A + this.f9304a.mo4324b()) / 2)) {
                    if (this.f9304a.f9271b) {
                        i = this.f9304a.f9286r;
                    } else if (Math.abs(view.getTop() - this.f9304a.f9285q) < Math.abs(view.getTop() - this.f9304a.f9287s)) {
                        i = this.f9304a.f9285q;
                    } else {
                        i = this.f9304a.f9287s;
                        i3 = 6;
                    }
                }
            }
            i = this.f9304a.f9256A;
            i2 = 5;
            i3 = i2;
        } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
            if (!this.f9304a.f9271b) {
                int top = view.getTop();
                if (Math.abs(top - this.f9304a.f9287s) < Math.abs(top - this.f9304a.f9289u)) {
                    i = this.f9304a.f9287s;
                    i3 = 6;
                }
            }
            i = this.f9304a.f9289u;
            i3 = i2;
        } else {
            int top2 = view.getTop();
            if (this.f9304a.f9271b) {
                if (Math.abs(top2 - this.f9304a.f9286r) < Math.abs(top2 - this.f9304a.f9289u)) {
                    i = this.f9304a.f9286r;
                } else {
                    i = this.f9304a.f9289u;
                    i3 = i2;
                }
            } else {
                if (top2 < this.f9304a.f9287s) {
                    if (top2 < Math.abs(top2 - this.f9304a.f9289u)) {
                        i = this.f9304a.f9285q;
                    } else {
                        i = this.f9304a.f9287s;
                    }
                } else if (Math.abs(top2 - this.f9304a.f9287s) < Math.abs(top2 - this.f9304a.f9289u)) {
                    i = this.f9304a.f9287s;
                } else {
                    i = this.f9304a.f9289u;
                    i3 = i2;
                }
                i3 = 6;
            }
        }
        this.f9304a.m6495a(view, i3, i, true);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: d */
    public final int mo2148d(View view, int i) {
        return C0418a.m1478a(i, this.f9304a.mo4324b(), this.f9304a.f9291w ? this.f9304a.f9256A : this.f9304a.f9289u);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: c */
    public final int mo2147c(View view, int i) {
        return view.getLeft();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final int mo2145b() {
        if (this.f9304a.f9291w) {
            return this.f9304a.f9256A;
        }
        return this.f9304a.f9289u;
    }
}
