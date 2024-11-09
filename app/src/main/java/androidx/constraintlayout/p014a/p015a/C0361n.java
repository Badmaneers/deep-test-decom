package androidx.constraintlayout.p014a.p015a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: ConstraintWidgetGroup.java */
/* renamed from: androidx.constraintlayout.a.a.n */
/* loaded from: classes.dex */
public final class C0361n {

    /* renamed from: a */
    public List<C0357j> f1734a;

    /* renamed from: b */
    int f1735b;

    /* renamed from: c */
    int f1736c;

    /* renamed from: d */
    public boolean f1737d;

    /* renamed from: e */
    public final int[] f1738e;

    /* renamed from: f */
    List<C0357j> f1739f;

    /* renamed from: g */
    List<C0357j> f1740g;

    /* renamed from: h */
    HashSet<C0357j> f1741h;

    /* renamed from: i */
    HashSet<C0357j> f1742i;

    /* renamed from: j */
    List<C0357j> f1743j;

    /* renamed from: k */
    List<C0357j> f1744k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0361n(List<C0357j> list) {
        this.f1735b = -1;
        this.f1736c = -1;
        this.f1737d = false;
        this.f1738e = new int[]{this.f1735b, this.f1736c};
        this.f1739f = new ArrayList();
        this.f1740g = new ArrayList();
        this.f1741h = new HashSet<>();
        this.f1742i = new HashSet<>();
        this.f1743j = new ArrayList();
        this.f1744k = new ArrayList();
        this.f1734a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0361n(List<C0357j> list, byte b) {
        this.f1735b = -1;
        this.f1736c = -1;
        this.f1737d = false;
        this.f1738e = new int[]{this.f1735b, this.f1736c};
        this.f1739f = new ArrayList();
        this.f1740g = new ArrayList();
        this.f1741h = new HashSet<>();
        this.f1742i = new HashSet<>();
        this.f1743j = new ArrayList();
        this.f1744k = new ArrayList();
        this.f1734a = list;
        this.f1737d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1268a(C0357j c0357j, int i) {
        if (i == 0) {
            this.f1741h.add(c0357j);
        } else if (i == 1) {
            this.f1742i.add(c0357j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<C0357j> m1267a() {
        if (!this.f1743j.isEmpty()) {
            return this.f1743j;
        }
        int size = this.f1734a.size();
        for (int i = 0; i < size; i++) {
            C0357j c0357j = this.f1734a.get(i);
            if (!c0357j.f1654W) {
                m1266a((ArrayList<C0357j>) this.f1743j, c0357j);
            }
        }
        this.f1744k.clear();
        this.f1744k.addAll(this.f1734a);
        this.f1744k.removeAll(this.f1743j);
        return this.f1743j;
    }

    /* renamed from: a */
    private void m1266a(ArrayList<C0357j> arrayList, C0357j c0357j) {
        if (c0357j.f1656Y) {
            return;
        }
        arrayList.add(c0357j);
        c0357j.f1656Y = true;
        if (c0357j.m1220h()) {
            return;
        }
        if (c0357j instanceof C0364q) {
            C0364q c0364q = (C0364q) c0357j;
            int i = c0364q.f1756aj;
            for (int i2 = 0; i2 < i; i2++) {
                m1266a(arrayList, c0364q.f1755ai[i2]);
            }
        }
        int length = c0357j.f1633A.length;
        for (int i3 = 0; i3 < length; i3++) {
            C0352e c0352e = c0357j.f1633A[i3].f1606c;
            if (c0352e != null) {
                C0357j c0357j2 = c0352e.f1604a;
                if (c0352e != null && c0357j2 != c0357j.f1636D) {
                    m1266a(arrayList, c0357j2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m1269b() {
        int size = this.f1744k.size();
        for (int i = 0; i < size; i++) {
            m1265a(this.f1744k.get(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0056  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1265a(androidx.constraintlayout.p014a.p015a.C0357j r7) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p014a.p015a.C0361n.m1265a(androidx.constraintlayout.a.a.j):void");
    }
}
