package androidx.widget;

import android.view.View;
import androidx.core.p024g.C0538w;
import androidx.customview.p027a.AbstractC0593l;
import androidx.customview.p027a.C0590i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorDrawerLayout.java */
/* renamed from: androidx.widget.i */
/* loaded from: classes.dex */
public final class C1151i extends AbstractC0593l {

    /* renamed from: a */
    final /* synthetic */ ColorDrawerLayout f4645a;

    /* renamed from: b */
    private final int f4646b;

    /* renamed from: c */
    private C0590i f4647c;

    /* renamed from: d */
    private int f4648d;

    /* renamed from: e */
    private final Runnable f4649e = new RunnableC1152j(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1151i(ColorDrawerLayout colorDrawerLayout, int i) {
        this.f4645a = colorDrawerLayout;
        this.f4646b = i;
    }

    /* renamed from: a */
    public final void m3806a(C0590i c0590i) {
        this.f4647c = c0590i;
    }

    /* renamed from: c */
    public final void m3807c() {
        this.f4645a.removeCallbacks(this.f4649e);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final boolean mo2146b(View view, int i) {
        return ColorDrawerLayout.m3787d(view) && this.f4645a.m3799a(view, this.f4646b) && this.f4645a.m3793a(view) == 0;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2140a(int i) {
        View m2132c = this.f4647c.m2132c();
        if (i == 1) {
            this.f4648d = m2132c == null ? this.f4645a.getHeight() : m2132c.getTop();
        }
        this.f4645a.m3796a(i, m2132c);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2144a(View view, int i, int i2) {
        float max;
        int width = view.getWidth();
        int height = view.getHeight();
        if (this.f4645a.m3799a(view, 3)) {
            max = (i + width) / width;
        } else if (this.f4645a.m3799a(view, 5)) {
            max = (this.f4645a.getWidth() - i) / width;
        } else {
            max = Math.max(0.0f, (this.f4645a.getMeasuredHeight() - i2) / height);
            C0538w.m1840a(view, max == 0.0f ? 4 : 1);
        }
        this.f4645a.m3797a(view, max);
        view.setVisibility(max != 0.0f ? 0 : 4);
        this.f4645a.invalidate();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2143a(View view, int i) {
        ((C1149g) view.getLayoutParams()).f4643c = false;
        m3805e();
    }

    /* renamed from: e */
    private void m3805e() {
        View m3800b;
        int i = this.f4646b;
        View view = null;
        if (i == 3) {
            view = this.f4645a.m3800b(80);
            m3800b = this.f4645a.m3800b(5);
        } else if (i == 5) {
            view = this.f4645a.m3800b(3);
            m3800b = this.f4645a.m3800b(80);
        } else if (i != 80) {
            m3800b = null;
        } else {
            view = this.f4645a.m3800b(3);
            m3800b = this.f4645a.m3800b(5);
        }
        if (view != null) {
            this.f4645a.m3803e(view);
        }
        if (m3800b != null) {
            this.f4645a.m3803e(m3800b);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2142a(View view, float f, float f2) {
        int i;
        int i2;
        boolean z;
        int width;
        float m3776b = ColorDrawerLayout.m3776b(view);
        int width2 = view.getWidth();
        int height = view.getHeight();
        int left = view.getLeft();
        int top = view.getTop();
        if (this.f4645a.m3799a(view, 3)) {
            if (f > 0.0f || (f == 0.0f && m3776b > 0.5f)) {
                left = 0;
            } else {
                width = -width2;
                left = width;
            }
        } else if (this.f4645a.m3799a(view, 5)) {
            width = this.f4645a.getWidth();
            if (f < 0.0f || (f == 0.0f && m3776b > 0.5f)) {
                width -= width2;
            }
            left = width;
        } else {
            top = this.f4645a.getHeight() - view.getMinimumHeight();
            this.f4645a.f4607al = 1;
            int top2 = this.f4648d - view.getTop();
            i = this.f4645a.f4624u;
            if (top2 <= i) {
                i2 = this.f4645a.f4624u;
                if (top2 < (-i2)) {
                    z = this.f4645a.f4628y;
                    if (z) {
                        top = this.f4645a.f4601af;
                        this.f4645a.f4607al = 2;
                    }
                }
            } else {
                top = this.f4645a.getHeight() - height;
                this.f4645a.f4607al = 0;
            }
        }
        this.f4647c.m2125a(left, top);
        this.f4645a.invalidate();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2139a() {
        this.f4645a.postDelayed(this.f4649e, 160L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m3808d() {
        View m3800b;
        int left;
        int m2128b = this.f4647c.m2128b();
        boolean z = this.f4646b == 3;
        boolean z2 = this.f4646b == 5;
        boolean z3 = this.f4646b == 80;
        if (z) {
            m3800b = this.f4645a.m3800b(3);
            left = (m3800b != null ? -m3800b.getWidth() : 0) + m2128b;
            if (m3800b != null) {
                r4 = m3800b.getTop();
            }
        } else if (z2) {
            m3800b = this.f4645a.m3800b(5);
            left = this.f4645a.getWidth() - m2128b;
            if (m3800b != null) {
                r4 = m3800b.getTop();
            }
        } else {
            m3800b = this.f4645a.m3800b(80);
            int height = this.f4645a.getHeight() - m2128b;
            left = m3800b != null ? m3800b.getLeft() : 0;
            r4 = height;
        }
        if (m3800b != null) {
            if (((!z || m3800b.getLeft() >= left) && ((!z2 || m3800b.getLeft() <= left) && (!z3 || m3800b.getTop() <= r4))) || this.f4645a.m3793a(m3800b) != 0) {
                return;
            }
            C1149g c1149g = (C1149g) m3800b.getLayoutParams();
            this.f4647c.m2127a(m3800b, left, r4);
            c1149g.f4643c = true;
            this.f4645a.invalidate();
            m3805e();
            this.f4645a.m3801b();
        }
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2141a(int i, int i2) {
        View m3800b;
        if ((i & 1) == 1) {
            m3800b = this.f4645a.m3800b(3);
        } else if ((i & 2) == 2) {
            m3800b = this.f4645a.m3800b(5);
        } else {
            m3800b = this.f4645a.m3800b(80);
        }
        if (m3800b == null || this.f4645a.m3793a(m3800b) != 0) {
            return;
        }
        this.f4647c.m2124a(m3800b, i2);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final int mo2138a(View view) {
        if (!ColorDrawerLayout.m3787d(view) || this.f4645a.m3799a(view, 80)) {
            return 0;
        }
        return view.getWidth();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: c */
    public final int mo2147c(View view, int i) {
        if (this.f4645a.m3799a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        if (!this.f4645a.m3799a(view, 5)) {
            return 0;
        }
        int width = this.f4645a.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: d */
    public final int mo2148d(View view, int i) {
        int i2;
        int height = this.f4645a.getHeight() - view.getHeight();
        i2 = this.f4645a.f4621r;
        return Math.min(this.f4645a.getHeight(), Math.max(i, Math.max(height, i2)));
    }
}
