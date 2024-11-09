package androidx.constraintlayout.p014a.p015a;

import androidx.constraintlayout.p014a.C0376e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: ConstraintWidgetContainer.java */
/* renamed from: androidx.constraintlayout.a.a.m */
/* loaded from: classes.dex */
public final class C0360m extends C0372y {

    /* renamed from: aB */
    private C0370w f1713aB;

    /* renamed from: aj */
    int f1718aj;

    /* renamed from: ak */
    int f1719ak;

    /* renamed from: al */
    int f1720al;

    /* renamed from: am */
    int f1721am;

    /* renamed from: aA */
    private boolean f1712aA = false;

    /* renamed from: ai */
    protected C0376e f1717ai = new C0376e();

    /* renamed from: an */
    int f1722an = 0;

    /* renamed from: ao */
    int f1723ao = 0;

    /* renamed from: ap */
    C0351d[] f1724ap = new C0351d[4];

    /* renamed from: aq */
    C0351d[] f1725aq = new C0351d[4];

    /* renamed from: ar */
    public List<C0361n> f1726ar = new ArrayList();

    /* renamed from: as */
    public boolean f1727as = false;

    /* renamed from: at */
    public boolean f1728at = false;

    /* renamed from: au */
    public boolean f1729au = false;

    /* renamed from: av */
    public int f1730av = 0;

    /* renamed from: aw */
    public int f1731aw = 0;

    /* renamed from: aC */
    private int f1714aC = 7;

    /* renamed from: ax */
    public boolean f1732ax = false;

    /* renamed from: aD */
    private boolean f1715aD = false;

    /* renamed from: aE */
    private boolean f1716aE = false;

    /* renamed from: ay */
    int f1733ay = 0;

    /* renamed from: a */
    public final void m1260a(int i) {
        this.f1714aC = i;
    }

    /* renamed from: H */
    public final int m1254H() {
        return this.f1714aC;
    }

    /* renamed from: u */
    public final boolean m1264u(int i) {
        return (this.f1714aC & i) == i;
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0372y, androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: f */
    public final void mo1216f() {
        this.f1717ai.m1339b();
        this.f1718aj = 0;
        this.f1720al = 0;
        this.f1719ak = 0;
        this.f1721am = 0;
        this.f1726ar.clear();
        this.f1732ax = false;
        super.mo1216f();
    }

    /* renamed from: I */
    public final boolean m1255I() {
        return this.f1715aD;
    }

    /* renamed from: J */
    public final boolean m1256J() {
        return this.f1716aE;
    }

    /* renamed from: a */
    public final void m1262a(boolean z) {
        this.f1712aA = z;
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: b */
    public final void mo1163b(int i) {
        super.mo1163b(i);
        int size = this.f1784az.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1784az.get(i2).mo1163b(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02be A[LOOP:5: B:96:0x02bc->B:97:0x02be, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.constraintlayout.a.a.j] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.constraintlayout.a.a.j] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // androidx.constraintlayout.p014a.p015a.C0372y
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1257K() {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p014a.p015a.C0360m.mo1257K():void");
    }

    /* renamed from: L */
    public final void m1258L() {
        m1252O();
        mo1163b(this.f1714aC);
    }

    /* renamed from: M */
    public final void m1259M() {
        C0367t m1168a = mo1188a(EnumC0356i.LEFT).m1168a();
        C0367t m1168a2 = mo1188a(EnumC0356i.TOP).m1168a();
        m1168a.m1283a((C0367t) null, 0.0f);
        m1168a2.m1283a((C0367t) null, 0.0f);
    }

    /* renamed from: f */
    public final void m1263f(int i, int i2) {
        if (this.f1635C[0] != C0359l.f1708b && this.f1681c != null) {
            this.f1681c.m1292a(i);
        }
        if (this.f1635C[1] == C0359l.f1708b || this.f1682d == null) {
            return;
        }
        this.f1682d.m1292a(i2);
    }

    /* renamed from: O */
    private void m1252O() {
        int size = this.f1784az.size();
        mo1162b();
        for (int i = 0; i < size; i++) {
            this.f1784az.get(i).mo1162b();
        }
    }

    /* renamed from: P */
    private void m1253P() {
        this.f1722an = 0;
        this.f1723ao = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1261a(C0357j c0357j, int i) {
        if (i == 0) {
            if (this.f1722an + 1 >= this.f1725aq.length) {
                this.f1725aq = (C0351d[]) Arrays.copyOf(this.f1725aq, this.f1725aq.length * 2);
            }
            this.f1725aq[this.f1722an] = new C0351d(c0357j, 0, this.f1712aA);
            this.f1722an++;
            return;
        }
        if (i == 1) {
            if (this.f1723ao + 1 >= this.f1724ap.length) {
                this.f1724ap = (C0351d[]) Arrays.copyOf(this.f1724ap, this.f1724ap.length * 2);
            }
            this.f1724ap[this.f1723ao] = new C0351d(c0357j, 1, this.f1712aA);
            this.f1723ao++;
        }
    }
}
