package androidx.slidingpanelayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlidingPaneLayout.java */
/* renamed from: androidx.slidingpanelayout.widget.a */
/* loaded from: classes.dex */
public final class C0975a extends C0479a {

    /* renamed from: a */
    final /* synthetic */ SlidingPaneLayout f3977a;

    /* renamed from: b */
    private final Rect f3978b = new Rect();

    public C0975a(SlidingPaneLayout slidingPaneLayout) {
        this.f3977a = slidingPaneLayout;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        C0482c m1636a = C0482c.m1636a(c0482c);
        super.mo1626a(view, m1636a);
        Rect rect = this.f3978b;
        m1636a.m1647a(rect);
        c0482c.m1657b(rect);
        m1636a.m1666c(rect);
        c0482c.m1671d(rect);
        c0482c.m1677e(m1636a.m1689i());
        c0482c.m1651a(m1636a.m1702q());
        c0482c.m1660b(m1636a.m1703r());
        c0482c.m1676e(m1636a.m1705t());
        c0482c.m1690j(m1636a.m1699n());
        c0482c.m1685h(m1636a.m1695l());
        c0482c.m1669c(m1636a.m1683g());
        c0482c.m1673d(m1636a.m1686h());
        c0482c.m1679f(m1636a.m1691j());
        c0482c.m1682g(m1636a.m1693k());
        c0482c.m1688i(m1636a.m1697m());
        c0482c.m1646a(m1636a.m1670d());
        c0482c.m1656b(m1636a.m1674e());
        m1636a.m1706u();
        c0482c.m1660b((CharSequence) SlidingPaneLayout.class.getName());
        c0482c.m1658b(view);
        Object m1880i = C0538w.m1880i(view);
        if (m1880i instanceof View) {
            c0482c.m1672d((View) m1880i);
        }
        int childCount = this.f3977a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f3977a.getChildAt(i);
            if (!m3435c(childAt) && childAt.getVisibility() == 0) {
                C0538w.m1840a(childAt, 1);
                c0482c.m1667c(childAt);
            }
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: d */
    public final void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1631d(view, accessibilityEvent);
        accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final boolean mo1628a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (m3435c(view)) {
            return false;
        }
        return super.mo1628a(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: c */
    private boolean m3435c(View view) {
        return this.f3977a.m3434c(view);
    }
}
