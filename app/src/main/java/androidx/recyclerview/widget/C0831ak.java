package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* compiled from: LinearSnapHelper.java */
/* renamed from: androidx.recyclerview.widget.ak */
/* loaded from: classes.dex */
public final class C0831ak extends AbstractC0884cj {

    /* renamed from: b */
    private AbstractC0834an f3499b;

    /* renamed from: c */
    private AbstractC0834an f3500c;

    @Override // androidx.recyclerview.widget.AbstractC0884cj
    /* renamed from: a */
    public final int[] mo2964a(AbstractC0856bi abstractC0856bi, View view) {
        int[] iArr = new int[2];
        if (abstractC0856bi.mo2842g()) {
            iArr[0] = m2956a(view, m2961d(abstractC0856bi));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0856bi.mo2843h()) {
            iArr[1] = m2956a(view, m2960c(abstractC0856bi));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC0884cj
    /* renamed from: a */
    public final int mo2962a(AbstractC0856bi abstractC0856bi, int i, int i2) {
        int m3086F;
        View mo2963a;
        int m3069e;
        int i3;
        PointF mo2834c;
        int i4;
        int i5;
        if (!(abstractC0856bi instanceof InterfaceC0875ca) || (m3086F = abstractC0856bi.m3086F()) == 0 || (mo2963a = mo2963a(abstractC0856bi)) == null || (m3069e = AbstractC0856bi.m3069e(mo2963a)) == -1 || (mo2834c = ((InterfaceC0875ca) abstractC0856bi).mo2834c(m3086F - 1)) == null) {
            return -1;
        }
        if (abstractC0856bi.mo2842g()) {
            i4 = m2957a(abstractC0856bi, m2961d(abstractC0856bi), i, 0);
            if (mo2834c.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (abstractC0856bi.mo2843h()) {
            i5 = m2957a(abstractC0856bi, m2960c(abstractC0856bi), 0, i2);
            if (mo2834c.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (!abstractC0856bi.mo2843h()) {
            i5 = i4;
        }
        if (i5 == 0) {
            return -1;
        }
        int i6 = m3069e + i5;
        if (i6 < 0) {
            i6 = 0;
        }
        return i6 >= m3086F ? i3 : i6;
    }

    @Override // androidx.recyclerview.widget.AbstractC0884cj
    /* renamed from: a */
    public final View mo2963a(AbstractC0856bi abstractC0856bi) {
        if (abstractC0856bi.mo2843h()) {
            return m2958a(abstractC0856bi, m2960c(abstractC0856bi));
        }
        if (abstractC0856bi.mo2842g()) {
            return m2958a(abstractC0856bi, m2961d(abstractC0856bi));
        }
        return null;
    }

    /* renamed from: a */
    private static int m2956a(View view, AbstractC0834an abstractC0834an) {
        return (abstractC0834an.mo2968a(view) + (abstractC0834an.mo2978e(view) / 2)) - (abstractC0834an.mo2975d() + (abstractC0834an.mo2981g() / 2));
    }

    /* renamed from: a */
    private int m2957a(AbstractC0856bi abstractC0856bi, AbstractC0834an abstractC0834an, int i, int i2) {
        int[] b = m3241b(i, i2);
        float m2959b = m2959b(abstractC0856bi, abstractC0834an);
        if (m2959b <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(b[0]) > Math.abs(b[1]) ? b[0] : b[1]) / m2959b);
    }

    /* renamed from: a */
    private static View m2958a(AbstractC0856bi abstractC0856bi, AbstractC0834an abstractC0834an) {
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

    /* renamed from: b */
    private static float m2959b(AbstractC0856bi abstractC0856bi, AbstractC0834an abstractC0834an) {
        int m3121v = abstractC0856bi.m3121v();
        if (m3121v == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < m3121v; i3++) {
            View m3111f = abstractC0856bi.m3111f(i3);
            int m3069e = AbstractC0856bi.m3069e(m3111f);
            if (m3069e != -1) {
                if (m3069e < i) {
                    view = m3111f;
                    i = m3069e;
                }
                if (m3069e > i2) {
                    view2 = m3111f;
                    i2 = m3069e;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(abstractC0834an.mo2971b(view), abstractC0834an.mo2971b(view2)) - Math.min(abstractC0834an.mo2968a(view), abstractC0834an.mo2968a(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i2 - i) + 1);
    }

    /* renamed from: c */
    private AbstractC0834an m2960c(AbstractC0856bi abstractC0856bi) {
        if (this.f3499b == null || this.f3499b.f3502a != abstractC0856bi) {
            this.f3499b = AbstractC0834an.m2967b(abstractC0856bi);
        }
        return this.f3499b;
    }

    /* renamed from: d */
    private AbstractC0834an m2961d(AbstractC0856bi abstractC0856bi) {
        if (this.f3500c == null || this.f3500c.f3502a != abstractC0856bi) {
            this.f3500c = AbstractC0834an.m2965a(abstractC0856bi);
        }
        return this.f3500c;
    }
}
