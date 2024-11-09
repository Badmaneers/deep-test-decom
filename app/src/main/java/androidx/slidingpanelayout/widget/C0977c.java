package androidx.slidingpanelayout.widget;

import android.view.View;
import androidx.customview.p027a.AbstractC0593l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlidingPaneLayout.java */
/* renamed from: androidx.slidingpanelayout.widget.c */
/* loaded from: classes.dex */
public final class C0977c extends AbstractC0593l {

    /* renamed from: a */
    final /* synthetic */ SlidingPaneLayout f3981a;

    public C0977c(SlidingPaneLayout slidingPaneLayout) {
        this.f3981a = slidingPaneLayout;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final boolean mo2146b(View view, int i) {
        if (this.f3981a.f3956d) {
            return false;
        }
        return ((C0978d) view.getLayoutParams()).f3984b;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2140a(int i) {
        if (this.f3981a.f3957e.m2121a() == 0) {
            if (this.f3981a.f3954b == 0.0f) {
                this.f3981a.m3431a(this.f3981a.f3953a);
                this.f3981a.sendAccessibilityEvent(32);
                this.f3981a.f3958f = false;
            } else {
                this.f3981a.sendAccessibilityEvent(32);
                this.f3981a.f3958f = true;
            }
        }
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2143a(View view, int i) {
        this.f3981a.m3429a();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2144a(View view, int i, int i2) {
        this.f3981a.m3430a(i);
        this.f3981a.invalidate();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2142a(View view, float f, float f2) {
        int paddingLeft;
        C0978d c0978d = (C0978d) view.getLayoutParams();
        if (this.f3981a.m3433b()) {
            int paddingRight = this.f3981a.getPaddingRight() + c0978d.rightMargin;
            if (f < 0.0f || (f == 0.0f && this.f3981a.f3954b > 0.5f)) {
                paddingRight += this.f3981a.f3955c;
            }
            paddingLeft = (this.f3981a.getWidth() - paddingRight) - this.f3981a.f3953a.getWidth();
        } else {
            paddingLeft = c0978d.leftMargin + this.f3981a.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && this.f3981a.f3954b > 0.5f)) {
                paddingLeft += this.f3981a.f3955c;
            }
        }
        this.f3981a.f3957e.m2125a(paddingLeft, view.getTop());
        this.f3981a.invalidate();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final int mo2138a(View view) {
        return this.f3981a.f3955c;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: c */
    public final int mo2147c(View view, int i) {
        C0978d c0978d = (C0978d) this.f3981a.f3953a.getLayoutParams();
        if (this.f3981a.m3433b()) {
            int width = this.f3981a.getWidth() - ((this.f3981a.getPaddingRight() + c0978d.rightMargin) + this.f3981a.f3953a.getWidth());
            return Math.max(Math.min(i, width), width - this.f3981a.f3955c);
        }
        int paddingLeft = this.f3981a.getPaddingLeft() + c0978d.leftMargin;
        return Math.min(Math.max(i, paddingLeft), this.f3981a.f3955c + paddingLeft);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: d */
    public final int mo2148d(View view, int i) {
        return view.getTop();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2141a(int i, int i2) {
        this.f3981a.f3957e.m2124a(this.f3981a.f3953a, i2);
    }
}
