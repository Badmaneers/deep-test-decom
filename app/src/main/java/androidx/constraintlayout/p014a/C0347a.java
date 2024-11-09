package androidx.constraintlayout.p014a;

import com.coloros.neton.BuildConfig;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* renamed from: androidx.constraintlayout.a.a */
/* loaded from: classes.dex */
public final class C0347a {

    /* renamed from: b */
    private final C0373b f1574b;

    /* renamed from: c */
    private final C0374c f1575c;

    /* renamed from: a */
    int f1573a = 0;

    /* renamed from: d */
    private int f1576d = 8;

    /* renamed from: e */
    private C0382k f1577e = null;

    /* renamed from: f */
    private int[] f1578f = new int[this.f1576d];

    /* renamed from: g */
    private int[] f1579g = new int[this.f1576d];

    /* renamed from: h */
    private float[] f1580h = new float[this.f1576d];

    /* renamed from: i */
    private int f1581i = -1;

    /* renamed from: j */
    private int f1582j = -1;

    /* renamed from: k */
    private boolean f1583k = false;

    public C0347a(C0373b c0373b, C0374c c0374c) {
        this.f1574b = c0373b;
        this.f1575c = c0374c;
    }

    /* renamed from: a */
    public final void m1142a(C0382k c0382k, float f) {
        if (f == 0.0f) {
            m1135a(c0382k, true);
            return;
        }
        if (this.f1581i == -1) {
            this.f1581i = 0;
            this.f1580h[this.f1581i] = f;
            this.f1578f[this.f1581i] = c0382k.f1848a;
            this.f1579g[this.f1581i] = -1;
            c0382k.f1856i++;
            c0382k.m1350a(this.f1574b);
            this.f1573a++;
            if (this.f1583k) {
                return;
            }
            this.f1582j++;
            if (this.f1582j >= this.f1578f.length) {
                this.f1583k = true;
                this.f1582j = this.f1578f.length - 1;
                return;
            }
            return;
        }
        int i = this.f1581i;
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.f1573a; i3++) {
            if (this.f1578f[i] == c0382k.f1848a) {
                this.f1580h[i] = f;
                return;
            }
            if (this.f1578f[i] < c0382k.f1848a) {
                i2 = i;
            }
            i = this.f1579g[i];
        }
        int i4 = this.f1582j + 1;
        if (this.f1583k) {
            if (this.f1578f[this.f1582j] == -1) {
                i4 = this.f1582j;
            } else {
                i4 = this.f1578f.length;
            }
        }
        if (i4 >= this.f1578f.length && this.f1573a < this.f1578f.length) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.f1578f.length) {
                    break;
                }
                if (this.f1578f[i5] == -1) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
        }
        if (i4 >= this.f1578f.length) {
            i4 = this.f1578f.length;
            this.f1576d *= 2;
            this.f1583k = false;
            this.f1582j = i4 - 1;
            this.f1580h = Arrays.copyOf(this.f1580h, this.f1576d);
            this.f1578f = Arrays.copyOf(this.f1578f, this.f1576d);
            this.f1579g = Arrays.copyOf(this.f1579g, this.f1576d);
        }
        this.f1578f[i4] = c0382k.f1848a;
        this.f1580h[i4] = f;
        if (i2 != -1) {
            int[] iArr = this.f1579g;
            iArr[i4] = iArr[i2];
            this.f1579g[i2] = i4;
        } else {
            this.f1579g[i4] = this.f1581i;
            this.f1581i = i4;
        }
        c0382k.f1856i++;
        c0382k.m1350a(this.f1574b);
        this.f1573a++;
        if (!this.f1583k) {
            this.f1582j++;
        }
        if (this.f1573a >= this.f1578f.length) {
            this.f1583k = true;
        }
        if (this.f1582j >= this.f1578f.length) {
            this.f1583k = true;
            this.f1582j = this.f1578f.length - 1;
        }
    }

    /* renamed from: a */
    public final void m1143a(C0382k c0382k, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        if (this.f1581i == -1) {
            this.f1581i = 0;
            this.f1580h[this.f1581i] = f;
            this.f1578f[this.f1581i] = c0382k.f1848a;
            this.f1579g[this.f1581i] = -1;
            c0382k.f1856i++;
            c0382k.m1350a(this.f1574b);
            this.f1573a++;
            if (this.f1583k) {
                return;
            }
            this.f1582j++;
            if (this.f1582j >= this.f1578f.length) {
                this.f1583k = true;
                this.f1582j = this.f1578f.length - 1;
                return;
            }
            return;
        }
        int i = this.f1581i;
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.f1573a; i3++) {
            if (this.f1578f[i] == c0382k.f1848a) {
                float[] fArr = this.f1580h;
                fArr[i] = fArr[i] + f;
                if (this.f1580h[i] == 0.0f) {
                    if (i == this.f1581i) {
                        this.f1581i = this.f1579g[i];
                    } else {
                        int[] iArr = this.f1579g;
                        iArr[i2] = iArr[i];
                    }
                    if (z) {
                        c0382k.m1352b(this.f1574b);
                    }
                    if (this.f1583k) {
                        this.f1582j = i;
                    }
                    c0382k.f1856i--;
                    this.f1573a--;
                    return;
                }
                return;
            }
            if (this.f1578f[i] < c0382k.f1848a) {
                i2 = i;
            }
            i = this.f1579g[i];
        }
        int i4 = this.f1582j + 1;
        if (this.f1583k) {
            if (this.f1578f[this.f1582j] == -1) {
                i4 = this.f1582j;
            } else {
                i4 = this.f1578f.length;
            }
        }
        if (i4 >= this.f1578f.length && this.f1573a < this.f1578f.length) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.f1578f.length) {
                    break;
                }
                if (this.f1578f[i5] == -1) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
        }
        if (i4 >= this.f1578f.length) {
            i4 = this.f1578f.length;
            this.f1576d *= 2;
            this.f1583k = false;
            this.f1582j = i4 - 1;
            this.f1580h = Arrays.copyOf(this.f1580h, this.f1576d);
            this.f1578f = Arrays.copyOf(this.f1578f, this.f1576d);
            this.f1579g = Arrays.copyOf(this.f1579g, this.f1576d);
        }
        this.f1578f[i4] = c0382k.f1848a;
        this.f1580h[i4] = f;
        if (i2 != -1) {
            int[] iArr2 = this.f1579g;
            iArr2[i4] = iArr2[i2];
            this.f1579g[i2] = i4;
        } else {
            this.f1579g[i4] = this.f1581i;
            this.f1581i = i4;
        }
        c0382k.f1856i++;
        c0382k.m1350a(this.f1574b);
        this.f1573a++;
        if (!this.f1583k) {
            this.f1582j++;
        }
        if (this.f1582j >= this.f1578f.length) {
            this.f1583k = true;
            this.f1582j = this.f1578f.length - 1;
        }
    }

    /* renamed from: a */
    public final float m1135a(C0382k c0382k, boolean z) {
        if (this.f1577e == c0382k) {
            this.f1577e = null;
        }
        if (this.f1581i == -1) {
            return 0.0f;
        }
        int i = this.f1581i;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1573a) {
            if (this.f1578f[i] == c0382k.f1848a) {
                if (i == this.f1581i) {
                    this.f1581i = this.f1579g[i];
                } else {
                    int[] iArr = this.f1579g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0382k.m1352b(this.f1574b);
                }
                c0382k.f1856i--;
                this.f1573a--;
                this.f1578f[i] = -1;
                if (this.f1583k) {
                    this.f1582j = i;
                }
                return this.f1580h[i];
            }
            i2++;
            i3 = i;
            i = this.f1579g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void m1138a() {
        int i = this.f1581i;
        for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
            C0382k c0382k = this.f1575c.f1792c[this.f1578f[i]];
            if (c0382k != null) {
                c0382k.m1352b(this.f1574b);
            }
            i = this.f1579g[i];
        }
        this.f1581i = -1;
        this.f1582j = -1;
        this.f1583k = false;
        this.f1573a = 0;
    }

    /* renamed from: a */
    public final boolean m1144a(C0382k c0382k) {
        if (this.f1581i == -1) {
            return false;
        }
        int i = this.f1581i;
        for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
            if (this.f1578f[i] == c0382k.f1848a) {
                return true;
            }
            i = this.f1579g[i];
        }
        return false;
    }

    /* renamed from: b */
    public final void m1147b() {
        int i = this.f1581i;
        for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
            float[] fArr = this.f1580h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f1579g[i];
        }
    }

    /* renamed from: a */
    public final void m1139a(float f) {
        int i = this.f1581i;
        for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
            float[] fArr = this.f1580h;
            fArr[i] = fArr[i] / f;
            i = this.f1579g[i];
        }
    }

    /* renamed from: c */
    private static boolean m1134c(C0382k c0382k) {
        return c0382k.f1856i <= 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.constraintlayout.p014a.C0382k m1148c() {
        /*
            r14 = this;
            int r0 = r14.f1581i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r6 = r2
            r8 = r6
            r5 = r3
            r7 = r5
        La:
            r9 = -1
            if (r0 == r9) goto L9c
            int r9 = r14.f1573a
            if (r2 >= r9) goto L9c
            float[] r9 = r14.f1580h
            r9 = r9[r0]
            androidx.constraintlayout.a.c r10 = r14.f1575c
            androidx.constraintlayout.a.k[] r10 = r10.f1792c
            int[] r11 = r14.f1578f
            r11 = r11[r0]
            r10 = r10[r11]
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L35
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 <= 0) goto L46
            float[] r9 = r14.f1580h
            r9[r0] = r3
            androidx.constraintlayout.a.b r9 = r14.f1574b
            r10.m1352b(r9)
        L33:
            r9 = r3
            goto L46
        L35:
            r11 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L46
            float[] r9 = r14.f1580h
            r9[r0] = r3
            androidx.constraintlayout.a.b r9 = r14.f1574b
            r10.m1352b(r9)
            goto L33
        L46:
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r12 = 1
            if (r11 == 0) goto L94
            int r11 = r10.f1853f
            int r13 = androidx.constraintlayout.p014a.C0383l.f1858a
            if (r11 != r13) goto L70
            if (r1 != 0) goto L5b
            boolean r1 = m1134c(r10)
        L57:
            r6 = r1
            r5 = r9
            r1 = r10
            goto L94
        L5b:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L64
            boolean r1 = m1134c(r10)
            goto L57
        L64:
            if (r6 != 0) goto L94
            boolean r11 = m1134c(r10)
            if (r11 == 0) goto L94
            r5 = r9
            r1 = r10
            r6 = r12
            goto L94
        L70:
            if (r1 != 0) goto L94
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L94
            if (r4 != 0) goto L80
            boolean r4 = m1134c(r10)
        L7c:
            r8 = r4
            r7 = r9
            r4 = r10
            goto L94
        L80:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L89
            boolean r4 = m1134c(r10)
            goto L7c
        L89:
            if (r8 != 0) goto L94
            boolean r11 = m1134c(r10)
            if (r11 == 0) goto L94
            r7 = r9
            r4 = r10
            r8 = r12
        L94:
            int[] r9 = r14.f1579g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto La
        L9c:
            if (r1 == 0) goto L9f
            return r1
        L9f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p014a.C0347a.m1148c():androidx.constraintlayout.a.k");
    }

    /* renamed from: a */
    public final void m1140a(C0373b c0373b, C0373b c0373b2) {
        int i = this.f1581i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
                if (this.f1578f[i] == c0373b2.f1785a.f1848a) {
                    float f = this.f1580h[i];
                    m1135a(c0373b2.f1785a, false);
                    C0347a c0347a = c0373b2.f1788d;
                    int i3 = c0347a.f1581i;
                    for (int i4 = 0; i3 != -1 && i4 < c0347a.f1573a; i4++) {
                        m1143a(this.f1575c.f1792c[c0347a.f1578f[i3]], c0347a.f1580h[i3] * f, false);
                        i3 = c0347a.f1579g[i3];
                    }
                    c0373b.f1786b += c0373b2.f1786b * f;
                    i = this.f1581i;
                } else {
                    i = this.f1579g[i];
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void m1141a(C0373b c0373b, C0373b[] c0373bArr) {
        int i = this.f1581i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
                C0382k c0382k = this.f1575c.f1792c[this.f1578f[i]];
                if (c0382k.f1849b != -1) {
                    float f = this.f1580h[i];
                    m1135a(c0382k, true);
                    C0373b c0373b2 = c0373bArr[c0382k.f1849b];
                    if (!c0373b2.f1789e) {
                        C0347a c0347a = c0373b2.f1788d;
                        int i3 = c0347a.f1581i;
                        for (int i4 = 0; i3 != -1 && i4 < c0347a.f1573a; i4++) {
                            m1143a(this.f1575c.f1792c[c0347a.f1578f[i3]], c0347a.f1580h[i3] * f, true);
                            i3 = c0347a.f1579g[i3];
                        }
                    }
                    c0373b.f1786b += c0373b2.f1786b * f;
                    c0373b2.f1785a.m1352b(c0373b);
                    i = this.f1581i;
                } else {
                    i = this.f1579g[i];
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final C0382k m1137a(boolean[] zArr, C0382k c0382k) {
        int i = this.f1581i;
        C0382k c0382k2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
            if (this.f1580h[i] < 0.0f) {
                C0382k c0382k3 = this.f1575c.f1792c[this.f1578f[i]];
                if ((zArr == null || !zArr[c0382k3.f1848a]) && c0382k3 != c0382k && (c0382k3.f1853f == C0383l.f1860c || c0382k3.f1853f == C0383l.f1861d)) {
                    float f2 = this.f1580h[i];
                    if (f2 < f) {
                        c0382k2 = c0382k3;
                        f = f2;
                    }
                }
            }
            i = this.f1579g[i];
        }
        return c0382k2;
    }

    /* renamed from: a */
    public final C0382k m1136a(int i) {
        int i2 = this.f1581i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1573a; i3++) {
            if (i3 == i) {
                return this.f1575c.f1792c[this.f1578f[i2]];
            }
            i2 = this.f1579g[i2];
        }
        return null;
    }

    /* renamed from: b */
    public final float m1145b(int i) {
        int i2 = this.f1581i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1573a; i3++) {
            if (i3 == i) {
                return this.f1580h[i2];
            }
            i2 = this.f1579g[i2];
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float m1146b(C0382k c0382k) {
        int i = this.f1581i;
        for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
            if (this.f1578f[i] == c0382k.f1848a) {
                return this.f1580h[i];
            }
            i = this.f1579g[i];
        }
        return 0.0f;
    }

    public final String toString() {
        String str = BuildConfig.FLAVOR;
        int i = this.f1581i;
        for (int i2 = 0; i != -1 && i2 < this.f1573a; i2++) {
            str = ((str + " -> ") + this.f1580h[i] + " : ") + this.f1575c.f1792c[this.f1578f[i]];
            i = this.f1579g[i];
        }
        return str;
    }
}
