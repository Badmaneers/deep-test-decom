package com.color.support.widget;

import java.util.ArrayList;

/* compiled from: ExpandableRecyclerPosition.java */
/* renamed from: com.color.support.widget.fr */
/* loaded from: classes.dex */
final class C1533fr {

    /* renamed from: e */
    private static ArrayList<C1533fr> f7285e = new ArrayList<>(5);

    /* renamed from: a */
    public int f7286a;

    /* renamed from: b */
    public int f7287b;

    /* renamed from: c */
    int f7288c;

    /* renamed from: d */
    public int f7289d;

    private C1533fr() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1533fr m5155a(int i, int i2, int i3, int i4) {
        C1533fr m5156b = m5156b();
        m5156b.f7289d = i;
        m5156b.f7286a = i2;
        m5156b.f7287b = i3;
        m5156b.f7288c = i4;
        return m5156b;
    }

    /* renamed from: b */
    private static C1533fr m5156b() {
        synchronized (f7285e) {
            if (f7285e.size() > 0) {
                C1533fr remove = f7285e.remove(0);
                remove.f7286a = 0;
                remove.f7287b = 0;
                remove.f7288c = 0;
                remove.f7289d = 0;
                return remove;
            }
            return new C1533fr();
        }
    }

    /* renamed from: a */
    public final void m5157a() {
        synchronized (f7285e) {
            if (f7285e.size() < 5) {
                f7285e.add(this);
            }
        }
    }
}
