package androidx.constraintlayout.p014a;

import com.coloros.neton.BuildConfig;

/* compiled from: ArrayRow.java */
/* renamed from: androidx.constraintlayout.a.b */
/* loaded from: classes.dex */
public class C0373b implements InterfaceC0377f {

    /* renamed from: d */
    public final C0347a f1788d;

    /* renamed from: a */
    C0382k f1785a = null;

    /* renamed from: b */
    float f1786b = 0.0f;

    /* renamed from: c */
    boolean f1787c = false;

    /* renamed from: e */
    boolean f1789e = false;

    public C0373b(C0374c c0374c) {
        this.f1788d = new C0347a(this, c0374c);
    }

    /* renamed from: a */
    public final boolean m1312a(C0382k c0382k) {
        return this.f1788d.m1144a(c0382k);
    }

    /* renamed from: a */
    public final C0373b m1307a(C0382k c0382k, C0382k c0382k2, C0382k c0382k3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1786b = i;
        }
        if (!z) {
            this.f1788d.m1142a(c0382k, -1.0f);
            this.f1788d.m1142a(c0382k2, 1.0f);
            this.f1788d.m1142a(c0382k3, 1.0f);
        } else {
            this.f1788d.m1142a(c0382k, 1.0f);
            this.f1788d.m1142a(c0382k2, -1.0f);
            this.f1788d.m1142a(c0382k3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0373b m1313b(C0382k c0382k, C0382k c0382k2, C0382k c0382k3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1786b = i;
        }
        if (!z) {
            this.f1788d.m1142a(c0382k, -1.0f);
            this.f1788d.m1142a(c0382k2, 1.0f);
            this.f1788d.m1142a(c0382k3, -1.0f);
        } else {
            this.f1788d.m1142a(c0382k, 1.0f);
            this.f1788d.m1142a(c0382k2, -1.0f);
            this.f1788d.m1142a(c0382k3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public final C0373b m1305a(float f, float f2, float f3, C0382k c0382k, C0382k c0382k2, C0382k c0382k3, C0382k c0382k4) {
        this.f1786b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f1788d.m1142a(c0382k, 1.0f);
            this.f1788d.m1142a(c0382k2, -1.0f);
            this.f1788d.m1142a(c0382k4, 1.0f);
            this.f1788d.m1142a(c0382k3, -1.0f);
        } else if (f == 0.0f) {
            this.f1788d.m1142a(c0382k, 1.0f);
            this.f1788d.m1142a(c0382k2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f1788d.m1142a(c0382k3, 1.0f);
            this.f1788d.m1142a(c0382k4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f1788d.m1142a(c0382k, 1.0f);
            this.f1788d.m1142a(c0382k2, -1.0f);
            this.f1788d.m1142a(c0382k4, f4);
            this.f1788d.m1142a(c0382k3, -f4);
        }
        return this;
    }

    /* renamed from: a */
    public final C0373b m1306a(C0376e c0376e, int i) {
        this.f1788d.m1142a(c0376e.m1330a(i), 1.0f);
        this.f1788d.m1142a(c0376e.m1330a(i), -1.0f);
        return this;
    }

    /* renamed from: a */
    public final C0373b m1308a(C0382k c0382k, C0382k c0382k2, C0382k c0382k3, C0382k c0382k4, float f) {
        this.f1788d.m1142a(c0382k, -1.0f);
        this.f1788d.m1142a(c0382k2, 1.0f);
        this.f1788d.m1142a(c0382k3, f);
        this.f1788d.m1142a(c0382k4, -f);
        return this;
    }

    /* renamed from: b */
    public final C0373b m1314b(C0382k c0382k, C0382k c0382k2, C0382k c0382k3, C0382k c0382k4, float f) {
        this.f1788d.m1142a(c0382k3, 0.5f);
        this.f1788d.m1142a(c0382k4, 0.5f);
        this.f1788d.m1142a(c0382k, -0.5f);
        this.f1788d.m1142a(c0382k2, -0.5f);
        this.f1786b = -f;
        return this;
    }

    /* renamed from: b */
    public final void m1316b(C0382k c0382k) {
        if (this.f1785a != null) {
            this.f1788d.m1142a(this.f1785a, -1.0f);
            this.f1785a = null;
        }
        float m1135a = this.f1788d.m1135a(c0382k, true) * (-1.0f);
        this.f1785a = c0382k;
        if (m1135a == 1.0f) {
            return;
        }
        this.f1786b /= m1135a;
        this.f1788d.m1139a(m1135a);
    }

    @Override // androidx.constraintlayout.p014a.InterfaceC0377f
    /* renamed from: a */
    public final C0382k mo1309a(boolean[] zArr) {
        return this.f1788d.m1137a(zArr, (C0382k) null);
    }

    @Override // androidx.constraintlayout.p014a.InterfaceC0377f
    /* renamed from: a */
    public final void mo1310a() {
        this.f1788d.m1138a();
        this.f1785a = null;
        this.f1786b = 0.0f;
    }

    @Override // androidx.constraintlayout.p014a.InterfaceC0377f
    /* renamed from: a */
    public final void mo1311a(InterfaceC0377f interfaceC0377f) {
        if (interfaceC0377f instanceof C0373b) {
            C0373b c0373b = (C0373b) interfaceC0377f;
            this.f1785a = null;
            this.f1788d.m1138a();
            for (int i = 0; i < c0373b.f1788d.f1573a; i++) {
                this.f1788d.m1143a(c0373b.f1788d.m1136a(i), c0373b.f1788d.m1145b(i), true);
            }
        }
    }

    @Override // androidx.constraintlayout.p014a.InterfaceC0377f
    /* renamed from: c */
    public void mo1317c(C0382k c0382k) {
        float f = 1.0f;
        if (c0382k.f1850c != 1) {
            if (c0382k.f1850c == 2) {
                f = 1000.0f;
            } else if (c0382k.f1850c == 3) {
                f = 1000000.0f;
            } else if (c0382k.f1850c == 4) {
                f = 1.0E9f;
            } else if (c0382k.f1850c == 5) {
                f = 1.0E12f;
            }
        }
        this.f1788d.m1142a(c0382k, f);
    }

    @Override // androidx.constraintlayout.p014a.InterfaceC0377f
    /* renamed from: b */
    public final C0382k mo1315b() {
        return this.f1785a;
    }

    public String toString() {
        String str;
        boolean z;
        String str2 = (this.f1785a == null ? BuildConfig.FLAVOR + "0" : BuildConfig.FLAVOR + this.f1785a) + " = ";
        if (this.f1786b != 0.0f) {
            str = str2 + this.f1786b;
            z = true;
        } else {
            str = str2;
            z = false;
        }
        int i = this.f1788d.f1573a;
        for (int i2 = 0; i2 < i; i2++) {
            C0382k m1136a = this.f1788d.m1136a(i2);
            if (m1136a != null) {
                float m1145b = this.f1788d.m1145b(i2);
                if (m1145b != 0.0f) {
                    String c0382k = m1136a.toString();
                    if (z) {
                        if (m1145b > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            m1145b *= -1.0f;
                        }
                    } else if (m1145b < 0.0f) {
                        str = str + "- ";
                        m1145b *= -1.0f;
                    }
                    str = m1145b == 1.0f ? str + c0382k : str + m1145b + " " + c0382k;
                    z = true;
                }
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }
}
