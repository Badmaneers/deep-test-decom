package com.coloros.anim.p056c.p059c;

import com.coloros.anim.C1638a;
import com.coloros.anim.p056c.p057a.C1704b;
import com.coloros.anim.p056c.p057a.C1712j;
import com.coloros.anim.p056c.p057a.C1713k;
import com.coloros.anim.p056c.p057a.C1714l;
import com.coloros.anim.p056c.p058b.C1724g;
import com.coloros.anim.p056c.p058b.InterfaceC1719b;
import com.coloros.anim.p063g.C1815c;
import com.coloros.neton.BuildConfig;
import java.util.List;
import java.util.Locale;

/* compiled from: Layer.java */
/* renamed from: com.coloros.anim.c.c.g */
/* loaded from: classes.dex */
public final class C1749g {

    /* renamed from: a */
    private final List<InterfaceC1719b> f8281a;

    /* renamed from: b */
    private final C1638a f8282b;

    /* renamed from: c */
    private final String f8283c;

    /* renamed from: d */
    private final long f8284d;

    /* renamed from: e */
    private final EnumC1750h f8285e;

    /* renamed from: f */
    private final long f8286f;

    /* renamed from: g */
    private final String f8287g;

    /* renamed from: h */
    private final List<C1724g> f8288h;

    /* renamed from: i */
    private final C1714l f8289i;

    /* renamed from: j */
    private final int f8290j;

    /* renamed from: k */
    private final int f8291k;

    /* renamed from: l */
    private final int f8292l;

    /* renamed from: m */
    private final float f8293m;

    /* renamed from: n */
    private final float f8294n;

    /* renamed from: o */
    private final int f8295o;

    /* renamed from: p */
    private final int f8296p;

    /* renamed from: q */
    private final C1712j f8297q;

    /* renamed from: r */
    private final C1713k f8298r;

    /* renamed from: s */
    private final C1704b f8299s;

    /* renamed from: t */
    private final List<C1815c<Float>> f8300t;

    /* renamed from: u */
    private final EnumC1751i f8301u;

    /* renamed from: v */
    private final boolean f8302v;

    public C1749g(List<InterfaceC1719b> list, C1638a c1638a, String str, long j, EnumC1750h enumC1750h, long j2, String str2, List<C1724g> list2, C1714l c1714l, int i, int i2, int i3, float f, float f2, int i4, int i5, C1712j c1712j, C1713k c1713k, List<C1815c<Float>> list3, EnumC1751i enumC1751i, C1704b c1704b, boolean z) {
        this.f8281a = list;
        this.f8282b = c1638a;
        this.f8283c = str;
        this.f8284d = j;
        this.f8285e = enumC1750h;
        this.f8286f = j2;
        this.f8287g = str2;
        this.f8288h = list2;
        this.f8289i = c1714l;
        this.f8290j = i;
        this.f8291k = i2;
        this.f8292l = i3;
        this.f8293m = f;
        this.f8294n = f2;
        this.f8295o = i4;
        this.f8296p = i5;
        this.f8297q = c1712j;
        this.f8298r = c1713k;
        this.f8300t = list3;
        this.f8301u = enumC1751i;
        this.f8299s = c1704b;
        this.f8302v = z;
    }

    /* renamed from: a */
    public final C1638a m5755a() {
        return this.f8282b;
    }

    /* renamed from: b */
    public final float m5757b() {
        return this.f8293m;
    }

    /* renamed from: c */
    public final float m5758c() {
        return this.f8294n / this.f8282b.m5478n();
    }

    /* renamed from: d */
    public final List<C1815c<Float>> m5759d() {
        return this.f8300t;
    }

    /* renamed from: e */
    public final long m5760e() {
        return this.f8284d;
    }

    /* renamed from: f */
    public final String m5761f() {
        return this.f8283c;
    }

    /* renamed from: g */
    public final String m5762g() {
        return this.f8287g;
    }

    /* renamed from: h */
    public final int m5763h() {
        return this.f8295o;
    }

    /* renamed from: i */
    public final int m5764i() {
        return this.f8296p;
    }

    /* renamed from: j */
    public final List<C1724g> m5765j() {
        return this.f8288h;
    }

    /* renamed from: k */
    public final EnumC1750h m5766k() {
        return this.f8285e;
    }

    /* renamed from: l */
    public final EnumC1751i m5767l() {
        return this.f8301u;
    }

    /* renamed from: m */
    public final long m5768m() {
        return this.f8286f;
    }

    /* renamed from: n */
    public final List<InterfaceC1719b> m5769n() {
        return this.f8281a;
    }

    /* renamed from: o */
    public final C1714l m5770o() {
        return this.f8289i;
    }

    /* renamed from: p */
    public final int m5771p() {
        return this.f8292l;
    }

    /* renamed from: q */
    public final int m5772q() {
        return this.f8291k;
    }

    /* renamed from: r */
    public final int m5773r() {
        return this.f8290j;
    }

    /* renamed from: s */
    public final C1712j m5774s() {
        return this.f8297q;
    }

    /* renamed from: t */
    public final C1713k m5775t() {
        return this.f8298r;
    }

    /* renamed from: u */
    public final C1704b m5776u() {
        return this.f8299s;
    }

    public final String toString() {
        return m5756a(BuildConfig.FLAVOR);
    }

    /* renamed from: v */
    public final boolean m5777v() {
        return this.f8302v;
    }

    /* renamed from: a */
    public final String m5756a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f8283c);
        sb.append("\n");
        C1749g m5458a = this.f8282b.m5458a(this.f8286f);
        if (m5458a != null) {
            sb.append("\t\tParents: ");
            sb.append(m5458a.f8283c);
            C1749g m5458a2 = this.f8282b.m5458a(m5458a.f8286f);
            while (m5458a2 != null) {
                sb.append("->");
                sb.append(m5458a2.f8283c);
                m5458a2 = this.f8282b.m5458a(m5458a2.f8286f);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.f8288h.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.f8288h.size());
            sb.append("\n");
        }
        if (this.f8290j != 0 && this.f8291k != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.f8290j), Integer.valueOf(this.f8291k), Integer.valueOf(this.f8292l)));
        }
        if (!this.f8281a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (InterfaceC1719b interfaceC1719b : this.f8281a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(interfaceC1719b);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
