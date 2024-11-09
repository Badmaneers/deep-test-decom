package androidx.customview.p027a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p024g.C0479a;
import androidx.core.p024g.C0506ag;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.C0481b;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0487h;
import androidx.core.p024g.p025a.C0490k;
import androidx.p011b.C0329o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExploreByTouchHelper.java */
/* renamed from: androidx.customview.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0582a extends C0479a {

    /* renamed from: c */
    private static final Rect f2531c = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: l */
    private static final InterfaceC0587f<C0482c> f2532l = new C0583b();

    /* renamed from: m */
    private static final InterfaceC0588g<C0329o<C0482c>, C0482c> f2533m = new C0584c();

    /* renamed from: h */
    private final AccessibilityManager f2540h;

    /* renamed from: i */
    private final View f2541i;

    /* renamed from: j */
    private C0585d f2542j;

    /* renamed from: d */
    private final Rect f2536d = new Rect();

    /* renamed from: e */
    private final Rect f2537e = new Rect();

    /* renamed from: f */
    private final Rect f2538f = new Rect();

    /* renamed from: g */
    private final int[] f2539g = new int[2];

    /* renamed from: a */
    int f2534a = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: b */
    int f2535b = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: k */
    private int f2543k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: a */
    protected abstract int mo2070a(float f, float f2);

    /* renamed from: a */
    protected void mo2073a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: a */
    protected abstract void mo2074a(int i, C0482c c0482c);

    /* renamed from: a */
    protected void mo2075a(int i, boolean z) {
    }

    /* renamed from: a */
    protected void mo2076a(C0482c c0482c) {
    }

    /* renamed from: a */
    protected abstract void mo2077a(List<Integer> list);

    /* renamed from: b */
    protected abstract boolean mo2084b(int i, int i2, Bundle bundle);

    public AbstractC0582a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2541i = view;
        this.f2540h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C0538w.m1876g(view) == 0) {
            C0538w.m1840a(view, 1);
        }
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public final C0487h mo1623a(View view) {
        if (this.f2542j == null) {
            this.f2542j = new C0585d(this);
        }
        return this.f2542j;
    }

    /* renamed from: a */
    public final boolean m2082a(MotionEvent motionEvent) {
        if (!this.f2540h.isEnabled() || !this.f2540h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            switch (action) {
                case 9:
                    break;
                case 10:
                    if (this.f2543k == Integer.MIN_VALUE) {
                        return false;
                    }
                    m2065d(RecyclerView.UNDEFINED_DURATION);
                    return true;
                default:
                    return false;
            }
        }
        int mo2070a = mo2070a(motionEvent.getX(), motionEvent.getY());
        m2065d(mo2070a);
        return mo2070a != Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final boolean m2081a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            int i2 = 66;
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        switch (keyCode) {
                            case 19:
                                i2 = 33;
                                break;
                            case 20:
                            default:
                                i2 = 130;
                                break;
                            case 21:
                                i2 = 17;
                                break;
                            case 22:
                                break;
                        }
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m2062b(i2, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            if (this.f2535b != Integer.MIN_VALUE) {
                mo2084b(this.f2535b, 16, null);
            }
            return true;
        }
        if (keyEvent.hasNoModifiers()) {
            return m2062b(2, (Rect) null);
        }
        if (keyEvent.hasModifiers(1)) {
            return m2062b(1, (Rect) null);
        }
        return false;
    }

    /* renamed from: a */
    public final void m2078a(boolean z, int i, Rect rect) {
        if (this.f2535b != Integer.MIN_VALUE) {
            m2069h(this.f2535b);
        }
        if (z) {
            m2062b(i, rect);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f2534a;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.f2535b;
    }

    /* renamed from: a */
    private void m2058a(int i, Rect rect) {
        m2083b(i).m1647a(rect);
    }

    /* renamed from: b */
    private boolean m2062b(int i, Rect rect) {
        C0482c c0482c;
        C0329o<C0482c> allNodes = getAllNodes();
        int i2 = this.f2535b;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        C0482c m1067a = i2 == Integer.MIN_VALUE ? null : allNodes.m1067a(i2);
        if (i != 17 && i != 33 && i != 66 && i != 130) {
            switch (i) {
                case 1:
                case 2:
                    c0482c = (C0482c) C0586e.m2090a(allNodes, f2533m, f2532l, m1067a, i, C0538w.m1878h(this.f2541i) == 1);
                    break;
                default:
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        } else {
            Rect rect2 = new Rect();
            if (this.f2535b != Integer.MIN_VALUE) {
                m2058a(this.f2535b, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m2057a(this.f2541i, i, rect2);
            }
            c0482c = (C0482c) C0586e.m2091a(allNodes, f2533m, f2532l, m1067a, rect2, i);
        }
        if (c0482c != null) {
            i3 = allNodes.m1072c(allNodes.m1065a((C0329o<C0482c>) c0482c));
        }
        return m2085c(i3);
    }

    private C0329o<C0482c> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        mo2077a(arrayList);
        C0329o<C0482c> c0329o = new C0329o<>();
        for (int i = 0; i < arrayList.size(); i++) {
            c0329o.m1071b(i, m2067f(i));
        }
        return c0329o;
    }

    /* renamed from: a */
    private static Rect m2057a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: a */
    public final boolean m2079a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f2540h.isEnabled() || (parent = this.f2541i.getParent()) == null) {
            return false;
        }
        return C0506ag.m1749a(parent, this.f2541i, m2063c(i, i2));
    }

    /* renamed from: a */
    public final void m2071a() {
        m2061b(-1, 1);
    }

    /* renamed from: a */
    public final void m2072a(int i) {
        m2061b(i, 0);
    }

    /* renamed from: b */
    private void m2061b(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f2540h.isEnabled() || (parent = this.f2541i.getParent()) == null) {
            return;
        }
        AccessibilityEvent m2063c = m2063c(i, 2048);
        C0481b.m1632a(m2063c, i2);
        C0506ag.m1749a(parent, this.f2541i, m2063c);
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    /* renamed from: d */
    private void m2065d(int i) {
        if (this.f2543k == i) {
            return;
        }
        int i2 = this.f2543k;
        this.f2543k = i;
        m2079a(i, 128);
        m2079a(i2, 256);
    }

    /* renamed from: c */
    private AccessibilityEvent m2063c(int i, int i2) {
        if (i == -1) {
            return m2066e(i2);
        }
        return m2064d(i, i2);
    }

    /* renamed from: e */
    private AccessibilityEvent m2066e(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f2541i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: d */
    public final void mo1631d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1631d(view, accessibilityEvent);
    }

    /* renamed from: d */
    private AccessibilityEvent m2064d(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0482c m2083b = m2083b(i);
        obtain.getText().add(m2083b.m1704s());
        obtain.setContentDescription(m2083b.m1705t());
        obtain.setScrollable(m2083b.m1701p());
        obtain.setPassword(m2083b.m1700o());
        obtain.setEnabled(m2083b.m1699n());
        obtain.setChecked(m2083b.m1680f());
        mo2073a(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m2083b.m1703r());
        C0490k.m1721a(obtain, this.f2541i, i);
        obtain.setPackageName(this.f2541i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: b */
    public final C0482c m2083b(int i) {
        if (i == -1) {
            return m2060b();
        }
        return m2067f(i);
    }

    /* renamed from: b */
    private C0482c m2060b() {
        C0482c m1634a = C0482c.m1634a(this.f2541i);
        C0538w.m1847a(this.f2541i, m1634a);
        ArrayList arrayList = new ArrayList();
        mo2077a(arrayList);
        if (m1634a.m1664c() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m1634a.m1659b(this.f2541i, ((Integer) arrayList.get(i)).intValue());
        }
        return m1634a;
    }

    @Override // androidx.core.p024g.C0479a
    /* renamed from: a */
    public void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        mo2076a(c0482c);
    }

    /* renamed from: f */
    private C0482c m2067f(int i) {
        C0482c m1639b = C0482c.m1639b();
        m1639b.m1690j(true);
        m1639b.m1669c(true);
        m1639b.m1660b("android.view.View");
        m1639b.m1657b(f2531c);
        m1639b.m1671d(f2531c);
        m1639b.m1672d(this.f2541i);
        mo2074a(i, m1639b);
        if (m1639b.m1704s() == null && m1639b.m1705t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m1639b.m1647a(this.f2537e);
        if (this.f2537e.equals(f2531c)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int m1670d = m1639b.m1670d();
        if ((m1670d & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((m1670d & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        m1639b.m1651a((CharSequence) this.f2541i.getContext().getPackageName());
        m1639b.m1648a(this.f2541i, i);
        if (this.f2534a == i) {
            m1639b.m1679f(true);
            m1639b.m1646a(128);
        } else {
            m1639b.m1679f(false);
            m1639b.m1646a(64);
        }
        boolean z = this.f2535b == i;
        if (z) {
            m1639b.m1646a(2);
        } else if (m1639b.m1683g()) {
            m1639b.m1646a(1);
        }
        m1639b.m1673d(z);
        this.f2541i.getLocationOnScreen(this.f2539g);
        m1639b.m1666c(this.f2536d);
        if (this.f2536d.equals(f2531c)) {
            m1639b.m1647a(this.f2536d);
            if (m1639b.f2285a != -1) {
                C0482c m1639b2 = C0482c.m1639b();
                for (int i2 = m1639b.f2285a; i2 != -1; i2 = m1639b2.f2285a) {
                    m1639b2.m1675e(this.f2541i);
                    m1639b2.m1657b(f2531c);
                    mo2074a(i2, m1639b2);
                    m1639b2.m1647a(this.f2537e);
                    this.f2536d.offset(this.f2537e.left, this.f2537e.top);
                }
                m1639b2.m1706u();
            }
            this.f2536d.offset(this.f2539g[0] - this.f2541i.getScrollX(), this.f2539g[1] - this.f2541i.getScrollY());
        }
        if (this.f2541i.getLocalVisibleRect(this.f2538f)) {
            this.f2538f.offset(this.f2539g[0] - this.f2541i.getScrollX(), this.f2539g[1] - this.f2541i.getScrollY());
            if (this.f2536d.intersect(this.f2538f)) {
                m1639b.m1671d(this.f2536d);
                if (m2059a(this.f2536d)) {
                    m1639b.m1677e(true);
                }
            }
        }
        return m1639b;
    }

    /* renamed from: a */
    private boolean m2059a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f2541i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f2541i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* renamed from: g */
    private boolean m2068g(int i) {
        if (this.f2534a != i) {
            return false;
        }
        this.f2534a = RecyclerView.UNDEFINED_DURATION;
        this.f2541i.invalidate();
        m2079a(i, 65536);
        return true;
    }

    /* renamed from: c */
    public final boolean m2085c(int i) {
        if ((!this.f2541i.isFocused() && !this.f2541i.requestFocus()) || this.f2535b == i) {
            return false;
        }
        if (this.f2535b != Integer.MIN_VALUE) {
            m2069h(this.f2535b);
        }
        this.f2535b = i;
        mo2075a(i, true);
        m2079a(i, 8);
        return true;
    }

    /* renamed from: h */
    private boolean m2069h(int i) {
        if (this.f2535b != i) {
            return false;
        }
        this.f2535b = RecyclerView.UNDEFINED_DURATION;
        mo2075a(i, false);
        m2079a(i, 8);
        return true;
    }

    /* renamed from: a */
    public final boolean m2080a(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return C0538w.m1856a(this.f2541i, i2, bundle);
        }
        if (i2 != 64) {
            if (i2 == 128) {
                return m2068g(i);
            }
            switch (i2) {
                case 1:
                    return m2085c(i);
                case 2:
                    return m2069h(i);
                default:
                    return mo2084b(i, i2, bundle);
            }
        }
        if (!this.f2540h.isEnabled() || !this.f2540h.isTouchExplorationEnabled() || this.f2534a == i) {
            return false;
        }
        if (this.f2534a != Integer.MIN_VALUE) {
            m2068g(this.f2534a);
        }
        this.f2534a = i;
        this.f2541i.invalidate();
        m2079a(i, 32768);
        return true;
    }
}
