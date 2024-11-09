package androidx.constraintlayout.p014a;

import androidx.constraintlayout.p014a.p015a.C0352e;
import androidx.constraintlayout.p014a.p015a.C0357j;
import androidx.constraintlayout.p014a.p015a.EnumC0356i;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem.java */
/* renamed from: androidx.constraintlayout.a.e */
/* loaded from: classes.dex */
public final class C0376e {

    /* renamed from: g */
    public static C0378g f1793g = null;

    /* renamed from: h */
    private static int f1794h = 1000;

    /* renamed from: b */
    C0373b[] f1796b;

    /* renamed from: f */
    final C0374c f1800f;

    /* renamed from: j */
    private InterfaceC0377f f1802j;

    /* renamed from: r */
    private final InterfaceC0377f f1810r;

    /* renamed from: a */
    int f1795a = 0;

    /* renamed from: i */
    private HashMap<String, C0382k> f1801i = null;

    /* renamed from: k */
    private int f1803k = 32;

    /* renamed from: l */
    private int f1804l = this.f1803k;

    /* renamed from: c */
    public boolean f1797c = false;

    /* renamed from: m */
    private boolean[] f1805m = new boolean[this.f1803k];

    /* renamed from: d */
    int f1798d = 1;

    /* renamed from: e */
    int f1799e = 0;

    /* renamed from: n */
    private int f1806n = this.f1803k;

    /* renamed from: o */
    private C0382k[] f1807o = new C0382k[f1794h];

    /* renamed from: p */
    private int f1808p = 0;

    /* renamed from: q */
    private C0373b[] f1809q = new C0373b[this.f1803k];

    public C0376e() {
        this.f1796b = null;
        this.f1796b = new C0373b[this.f1803k];
        m1327g();
        this.f1800f = new C0374c();
        this.f1802j = new C0375d(this.f1800f);
        this.f1810r = new C0373b(this.f1800f);
    }

    /* renamed from: a */
    public static C0378g m1320a() {
        return f1793g;
    }

    /* renamed from: f */
    private void m1326f() {
        this.f1803k *= 2;
        this.f1796b = (C0373b[]) Arrays.copyOf(this.f1796b, this.f1803k);
        this.f1800f.f1792c = (C0382k[]) Arrays.copyOf(this.f1800f.f1792c, this.f1803k);
        this.f1805m = new boolean[this.f1803k];
        this.f1804l = this.f1803k;
        this.f1806n = this.f1803k;
        if (f1793g != null) {
            f1793g.f1818d++;
            C0378g c0378g = f1793g;
            c0378g.f1830p = Math.max(c0378g.f1830p, this.f1803k);
            C0378g c0378g2 = f1793g;
            c0378g2.f1814D = c0378g2.f1830p;
        }
    }

    /* renamed from: g */
    private void m1327g() {
        for (int i = 0; i < this.f1796b.length; i++) {
            C0373b c0373b = this.f1796b[i];
            if (c0373b != null) {
                this.f1800f.f1790a.mo1348a(c0373b);
            }
            this.f1796b[i] = null;
        }
    }

    /* renamed from: b */
    public final void m1339b() {
        for (int i = 0; i < this.f1800f.f1792c.length; i++) {
            C0382k c0382k = this.f1800f.f1792c[i];
            if (c0382k != null) {
                c0382k.m1351b();
            }
        }
        this.f1800f.f1791b.mo1347a(this.f1807o, this.f1808p);
        this.f1808p = 0;
        Arrays.fill(this.f1800f.f1792c, (Object) null);
        if (this.f1801i != null) {
            this.f1801i.clear();
        }
        this.f1795a = 0;
        this.f1802j.mo1310a();
        this.f1798d = 1;
        for (int i2 = 0; i2 < this.f1799e; i2++) {
            this.f1796b[i2].f1787c = false;
        }
        m1327g();
        this.f1799e = 0;
    }

    /* renamed from: a */
    public final C0382k m1331a(Object obj) {
        C0382k c0382k = null;
        if (obj == null) {
            return null;
        }
        if (this.f1798d + 1 >= this.f1804l) {
            m1326f();
        }
        if (obj instanceof C0352e) {
            C0352e c0352e = (C0352e) obj;
            c0382k = c0352e.m1171b();
            if (c0382k == null) {
                c0352e.m1172c();
                c0382k = c0352e.m1171b();
            }
            if (c0382k.f1848a == -1 || c0382k.f1848a > this.f1795a || this.f1800f.f1792c[c0382k.f1848a] == null) {
                if (c0382k.f1848a != -1) {
                    c0382k.m1351b();
                }
                this.f1795a++;
                this.f1798d++;
                c0382k.f1848a = this.f1795a;
                c0382k.f1853f = C0383l.f1858a;
                this.f1800f.f1792c[this.f1795a] = c0382k;
            }
        }
        return c0382k;
    }

    /* renamed from: c */
    public final C0373b m1342c() {
        C0373b mo1346a = this.f1800f.f1790a.mo1346a();
        if (mo1346a == null) {
            mo1346a = new C0373b(this.f1800f);
        } else {
            mo1346a.f1785a = null;
            mo1346a.f1788d.m1138a();
            mo1346a.f1786b = 0.0f;
            mo1346a.f1789e = false;
        }
        C0382k.m1349a();
        return mo1346a;
    }

    /* renamed from: h */
    private C0382k m1328h() {
        if (f1793g != null) {
            f1793g.f1828n++;
        }
        if (this.f1798d + 1 >= this.f1804l) {
            m1326f();
        }
        C0382k m1323b = m1323b(C0383l.f1860c);
        this.f1795a++;
        this.f1798d++;
        m1323b.f1848a = this.f1795a;
        this.f1800f.f1792c[this.f1795a] = m1323b;
        return m1323b;
    }

    /* renamed from: a */
    private void m1321a(C0373b c0373b, int i, int i2) {
        c0373b.f1788d.m1142a(m1330a(i2), i);
    }

    /* renamed from: a */
    public final C0382k m1330a(int i) {
        if (f1793g != null) {
            f1793g.f1827m++;
        }
        if (this.f1798d + 1 >= this.f1804l) {
            m1326f();
        }
        C0382k m1323b = m1323b(C0383l.f1861d);
        this.f1795a++;
        this.f1798d++;
        m1323b.f1848a = this.f1795a;
        m1323b.f1850c = i;
        this.f1800f.f1792c[this.f1795a] = m1323b;
        this.f1802j.mo1317c(m1323b);
        return m1323b;
    }

    /* renamed from: b */
    private C0382k m1323b(int i) {
        C0382k mo1346a = this.f1800f.f1791b.mo1346a();
        if (mo1346a == null) {
            mo1346a = new C0382k(i);
            mo1346a.f1853f = i;
        } else {
            mo1346a.m1351b();
            mo1346a.f1853f = i;
        }
        if (this.f1808p >= f1794h) {
            f1794h *= 2;
            this.f1807o = (C0382k[]) Arrays.copyOf(this.f1807o, f1794h);
        }
        C0382k[] c0382kArr = this.f1807o;
        int i2 = this.f1808p;
        this.f1808p = i2 + 1;
        c0382kArr[i2] = mo1346a;
        return mo1346a;
    }

    /* renamed from: b */
    public static int m1322b(Object obj) {
        C0382k m1171b = ((C0352e) obj).m1171b();
        if (m1171b != null) {
            return (int) (m1171b.f1851d + 0.5f);
        }
        return 0;
    }

    /* renamed from: d */
    public final void m1344d() {
        float f;
        boolean z;
        long j;
        boolean z2;
        long j2 = 1;
        if (f1793g != null) {
            f1793g.f1819e++;
        }
        int i = 1;
        if (this.f1797c) {
            if (f1793g != null) {
                f1793g.f1832r++;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.f1799e) {
                    z2 = true;
                    break;
                } else {
                    if (!this.f1796b[i2].f1789e) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                if (f1793g != null) {
                    f1793g.f1831q++;
                }
                m1329i();
                return;
            }
        }
        InterfaceC0377f interfaceC0377f = this.f1802j;
        if (f1793g != null) {
            f1793g.f1834t++;
            C0378g c0378g = f1793g;
            c0378g.f1835u = Math.max(c0378g.f1835u, this.f1798d);
            C0378g c0378g2 = f1793g;
            c0378g2.f1836v = Math.max(c0378g2.f1836v, this.f1799e);
        }
        m1324b((C0373b) interfaceC0377f);
        int i3 = 0;
        while (true) {
            f = 0.0f;
            if (i3 >= this.f1799e) {
                z = false;
                break;
            } else {
                if (this.f1796b[i3].f1785a.f1853f != C0383l.f1858a && this.f1796b[i3].f1786b < 0.0f) {
                    z = true;
                    break;
                }
                i3++;
            }
        }
        if (z) {
            boolean z3 = false;
            int i4 = 0;
            while (!z3) {
                if (f1793g != null) {
                    f1793g.f1825k += j2;
                }
                i4 += i;
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                int i8 = 0;
                while (i7 < this.f1799e) {
                    C0373b c0373b = this.f1796b[i7];
                    if (c0373b.f1785a.f1853f != C0383l.f1858a && !c0373b.f1789e && c0373b.f1786b < f) {
                        int i9 = 1;
                        while (i9 < this.f1798d) {
                            C0382k c0382k = this.f1800f.f1792c[i9];
                            float m1146b = c0373b.f1788d.m1146b(c0382k);
                            if (m1146b > f) {
                                for (int i10 = 0; i10 < 7; i10++) {
                                    float f3 = c0382k.f1852e[i10] / m1146b;
                                    if ((f3 < f2 && i10 == i8) || i10 > i8) {
                                        i8 = i10;
                                        i6 = i9;
                                        f2 = f3;
                                        i5 = i7;
                                    }
                                }
                            }
                            i9++;
                            f = 0.0f;
                        }
                    }
                    i7++;
                    f = 0.0f;
                }
                if (i5 != -1) {
                    C0373b c0373b2 = this.f1796b[i5];
                    c0373b2.f1785a.f1849b = -1;
                    if (f1793g != null) {
                        j = 1;
                        f1793g.f1824j++;
                    } else {
                        j = 1;
                    }
                    c0373b2.m1316b(this.f1800f.f1792c[i6]);
                    c0373b2.f1785a.f1849b = i5;
                    c0373b2.f1785a.m1353c(c0373b2);
                } else {
                    j = 1;
                    z3 = true;
                }
                if (i4 > this.f1798d / 2) {
                    z3 = true;
                }
                j2 = j;
                i = 1;
                f = 0.0f;
            }
        }
        m1318a(interfaceC0377f);
        m1329i();
    }

    /* renamed from: b */
    private final void m1324b(C0373b c0373b) {
        if (this.f1799e > 0) {
            c0373b.f1788d.m1141a(c0373b, this.f1796b);
            if (c0373b.f1788d.f1573a == 0) {
                c0373b.f1789e = true;
            }
        }
    }

    /* renamed from: a */
    public final void m1333a(C0373b c0373b) {
        boolean z;
        boolean z2;
        C0382k m1137a;
        if (c0373b == null) {
            return;
        }
        if (f1793g != null) {
            f1793g.f1820f++;
            if (c0373b.f1789e) {
                f1793g.f1821g++;
            }
        }
        boolean z3 = true;
        if (this.f1799e + 1 >= this.f1806n || this.f1798d + 1 >= this.f1804l) {
            m1326f();
        }
        if (c0373b.f1789e) {
            z = false;
        } else {
            m1324b(c0373b);
            if (c0373b.f1785a == null && c0373b.f1786b == 0.0f && c0373b.f1788d.f1573a == 0) {
                return;
            }
            if (c0373b.f1786b < 0.0f) {
                c0373b.f1786b *= -1.0f;
                c0373b.f1788d.m1147b();
            }
            C0382k m1148c = c0373b.f1788d.m1148c();
            if (m1148c == null) {
                z2 = true;
            } else {
                c0373b.m1316b(m1148c);
                z2 = false;
            }
            if (c0373b.f1788d.f1573a == 0) {
                c0373b.f1789e = true;
            }
            if (z2) {
                if (f1793g != null) {
                    f1793g.f1829o++;
                }
                if (this.f1798d + 1 >= this.f1804l) {
                    m1326f();
                }
                C0382k m1323b = m1323b(C0383l.f1860c);
                this.f1795a++;
                this.f1798d++;
                m1323b.f1848a = this.f1795a;
                this.f1800f.f1792c[this.f1795a] = m1323b;
                c0373b.f1785a = m1323b;
                m1325c(c0373b);
                this.f1810r.mo1311a(c0373b);
                m1318a(this.f1810r);
                if (m1323b.f1849b == -1) {
                    if (c0373b.f1785a == m1323b && (m1137a = c0373b.f1788d.m1137a((boolean[]) null, m1323b)) != null) {
                        if (f1793g != null) {
                            f1793g.f1824j++;
                        }
                        c0373b.m1316b(m1137a);
                    }
                    if (!c0373b.f1789e) {
                        c0373b.f1785a.m1353c(c0373b);
                    }
                    this.f1799e--;
                }
                z = true;
            } else {
                z = false;
            }
            if (c0373b.f1785a == null || (c0373b.f1785a.f1853f != C0383l.f1858a && c0373b.f1786b < 0.0f)) {
                z3 = false;
            }
            if (!z3) {
                return;
            }
        }
        if (z) {
            return;
        }
        m1325c(c0373b);
    }

    /* renamed from: c */
    private final void m1325c(C0373b c0373b) {
        if (this.f1796b[this.f1799e] != null) {
            this.f1800f.f1790a.mo1348a(this.f1796b[this.f1799e]);
        }
        this.f1796b[this.f1799e] = c0373b;
        c0373b.f1785a.f1849b = this.f1799e;
        this.f1799e++;
        c0373b.f1785a.m1353c(c0373b);
    }

    /* renamed from: a */
    private final int m1318a(InterfaceC0377f interfaceC0377f) {
        if (f1793g != null) {
            f1793g.f1822h++;
        }
        for (int i = 0; i < this.f1798d; i++) {
            this.f1805m[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            if (f1793g != null) {
                f1793g.f1823i++;
            }
            i2++;
            if (i2 >= this.f1798d * 2) {
                return i2;
            }
            if (interfaceC0377f.mo1315b() != null) {
                this.f1805m[interfaceC0377f.mo1315b().f1848a] = true;
            }
            C0382k mo1309a = interfaceC0377f.mo1309a(this.f1805m);
            if (mo1309a != null) {
                if (this.f1805m[mo1309a.f1848a]) {
                    return i2;
                }
                this.f1805m[mo1309a.f1848a] = true;
            }
            if (mo1309a != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.f1799e; i4++) {
                    C0373b c0373b = this.f1796b[i4];
                    if (c0373b.f1785a.f1853f != C0383l.f1858a && !c0373b.f1789e && c0373b.m1312a(mo1309a)) {
                        float m1146b = c0373b.f1788d.m1146b(mo1309a);
                        if (m1146b < 0.0f) {
                            float f2 = (-c0373b.f1786b) / m1146b;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    C0373b c0373b2 = this.f1796b[i3];
                    c0373b2.f1785a.f1849b = -1;
                    if (f1793g != null) {
                        f1793g.f1824j++;
                    }
                    c0373b2.m1316b(mo1309a);
                    c0373b2.f1785a.f1849b = i3;
                    c0373b2.f1785a.m1353c(c0373b2);
                }
            }
            z = true;
        }
        return i2;
    }

    /* renamed from: i */
    private void m1329i() {
        for (int i = 0; i < this.f1799e; i++) {
            C0373b c0373b = this.f1796b[i];
            c0373b.f1785a.f1851d = c0373b.f1786b;
        }
    }

    /* renamed from: e */
    public final C0374c m1345e() {
        return this.f1800f;
    }

    /* renamed from: a */
    public final void m1336a(C0382k c0382k, C0382k c0382k2, int i, int i2) {
        C0373b m1342c = m1342c();
        C0382k m1328h = m1328h();
        m1328h.f1850c = 0;
        m1342c.m1307a(c0382k, c0382k2, m1328h, i);
        if (i2 != 6) {
            m1321a(m1342c, (int) (m1342c.f1788d.m1146b(m1328h) * (-1.0f)), i2);
        }
        m1333a(m1342c);
    }

    /* renamed from: a */
    public final void m1338a(C0382k c0382k, C0382k c0382k2, boolean z) {
        C0373b m1342c = m1342c();
        C0382k m1328h = m1328h();
        m1328h.f1850c = 0;
        m1342c.m1307a(c0382k, c0382k2, m1328h, 0);
        if (z) {
            m1321a(m1342c, (int) (m1342c.f1788d.m1146b(m1328h) * (-1.0f)), 1);
        }
        m1333a(m1342c);
    }

    /* renamed from: b */
    public final void m1340b(C0382k c0382k, C0382k c0382k2, int i, int i2) {
        C0373b m1342c = m1342c();
        C0382k m1328h = m1328h();
        m1328h.f1850c = 0;
        m1342c.m1313b(c0382k, c0382k2, m1328h, i);
        if (i2 != 6) {
            m1321a(m1342c, (int) (m1342c.f1788d.m1146b(m1328h) * (-1.0f)), i2);
        }
        m1333a(m1342c);
    }

    /* renamed from: b */
    public final void m1341b(C0382k c0382k, C0382k c0382k2, boolean z) {
        C0373b m1342c = m1342c();
        C0382k m1328h = m1328h();
        m1328h.f1850c = 0;
        m1342c.m1313b(c0382k, c0382k2, m1328h, 0);
        if (z) {
            m1321a(m1342c, (int) (m1342c.f1788d.m1146b(m1328h) * (-1.0f)), 1);
        }
        m1333a(m1342c);
    }

    /* renamed from: a */
    public final void m1335a(C0382k c0382k, C0382k c0382k2, int i, float f, C0382k c0382k3, C0382k c0382k4, int i2, int i3) {
        C0373b m1342c = m1342c();
        if (c0382k2 == c0382k3) {
            m1342c.f1788d.m1142a(c0382k, 1.0f);
            m1342c.f1788d.m1142a(c0382k4, 1.0f);
            m1342c.f1788d.m1142a(c0382k2, -2.0f);
        } else if (f == 0.5f) {
            m1342c.f1788d.m1142a(c0382k, 1.0f);
            m1342c.f1788d.m1142a(c0382k2, -1.0f);
            m1342c.f1788d.m1142a(c0382k3, -1.0f);
            m1342c.f1788d.m1142a(c0382k4, 1.0f);
            if (i > 0 || i2 > 0) {
                m1342c.f1786b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            m1342c.f1788d.m1142a(c0382k, -1.0f);
            m1342c.f1788d.m1142a(c0382k2, 1.0f);
            m1342c.f1786b = i;
        } else if (f >= 1.0f) {
            m1342c.f1788d.m1142a(c0382k3, -1.0f);
            m1342c.f1788d.m1142a(c0382k4, 1.0f);
            m1342c.f1786b = i2;
        } else {
            float f2 = 1.0f - f;
            m1342c.f1788d.m1142a(c0382k, f2 * 1.0f);
            m1342c.f1788d.m1142a(c0382k2, f2 * (-1.0f));
            m1342c.f1788d.m1142a(c0382k3, (-1.0f) * f);
            m1342c.f1788d.m1142a(c0382k4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                m1342c.f1786b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 6) {
            m1342c.m1306a(this, i3);
        }
        m1333a(m1342c);
    }

    /* renamed from: a */
    public final void m1337a(C0382k c0382k, C0382k c0382k2, C0382k c0382k3, C0382k c0382k4, float f) {
        C0373b m1342c = m1342c();
        m1342c.m1308a(c0382k, c0382k2, c0382k3, c0382k4, f);
        m1333a(m1342c);
    }

    /* renamed from: c */
    public final C0373b m1343c(C0382k c0382k, C0382k c0382k2, int i, int i2) {
        C0373b m1342c = m1342c();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m1342c.f1786b = i;
        }
        if (!z) {
            m1342c.f1788d.m1142a(c0382k, -1.0f);
            m1342c.f1788d.m1142a(c0382k2, 1.0f);
        } else {
            m1342c.f1788d.m1142a(c0382k, 1.0f);
            m1342c.f1788d.m1142a(c0382k2, -1.0f);
        }
        if (i2 != 6) {
            m1342c.m1306a(this, i2);
        }
        m1333a(m1342c);
        return m1342c;
    }

    /* renamed from: a */
    public final void m1334a(C0382k c0382k, int i) {
        int i2 = c0382k.f1849b;
        if (c0382k.f1849b != -1) {
            C0373b c0373b = this.f1796b[i2];
            if (c0373b.f1789e) {
                c0373b.f1786b = i;
                return;
            }
            if (c0373b.f1788d.f1573a == 0) {
                c0373b.f1789e = true;
                c0373b.f1786b = i;
                return;
            }
            C0373b m1342c = m1342c();
            if (i < 0) {
                m1342c.f1786b = i * (-1);
                m1342c.f1788d.m1142a(c0382k, 1.0f);
            } else {
                m1342c.f1786b = i;
                m1342c.f1788d.m1142a(c0382k, -1.0f);
            }
            m1333a(m1342c);
            return;
        }
        C0373b m1342c2 = m1342c();
        m1342c2.f1785a = c0382k;
        float f = i;
        c0382k.f1851d = f;
        m1342c2.f1786b = f;
        m1342c2.f1789e = true;
        m1333a(m1342c2);
    }

    /* renamed from: a */
    public static C0373b m1319a(C0376e c0376e, C0382k c0382k, C0382k c0382k2, C0382k c0382k3, float f, boolean z) {
        C0373b m1342c = c0376e.m1342c();
        if (z) {
            m1342c.m1306a(c0376e, 0);
        }
        m1342c.f1788d.m1142a(c0382k, -1.0f);
        m1342c.f1788d.m1142a(c0382k2, 1.0f - f);
        m1342c.f1788d.m1142a(c0382k3, f);
        return m1342c;
    }

    /* renamed from: a */
    public final void m1332a(C0357j c0357j, C0357j c0357j2, float f, int i) {
        C0382k m1331a = m1331a(c0357j.mo1188a(EnumC0356i.LEFT));
        C0382k m1331a2 = m1331a(c0357j.mo1188a(EnumC0356i.TOP));
        C0382k m1331a3 = m1331a(c0357j.mo1188a(EnumC0356i.RIGHT));
        C0382k m1331a4 = m1331a(c0357j.mo1188a(EnumC0356i.BOTTOM));
        C0382k m1331a5 = m1331a(c0357j2.mo1188a(EnumC0356i.LEFT));
        C0382k m1331a6 = m1331a(c0357j2.mo1188a(EnumC0356i.TOP));
        C0382k m1331a7 = m1331a(c0357j2.mo1188a(EnumC0356i.RIGHT));
        C0382k m1331a8 = m1331a(c0357j2.mo1188a(EnumC0356i.BOTTOM));
        C0373b m1342c = m1342c();
        double d = f;
        double d2 = i;
        m1342c.m1314b(m1331a2, m1331a4, m1331a6, m1331a8, (float) (Math.sin(d) * d2));
        m1333a(m1342c);
        C0373b m1342c2 = m1342c();
        m1342c2.m1314b(m1331a, m1331a3, m1331a5, m1331a7, (float) (Math.cos(d) * d2));
        m1333a(m1342c2);
    }
}
