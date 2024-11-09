package androidx.constraintlayout.p014a.p015a;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ResolutionNode.java */
/* renamed from: androidx.constraintlayout.a.a.v */
/* loaded from: classes.dex */
public class C0369v {

    /* renamed from: h */
    HashSet<C0369v> f1772h = new HashSet<>(2);

    /* renamed from: i */
    int f1773i = 0;

    /* renamed from: a */
    public void mo1282a() {
    }

    /* renamed from: a */
    public final void m1294a(C0369v c0369v) {
        this.f1772h.add(c0369v);
    }

    /* renamed from: b */
    public void mo1287b() {
        this.f1773i = 0;
        this.f1772h.clear();
    }

    /* renamed from: d */
    public final void m1295d() {
        this.f1773i = 0;
        Iterator<C0369v> it = this.f1772h.iterator();
        while (it.hasNext()) {
            it.next().m1295d();
        }
    }

    /* renamed from: e */
    public final void m1296e() {
        this.f1773i = 1;
        Iterator<C0369v> it = this.f1772h.iterator();
        while (it.hasNext()) {
            it.next().mo1282a();
        }
    }

    /* renamed from: f */
    public final boolean m1297f() {
        return this.f1773i == 1;
    }
}
