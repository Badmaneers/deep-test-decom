package androidx.constraintlayout.p014a.p015a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Analyzer.java */
/* renamed from: androidx.constraintlayout.a.a.a */
/* loaded from: classes.dex */
public final class C0348a {
    /* renamed from: a */
    public static void m1153a(C0360m c0360m) {
        if ((c0360m.m1254H() & 32) != 32) {
            m1157b(c0360m);
            return;
        }
        c0360m.f1732ax = true;
        c0360m.f1727as = false;
        c0360m.f1728at = false;
        c0360m.f1729au = false;
        ArrayList<C0357j> arrayList = c0360m.f1784az;
        List<C0361n> list = c0360m.f1726ar;
        boolean z = c0360m.m1185E() == C0359l.f1708b;
        boolean z2 = c0360m.m1186F() == C0359l.f1708b;
        boolean z3 = z || z2;
        list.clear();
        for (C0357j c0357j : arrayList) {
            c0357j.f1696r = null;
            c0357j.f1656Y = false;
            c0357j.mo1162b();
        }
        for (C0357j c0357j2 : arrayList) {
            if (c0357j2.f1696r == null) {
                C0361n c0361n = new C0361n(new ArrayList(), (byte) 0);
                list.add(c0361n);
                if (!m1156a(c0357j2, c0361n, list, z3)) {
                    m1157b(c0360m);
                    c0360m.f1732ax = false;
                    return;
                }
            }
        }
        int i = 0;
        int i2 = 0;
        for (C0361n c0361n2 : list) {
            i = Math.max(i, m1152a(c0361n2, 0));
            i2 = Math.max(i2, m1152a(c0361n2, 1));
        }
        if (z) {
            c0360m.m1242s(C0359l.f1707a);
            c0360m.m1222i(i);
            c0360m.f1727as = true;
            c0360m.f1728at = true;
            c0360m.f1730av = i;
        }
        if (z2) {
            c0360m.m1244t(C0359l.f1707a);
            c0360m.m1224j(i2);
            c0360m.f1727as = true;
            c0360m.f1729au = true;
            c0360m.f1731aw = i2;
        }
        m1155a(list, 0, c0360m.m1233o());
        m1155a(list, 1, c0360m.m1237q());
    }

    /* renamed from: a */
    private static boolean m1156a(C0357j c0357j, C0361n c0361n, List<C0361n> list, boolean z) {
        if (c0357j == null) {
            return true;
        }
        c0357j.f1655X = false;
        C0360m c0360m = (C0360m) c0357j.f1636D;
        if (c0357j.f1696r == null) {
            c0357j.f1654W = true;
            c0361n.f1734a.add(c0357j);
            c0357j.f1696r = c0361n;
            if (c0357j.f1697s.f1606c == null && c0357j.f1699u.f1606c == null && c0357j.f1698t.f1606c == null && c0357j.f1700v.f1606c == null && c0357j.f1701w.f1606c == null && c0357j.f1704z.f1606c == null) {
                m1154a(c0360m, c0357j, c0361n);
                if (z) {
                    return false;
                }
            }
            if (c0357j.f1698t.f1606c != null && c0357j.f1700v.f1606c != null) {
                int i = C0359l.f1708b;
                if (z) {
                    m1154a(c0360m, c0357j, c0361n);
                    return false;
                }
                if (c0357j.f1698t.f1606c.f1604a != c0357j.f1636D || c0357j.f1700v.f1606c.f1604a != c0357j.f1636D) {
                    m1154a(c0360m, c0357j, c0361n);
                }
            }
            if (c0357j.f1697s.f1606c != null && c0357j.f1699u.f1606c != null) {
                int i2 = C0359l.f1708b;
                if (z) {
                    m1154a(c0360m, c0357j, c0361n);
                    return false;
                }
                if (c0357j.f1697s.f1606c.f1604a != c0357j.f1636D || c0357j.f1699u.f1606c.f1604a != c0357j.f1636D) {
                    m1154a(c0360m, c0357j, c0361n);
                }
            }
            if (((c0357j.m1185E() == C0359l.f1709c) ^ (c0357j.m1186F() == C0359l.f1709c)) && c0357j.f1639G != 0.0f) {
                m1149a(c0357j);
            } else if (c0357j.m1185E() == C0359l.f1709c || c0357j.m1186F() == C0359l.f1709c) {
                m1154a(c0360m, c0357j, c0361n);
                if (z) {
                    return false;
                }
            }
            if (((c0357j.f1697s.f1606c == null && c0357j.f1699u.f1606c == null) || ((c0357j.f1697s.f1606c != null && c0357j.f1697s.f1606c.f1604a == c0357j.f1636D && c0357j.f1699u.f1606c == null) || ((c0357j.f1699u.f1606c != null && c0357j.f1699u.f1606c.f1604a == c0357j.f1636D && c0357j.f1697s.f1606c == null) || (c0357j.f1697s.f1606c != null && c0357j.f1697s.f1606c.f1604a == c0357j.f1636D && c0357j.f1699u.f1606c != null && c0357j.f1699u.f1606c.f1604a == c0357j.f1636D)))) && c0357j.f1704z.f1606c == null && !(c0357j instanceof C0362o) && !(c0357j instanceof C0364q)) {
                c0361n.f1739f.add(c0357j);
            }
            if (((c0357j.f1698t.f1606c == null && c0357j.f1700v.f1606c == null) || ((c0357j.f1698t.f1606c != null && c0357j.f1698t.f1606c.f1604a == c0357j.f1636D && c0357j.f1700v.f1606c == null) || ((c0357j.f1700v.f1606c != null && c0357j.f1700v.f1606c.f1604a == c0357j.f1636D && c0357j.f1698t.f1606c == null) || (c0357j.f1698t.f1606c != null && c0357j.f1698t.f1606c.f1604a == c0357j.f1636D && c0357j.f1700v.f1606c != null && c0357j.f1700v.f1606c.f1604a == c0357j.f1636D)))) && c0357j.f1704z.f1606c == null && c0357j.f1701w.f1606c == null && !(c0357j instanceof C0362o) && !(c0357j instanceof C0364q)) {
                c0361n.f1740g.add(c0357j);
            }
            if (c0357j instanceof C0364q) {
                m1154a(c0360m, c0357j, c0361n);
                if (z) {
                    return false;
                }
                C0364q c0364q = (C0364q) c0357j;
                for (int i3 = 0; i3 < c0364q.f1756aj; i3++) {
                    if (!m1156a(c0364q.f1755ai[i3], c0361n, list, z)) {
                        return false;
                    }
                }
            }
            int length = c0357j.f1633A.length;
            for (int i4 = 0; i4 < length; i4++) {
                C0352e c0352e = c0357j.f1633A[i4];
                if (c0352e.f1606c != null && c0352e.f1606c.f1604a != c0357j.f1636D) {
                    if (c0352e.f1605b == EnumC0356i.CENTER) {
                        m1154a(c0360m, c0357j, c0361n);
                        if (z) {
                            return false;
                        }
                    } else {
                        C0367t m1168a = c0352e.m1168a();
                        if (c0352e.f1606c != null && c0352e.f1606c.f1606c != c0352e) {
                            c0352e.f1606c.m1168a().m1294a(m1168a);
                        }
                    }
                    if (!m1156a(c0352e.f1606c.f1604a, c0361n, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (c0357j.f1696r != c0361n) {
            c0361n.f1734a.addAll(c0357j.f1696r.f1734a);
            c0361n.f1739f.addAll(c0357j.f1696r.f1739f);
            c0361n.f1740g.addAll(c0357j.f1696r.f1740g);
            if (!c0357j.f1696r.f1737d) {
                c0361n.f1737d = false;
            }
            list.remove(c0357j.f1696r);
            Iterator<C0357j> it = c0357j.f1696r.f1734a.iterator();
            while (it.hasNext()) {
                it.next().f1696r = c0361n;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m1154a(C0360m c0360m, C0357j c0357j, C0361n c0361n) {
        c0361n.f1737d = false;
        c0360m.f1732ax = false;
        c0357j.f1654W = false;
    }

    /* renamed from: a */
    private static int m1151a(C0357j c0357j, int i, boolean z, int i2) {
        int m1237q;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int m1233o;
        int i8;
        int i9;
        C0357j c0357j2;
        int i10 = 0;
        if (!c0357j.f1654W) {
            return 0;
        }
        boolean z2 = c0357j.f1701w.f1606c != null && i == 1;
        if (z) {
            m1237q = c0357j.f1647O;
            i3 = c0357j.m1237q() - c0357j.f1647O;
            i5 = i * 2;
            i4 = i5 + 1;
        } else {
            m1237q = c0357j.m1237q() - c0357j.f1647O;
            i3 = c0357j.f1647O;
            i4 = i * 2;
            i5 = i4 + 1;
        }
        if (c0357j.f1633A[i4].f1606c == null || c0357j.f1633A[i5].f1606c != null) {
            i6 = i4;
            i7 = 1;
        } else {
            i6 = i5;
            i5 = i4;
            i7 = -1;
        }
        int i11 = z2 ? i2 - m1237q : i2;
        int m1173d = (c0357j.f1633A[i5].m1173d() * i7) + m1150a(c0357j, i);
        int i12 = i11 + m1173d;
        int m1233o2 = (i == 0 ? c0357j.m1233o() : c0357j.m1237q()) * i7;
        Iterator<C0369v> it = c0357j.f1633A[i5].m1168a().f1772h.iterator();
        while (it.hasNext()) {
            i10 = Math.max(i10, m1151a(((C0367t) it.next()).f1758a.f1604a, i, z, i12));
        }
        int i13 = 0;
        for (Iterator<C0369v> it2 = c0357j.f1633A[i6].m1168a().f1772h.iterator(); it2.hasNext(); it2 = it2) {
            i13 = Math.max(i13, m1151a(((C0367t) it2.next()).f1758a.f1604a, i, z, m1233o2 + i12));
        }
        if (z2) {
            i10 -= m1237q;
            m1233o = i13 + i3;
        } else {
            m1233o = i13 + ((i == 0 ? c0357j.m1233o() : c0357j.m1237q()) * i7);
        }
        int i14 = 1;
        if (i == 1) {
            Iterator<C0369v> it3 = c0357j.f1701w.m1168a().f1772h.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                Iterator<C0369v> it4 = it3;
                C0367t c0367t = (C0367t) it3.next();
                if (i7 == i14) {
                    i15 = Math.max(i15, m1151a(c0367t.f1758a.f1604a, i, z, m1237q + i12));
                    it3 = it4;
                } else {
                    i15 = Math.max(i15, m1151a(c0367t.f1758a.f1604a, i, z, (i3 * i7) + i12));
                    it3 = it4;
                    i6 = i6;
                }
                i14 = 1;
            }
            i8 = i6;
            int i16 = i15;
            i9 = (c0357j.f1701w.m1168a().f1772h.size() <= 0 || z2) ? i16 : i7 == 1 ? i16 + m1237q : i16 - i3;
        } else {
            i8 = i6;
            i9 = 0;
        }
        int max = m1173d + Math.max(i10, Math.max(m1233o, i9));
        int i17 = i12 + m1233o2;
        if (i7 == -1) {
            i12 = i17;
            i17 = i12;
        }
        if (z) {
            C0365r.m1277a(c0357j, i, i12);
            c0357j.m1191a(i12, i17, i);
        } else {
            c0357j.f1696r.m1268a(c0357j, i);
            c0357j.m1213e(i12, i);
        }
        if (c0357j.m1240r(i) == C0359l.f1709c && c0357j.f1639G != 0.0f) {
            c0357j.f1696r.m1268a(c0357j, i);
        }
        if (c0357j.f1633A[i5].f1606c != null && c0357j.f1633A[i8].f1606c != null && c0357j.f1633A[i5].f1606c.f1604a == (c0357j2 = c0357j.f1636D) && c0357j.f1633A[i8].f1606c.f1604a == c0357j2) {
            c0357j.f1696r.m1268a(c0357j, i);
        }
        return max;
    }

    /* renamed from: b */
    private static void m1157b(C0360m c0360m) {
        c0360m.f1726ar.clear();
        c0360m.f1726ar.add(0, new C0361n(c0360m.f1784az));
    }

    /* renamed from: a */
    public static void m1155a(List<C0361n> list, int i, int i2) {
        HashSet<C0357j> hashSet;
        int i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0361n c0361n = list.get(i4);
            if (i == 0) {
                hashSet = c0361n.f1741h;
            } else {
                hashSet = i == 1 ? c0361n.f1742i : null;
            }
            for (C0357j c0357j : hashSet) {
                if (c0357j.f1654W) {
                    int i5 = i * 2;
                    C0352e c0352e = c0357j.f1633A[i5];
                    C0352e c0352e2 = c0357j.f1633A[i5 + 1];
                    if ((c0352e.f1606c == null || c0352e2.f1606c == null) ? false : true) {
                        C0365r.m1277a(c0357j, i, m1150a(c0357j, i) + c0352e.m1173d());
                    } else if (c0357j.f1639G != 0.0f && c0357j.m1240r(i) == C0359l.f1709c) {
                        int m1149a = m1149a(c0357j);
                        int i6 = (int) c0357j.f1633A[i5].m1168a().f1763f;
                        c0352e2.m1168a().f1762e = c0352e.m1168a();
                        c0352e2.m1168a().f1763f = m1149a;
                        c0352e2.m1168a().f1773i = 1;
                        c0357j.m1191a(i6, i6 + m1149a, i);
                    } else {
                        if (i == 0) {
                            i3 = c0357j.f1643K;
                        } else {
                            i3 = i == 1 ? c0357j.f1644L : 0;
                        }
                        int i7 = i2 - i3;
                        int m1215f = i7 - c0357j.m1215f(i);
                        c0357j.m1191a(m1215f, i7, i);
                        C0365r.m1277a(c0357j, i, m1215f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static int m1150a(C0357j c0357j, int i) {
        int i2 = i * 2;
        C0352e c0352e = c0357j.f1633A[i2];
        C0352e c0352e2 = c0357j.f1633A[i2 + 1];
        if (c0352e.f1606c == null || c0352e.f1606c.f1604a != c0357j.f1636D || c0352e2.f1606c == null || c0352e2.f1606c.f1604a != c0357j.f1636D) {
            return 0;
        }
        return (int) ((((c0357j.f1636D.m1215f(i) - c0352e.m1173d()) - c0352e2.m1173d()) - c0357j.m1215f(i)) * (i == 0 ? c0357j.f1650S : c0357j.f1651T));
    }

    /* renamed from: a */
    private static int m1149a(C0357j c0357j) {
        int m1233o;
        int m1237q;
        if (c0357j.m1185E() == C0359l.f1709c) {
            if (c0357j.f1640H == 0) {
                m1237q = (int) (c0357j.m1237q() * c0357j.f1639G);
            } else {
                m1237q = (int) (c0357j.m1237q() / c0357j.f1639G);
            }
            c0357j.m1222i(m1237q);
            return m1237q;
        }
        if (c0357j.m1186F() != C0359l.f1709c) {
            return -1;
        }
        if (c0357j.f1640H == 1) {
            m1233o = (int) (c0357j.m1233o() * c0357j.f1639G);
        } else {
            m1233o = (int) (c0357j.m1233o() / c0357j.f1639G);
        }
        c0357j.m1224j(m1233o);
        return m1233o;
    }

    /* renamed from: a */
    private static int m1152a(C0361n c0361n, int i) {
        List<C0357j> list;
        int i2 = i * 2;
        if (i == 0) {
            list = c0361n.f1739f;
        } else {
            list = i == 1 ? c0361n.f1740g : null;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0357j c0357j = list.get(i4);
            int i5 = i2 + 1;
            i3 = Math.max(i3, m1151a(c0357j, i, c0357j.f1633A[i5].f1606c == null || !(c0357j.f1633A[i2].f1606c == null || c0357j.f1633A[i5].f1606c == null), 0));
        }
        c0361n.f1738e[i] = i3;
        return i3;
    }
}
