package androidx.constraintlayout.p014a.p015a;

import androidx.constraintlayout.p014a.C0376e;
import androidx.constraintlayout.p014a.C0382k;
import java.util.ArrayList;

/* compiled from: Barrier.java */
/* renamed from: androidx.constraintlayout.a.a.b */
/* loaded from: classes.dex */
public final class C0349b extends C0364q {

    /* renamed from: ak */
    private int f1584ak = 0;

    /* renamed from: al */
    private ArrayList<C0367t> f1585al = new ArrayList<>(4);

    /* renamed from: am */
    private boolean f1586am = true;

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: a */
    public final boolean mo1161a() {
        return true;
    }

    /* renamed from: a */
    public final void m1158a(int i) {
        this.f1584ak = i;
    }

    /* renamed from: a */
    public final void m1160a(boolean z) {
        this.f1586am = z;
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: b */
    public final void mo1162b() {
        super.mo1162b();
        this.f1585al.clear();
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: b */
    public final void mo1163b(int i) {
        C0367t m1168a;
        C0367t m1168a2;
        if (this.f1636D != null && ((C0360m) this.f1636D).m1264u(2)) {
            switch (this.f1584ak) {
                case 0:
                    m1168a = this.f1697s.m1168a();
                    break;
                case 1:
                    m1168a = this.f1699u.m1168a();
                    break;
                case 2:
                    m1168a = this.f1698t.m1168a();
                    break;
                case 3:
                    m1168a = this.f1700v.m1168a();
                    break;
                default:
                    return;
            }
            m1168a.f1764g = 5;
            if (this.f1584ak == 0 || this.f1584ak == 1) {
                this.f1698t.m1168a().m1283a((C0367t) null, 0.0f);
                this.f1700v.m1168a().m1283a((C0367t) null, 0.0f);
            } else {
                this.f1697s.m1168a().m1283a((C0367t) null, 0.0f);
                this.f1699u.m1168a().m1283a((C0367t) null, 0.0f);
            }
            this.f1585al.clear();
            for (int i2 = 0; i2 < this.f1756aj; i2++) {
                C0357j c0357j = this.f1755ai[i2];
                if (this.f1586am || c0357j.mo1161a()) {
                    switch (this.f1584ak) {
                        case 0:
                            m1168a2 = c0357j.f1697s.m1168a();
                            break;
                        case 1:
                            m1168a2 = c0357j.f1699u.m1168a();
                            break;
                        case 2:
                            m1168a2 = c0357j.f1698t.m1168a();
                            break;
                        case 3:
                            m1168a2 = c0357j.f1700v.m1168a();
                            break;
                        default:
                            m1168a2 = null;
                            break;
                    }
                    if (m1168a2 != null) {
                        this.f1585al.add(m1168a2);
                        m1168a2.m1294a(m1168a);
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1164c() {
        /*
            r8 = this;
            int r0 = r8.f1584ak
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 0
            switch(r0) {
                case 0: goto L20;
                case 1: goto L18;
                case 2: goto L11;
                case 3: goto La;
                default: goto L9;
            }
        L9:
            return
        La:
            androidx.constraintlayout.a.a.e r0 = r8.f1700v
            androidx.constraintlayout.a.a.t r0 = r0.m1168a()
            goto L1e
        L11:
            androidx.constraintlayout.a.a.e r0 = r8.f1698t
            androidx.constraintlayout.a.a.t r0 = r0.m1168a()
            goto L26
        L18:
            androidx.constraintlayout.a.a.e r0 = r8.f1699u
            androidx.constraintlayout.a.a.t r0 = r0.m1168a()
        L1e:
            r1 = r2
            goto L26
        L20:
            androidx.constraintlayout.a.a.e r0 = r8.f1697s
            androidx.constraintlayout.a.a.t r0 = r0.m1168a()
        L26:
            java.util.ArrayList<androidx.constraintlayout.a.a.t> r2 = r8.f1585al
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L2e:
            if (r4 >= r2) goto L60
            java.util.ArrayList<androidx.constraintlayout.a.a.t> r5 = r8.f1585al
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.a.a.t r5 = (androidx.constraintlayout.p014a.p015a.C0367t) r5
            int r6 = r5.f1773i
            r7 = 1
            if (r6 == r7) goto L3e
            return
        L3e:
            int r6 = r8.f1584ak
            if (r6 == 0) goto L53
            int r6 = r8.f1584ak
            r7 = 2
            if (r6 != r7) goto L48
            goto L53
        L48:
            float r6 = r5.f1763f
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L5d
            float r1 = r5.f1763f
            androidx.constraintlayout.a.a.t r3 = r5.f1762e
            goto L5d
        L53:
            float r6 = r5.f1763f
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L5d
            float r1 = r5.f1763f
            androidx.constraintlayout.a.a.t r3 = r5.f1762e
        L5d:
            int r4 = r4 + 1
            goto L2e
        L60:
            androidx.constraintlayout.a.g r2 = androidx.constraintlayout.p014a.C0376e.m1320a()
            if (r2 == 0) goto L71
            androidx.constraintlayout.a.g r2 = androidx.constraintlayout.p014a.C0376e.m1320a()
            long r4 = r2.f1840z
            r6 = 1
            long r4 = r4 + r6
            r2.f1840z = r4
        L71:
            r0.f1762e = r3
            r0.f1763f = r1
            r0.m1296e()
            int r0 = r8.f1584ak
            switch(r0) {
                case 0: goto L9c;
                case 1: goto L92;
                case 2: goto L88;
                case 3: goto L7e;
                default: goto L7d;
            }
        L7d:
            return
        L7e:
            androidx.constraintlayout.a.a.e r8 = r8.f1698t
            androidx.constraintlayout.a.a.t r8 = r8.m1168a()
            r8.m1283a(r3, r1)
            return
        L88:
            androidx.constraintlayout.a.a.e r8 = r8.f1700v
            androidx.constraintlayout.a.a.t r8 = r8.m1168a()
            r8.m1283a(r3, r1)
            return
        L92:
            androidx.constraintlayout.a.a.e r8 = r8.f1697s
            androidx.constraintlayout.a.a.t r8 = r8.m1168a()
            r8.m1283a(r3, r1)
            return
        L9c:
            androidx.constraintlayout.a.a.e r8 = r8.f1699u
            androidx.constraintlayout.a.a.t r8 = r8.m1168a()
            r8.m1283a(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p014a.p015a.C0349b.mo1164c():void");
    }

    @Override // androidx.constraintlayout.p014a.p015a.C0357j
    /* renamed from: a */
    public final void mo1159a(C0376e c0376e) {
        boolean z;
        this.f1633A[0] = this.f1697s;
        this.f1633A[2] = this.f1698t;
        this.f1633A[1] = this.f1699u;
        this.f1633A[3] = this.f1700v;
        for (int i = 0; i < this.f1633A.length; i++) {
            this.f1633A[i].f1609f = c0376e.m1331a(this.f1633A[i]);
        }
        if (this.f1584ak < 0 || this.f1584ak >= 4) {
            return;
        }
        C0352e c0352e = this.f1633A[this.f1584ak];
        for (int i2 = 0; i2 < this.f1756aj; i2++) {
            C0357j c0357j = this.f1755ai[i2];
            if ((this.f1586am || c0357j.mo1161a()) && (((this.f1584ak == 0 || this.f1584ak == 1) && c0357j.m1185E() == C0359l.f1709c) || ((this.f1584ak == 2 || this.f1584ak == 3) && c0357j.m1186F() == C0359l.f1709c))) {
                z = true;
                break;
            }
        }
        z = false;
        if (this.f1584ak == 0 || this.f1584ak == 1 ? this.f1636D.m1185E() == C0359l.f1708b : this.f1636D.m1186F() == C0359l.f1708b) {
            z = false;
        }
        for (int i3 = 0; i3 < this.f1756aj; i3++) {
            C0357j c0357j2 = this.f1755ai[i3];
            if (this.f1586am || c0357j2.mo1161a()) {
                C0382k m1331a = c0376e.m1331a(c0357j2.f1633A[this.f1584ak]);
                c0357j2.f1633A[this.f1584ak].f1609f = m1331a;
                if (this.f1584ak == 0 || this.f1584ak == 2) {
                    c0376e.m1341b(c0352e.f1609f, m1331a, z);
                } else {
                    c0376e.m1338a(c0352e.f1609f, m1331a, z);
                }
            }
        }
        if (this.f1584ak == 0) {
            c0376e.m1343c(this.f1699u.f1609f, this.f1697s.f1609f, 0, 6);
            if (z) {
                return;
            }
            c0376e.m1343c(this.f1697s.f1609f, this.f1636D.f1699u.f1609f, 0, 5);
            return;
        }
        if (this.f1584ak == 1) {
            c0376e.m1343c(this.f1697s.f1609f, this.f1699u.f1609f, 0, 6);
            if (z) {
                return;
            }
            c0376e.m1343c(this.f1697s.f1609f, this.f1636D.f1697s.f1609f, 0, 5);
            return;
        }
        if (this.f1584ak == 2) {
            c0376e.m1343c(this.f1700v.f1609f, this.f1698t.f1609f, 0, 6);
            if (z) {
                return;
            }
            c0376e.m1343c(this.f1698t.f1609f, this.f1636D.f1700v.f1609f, 0, 5);
            return;
        }
        if (this.f1584ak == 3) {
            c0376e.m1343c(this.f1698t.f1609f, this.f1700v.f1609f, 0, 6);
            if (z) {
                return;
            }
            c0376e.m1343c(this.f1698t.f1609f, this.f1636D.f1698t.f1609f, 0, 5);
        }
    }
}
