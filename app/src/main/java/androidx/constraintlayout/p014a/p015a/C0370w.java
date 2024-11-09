package androidx.constraintlayout.p014a.p015a;

import java.util.ArrayList;

/* compiled from: Snapshot.java */
/* renamed from: androidx.constraintlayout.a.a.w */
/* loaded from: classes.dex */
public final class C0370w {

    /* renamed from: a */
    private int f1774a;

    /* renamed from: b */
    private int f1775b;

    /* renamed from: c */
    private int f1776c;

    /* renamed from: d */
    private int f1777d;

    /* renamed from: e */
    private ArrayList<C0371x> f1778e = new ArrayList<>();

    public C0370w(C0357j c0357j) {
        this.f1774a = c0357j.m1229m();
        this.f1775b = c0357j.m1231n();
        this.f1776c = c0357j.m1233o();
        this.f1777d = c0357j.m1237q();
        ArrayList<C0352e> mo1182B = c0357j.mo1182B();
        int size = mo1182B.size();
        for (int i = 0; i < size; i++) {
            this.f1778e.add(new C0371x(mo1182B.get(i)));
        }
    }

    /* renamed from: a */
    public final void m1298a(C0357j c0357j) {
        this.f1774a = c0357j.m1229m();
        this.f1775b = c0357j.m1231n();
        this.f1776c = c0357j.m1233o();
        this.f1777d = c0357j.m1237q();
        int size = this.f1778e.size();
        for (int i = 0; i < size; i++) {
            this.f1778e.get(i).m1300a(c0357j);
        }
    }

    /* renamed from: b */
    public final void m1299b(C0357j c0357j) {
        c0357j.m1218g(this.f1774a);
        c0357j.m1219h(this.f1775b);
        c0357j.m1222i(this.f1776c);
        c0357j.m1224j(this.f1777d);
        int size = this.f1778e.size();
        for (int i = 0; i < size; i++) {
            this.f1778e.get(i).m1301b(c0357j);
        }
    }
}
