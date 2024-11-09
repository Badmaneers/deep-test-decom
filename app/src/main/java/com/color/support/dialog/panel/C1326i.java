package com.color.support.dialog.panel;

import android.view.View;
import androidx.core.p018b.C0418a;
import androidx.customview.p027a.AbstractC0593l;

/* compiled from: ColorGuideBehavior.java */
/* renamed from: com.color.support.dialog.panel.i */
/* loaded from: classes.dex */
final class C1326i extends AbstractC0593l {

    /* renamed from: a */
    final /* synthetic */ ColorGuideBehavior f5687a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1326i(ColorGuideBehavior colorGuideBehavior) {
        this.f5687a = colorGuideBehavior;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final boolean mo2146b(View view, int i) {
        if (this.f5687a.f5658h == 1 || this.f5687a.f5665o) {
            return false;
        }
        if (this.f5687a.f5658h == 3 && this.f5687a.f5664n == i) {
            View view2 = this.f5687a.f5663m != null ? this.f5687a.f5663m.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        return this.f5687a.f5662l != null && this.f5687a.f5662l.get() == view;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2144a(View view, int i, int i2) {
        this.f5687a.m4355d();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2140a(int i) {
        boolean z;
        if (i == 1) {
            z = this.f5687a.f5640V;
            if (z) {
                this.f5687a.m4356d(1);
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
            if (this.f5687a.f5626G) {
                i = this.f5687a.f5652b;
            } else if (view.getTop() > this.f5687a.f5653c) {
                i = this.f5687a.f5653c;
                i3 = 6;
            } else {
                i = this.f5687a.f5645a;
            }
        } else if (this.f5687a.f5657g && this.f5687a.m4353a(view, f2)) {
            if (this.f5687a.f5666p != null && this.f5687a.f5666p.m4363a()) {
                i = this.f5687a.f5652b;
                this.f5687a.f5650ae = false;
            } else {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    if (!(view.getTop() > (this.f5687a.f5661k + this.f5687a.mo4324b()) / 2)) {
                        if (this.f5687a.f5626G) {
                            i = this.f5687a.f5652b;
                        } else if (Math.abs(view.getTop() - this.f5687a.f5645a) < Math.abs(view.getTop() - this.f5687a.f5653c)) {
                            i = this.f5687a.f5645a;
                        } else {
                            i = this.f5687a.f5653c;
                            i3 = 6;
                        }
                    }
                }
                i = this.f5687a.f5661k;
                i2 = 5;
                this.f5687a.f5650ae = true;
                i3 = i2;
            }
        } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
            if (!this.f5687a.f5626G) {
                int top = view.getTop();
                if (Math.abs(top - this.f5687a.f5653c) < Math.abs(top - this.f5687a.f5655e)) {
                    i = this.f5687a.f5653c;
                    i3 = 6;
                }
            }
            i = this.f5687a.f5655e;
            i3 = i2;
        } else {
            int top2 = view.getTop();
            if (this.f5687a.f5626G) {
                if (Math.abs(top2 - this.f5687a.f5652b) < Math.abs(top2 - this.f5687a.f5655e)) {
                    i = this.f5687a.f5652b;
                } else {
                    i = this.f5687a.f5655e;
                    i3 = i2;
                }
            } else {
                if (top2 < this.f5687a.f5653c) {
                    if (top2 < Math.abs(top2 - this.f5687a.f5655e)) {
                        i = this.f5687a.f5645a;
                    } else {
                        i = this.f5687a.f5653c;
                    }
                } else if (Math.abs(top2 - this.f5687a.f5653c) < Math.abs(top2 - this.f5687a.f5655e)) {
                    i = this.f5687a.f5653c;
                } else {
                    i = this.f5687a.f5655e;
                    i3 = i2;
                }
                i3 = 6;
            }
        }
        this.f5687a.m4352a(view, i3, i, true);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: d */
    public final int mo2148d(View view, int i) {
        return C0418a.m1478a(i, this.f5687a.mo4324b(), this.f5687a.f5657g ? this.f5687a.f5661k : this.f5687a.f5655e);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: c */
    public final int mo2147c(View view, int i) {
        return view.getLeft();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final int mo2145b() {
        if (this.f5687a.f5657g) {
            return this.f5687a.f5661k;
        }
        return this.f5687a.f5655e;
    }
}
