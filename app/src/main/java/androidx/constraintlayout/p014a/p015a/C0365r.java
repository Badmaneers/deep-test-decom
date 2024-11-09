package androidx.constraintlayout.p014a.p015a;

import androidx.constraintlayout.p014a.C0376e;

/* compiled from: Optimizer.java */
/* renamed from: androidx.constraintlayout.a.a.r */
/* loaded from: classes.dex */
public final class C0365r {

    /* renamed from: a */
    static boolean[] f1757a = new boolean[3];

    /* renamed from: a */
    public static void m1278a(C0360m c0360m, C0376e c0376e, C0357j c0357j) {
        if (c0360m.f1635C[0] != C0359l.f1708b && c0357j.f1635C[0] == C0359l.f1710d) {
            int i = c0357j.f1697s.f1607d;
            int o = c0360m.m1233o() - c0357j.f1699u.f1607d;
            c0357j.f1697s.f1609f = c0376e.m1331a(c0357j.f1697s);
            c0357j.f1699u.f1609f = c0376e.m1331a(c0357j.f1699u);
            c0376e.m1334a(c0357j.f1697s.f1609f, i);
            c0376e.m1334a(c0357j.f1699u.f1609f, o);
            c0357j.f1658a = 2;
            c0357j.m1206c(i, o);
        }
        if (c0360m.f1635C[1] == C0359l.f1708b || c0357j.f1635C[1] != C0359l.f1710d) {
            return;
        }
        int i2 = c0357j.f1698t.f1607d;
        int q = c0360m.m1237q() - c0357j.f1700v.f1607d;
        c0357j.f1698t.f1609f = c0376e.m1331a(c0357j.f1698t);
        c0357j.f1700v.f1609f = c0376e.m1331a(c0357j.f1700v);
        c0376e.m1334a(c0357j.f1698t.f1609f, i2);
        c0376e.m1334a(c0357j.f1700v.f1609f, q);
        if (c0357j.f1647O > 0 || c0357j.m1225k() == 8) {
            c0357j.f1701w.f1609f = c0376e.m1331a(c0357j.f1701w);
            c0376e.m1334a(c0357j.f1701w.f1609f, c0357j.f1647O + i2);
        }
        c0357j.f1680b = 2;
        c0357j.m1210d(i2, q);
    }

    /* renamed from: a */
    private static boolean m1279a(C0357j c0357j, int i) {
        if (c0357j.f1635C[i] != C0359l.f1709c) {
            return false;
        }
        if (c0357j.f1639G != 0.0f) {
            return c0357j.f1635C[i != 0 ? (char) 0 : (char) 1] == C0359l.f1709c ? false : false;
        }
        if (i == 0) {
            if (c0357j.f1683e != 0 || c0357j.f1686h != 0 || c0357j.f1687i != 0) {
                return false;
            }
        } else if (c0357j.f1684f != 0 || c0357j.f1689k != 0 || c0357j.f1690l != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m1276a(int i, C0357j c0357j) {
        c0357j.m1217g();
        C0367t m1168a = c0357j.f1697s.m1168a();
        C0367t m1168a2 = c0357j.f1698t.m1168a();
        C0367t m1168a3 = c0357j.f1699u.m1168a();
        C0367t m1168a4 = c0357j.f1700v.m1168a();
        boolean z = (i & 8) == 8;
        boolean z2 = c0357j.f1635C[0] == C0359l.f1709c && m1279a(c0357j, 0);
        if (m1168a.f1764g != 4 && m1168a3.f1764g != 4) {
            if (c0357j.f1635C[0] == C0359l.f1707a || (z2 && c0357j.m1225k() == 8)) {
                if (c0357j.f1697s.f1606c != null || c0357j.f1699u.f1606c != null) {
                    if (c0357j.f1697s.f1606c == null || c0357j.f1699u.f1606c != null) {
                        if (c0357j.f1697s.f1606c != null || c0357j.f1699u.f1606c == null) {
                            if (c0357j.f1697s.f1606c != null && c0357j.f1699u.f1606c != null) {
                                m1168a.f1764g = 2;
                                m1168a3.f1764g = 2;
                                if (z) {
                                    c0357j.m1221i().m1294a(m1168a);
                                    c0357j.m1221i().m1294a(m1168a3);
                                    m1168a.m1290b(m1168a3, -1, c0357j.m1221i());
                                    m1168a3.m1290b(m1168a, 1, c0357j.m1221i());
                                } else {
                                    m1168a.m1288b(m1168a3, -c0357j.m1233o());
                                    m1168a3.m1288b(m1168a, c0357j.m1233o());
                                }
                            }
                        } else {
                            m1168a.f1764g = 1;
                            m1168a3.f1764g = 1;
                            m1168a.m1289b(m1168a3, -c0357j.m1233o());
                            if (z) {
                                m1168a.m1285a(m1168a3, -1, c0357j.m1221i());
                            } else {
                                m1168a.m1289b(m1168a3, -c0357j.m1233o());
                            }
                        }
                    } else {
                        m1168a.f1764g = 1;
                        m1168a3.f1764g = 1;
                        if (z) {
                            m1168a3.m1285a(m1168a, 1, c0357j.m1221i());
                        } else {
                            m1168a3.m1289b(m1168a, c0357j.m1233o());
                        }
                    }
                } else {
                    m1168a.f1764g = 1;
                    m1168a3.f1764g = 1;
                    if (z) {
                        m1168a3.m1285a(m1168a, 1, c0357j.m1221i());
                    } else {
                        m1168a3.m1289b(m1168a, c0357j.m1233o());
                    }
                }
            } else if (z2) {
                int m1233o = c0357j.m1233o();
                m1168a.f1764g = 1;
                m1168a3.f1764g = 1;
                if (c0357j.f1697s.f1606c == null && c0357j.f1699u.f1606c == null) {
                    if (z) {
                        m1168a3.m1285a(m1168a, 1, c0357j.m1221i());
                    } else {
                        m1168a3.m1289b(m1168a, m1233o);
                    }
                } else if (c0357j.f1697s.f1606c == null || c0357j.f1699u.f1606c != null) {
                    if (c0357j.f1697s.f1606c != null || c0357j.f1699u.f1606c == null) {
                        if (c0357j.f1697s.f1606c != null && c0357j.f1699u.f1606c != null) {
                            if (z) {
                                c0357j.m1221i().m1294a(m1168a);
                                c0357j.m1221i().m1294a(m1168a3);
                            }
                            if (c0357j.f1639G == 0.0f) {
                                m1168a.f1764g = 3;
                                m1168a3.f1764g = 3;
                                m1168a.m1288b(m1168a3, 0.0f);
                                m1168a3.m1288b(m1168a, 0.0f);
                            } else {
                                m1168a.f1764g = 2;
                                m1168a3.f1764g = 2;
                                m1168a.m1288b(m1168a3, -m1233o);
                                m1168a3.m1288b(m1168a, m1233o);
                                c0357j.m1222i(m1233o);
                            }
                        }
                    } else if (z) {
                        m1168a.m1285a(m1168a3, -1, c0357j.m1221i());
                    } else {
                        m1168a.m1289b(m1168a3, -m1233o);
                    }
                } else if (z) {
                    m1168a3.m1285a(m1168a, 1, c0357j.m1221i());
                } else {
                    m1168a3.m1289b(m1168a, m1233o);
                }
            }
        }
        boolean z3 = c0357j.f1635C[1] == C0359l.f1709c && m1279a(c0357j, 1);
        if (m1168a2.f1764g == 4 || m1168a4.f1764g == 4) {
            return;
        }
        if (c0357j.f1635C[1] != C0359l.f1707a && (!z3 || c0357j.m1225k() != 8)) {
            if (z3) {
                int m1237q = c0357j.m1237q();
                m1168a2.f1764g = 1;
                m1168a4.f1764g = 1;
                if (c0357j.f1698t.f1606c == null && c0357j.f1700v.f1606c == null) {
                    if (z) {
                        m1168a4.m1285a(m1168a2, 1, c0357j.m1223j());
                        return;
                    } else {
                        m1168a4.m1289b(m1168a2, m1237q);
                        return;
                    }
                }
                if (c0357j.f1698t.f1606c != null && c0357j.f1700v.f1606c == null) {
                    if (z) {
                        m1168a4.m1285a(m1168a2, 1, c0357j.m1223j());
                        return;
                    } else {
                        m1168a4.m1289b(m1168a2, m1237q);
                        return;
                    }
                }
                if (c0357j.f1698t.f1606c == null && c0357j.f1700v.f1606c != null) {
                    if (z) {
                        m1168a2.m1285a(m1168a4, -1, c0357j.m1223j());
                        return;
                    } else {
                        m1168a2.m1289b(m1168a4, -m1237q);
                        return;
                    }
                }
                if (c0357j.f1698t.f1606c == null || c0357j.f1700v.f1606c == null) {
                    return;
                }
                if (z) {
                    c0357j.m1223j().m1294a(m1168a2);
                    c0357j.m1221i().m1294a(m1168a4);
                }
                if (c0357j.f1639G == 0.0f) {
                    m1168a2.f1764g = 3;
                    m1168a4.f1764g = 3;
                    m1168a2.m1288b(m1168a4, 0.0f);
                    m1168a4.m1288b(m1168a2, 0.0f);
                    return;
                }
                m1168a2.f1764g = 2;
                m1168a4.f1764g = 2;
                m1168a2.m1288b(m1168a4, -m1237q);
                m1168a4.m1288b(m1168a2, m1237q);
                c0357j.m1224j(m1237q);
                if (c0357j.f1647O > 0) {
                    c0357j.f1701w.m1168a().m1284a(m1168a2, c0357j.f1647O);
                    return;
                }
                return;
            }
            return;
        }
        if (c0357j.f1698t.f1606c != null || c0357j.f1700v.f1606c != null) {
            if (c0357j.f1698t.f1606c == null || c0357j.f1700v.f1606c != null) {
                if (c0357j.f1698t.f1606c != null || c0357j.f1700v.f1606c == null) {
                    if (c0357j.f1698t.f1606c == null || c0357j.f1700v.f1606c == null) {
                        return;
                    }
                    m1168a2.f1764g = 2;
                    m1168a4.f1764g = 2;
                    if (z) {
                        m1168a2.m1290b(m1168a4, -1, c0357j.m1223j());
                        m1168a4.m1290b(m1168a2, 1, c0357j.m1223j());
                        c0357j.m1223j().m1294a(m1168a2);
                        c0357j.m1221i().m1294a(m1168a4);
                    } else {
                        m1168a2.m1288b(m1168a4, -c0357j.m1237q());
                        m1168a4.m1288b(m1168a2, c0357j.m1237q());
                    }
                    if (c0357j.f1647O > 0) {
                        c0357j.f1701w.m1168a().m1284a(m1168a2, c0357j.f1647O);
                        return;
                    }
                    return;
                }
                m1168a2.f1764g = 1;
                m1168a4.f1764g = 1;
                if (z) {
                    m1168a2.m1285a(m1168a4, -1, c0357j.m1223j());
                } else {
                    m1168a2.m1289b(m1168a4, -c0357j.m1237q());
                }
                if (c0357j.f1647O > 0) {
                    c0357j.f1701w.m1168a().m1284a(m1168a2, c0357j.f1647O);
                    return;
                }
                return;
            }
            m1168a2.f1764g = 1;
            m1168a4.f1764g = 1;
            if (z) {
                m1168a4.m1285a(m1168a2, 1, c0357j.m1223j());
            } else {
                m1168a4.m1289b(m1168a2, c0357j.m1237q());
            }
            if (c0357j.f1647O > 0) {
                c0357j.f1701w.m1168a().m1284a(m1168a2, c0357j.f1647O);
                return;
            }
            return;
        }
        m1168a2.f1764g = 1;
        m1168a4.f1764g = 1;
        if (z) {
            m1168a4.m1285a(m1168a2, 1, c0357j.m1223j());
        } else {
            m1168a4.m1289b(m1168a2, c0357j.m1237q());
        }
        if (c0357j.f1701w.f1606c != null) {
            c0357j.f1701w.m1168a().f1764g = 1;
            m1168a2.m1284a(c0357j.f1701w.m1168a(), -c0357j.f1647O);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:            if (r7.f1657Z == 2) goto L256;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:            r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x002c, code lost:            r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x003e, code lost:            if (r7.f1659aa == 2) goto L256;     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1280a(androidx.constraintlayout.p014a.C0376e r22, int r23, int r24, androidx.constraintlayout.p014a.p015a.C0351d r25) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p014a.p015a.C0365r.m1280a(androidx.constraintlayout.a.e, int, int, androidx.constraintlayout.a.a.d):boolean");
    }

    /* renamed from: a */
    public static void m1277a(C0357j c0357j, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        c0357j.f1633A[i3].m1168a().f1762e = c0357j.f1636D.f1697s.m1168a();
        c0357j.f1633A[i3].m1168a().f1763f = i2;
        c0357j.f1633A[i3].m1168a().f1773i = 1;
        c0357j.f1633A[i4].m1168a().f1762e = c0357j.f1633A[i3].m1168a();
        c0357j.f1633A[i4].m1168a().f1763f = c0357j.m1215f(i);
        c0357j.f1633A[i4].m1168a().f1773i = 1;
    }
}
