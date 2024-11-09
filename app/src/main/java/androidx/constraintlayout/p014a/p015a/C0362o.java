package androidx.constraintlayout.p014a.p015a;

import androidx.constraintlayout.p014a.C0376e;
import androidx.constraintlayout.p014a.C0382k;
import java.util.ArrayList;

/* compiled from: Guideline.java */
/* renamed from: androidx.constraintlayout.a.a.o */
/* loaded from: classes.dex */
public final class C0362o extends C0357j {

    /* renamed from: ai */
    protected float f1745ai = -1.0f;

    /* renamed from: aj */
    protected int f1746aj = -1;

    /* renamed from: ak */
    protected int f1747ak = -1;

    /* renamed from: al */
    private C0352e f1748al = this.f1698t;

    /* renamed from: am */
    private int f1749am = 0;

    /* renamed from: an */
    private boolean f1750an = false;

    /* renamed from: ao */
    private int f1751ao = 0;

    /* renamed from: ap */
    private C0366s f1752ap = new C0366s();

    /* renamed from: aq */
    private int f1753aq = 8;

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: a */
    public final boolean mo1161a() {
        return true;
    }

    public C0362o() {
        this.f1634B.clear();
        this.f1634B.add(this.f1748al);
        int length = this.f1633A.length;
        for (int i = 0; i < length; i++) {
            this.f1633A[i] = this.f1748al;
        }
    }

    /* renamed from: a */
    public final void m1270a(int i) {
        if (this.f1749am == i) {
            return;
        }
        this.f1749am = i;
        this.f1634B.clear();
        if (this.f1749am == 1) {
            this.f1748al = this.f1697s;
        } else {
            this.f1748al = this.f1698t;
        }
        this.f1634B.add(this.f1748al);
        int length = this.f1633A.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f1633A[i2] = this.f1748al;
        }
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: a */
    public final C0352e mo1188a(EnumC0356i enumC0356i) {
        switch (C0363p.f1754a[enumC0356i.ordinal()]) {
            case 1:
            case 2:
                if (this.f1749am == 1) {
                    return this.f1748al;
                }
                break;
            case 3:
            case 4:
                if (this.f1749am == 0) {
                    return this.f1748al;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC0356i.name());
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: B */
    public final ArrayList<C0352e> mo1182B() {
        return this.f1634B;
    }

    /* renamed from: e */
    public final void m1271e(float f) {
        if (f > -1.0f) {
            this.f1745ai = f;
            this.f1746aj = -1;
            this.f1747ak = -1;
        }
    }

    /* renamed from: u */
    public final void m1272u(int i) {
        if (i >= 0) {
            this.f1745ai = -1.0f;
            this.f1746aj = i;
            this.f1747ak = -1;
        }
    }

    /* renamed from: v */
    public final void m1273v(int i) {
        if (i >= 0) {
            this.f1745ai = -1.0f;
            this.f1746aj = -1;
            this.f1747ak = i;
        }
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: b */
    public final void mo1163b(int i) {
        C0357j c0357j = this.f1636D;
        if (c0357j == null) {
            return;
        }
        if (this.f1749am == 1) {
            this.f1698t.m1168a().m1284a(c0357j.f1698t.m1168a(), 0);
            this.f1700v.m1168a().m1284a(c0357j.f1698t.m1168a(), 0);
            if (this.f1746aj != -1) {
                this.f1697s.m1168a().m1284a(c0357j.f1697s.m1168a(), this.f1746aj);
                this.f1699u.m1168a().m1284a(c0357j.f1697s.m1168a(), this.f1746aj);
                return;
            } else if (this.f1747ak != -1) {
                this.f1697s.m1168a().m1284a(c0357j.f1699u.m1168a(), -this.f1747ak);
                this.f1699u.m1168a().m1284a(c0357j.f1699u.m1168a(), -this.f1747ak);
                return;
            } else {
                if (this.f1745ai == -1.0f || c0357j.m1185E() != C0359l.f1707a) {
                    return;
                }
                int i2 = (int) (c0357j.f1637E * this.f1745ai);
                this.f1697s.m1168a().m1284a(c0357j.f1697s.m1168a(), i2);
                this.f1699u.m1168a().m1284a(c0357j.f1697s.m1168a(), i2);
                return;
            }
        }
        this.f1697s.m1168a().m1284a(c0357j.f1697s.m1168a(), 0);
        this.f1699u.m1168a().m1284a(c0357j.f1697s.m1168a(), 0);
        if (this.f1746aj != -1) {
            this.f1698t.m1168a().m1284a(c0357j.f1698t.m1168a(), this.f1746aj);
            this.f1700v.m1168a().m1284a(c0357j.f1698t.m1168a(), this.f1746aj);
        } else if (this.f1747ak != -1) {
            this.f1698t.m1168a().m1284a(c0357j.f1700v.m1168a(), -this.f1747ak);
            this.f1700v.m1168a().m1284a(c0357j.f1700v.m1168a(), -this.f1747ak);
        } else {
            if (this.f1745ai == -1.0f || c0357j.m1186F() != C0359l.f1707a) {
                return;
            }
            int i3 = (int) (c0357j.f1638F * this.f1745ai);
            this.f1698t.m1168a().m1284a(c0357j.f1698t.m1168a(), i3);
            this.f1700v.m1168a().m1284a(c0357j.f1698t.m1168a(), i3);
        }
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: a */
    public final void mo1159a(C0376e c0376e) {
        C0360m c0360m = (C0360m) this.f1636D;
        if (c0360m == null) {
            return;
        }
        C0352e a2 = c0360m.mo1188a(EnumC0356i.LEFT);
        C0352e a3 = c0360m.mo1188a(EnumC0356i.RIGHT);
        boolean z = this.f1636D != null && this.f1636D.f1635C[0] == C0359l.f1708b;
        if (this.f1749am == 0) {
            a2 = c0360m.mo1188a(EnumC0356i.TOP);
            a3 = c0360m.mo1188a(EnumC0356i.BOTTOM);
            z = this.f1636D != null && this.f1636D.f1635C[1] == C0359l.f1708b;
        }
        if (this.f1746aj != -1) {
            C0382k m1331a = c0376e.m1331a(this.f1748al);
            c0376e.m1343c(m1331a, c0376e.m1331a(a2), this.f1746aj, 6);
            if (z) {
                c0376e.m1336a(c0376e.m1331a(a3), m1331a, 0, 5);
                return;
            }
            return;
        }
        if (this.f1747ak == -1) {
            if (this.f1745ai != -1.0f) {
                c0376e.m1333a(C0376e.m1319a(c0376e, c0376e.m1331a(this.f1748al), c0376e.m1331a(a2), c0376e.m1331a(a3), this.f1745ai, this.f1750an));
                return;
            }
            return;
        }
        C0382k m1331a2 = c0376e.m1331a(this.f1748al);
        C0382k m1331a3 = c0376e.m1331a(a3);
        c0376e.m1343c(m1331a2, m1331a3, -this.f1747ak, 6);
        if (z) {
            c0376e.m1336a(m1331a2, c0376e.m1331a(a2), 0, 5);
            c0376e.m1336a(m1331a3, m1331a2, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: G */
    public final void mo1187G() {
        if (this.f1636D == null) {
            return;
        }
        int m1322b = C0376e.m1322b(this.f1748al);
        if (this.f1749am == 1) {
            m1218g(m1322b);
            m1219h(0);
            m1224j(this.f1636D.m1237q());
            m1222i(0);
            return;
        }
        m1218g(0);
        m1219h(m1322b);
        m1222i(this.f1636D.m1233o());
        m1224j(0);
    }
}
