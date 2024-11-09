package androidx.drawerlayout.widget;

import android.view.View;
import androidx.customview.p027a.AbstractC0593l;
import androidx.customview.p027a.C0590i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawerLayout.java */
/* renamed from: androidx.drawerlayout.widget.g */
/* loaded from: classes.dex */
public final class C0606g extends AbstractC0593l {

    /* renamed from: a */
    final /* synthetic */ DrawerLayout f2633a;

    /* renamed from: b */
    private final int f2634b;

    /* renamed from: c */
    private C0590i f2635c;

    /* renamed from: d */
    private final Runnable f2636d = new RunnableC0607h(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0606g(DrawerLayout drawerLayout, int i) {
        this.f2633a = drawerLayout;
        this.f2634b = i;
    }

    /* renamed from: a */
    public final void m2174a(C0590i c0590i) {
        this.f2635c = c0590i;
    }

    /* renamed from: c */
    public final void m2175c() {
        this.f2633a.removeCallbacks(this.f2636d);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: b */
    public final boolean mo2146b(View view, int i) {
        return DrawerLayout.m2157d(view) && this.f2633a.m2168a(view, this.f2634b) && this.f2633a.m2162a(view) == 0;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2140a(int i) {
        this.f2633a.m2165a(i, this.f2635c.m2132c());
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2144a(View view, int i, int i2) {
        int width = view.getWidth();
        float width2 = this.f2633a.m2168a(view, 3) ? (i + width) / width : (this.f2633a.getWidth() - i) / width;
        this.f2633a.m2166a(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        this.f2633a.invalidate();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2143a(View view, int i) {
        ((C0604e) view.getLayoutParams()).f2631c = false;
        m2173e();
    }

    /* renamed from: e */
    private void m2173e() {
        View m2169b = this.f2633a.m2169b(this.f2634b == 3 ? 5 : 3);
        if (m2169b != null) {
            this.f2633a.m2172e(m2169b);
        }
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2142a(View view, float f, float f2) {
        int i;
        float m2155b = DrawerLayout.m2155b(view);
        int width = view.getWidth();
        if (this.f2633a.m2168a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && m2155b > 0.5f)) ? 0 : -width;
        } else {
            int width2 = this.f2633a.getWidth();
            if (f < 0.0f || (f == 0.0f && m2155b > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f2635c.m2125a(i, view.getTop());
        this.f2633a.invalidate();
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2139a() {
        this.f2633a.postDelayed(this.f2636d, 160L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m2176d() {
        View m2169b;
        int width;
        int m2128b = this.f2635c.m2128b();
        boolean z = this.f2634b == 3;
        if (z) {
            m2169b = this.f2633a.m2169b(3);
            width = (m2169b != null ? -m2169b.getWidth() : 0) + m2128b;
        } else {
            m2169b = this.f2633a.m2169b(5);
            width = this.f2633a.getWidth() - m2128b;
        }
        if (m2169b != null) {
            if (((!z || m2169b.getLeft() >= width) && (z || m2169b.getLeft() <= width)) || this.f2633a.m2162a(m2169b) != 0) {
                return;
            }
            C0604e c0604e = (C0604e) m2169b.getLayoutParams();
            this.f2635c.m2127a(m2169b, width, m2169b.getTop());
            c0604e.f2631c = true;
            this.f2633a.invalidate();
            m2173e();
            this.f2633a.m2170b();
        }
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final void mo2141a(int i, int i2) {
        View m2169b;
        if ((i & 1) == 1) {
            m2169b = this.f2633a.m2169b(3);
        } else {
            m2169b = this.f2633a.m2169b(5);
        }
        if (m2169b == null || this.f2633a.m2162a(m2169b) != 0) {
            return;
        }
        this.f2635c.m2124a(m2169b, i2);
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: a */
    public final int mo2138a(View view) {
        if (DrawerLayout.m2157d(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: c */
    public final int mo2147c(View view, int i) {
        if (this.f2633a.m2168a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f2633a.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // androidx.customview.p027a.AbstractC0593l
    /* renamed from: d */
    public final int mo2148d(View view, int i) {
        return view.getTop();
    }
}
