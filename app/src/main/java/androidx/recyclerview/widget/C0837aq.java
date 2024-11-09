package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PagerSnapHelper.java */
/* renamed from: androidx.recyclerview.widget.aq */
/* loaded from: classes.dex */
public class C0837aq extends AbstractC0884cj {

    /* renamed from: b */
    private AbstractC0834an f3505b;

    /* renamed from: c */
    private AbstractC0834an f3506c;

    @Override // androidx.recyclerview.widget.AbstractC0884cj
    /* renamed from: a */
    public final int[] mo2964a(AbstractC0856bi abstractC0856bi, View view) {
        int[] iArr = new int[2];
        if (abstractC0856bi.mo2842g()) {
            iArr[0] = m2985a(view, m2988d(abstractC0856bi));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0856bi.mo2843h()) {
            iArr[1] = m2985a(view, m2987c(abstractC0856bi));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0884cj
    /* renamed from: a */
    public View mo2963a(AbstractC0856bi abstractC0856bi) {
        if (abstractC0856bi.mo2843h()) {
            return m2986a(abstractC0856bi, m2987c(abstractC0856bi));
        }
        if (abstractC0856bi.mo2842g()) {
            return m2986a(abstractC0856bi, m2988d(abstractC0856bi));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC0884cj
    /* renamed from: a */
    public final int mo2962a(AbstractC0856bi abstractC0856bi, int i, int i2) {
        AbstractC0834an m2988d;
        PointF mo2834c;
        int m3086F = abstractC0856bi.m3086F();
        if (m3086F == 0) {
            return -1;
        }
        if (abstractC0856bi.mo2843h()) {
            m2988d = m2987c(abstractC0856bi);
        } else {
            m2988d = abstractC0856bi.mo2842g() ? m2988d(abstractC0856bi) : null;
        }
        if (m2988d == null) {
            return -1;
        }
        int i3 = Integer.MAX_VALUE;
        int m3121v = abstractC0856bi.m3121v();
        boolean z = false;
        View view = null;
        View view2 = null;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < m3121v; i5++) {
            View m3111f = abstractC0856bi.m3111f(i5);
            if (m3111f != null) {
                int m2985a = m2985a(m3111f, m2988d);
                if (m2985a <= 0 && m2985a > i4) {
                    view2 = m3111f;
                    i4 = m2985a;
                }
                if (m2985a >= 0 && m2985a < i3) {
                    view = m3111f;
                    i3 = m2985a;
                }
            }
        }
        boolean z2 = !abstractC0856bi.mo2842g() ? i2 <= 0 : i <= 0;
        if (z2 && view != null) {
            return AbstractC0856bi.m3069e(view);
        }
        if (!z2 && view2 != null) {
            return AbstractC0856bi.m3069e(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m3069e = AbstractC0856bi.m3069e(view);
        int m3086F2 = abstractC0856bi.m3086F();
        if ((abstractC0856bi instanceof InterfaceC0875ca) && (mo2834c = ((InterfaceC0875ca) abstractC0856bi).mo2834c(m3086F2 - 1)) != null && (mo2834c.x < 0.0f || mo2834c.y < 0.0f)) {
            z = true;
        }
        int i6 = m3069e + (z == z2 ? -1 : 1);
        if (i6 < 0 || i6 >= m3086F) {
            return -1;
        }
        return i6;
    }

    @Override // androidx.recyclerview.widget.AbstractC0884cj
    /* renamed from: b */
    protected final C0830aj mo2989b(AbstractC0856bi abstractC0856bi) {
        if (abstractC0856bi instanceof InterfaceC0875ca) {
            return new C0838ar(this, this.f3637a.getContext());
        }
        return null;
    }

    /* renamed from: a */
    private static int m2985a(View view, AbstractC0834an abstractC0834an) {
        return (abstractC0834an.mo2968a(view) + (abstractC0834an.mo2978e(view) / 2)) - (abstractC0834an.mo2975d() + (abstractC0834an.mo2981g() / 2));
    }

    /* renamed from: a */
    private static View m2986a(AbstractC0856bi abstractC0856bi, AbstractC0834an abstractC0834an) {
        int m3121v = abstractC0856bi.m3121v();
        View view = null;
        if (m3121v == 0) {
            return null;
        }
        int mo2975d = abstractC0834an.mo2975d() + (abstractC0834an.mo2981g() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < m3121v; i2++) {
            View m3111f = abstractC0856bi.m3111f(i2);
            int abs = Math.abs((abstractC0834an.mo2968a(m3111f) + (abstractC0834an.mo2978e(m3111f) / 2)) - mo2975d);
            if (abs < i) {
                view = m3111f;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: c */
    private AbstractC0834an m2987c(AbstractC0856bi abstractC0856bi) {
        if (this.f3505b == null || this.f3505b.f3502a != abstractC0856bi) {
            this.f3505b = AbstractC0834an.m2967b(abstractC0856bi);
        }
        return this.f3505b;
    }

    /* renamed from: d */
    private AbstractC0834an m2988d(AbstractC0856bi abstractC0856bi) {
        if (this.f3506c == null || this.f3506c.f3502a != abstractC0856bi) {
            this.f3506c = AbstractC0834an.m2965a(abstractC0856bi);
        }
        return this.f3506c;
    }
}
