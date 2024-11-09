package androidx.constraintlayout.p014a.p015a;

import java.util.ArrayList;

/* compiled from: ChainHead.java */
/* renamed from: androidx.constraintlayout.a.a.d */
/* loaded from: classes.dex */
public final class C0351d {

    /* renamed from: a */
    protected C0357j f1587a;

    /* renamed from: b */
    protected C0357j f1588b;

    /* renamed from: c */
    protected C0357j f1589c;

    /* renamed from: d */
    protected C0357j f1590d;

    /* renamed from: e */
    protected C0357j f1591e;

    /* renamed from: f */
    protected C0357j f1592f;

    /* renamed from: g */
    protected C0357j f1593g;

    /* renamed from: h */
    protected ArrayList<C0357j> f1594h;

    /* renamed from: i */
    protected int f1595i;

    /* renamed from: j */
    protected int f1596j;

    /* renamed from: k */
    protected float f1597k = 0.0f;

    /* renamed from: l */
    protected boolean f1598l;

    /* renamed from: m */
    protected boolean f1599m;

    /* renamed from: n */
    protected boolean f1600n;

    /* renamed from: o */
    private int f1601o;

    /* renamed from: p */
    private boolean f1602p;

    /* renamed from: q */
    private boolean f1603q;

    public C0351d(C0357j c0357j, int i, boolean z) {
        this.f1602p = false;
        this.f1587a = c0357j;
        this.f1601o = i;
        this.f1602p = z;
    }

    /* renamed from: a */
    public final void m1166a() {
        if (!this.f1603q) {
            int i = this.f1601o * 2;
            C0357j c0357j = this.f1587a;
            C0357j c0357j2 = this.f1587a;
            boolean z = false;
            C0357j c0357j3 = c0357j;
            boolean z2 = false;
            while (!z2) {
                this.f1595i++;
                C0357j c0357j4 = null;
                c0357j2.f1664af[this.f1601o] = null;
                c0357j2.f1663ae[this.f1601o] = null;
                if (c0357j2.m1225k() != 8) {
                    if (this.f1588b == null) {
                        this.f1588b = c0357j2;
                    }
                    this.f1590d = c0357j2;
                    if (c0357j2.f1635C[this.f1601o] == C0359l.f1709c && (c0357j2.f1685g[this.f1601o] == 0 || c0357j2.f1685g[this.f1601o] == 3 || c0357j2.f1685g[this.f1601o] == 2)) {
                        this.f1596j++;
                        float f = c0357j2.f1662ad[this.f1601o];
                        if (f > 0.0f) {
                            this.f1597k += c0357j2.f1662ad[this.f1601o];
                        }
                        int i2 = this.f1601o;
                        if (c0357j2.m1225k() != 8 && c0357j2.f1635C[i2] == C0359l.f1709c && (c0357j2.f1685g[i2] == 0 || c0357j2.f1685g[i2] == 3)) {
                            if (f < 0.0f) {
                                this.f1598l = true;
                            } else {
                                this.f1599m = true;
                            }
                            if (this.f1594h == null) {
                                this.f1594h = new ArrayList<>();
                            }
                            this.f1594h.add(c0357j2);
                        }
                        if (this.f1592f == null) {
                            this.f1592f = c0357j2;
                        }
                        if (this.f1593g != null) {
                            this.f1593g.f1663ae[this.f1601o] = c0357j2;
                        }
                        this.f1593g = c0357j2;
                    }
                }
                if (c0357j3 != c0357j2) {
                    c0357j3.f1664af[this.f1601o] = c0357j2;
                }
                C0352e c0352e = c0357j2.f1633A[i + 1].f1606c;
                if (c0352e != null) {
                    C0357j c0357j5 = c0352e.f1604a;
                    if (c0357j5.f1633A[i].f1606c != null && c0357j5.f1633A[i].f1606c.f1604a == c0357j2) {
                        c0357j4 = c0357j5;
                    }
                }
                if (c0357j4 != null) {
                    c0357j3 = c0357j2;
                    c0357j2 = c0357j4;
                } else {
                    z2 = true;
                    c0357j3 = c0357j2;
                }
            }
            this.f1589c = c0357j2;
            if (this.f1601o == 0 && this.f1602p) {
                this.f1591e = this.f1589c;
            } else {
                this.f1591e = this.f1587a;
            }
            if (this.f1599m && this.f1598l) {
                z = true;
            }
            this.f1600n = z;
        }
        this.f1603q = true;
    }
}
