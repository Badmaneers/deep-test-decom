package androidx.constraintlayout.p014a.p015a;

import androidx.constraintlayout.p014a.C0376e;
import androidx.constraintlayout.p014a.C0382k;

/* compiled from: ResolutionAnchor.java */
/* renamed from: androidx.constraintlayout.a.a.t */
/* loaded from: classes.dex */
public final class C0367t extends C0369v {

    /* renamed from: a */
    C0352e f1758a;

    /* renamed from: b */
    float f1759b;

    /* renamed from: c */
    C0367t f1760c;

    /* renamed from: d */
    float f1761d;

    /* renamed from: e */
    C0367t f1762e;

    /* renamed from: f */
    float f1763f;

    /* renamed from: j */
    private C0367t f1765j;

    /* renamed from: k */
    private float f1766k;

    /* renamed from: g */
    int f1764g = 0;

    /* renamed from: l */
    private C0368u f1767l = null;

    /* renamed from: m */
    private int f1768m = 1;

    /* renamed from: n */
    private C0368u f1769n = null;

    /* renamed from: o */
    private int f1770o = 1;

    /* renamed from: a */
    private static String m1281a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public C0367t(C0352e c0352e) {
        this.f1758a = c0352e;
    }

    public final String toString() {
        if (this.f1773i == 1) {
            if (this.f1762e == this) {
                return "[" + this.f1758a + ", RESOLVED: " + this.f1763f + "]  type: " + m1281a(this.f1764g);
            }
            return "[" + this.f1758a + ", RESOLVED: " + this.f1762e + ":" + this.f1763f + "] type: " + m1281a(this.f1764g);
        }
        return "{ " + this.f1758a + " UNRESOLVED} type: " + m1281a(this.f1764g);
    }

    /* renamed from: a */
    public final void m1283a(C0367t c0367t, float f) {
        if (this.f1773i == 0 || !(this.f1762e == c0367t || this.f1763f == f)) {
            this.f1762e = c0367t;
            this.f1763f = f;
            if (this.f1773i == 1) {
                m1295d();
            }
            m1296e();
        }
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0369v
    /* renamed from: a */
    public final void mo1282a() {
        float f;
        float m1233o;
        float f2;
        boolean z = true;
        if (this.f1773i == 1 || this.f1764g == 4) {
            return;
        }
        if (this.f1767l != null) {
            if (this.f1767l.f1773i != 1) {
                return;
            } else {
                this.f1761d = this.f1768m * this.f1767l.f1771a;
            }
        }
        if (this.f1769n != null) {
            if (this.f1769n.f1773i != 1) {
                return;
            } else {
                this.f1766k = this.f1770o * this.f1769n.f1771a;
            }
        }
        if (this.f1764g == 1 && (this.f1760c == null || this.f1760c.f1773i == 1)) {
            if (this.f1760c == null) {
                this.f1762e = this;
                this.f1763f = this.f1761d;
            } else {
                this.f1762e = this.f1760c.f1762e;
                this.f1763f = this.f1760c.f1763f + this.f1761d;
            }
            m1296e();
            return;
        }
        if (this.f1764g == 2 && this.f1760c != null && this.f1760c.f1773i == 1 && this.f1765j != null && this.f1765j.f1760c != null && this.f1765j.f1760c.f1773i == 1) {
            if (C0376e.m1320a() != null) {
                C0376e.m1320a().f1837w++;
            }
            this.f1762e = this.f1760c.f1762e;
            this.f1765j.f1762e = this.f1765j.f1760c.f1762e;
            int i = 0;
            if (this.f1758a.f1605b != EnumC0356i.RIGHT && this.f1758a.f1605b != EnumC0356i.BOTTOM) {
                z = false;
            }
            if (z) {
                f = this.f1760c.f1763f - this.f1765j.f1760c.f1763f;
            } else {
                f = this.f1765j.f1760c.f1763f - this.f1760c.f1763f;
            }
            if (this.f1758a.f1605b == EnumC0356i.LEFT || this.f1758a.f1605b == EnumC0356i.RIGHT) {
                m1233o = f - this.f1758a.f1604a.m1233o();
                f2 = this.f1758a.f1604a.f1650S;
            } else {
                m1233o = f - this.f1758a.f1604a.m1237q();
                f2 = this.f1758a.f1604a.f1651T;
            }
            int m1173d = this.f1758a.m1173d();
            int m1173d2 = this.f1765j.f1758a.m1173d();
            if (this.f1758a.f1606c == this.f1765j.f1758a.f1606c) {
                f2 = 0.5f;
                m1173d2 = 0;
            } else {
                i = m1173d;
            }
            float f3 = i;
            float f4 = m1173d2;
            float f5 = (m1233o - f3) - f4;
            if (z) {
                this.f1765j.f1763f = this.f1765j.f1760c.f1763f + f4 + (f5 * f2);
                this.f1763f = (this.f1760c.f1763f - f3) - (f5 * (1.0f - f2));
            } else {
                this.f1763f = this.f1760c.f1763f + f3 + (f5 * f2);
                this.f1765j.f1763f = (this.f1765j.f1760c.f1763f - f4) - (f5 * (1.0f - f2));
            }
            m1296e();
            this.f1765j.m1296e();
            return;
        }
        if (this.f1764g == 3 && this.f1760c != null && this.f1760c.f1773i == 1 && this.f1765j != null && this.f1765j.f1760c != null && this.f1765j.f1760c.f1773i == 1) {
            if (C0376e.m1320a() != null) {
                C0376e.m1320a().f1838x++;
            }
            this.f1762e = this.f1760c.f1762e;
            this.f1765j.f1762e = this.f1765j.f1760c.f1762e;
            this.f1763f = this.f1760c.f1763f + this.f1761d;
            this.f1765j.f1763f = this.f1765j.f1760c.f1763f + this.f1765j.f1761d;
            m1296e();
            this.f1765j.m1296e();
            return;
        }
        if (this.f1764g == 5) {
            this.f1758a.f1604a.mo1164c();
        }
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0369v
    /* renamed from: b */
    public final void mo1287b() {
        super.mo1287b();
        this.f1760c = null;
        this.f1761d = 0.0f;
        this.f1767l = null;
        this.f1768m = 1;
        this.f1769n = null;
        this.f1770o = 1;
        this.f1762e = null;
        this.f1763f = 0.0f;
        this.f1759b = 0.0f;
        this.f1765j = null;
        this.f1766k = 0.0f;
        this.f1764g = 0;
    }

    /* renamed from: a */
    public final void m1284a(C0367t c0367t, int i) {
        this.f1764g = 1;
        this.f1760c = c0367t;
        this.f1761d = i;
        this.f1760c.m1294a(this);
    }

    /* renamed from: b */
    public final void m1289b(C0367t c0367t, int i) {
        this.f1760c = c0367t;
        this.f1761d = i;
        this.f1760c.m1294a(this);
    }

    /* renamed from: a */
    public final void m1285a(C0367t c0367t, int i, C0368u c0368u) {
        this.f1760c = c0367t;
        this.f1760c.m1294a(this);
        this.f1767l = c0368u;
        this.f1768m = i;
        this.f1767l.m1294a(this);
    }

    /* renamed from: b */
    public final void m1288b(C0367t c0367t, float f) {
        this.f1765j = c0367t;
        this.f1766k = f;
    }

    /* renamed from: b */
    public final void m1290b(C0367t c0367t, int i, C0368u c0368u) {
        this.f1765j = c0367t;
        this.f1769n = c0368u;
        this.f1770o = i;
    }

    /* renamed from: a */
    public final void m1286a(C0376e c0376e) {
        C0382k c0382k = this.f1758a.f1609f;
        if (this.f1762e == null) {
            c0376e.m1334a(c0382k, (int) (this.f1763f + 0.5f));
        } else {
            c0376e.m1343c(c0382k, c0376e.m1331a(this.f1762e.f1758a), (int) (this.f1763f + 0.5f), 6);
        }
    }

    /* renamed from: c */
    public final float m1291c() {
        return this.f1763f;
    }
}
