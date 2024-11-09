package androidx.coordinatorlayout.widget;

import androidx.core.p023f.C0476g;
import androidx.core.p023f.InterfaceC0475f;
import androidx.p011b.C0328n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph.java */
/* renamed from: androidx.coordinatorlayout.widget.j */
/* loaded from: classes.dex */
public final class C0398j<T> {

    /* renamed from: a */
    private final InterfaceC0475f<ArrayList<T>> f2099a = new C0476g(10);

    /* renamed from: b */
    private final C0328n<T, ArrayList<T>> f2100b = new C0328n<>();

    /* renamed from: c */
    private final ArrayList<T> f2101c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2102d = new HashSet<>();

    /* renamed from: a */
    public final void m1439a(T t) {
        if (this.f2100b.containsKey(t)) {
            return;
        }
        this.f2100b.put(t, null);
    }

    /* renamed from: b */
    public final boolean m1442b(T t) {
        return this.f2100b.containsKey(t);
    }

    /* renamed from: a */
    public final void m1440a(T t, T t2) {
        if (!this.f2100b.containsKey(t) || !this.f2100b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f2100b.get(t);
        if (arrayList == null) {
            arrayList = this.f2099a.mo1617a();
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.f2100b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: c */
    public final List m1443c(T t) {
        return this.f2100b.get(t);
    }

    /* renamed from: d */
    public final List<T> m1444d(T t) {
        int size = this.f2100b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m1062c = this.f2100b.m1062c(i);
            if (m1062c != null && m1062c.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2100b.m1061b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final boolean m1445e(T t) {
        int size = this.f2100b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m1062c = this.f2100b.m1062c(i);
            if (m1062c != null && m1062c.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m1438a() {
        int size = this.f2100b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m1062c = this.f2100b.m1062c(i);
            if (m1062c != null) {
                m1062c.clear();
                this.f2099a.mo1618a(m1062c);
            }
        }
        this.f2100b.clear();
    }

    /* renamed from: b */
    public final ArrayList<T> m1441b() {
        this.f2101c.clear();
        this.f2102d.clear();
        int size = this.f2100b.size();
        for (int i = 0; i < size; i++) {
            m1437a(this.f2100b.m1061b(i), this.f2101c, this.f2102d);
        }
        return this.f2101c;
    }

    /* renamed from: a */
    private void m1437a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f2100b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m1437a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
