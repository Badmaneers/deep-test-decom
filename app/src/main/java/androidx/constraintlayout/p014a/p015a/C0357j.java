package androidx.constraintlayout.p014a.p015a;

import androidx.constraintlayout.p014a.C0374c;
import androidx.constraintlayout.p014a.C0376e;
import com.coloros.neton.BuildConfig;
import java.util.ArrayList;

/* compiled from: ConstraintWidget.java */
/* renamed from: androidx.constraintlayout.a.a.j */
/* loaded from: classes.dex */
public class C0357j {

    /* renamed from: R */
    public static float f1632R = 0.5f;

    /* renamed from: P */
    protected int f1648P;

    /* renamed from: Q */
    protected int f1649Q;

    /* renamed from: U */
    boolean f1652U;

    /* renamed from: V */
    boolean f1653V;

    /* renamed from: ab */
    boolean f1660ab;

    /* renamed from: ac */
    boolean f1661ac;

    /* renamed from: ao */
    private int f1673ao;

    /* renamed from: ap */
    private int f1674ap;

    /* renamed from: aq */
    private Object f1675aq;

    /* renamed from: c */
    C0368u f1681c;

    /* renamed from: d */
    C0368u f1682d;

    /* renamed from: n */
    boolean f1692n;

    /* renamed from: o */
    boolean f1693o;

    /* renamed from: a */
    public int f1658a = -1;

    /* renamed from: b */
    public int f1680b = -1;

    /* renamed from: e */
    int f1683e = 0;

    /* renamed from: f */
    int f1684f = 0;

    /* renamed from: g */
    int[] f1685g = new int[2];

    /* renamed from: h */
    int f1686h = 0;

    /* renamed from: i */
    int f1687i = 0;

    /* renamed from: j */
    float f1688j = 1.0f;

    /* renamed from: k */
    int f1689k = 0;

    /* renamed from: l */
    int f1690l = 0;

    /* renamed from: m */
    float f1691m = 1.0f;

    /* renamed from: p */
    int f1694p = -1;

    /* renamed from: q */
    float f1695q = 1.0f;

    /* renamed from: r */
    C0361n f1696r = null;

    /* renamed from: ai */
    private int[] f1667ai = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: aj */
    private float f1668aj = 0.0f;

    /* renamed from: s */
    C0352e f1697s = new C0352e(this, EnumC0356i.LEFT);

    /* renamed from: t */
    C0352e f1698t = new C0352e(this, EnumC0356i.TOP);

    /* renamed from: u */
    C0352e f1699u = new C0352e(this, EnumC0356i.RIGHT);

    /* renamed from: v */
    C0352e f1700v = new C0352e(this, EnumC0356i.BOTTOM);

    /* renamed from: w */
    C0352e f1701w = new C0352e(this, EnumC0356i.BASELINE);

    /* renamed from: x */
    C0352e f1702x = new C0352e(this, EnumC0356i.CENTER_X);

    /* renamed from: y */
    C0352e f1703y = new C0352e(this, EnumC0356i.CENTER_Y);

    /* renamed from: z */
    C0352e f1704z = new C0352e(this, EnumC0356i.CENTER);

    /* renamed from: A */
    protected C0352e[] f1633A = {this.f1697s, this.f1699u, this.f1698t, this.f1700v, this.f1701w, this.f1704z};

    /* renamed from: B */
    protected ArrayList<C0352e> f1634B = new ArrayList<>();

    /* renamed from: C */
    protected int[] f1635C = {C0359l.f1707a, C0359l.f1707a};

    /* renamed from: D */
    C0357j f1636D = null;

    /* renamed from: E */
    int f1637E = 0;

    /* renamed from: F */
    int f1638F = 0;

    /* renamed from: G */
    protected float f1639G = 0.0f;

    /* renamed from: H */
    protected int f1640H = -1;

    /* renamed from: I */
    protected int f1641I = 0;

    /* renamed from: J */
    protected int f1642J = 0;

    /* renamed from: K */
    int f1643K = 0;

    /* renamed from: L */
    int f1644L = 0;

    /* renamed from: ak */
    private int f1669ak = 0;

    /* renamed from: al */
    private int f1670al = 0;

    /* renamed from: am */
    private int f1671am = 0;

    /* renamed from: an */
    private int f1672an = 0;

    /* renamed from: M */
    protected int f1645M = 0;

    /* renamed from: N */
    protected int f1646N = 0;

    /* renamed from: O */
    int f1647O = 0;

    /* renamed from: S */
    float f1650S = f1632R;

    /* renamed from: T */
    float f1651T = f1632R;

    /* renamed from: ar */
    private int f1676ar = 0;

    /* renamed from: as */
    private int f1677as = 0;

    /* renamed from: at */
    private String f1678at = null;

    /* renamed from: au */
    private String f1679au = null;

    /* renamed from: W */
    boolean f1654W = false;

    /* renamed from: X */
    boolean f1655X = false;

    /* renamed from: Y */
    boolean f1656Y = false;

    /* renamed from: Z */
    int f1657Z = 0;

    /* renamed from: aa */
    int f1659aa = 0;

    /* renamed from: ad */
    float[] f1662ad = {-1.0f, -1.0f};

    /* renamed from: ae */
    protected C0357j[] f1663ae = {null, null};

    /* renamed from: af */
    protected C0357j[] f1664af = {null, null};

    /* renamed from: ag */
    C0357j f1665ag = null;

    /* renamed from: ah */
    C0357j f1666ah = null;

    /* renamed from: c */
    public void mo1164c() {
    }

    /* renamed from: c */
    public final void m1205c(int i) {
        this.f1667ai[0] = i;
    }

    /* renamed from: d */
    public final void m1209d(int i) {
        this.f1667ai[1] = i;
    }

    /* renamed from: d */
    public final boolean m1211d() {
        return this.f1683e == 0 && this.f1639G == 0.0f && this.f1686h == 0 && this.f1687i == 0 && this.f1635C[0] == C0359l.f1709c;
    }

    /* renamed from: e */
    public final boolean m1214e() {
        return this.f1684f == 0 && this.f1639G == 0.0f && this.f1689k == 0 && this.f1690l == 0 && this.f1635C[1] == C0359l.f1709c;
    }

    /* renamed from: f */
    public void mo1216f() {
        this.f1697s.m1177h();
        this.f1698t.m1177h();
        this.f1699u.m1177h();
        this.f1700v.m1177h();
        this.f1701w.m1177h();
        this.f1702x.m1177h();
        this.f1703y.m1177h();
        this.f1704z.m1177h();
        this.f1636D = null;
        this.f1668aj = 0.0f;
        this.f1637E = 0;
        this.f1638F = 0;
        this.f1639G = 0.0f;
        this.f1640H = -1;
        this.f1641I = 0;
        this.f1642J = 0;
        this.f1669ak = 0;
        this.f1670al = 0;
        this.f1671am = 0;
        this.f1672an = 0;
        this.f1645M = 0;
        this.f1646N = 0;
        this.f1647O = 0;
        this.f1648P = 0;
        this.f1649Q = 0;
        this.f1673ao = 0;
        this.f1674ap = 0;
        this.f1650S = f1632R;
        this.f1651T = f1632R;
        this.f1635C[0] = C0359l.f1707a;
        this.f1635C[1] = C0359l.f1707a;
        this.f1675aq = null;
        this.f1676ar = 0;
        this.f1677as = 0;
        this.f1679au = null;
        this.f1652U = false;
        this.f1653V = false;
        this.f1657Z = 0;
        this.f1659aa = 0;
        this.f1660ab = false;
        this.f1661ac = false;
        this.f1662ad[0] = -1.0f;
        this.f1662ad[1] = -1.0f;
        this.f1658a = -1;
        this.f1680b = -1;
        this.f1667ai[0] = Integer.MAX_VALUE;
        this.f1667ai[1] = Integer.MAX_VALUE;
        this.f1683e = 0;
        this.f1684f = 0;
        this.f1688j = 1.0f;
        this.f1691m = 1.0f;
        this.f1687i = Integer.MAX_VALUE;
        this.f1690l = Integer.MAX_VALUE;
        this.f1686h = 0;
        this.f1689k = 0;
        this.f1694p = -1;
        this.f1695q = 1.0f;
        if (this.f1681c != null) {
            this.f1681c.mo1287b();
        }
        if (this.f1682d != null) {
            this.f1682d.mo1287b();
        }
        this.f1696r = null;
        this.f1654W = false;
        this.f1655X = false;
        this.f1656Y = false;
    }

    /* renamed from: b */
    public void mo1162b() {
        for (int i = 0; i < 6; i++) {
            this.f1633A[i].m1168a().mo1287b();
        }
    }

    /* renamed from: g */
    public final void m1217g() {
        for (int i = 0; i < 6; i++) {
            C0367t m1168a = this.f1633A[i].m1168a();
            C0352e c0352e = m1168a.f1758a.f1606c;
            if (c0352e != null) {
                if (c0352e.f1606c == m1168a.f1758a) {
                    m1168a.f1764g = 4;
                    c0352e.m1168a().f1764g = 4;
                }
                int m1173d = m1168a.f1758a.m1173d();
                if (m1168a.f1758a.f1605b == EnumC0356i.RIGHT || m1168a.f1758a.f1605b == EnumC0356i.BOTTOM) {
                    m1173d = -m1173d;
                }
                m1168a.m1289b(c0352e.m1168a(), m1173d);
            }
        }
    }

    /* renamed from: b */
    public void mo1163b(int i) {
        C0365r.m1276a(i, this);
    }

    /* renamed from: h */
    public final boolean m1220h() {
        return this.f1697s.m1168a().f1773i == 1 && this.f1699u.m1168a().f1773i == 1 && this.f1698t.m1168a().f1773i == 1 && this.f1700v.m1168a().f1773i == 1;
    }

    /* renamed from: i */
    public final C0368u m1221i() {
        if (this.f1681c == null) {
            this.f1681c = new C0368u();
        }
        return this.f1681c;
    }

    /* renamed from: j */
    public final C0368u m1223j() {
        if (this.f1682d == null) {
            this.f1682d = new C0368u();
        }
        return this.f1682d;
    }

    public C0357j() {
        this.f1634B.add(this.f1697s);
        this.f1634B.add(this.f1698t);
        this.f1634B.add(this.f1699u);
        this.f1634B.add(this.f1700v);
        this.f1634B.add(this.f1702x);
        this.f1634B.add(this.f1703y);
        this.f1634B.add(this.f1704z);
        this.f1634B.add(this.f1701w);
    }

    /* renamed from: a */
    public void mo1195a(C0374c c0374c) {
        this.f1697s.m1172c();
        this.f1698t.m1172c();
        this.f1699u.m1172c();
        this.f1700v.m1172c();
        this.f1701w.m1172c();
        this.f1704z.m1172c();
        this.f1702x.m1172c();
        this.f1703y.m1172c();
    }

    /* renamed from: b */
    public final void m1203b(boolean z) {
        this.f1692n = z;
    }

    /* renamed from: c */
    public final void m1207c(boolean z) {
        this.f1693o = z;
    }

    /* renamed from: a */
    public final void m1194a(C0357j c0357j, float f, int i) {
        m1193a(EnumC0356i.CENTER, c0357j, EnumC0356i.CENTER, i, 0);
        this.f1668aj = f;
    }

    /* renamed from: e */
    public final void m1212e(int i) {
        this.f1677as = i;
    }

    /* renamed from: k */
    public final int m1225k() {
        return this.f1677as;
    }

    /* renamed from: l */
    public final String m1227l() {
        return this.f1678at;
    }

    /* renamed from: a */
    public final void m1197a(String str) {
        this.f1678at = str;
    }

    /* renamed from: b */
    public final void m1201b(C0376e c0376e) {
        c0376e.m1331a(this.f1697s);
        c0376e.m1331a(this.f1698t);
        c0376e.m1331a(this.f1699u);
        c0376e.m1331a(this.f1700v);
        if (this.f1647O > 0) {
            c0376e.m1331a(this.f1701w);
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f1679au != null) {
            str = "type: " + this.f1679au + " ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        if (this.f1678at != null) {
            str2 = "id: " + this.f1678at + " ";
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f1641I);
        sb.append(", ");
        sb.append(this.f1642J);
        sb.append(") - (");
        sb.append(this.f1637E);
        sb.append(" x ");
        sb.append(this.f1638F);
        sb.append(") wrap: (");
        sb.append(this.f1673ao);
        sb.append(" x ");
        sb.append(this.f1674ap);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: m */
    public final int m1229m() {
        return this.f1641I;
    }

    /* renamed from: n */
    public final int m1231n() {
        return this.f1642J;
    }

    /* renamed from: o */
    public final int m1233o() {
        if (this.f1677as == 8) {
            return 0;
        }
        return this.f1637E;
    }

    /* renamed from: p */
    public final int m1235p() {
        return this.f1673ao;
    }

    /* renamed from: q */
    public final int m1237q() {
        if (this.f1677as == 8) {
            return 0;
        }
        return this.f1638F;
    }

    /* renamed from: r */
    public final int m1239r() {
        return this.f1674ap;
    }

    /* renamed from: f */
    public final int m1215f(int i) {
        if (i == 0) {
            return m1233o();
        }
        if (i == 1) {
            return m1237q();
        }
        return 0;
    }

    /* renamed from: s */
    public final int m1241s() {
        return this.f1669ak + this.f1645M;
    }

    /* renamed from: t */
    public final int m1243t() {
        return this.f1670al + this.f1646N;
    }

    /* renamed from: u */
    public final int m1245u() {
        return this.f1641I + this.f1645M;
    }

    /* renamed from: v */
    public final int m1246v() {
        return this.f1642J + this.f1646N;
    }

    /* renamed from: y */
    public final boolean m1249y() {
        return this.f1647O > 0;
    }

    /* renamed from: z */
    public final int m1250z() {
        return this.f1647O;
    }

    /* renamed from: A */
    public final Object m1181A() {
        return this.f1675aq;
    }

    /* renamed from: B */
    public ArrayList<C0352e> mo1182B() {
        return this.f1634B;
    }

    /* renamed from: g */
    public final void m1218g(int i) {
        this.f1641I = i;
    }

    /* renamed from: h */
    public final void m1219h(int i) {
        this.f1642J = i;
    }

    /* renamed from: a */
    public final void m1190a(int i, int i2) {
        this.f1641I = i;
        this.f1642J = i2;
    }

    /* renamed from: b */
    public void mo1199b(int i, int i2) {
        this.f1645M = i;
        this.f1646N = i2;
    }

    /* renamed from: C */
    public void mo1183C() {
        int i = this.f1641I;
        int i2 = this.f1642J;
        int i3 = this.f1641I + this.f1637E;
        int i4 = this.f1642J + this.f1638F;
        this.f1669ak = i;
        this.f1670al = i2;
        this.f1671am = i3 - i;
        this.f1672an = i4 - i2;
    }

    /* renamed from: i */
    public final void m1222i(int i) {
        this.f1637E = i;
        if (this.f1637E < this.f1648P) {
            this.f1637E = this.f1648P;
        }
    }

    /* renamed from: j */
    public final void m1224j(int i) {
        this.f1638F = i;
        if (this.f1638F < this.f1649Q) {
            this.f1638F = this.f1649Q;
        }
    }

    /* renamed from: a */
    public final void m1192a(int i, int i2, int i3, float f) {
        this.f1683e = i;
        this.f1686h = i2;
        this.f1687i = i3;
        this.f1688j = f;
        if (f >= 1.0f || this.f1683e != 0) {
            return;
        }
        this.f1683e = 2;
    }

    /* renamed from: b */
    public final void m1200b(int i, int i2, int i3, float f) {
        this.f1684f = i;
        this.f1689k = i2;
        this.f1690l = i3;
        this.f1691m = f;
        if (f >= 1.0f || this.f1684f != 0) {
            return;
        }
        this.f1684f = 2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:31:0x0085). Please report as a decompilation issue!!! */
    /* renamed from: b */
    public final void m1202b(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f1639G = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0 && indexOf2 < length - 1) {
            String substring2 = str.substring(i3, indexOf2);
            String substring3 = str.substring(indexOf2 + 1);
            if (substring2.length() > 0 && substring3.length() > 0) {
                float parseFloat = Float.parseFloat(substring2);
                float parseFloat2 = Float.parseFloat(substring3);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    if (i2 == 1) {
                        f = Math.abs(parseFloat2 / parseFloat);
                    } else {
                        f = Math.abs(parseFloat / parseFloat2);
                    }
                }
            }
            f = i;
        } else {
            String substring4 = str.substring(i3);
            if (substring4.length() > 0) {
                f = Float.parseFloat(substring4);
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.f1639G = f;
            this.f1640H = i2;
        }
    }

    /* renamed from: a */
    public final void m1189a(float f) {
        this.f1650S = f;
    }

    /* renamed from: b */
    public final void m1198b(float f) {
        this.f1651T = f;
    }

    /* renamed from: k */
    public final void m1226k(int i) {
        if (i < 0) {
            this.f1648P = 0;
        } else {
            this.f1648P = i;
        }
    }

    /* renamed from: l */
    public final void m1228l(int i) {
        if (i < 0) {
            this.f1649Q = 0;
        } else {
            this.f1649Q = i;
        }
    }

    /* renamed from: m */
    public final void m1230m(int i) {
        this.f1673ao = i;
    }

    /* renamed from: n */
    public final void m1232n(int i) {
        this.f1674ap = i;
    }

    /* renamed from: a */
    public final void m1191a(int i, int i2, int i3) {
        if (i3 == 0) {
            m1206c(i, i2);
        } else if (i3 == 1) {
            m1210d(i, i2);
        }
        this.f1655X = true;
    }

    /* renamed from: c */
    public final void m1206c(int i, int i2) {
        this.f1641I = i;
        this.f1637E = i2 - i;
        if (this.f1637E < this.f1648P) {
            this.f1637E = this.f1648P;
        }
    }

    /* renamed from: d */
    public final void m1210d(int i, int i2) {
        this.f1642J = i;
        this.f1638F = i2 - i;
        if (this.f1638F < this.f1649Q) {
            this.f1638F = this.f1649Q;
        }
    }

    /* renamed from: e */
    public final void m1213e(int i, int i2) {
        if (i2 == 0) {
            this.f1643K = i;
        } else if (i2 == 1) {
            this.f1644L = i;
        }
    }

    /* renamed from: o */
    public final void m1234o(int i) {
        this.f1647O = i;
    }

    /* renamed from: a */
    public final void m1196a(Object obj) {
        this.f1675aq = obj;
    }

    /* renamed from: c */
    public final void m1204c(float f) {
        this.f1662ad[0] = f;
    }

    /* renamed from: d */
    public final void m1208d(float f) {
        this.f1662ad[1] = f;
    }

    /* renamed from: p */
    public final void m1236p(int i) {
        this.f1657Z = i;
    }

    /* renamed from: q */
    public final void m1238q(int i) {
        this.f1659aa = i;
    }

    /* renamed from: a */
    public boolean mo1161a() {
        return this.f1677as != 8;
    }

    /* renamed from: a */
    public final void m1193a(EnumC0356i enumC0356i, C0357j c0357j, EnumC0356i enumC0356i2, int i, int i2) {
        mo1188a(enumC0356i).m1170a(c0357j.mo1188a(enumC0356i2), i, i2, C0355h.f1619b, 0, true);
    }

    /* renamed from: D */
    public final void m1184D() {
        int size = this.f1634B.size();
        for (int i = 0; i < size; i++) {
            this.f1634B.get(i).m1177h();
        }
    }

    /* renamed from: a */
    public C0352e mo1188a(EnumC0356i enumC0356i) {
        switch (enumC0356i) {
            case LEFT:
                return this.f1697s;
            case TOP:
                return this.f1698t;
            case RIGHT:
                return this.f1699u;
            case BOTTOM:
                return this.f1700v;
            case BASELINE:
                return this.f1701w;
            case CENTER:
                return this.f1704z;
            case CENTER_X:
                return this.f1702x;
            case CENTER_Y:
                return this.f1703y;
            case NONE:
                return null;
            default:
                throw new AssertionError(enumC0356i.name());
        }
    }

    /* renamed from: E */
    public final int m1185E() {
        return this.f1635C[0];
    }

    /* renamed from: F */
    public final int m1186F() {
        return this.f1635C[1];
    }

    /* renamed from: s */
    public final void m1242s(int i) {
        this.f1635C[0] = i;
        if (i == C0359l.f1708b) {
            m1222i(this.f1673ao);
        }
    }

    /* renamed from: t */
    public final void m1244t(int i) {
        this.f1635C[1] = i;
        if (i == C0359l.f1708b) {
            m1224j(this.f1674ap);
        }
    }

    /* renamed from: a */
    private boolean m1180a(int i) {
        int i2 = i * 2;
        if (this.f1633A[i2].f1606c == null || this.f1633A[i2].f1606c.f1606c == this.f1633A[i2]) {
            return false;
        }
        int i3 = i2 + 1;
        return this.f1633A[i3].f1606c != null && this.f1633A[i3].f1606c.f1606c == this.f1633A[i3];
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e7, code lost:            if (r38.f1694p == (-1)) goto L453;     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0385 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1159a(androidx.constraintlayout.p014a.C0376e r39) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p014a.p015a.C0357j.mo1159a(androidx.constraintlayout.a.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0323 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1179a(androidx.constraintlayout.p014a.C0376e r30, boolean r31, androidx.constraintlayout.p014a.C0382k r32, androidx.constraintlayout.p014a.C0382k r33, int r34, boolean r35, androidx.constraintlayout.p014a.p015a.C0352e r36, androidx.constraintlayout.p014a.p015a.C0352e r37, int r38, int r39, int r40, int r41, float r42, boolean r43, boolean r44, int r45, int r46, int r47, float r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p014a.p015a.C0357j.m1179a(androidx.constraintlayout.a.e, boolean, androidx.constraintlayout.a.k, androidx.constraintlayout.a.k, int, boolean, androidx.constraintlayout.a.a.e, androidx.constraintlayout.a.a.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* renamed from: G */
    public void mo1187G() {
        int m1322b = C0376e.m1322b(this.f1697s);
        int m1322b2 = C0376e.m1322b(this.f1698t);
        int m1322b3 = C0376e.m1322b(this.f1699u);
        int m1322b4 = C0376e.m1322b(this.f1700v);
        int i = m1322b4 - m1322b2;
        if (m1322b3 - m1322b < 0 || i < 0 || m1322b == Integer.MIN_VALUE || m1322b == Integer.MAX_VALUE || m1322b2 == Integer.MIN_VALUE || m1322b2 == Integer.MAX_VALUE || m1322b3 == Integer.MIN_VALUE || m1322b3 == Integer.MAX_VALUE || m1322b4 == Integer.MIN_VALUE || m1322b4 == Integer.MAX_VALUE) {
            m1322b = 0;
            m1322b2 = 0;
            m1322b3 = 0;
            m1322b4 = 0;
        }
        int i2 = m1322b3 - m1322b;
        int i3 = m1322b4 - m1322b2;
        this.f1641I = m1322b;
        this.f1642J = m1322b2;
        if (this.f1677as == 8) {
            this.f1637E = 0;
            this.f1638F = 0;
            return;
        }
        if (this.f1635C[0] == C0359l.f1707a && i2 < this.f1637E) {
            i2 = this.f1637E;
        }
        if (this.f1635C[1] == C0359l.f1707a && i3 < this.f1638F) {
            i3 = this.f1638F;
        }
        this.f1637E = i2;
        this.f1638F = i3;
        if (this.f1638F < this.f1649Q) {
            this.f1638F = this.f1649Q;
        }
        if (this.f1637E < this.f1648P) {
            this.f1637E = this.f1648P;
        }
        this.f1655X = true;
    }

    /* renamed from: w */
    public final int m1247w() {
        return this.f1641I + this.f1637E;
    }

    /* renamed from: x */
    public final int m1248x() {
        return this.f1642J + this.f1638F;
    }

    /* renamed from: r */
    public final int m1240r(int i) {
        if (i == 0) {
            return this.f1635C[0];
        }
        if (i == 1) {
            return this.f1635C[1];
        }
        return 0;
    }
}
