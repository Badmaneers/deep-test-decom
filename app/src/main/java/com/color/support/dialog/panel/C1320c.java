package com.color.support.dialog.panel;

import android.view.View;
import androidx.core.p018b.C0418a;
import androidx.customview.p027a.AbstractC0593l;

/* compiled from: ColorBottomSheetBehavior.java */
/* renamed from: com.color.support.dialog.panel.c */
/* loaded from: classes.dex */
final class C1320c extends AbstractC0593l {

    /* renamed from: a */
    final /* synthetic */ ColorBottomSheetBehavior f5676a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1320c(ColorBottomSheetBehavior colorBottomSheetBehavior) {
        this.f5676a = colorBottomSheetBehavior;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final boolean mo2146b(View view, int i) {
        if (this.f5676a.f5610h == 1 || this.f5676a.f5617o) {
            return false;
        }
        if (this.f5676a.f5610h == 3 && this.f5676a.f5616n == i) {
            View view2 = this.f5676a.f5615m != null ? this.f5676a.f5615m.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        return this.f5676a.f5614l != null && this.f5676a.f5614l.get() == view;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2144a(View view, int i, int i2) {
        this.f5676a.m4330d();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2140a(int i) {
        boolean z;
        if (i == 1) {
            z = this.f5676a.f5592V;
            if (z) {
                this.f5676a.m4331d(1);
            }
        }
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2142a(View view, float f, float f2) {
        int i;
        int i2 = 3;
        if (f2 < 0.0f) {
            if (this.f5676a.f5578G) {
                i = this.f5676a.f5604b;
            } else if (view.getTop() > this.f5676a.f5605c) {
                i = this.f5676a.f5605c;
                i2 = 6;
            } else {
                i = this.f5676a.f5597a;
            }
        } else if (this.f5676a.f5609g && this.f5676a.m4323a(view, f2)) {
            if (this.f5676a.f5618p != null && this.f5676a.f5618p.m4363a()) {
                i = this.f5676a.f5604b;
                this.f5676a.f5602ae = false;
            } else {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    if (!(view.getTop() > (this.f5676a.f5613k + this.f5676a.mo4324b()) / 2)) {
                        if (this.f5676a.f5578G) {
                            i = this.f5676a.f5604b;
                        } else if (Math.abs(view.getTop() - this.f5676a.f5597a) < Math.abs(view.getTop() - this.f5676a.f5605c)) {
                            i = this.f5676a.f5597a;
                        } else {
                            i = this.f5676a.f5605c;
                            i2 = 6;
                        }
                    }
                }
                i = this.f5676a.f5613k;
                this.f5676a.f5602ae = true;
                i2 = 5;
            }
        } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
            if (this.f5676a.f5578G) {
                if (this.f5676a.f5618p != null) {
                    if (this.f5676a.f5618p.m4363a()) {
                        i = this.f5676a.f5604b;
                    } else {
                        i = this.f5676a.f5613k;
                        i2 = 5;
                    }
                } else {
                    i = this.f5676a.f5607e;
                }
            } else {
                int top = view.getTop();
                if (Math.abs(top - this.f5676a.f5605c) < Math.abs(top - this.f5676a.f5607e)) {
                    i = this.f5676a.f5605c;
                    i2 = 6;
                } else {
                    i = this.f5676a.f5607e;
                }
            }
            i2 = 4;
        } else {
            int top2 = view.getTop();
            if (this.f5676a.f5578G) {
                if (Math.abs(top2 - this.f5676a.f5604b) < Math.abs(top2 - this.f5676a.f5607e)) {
                    i = this.f5676a.f5604b;
                } else {
                    i = this.f5676a.f5607e;
                    i2 = 4;
                }
            } else {
                if (top2 < this.f5676a.f5605c) {
                    if (top2 < Math.abs(top2 - this.f5676a.f5607e)) {
                        i = this.f5676a.f5597a;
                    } else {
                        i = this.f5676a.f5605c;
                    }
                } else if (Math.abs(top2 - this.f5676a.f5605c) < Math.abs(top2 - this.f5676a.f5607e)) {
                    i = this.f5676a.f5605c;
                } else {
                    i = this.f5676a.f5607e;
                    i2 = 4;
                }
                i2 = 6;
            }
        }
        this.f5676a.m4321a(view, i2, i, true);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: d */
    public final int mo2148d(View view, int i) {
        return C0418a.m1478a(i, this.f5676a.mo4324b(), this.f5676a.f5609g ? this.f5676a.f5613k : this.f5676a.f5607e);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: c */
    public final int mo2147c(View view, int i) {
        return view.getLeft();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final int mo2145b() {
        if (this.f5676a.f5609g) {
            return this.f5676a.f5613k;
        }
        return this.f5676a.f5607e;
    }
}
