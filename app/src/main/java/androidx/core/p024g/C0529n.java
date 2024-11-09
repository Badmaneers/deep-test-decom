package androidx.core.p024g;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* renamed from: androidx.core.g.n */
/* loaded from: classes.dex */
public final class C0529n {

    /* renamed from: a */
    private ViewParent f2370a;

    /* renamed from: b */
    private ViewParent f2371b;

    /* renamed from: c */
    private final View f2372c;

    /* renamed from: d */
    private boolean f2373d;

    /* renamed from: e */
    private int[] f2374e;

    public C0529n(View view) {
        this.f2372c = view;
    }

    /* renamed from: a */
    public final void m1794a(boolean z) {
        if (this.f2373d) {
            C0538w.m1818B(this.f2372c);
        }
        this.f2373d = z;
    }

    /* renamed from: a */
    public final boolean m1795a() {
        return this.f2373d;
    }

    /* renamed from: b */
    public final boolean m1804b() {
        return m1798a(0);
    }

    /* renamed from: a */
    public final boolean m1798a(int i) {
        return m1791d(i) != null;
    }

    /* renamed from: b */
    public final boolean m1805b(int i) {
        return m1799a(i, 0);
    }

    /* renamed from: a */
    public final boolean m1799a(int i, int i2) {
        if (m1798a(i2)) {
            return true;
        }
        if (!this.f2373d) {
            return false;
        }
        View view = this.f2372c;
        for (ViewParent parent = this.f2372c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0506ag.m1748a(parent, view, this.f2372c, i, i2)) {
                m1789a(i2, parent);
                C0506ag.m1750b(parent, view, this.f2372c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m1806c() {
        m1807c(0);
    }

    /* renamed from: c */
    public final void m1807c(int i) {
        ViewParent m1791d = m1791d(i);
        if (m1791d != null) {
            C0506ag.m1743a(m1791d, this.f2372c, i);
            m1789a(i, (ViewParent) null);
        }
    }

    /* renamed from: a */
    public final boolean m1800a(int i, int i2, int i3, int i4, int[] iArr) {
        return m1790b(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public final boolean m1801a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m1790b(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: a */
    public final void m1793a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m1790b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public final boolean m1802a(int i, int i2, int[] iArr, int[] iArr2) {
        return m1803a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    private ViewParent m1791d(int i) {
        switch (i) {
            case 0:
                return this.f2370a;
            case 1:
                return this.f2371b;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private void m1789a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f2370a = viewParent;
                return;
            case 1:
                this.f2371b = viewParent;
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private int[] m1792d() {
        if (this.f2374e == null) {
            this.f2374e = new int[2];
        }
        return this.f2374e;
    }

    /* renamed from: b */
    private boolean m1790b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m1791d;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f2373d || (m1791d = m1791d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2372c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] m1792d = m1792d();
            m1792d[0] = 0;
            m1792d[1] = 0;
            iArr3 = m1792d;
        } else {
            iArr3 = iArr2;
        }
        C0506ag.m1744a(m1791d, this.f2372c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f2372c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m1803a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m1791d;
        int i4;
        int i5;
        if (!this.f2373d || (m1791d = m1791d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f2372c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m1792d();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0506ag.m1745a(m1791d, this.f2372c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f2372c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: a */
    public final boolean m1797a(float f, float f2, boolean z) {
        ViewParent m1791d;
        if (!this.f2373d || (m1791d = m1791d(0)) == null) {
            return false;
        }
        return C0506ag.m1747a(m1791d, this.f2372c, f, f2, z);
    }

    /* renamed from: a */
    public final boolean m1796a(float f, float f2) {
        ViewParent m1791d;
        if (!this.f2373d || (m1791d = m1791d(0)) == null) {
            return false;
        }
        return C0506ag.m1746a(m1791d, this.f2372c, f, f2);
    }
}
