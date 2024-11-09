package androidx.drawerlayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0483d;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawerLayout.java */
/* renamed from: androidx.drawerlayout.widget.b */
/* loaded from: classes.dex */
public final class C0601b extends C0479a {

    /* renamed from: a */
    final /* synthetic */ DrawerLayout f2627a;

    /* renamed from: b */
    private final Rect f2628b = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0601b(DrawerLayout drawerLayout) {
        this.f2627a = drawerLayout;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        if (DrawerLayout.f2581b) {
            super.mo1626a(view, c0482c);
        } else {
            C0482c m1636a = C0482c.m1636a(c0482c);
            super.mo1626a(view, m1636a);
            c0482c.m1658b(view);
            Object m1880i = C0538w.m1880i(view);
            if (m1880i instanceof View) {
                c0482c.m1672d((View) m1880i);
            }
            Rect rect = this.f2628b;
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
            m1636a.m1706u();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2158f(childAt)) {
                    c0482c.m1667c(childAt);
                }
            }
        }
        c0482c.m1660b((CharSequence) DrawerLayout.class.getName());
        c0482c.m1669c(false);
        c0482c.m1673d(false);
        c0482c.m1663b(C0483d.f2299a);
        c0482c.m1663b(C0483d.f2300b);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: d */
    public final void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1631d(view, accessibilityEvent);
        accessibilityEvent.setClassName(DrawerLayout.class.getName());
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: b */
    public final boolean mo1629b(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            List<CharSequence> text = accessibilityEvent.getText();
            View m2163a = this.f2627a.m2163a();
            if (m2163a == null) {
                return true;
            }
            CharSequence m2164a = this.f2627a.m2164a(this.f2627a.m2171c(m2163a));
            if (m2164a == null) {
                return true;
            }
            text.add(m2164a);
            return true;
        }
        return super.mo1629b(view, accessibilityEvent);
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final boolean mo1628a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.f2581b || DrawerLayout.m2158f(view)) {
            return super.mo1628a(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}