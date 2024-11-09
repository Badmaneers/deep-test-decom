package androidx.constraintlayout.p014a.p015a;

import androidx.constraintlayout.p014a.C0382k;
import androidx.constraintlayout.p014a.C0383l;

/* compiled from: ConstraintAnchor.java */
/* renamed from: androidx.constraintlayout.a.a.e */
/* loaded from: classes.dex */
public final class C0352e {

    /* renamed from: a */
    final C0357j f1604a;

    /* renamed from: b */
    final EnumC0356i f1605b;

    /* renamed from: c */
    C0352e f1606c;

    /* renamed from: f */
    C0382k f1609f;

    /* renamed from: g */
    private C0367t f1610g = new C0367t(this);

    /* renamed from: d */
    public int f1607d = 0;

    /* renamed from: e */
    int f1608e = -1;

    /* renamed from: h */
    private int f1611h = C0355h.f1618a;

    /* renamed from: i */
    private int f1612i = C0354g.f1615a;

    /* renamed from: j */
    private int f1613j = 0;

    /* renamed from: a */
    public final C0367t m1168a() {
        return this.f1610g;
    }

    public C0352e(C0357j c0357j, EnumC0356i enumC0356i) {
        this.f1604a = c0357j;
        this.f1605b = enumC0356i;
    }

    /* renamed from: b */
    public final C0382k m1171b() {
        return this.f1609f;
    }

    /* renamed from: c */
    public final void m1172c() {
        if (this.f1609f == null) {
            this.f1609f = new C0382k(C0383l.f1858a);
        } else {
            this.f1609f.m1351b();
        }
    }

    /* renamed from: d */
    public final int m1173d() {
        if (this.f1604a.m1225k() == 8) {
            return 0;
        }
        if (this.f1608e >= 0 && this.f1606c != null && this.f1606c.f1604a.m1225k() == 8) {
            return this.f1608e;
        }
        return this.f1607d;
    }

    /* renamed from: e */
    public final int m1174e() {
        return this.f1611h;
    }

    /* renamed from: f */
    public final C0352e m1175f() {
        return this.f1606c;
    }

    /* renamed from: g */
    public final int m1176g() {
        return this.f1613j;
    }

    /* renamed from: h */
    public final void m1177h() {
        this.f1606c = null;
        this.f1607d = 0;
        this.f1608e = -1;
        this.f1611h = C0355h.f1619b;
        this.f1613j = 0;
        this.f1612i = C0354g.f1615a;
        this.f1610g.mo1287b();
    }

    /* renamed from: a */
    public final boolean m1169a(C0352e c0352e, int i, int i2, int i3) {
        return m1170a(c0352e, i, -1, i2, i3, false);
    }

    /* renamed from: a */
    public final boolean m1170a(C0352e c0352e, int i, int i2, int i3, int i4, boolean z) {
        if (c0352e == null) {
            this.f1606c = null;
            this.f1607d = 0;
            this.f1608e = -1;
            this.f1611h = C0355h.f1618a;
            this.f1613j = 2;
            return true;
        }
        if (!z && !m1167a(c0352e)) {
            return false;
        }
        this.f1606c = c0352e;
        if (i > 0) {
            this.f1607d = i;
        } else {
            this.f1607d = 0;
        }
        this.f1608e = i2;
        this.f1611h = i3;
        this.f1613j = i4;
        return true;
    }

    /* renamed from: i */
    public final boolean m1178i() {
        return this.f1606c != null;
    }

    public final String toString() {
        return this.f1604a.m1227l() + ":" + this.f1605b.toString();
    }

    /* renamed from: a */
    private boolean m1167a(C0352e c0352e) {
        if (c0352e == null) {
            return false;
        }
        EnumC0356i enumC0356i = c0352e.f1605b;
        if (enumC0356i == this.f1605b) {
            return this.f1605b != EnumC0356i.BASELINE || (c0352e.f1604a.m1249y() && this.f1604a.m1249y());
        }
        switch (this.f1605b) {
            case CENTER:
                return (enumC0356i == EnumC0356i.BASELINE || enumC0356i == EnumC0356i.CENTER_X || enumC0356i == EnumC0356i.CENTER_Y) ? false : true;
            case LEFT:
            case RIGHT:
                boolean z = enumC0356i == EnumC0356i.LEFT || enumC0356i == EnumC0356i.RIGHT;
                return c0352e.f1604a instanceof C0362o ? z || enumC0356i == EnumC0356i.CENTER_X : z;
            case TOP:
            case BOTTOM:
                boolean z2 = enumC0356i == EnumC0356i.TOP || enumC0356i == EnumC0356i.BOTTOM;
                return c0352e.f1604a instanceof C0362o ? z2 || enumC0356i == EnumC0356i.CENTER_Y : z2;
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            default:
                throw new AssertionError(this.f1605b.name());
        }
    }
}
