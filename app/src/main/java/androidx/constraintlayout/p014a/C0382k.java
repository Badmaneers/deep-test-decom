package androidx.constraintlayout.p014a;

import com.coloros.neton.BuildConfig;
import java.util.Arrays;

/* compiled from: SolverVariable.java */
/* renamed from: androidx.constraintlayout.a.k */
/* loaded from: classes.dex */
public final class C0382k {

    /* renamed from: j */
    private static int f1843j = 1;

    /* renamed from: k */
    private static int f1844k = 1;

    /* renamed from: l */
    private static int f1845l = 1;

    /* renamed from: m */
    private static int f1846m = 1;

    /* renamed from: n */
    private static int f1847n = 1;

    /* renamed from: d */
    public float f1851d;

    /* renamed from: f */
    int f1853f;

    /* renamed from: o */
    private String f1857o;

    /* renamed from: a */
    public int f1848a = -1;

    /* renamed from: b */
    int f1849b = -1;

    /* renamed from: c */
    public int f1850c = 0;

    /* renamed from: e */
    float[] f1852e = new float[7];

    /* renamed from: g */
    C0373b[] f1854g = new C0373b[8];

    /* renamed from: h */
    int f1855h = 0;

    /* renamed from: i */
    public int f1856i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1349a() {
        f1844k++;
    }

    public C0382k(int i) {
        this.f1853f = i;
    }

    /* renamed from: a */
    public final void m1350a(C0373b c0373b) {
        for (int i = 0; i < this.f1855h; i++) {
            if (this.f1854g[i] == c0373b) {
                return;
            }
        }
        if (this.f1855h >= this.f1854g.length) {
            this.f1854g = (C0373b[]) Arrays.copyOf(this.f1854g, this.f1854g.length * 2);
        }
        this.f1854g[this.f1855h] = c0373b;
        this.f1855h++;
    }

    /* renamed from: b */
    public final void m1352b(C0373b c0373b) {
        int i = this.f1855h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1854g[i2] == c0373b) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.f1854g[i4] = this.f1854g[i4 + 1];
                }
                this.f1855h--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m1353c(C0373b c0373b) {
        int i = this.f1855h;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1854g[i2].f1788d.m1140a(this.f1854g[i2], c0373b);
        }
        this.f1855h = 0;
    }

    /* renamed from: b */
    public final void m1351b() {
        this.f1857o = null;
        this.f1853f = C0383l.f1862e;
        this.f1850c = 0;
        this.f1848a = -1;
        this.f1849b = -1;
        this.f1851d = 0.0f;
        this.f1855h = 0;
        this.f1856i = 0;
    }

    public final String toString() {
        return BuildConfig.FLAVOR + this.f1857o;
    }
}
