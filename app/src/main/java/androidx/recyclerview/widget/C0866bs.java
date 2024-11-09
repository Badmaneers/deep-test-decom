package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bs */
/* loaded from: classes.dex */
public final class C0866bs {

    /* renamed from: a */
    SparseArray<C0867bt> f3554a = new SparseArray<>();

    /* renamed from: b */
    private int f3555b = 0;

    /* renamed from: a */
    public final AbstractC0879ce m3140a(int i) {
        C0867bt c0867bt = this.f3554a.get(i);
        if (c0867bt == null || c0867bt.f3556a.isEmpty()) {
            return null;
        }
        ArrayList<AbstractC0879ce> arrayList = c0867bt.f3556a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!arrayList.get(size).m3222p()) {
                return arrayList.remove(size);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static long m3138a(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3142a(int i, long j) {
        C0867bt m3139b = m3139b(i);
        m3139b.f3558c = m3138a(m3139b.f3558c, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3147b(int i, long j) {
        C0867bt m3139b = m3139b(i);
        m3139b.f3559d = m3138a(m3139b.f3559d, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3145a(int i, long j, long j2) {
        long j3 = m3139b(i).f3558c;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m3148b(int i, long j, long j2) {
        long j3 = m3139b(i).f3559d;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3141a() {
        this.f3555b++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m3146b() {
        this.f3555b--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3143a(AbstractC0845ay abstractC0845ay, AbstractC0845ay abstractC0845ay2, boolean z) {
        if (abstractC0845ay != null) {
            m3146b();
        }
        if (!z && this.f3555b == 0) {
            for (int i = 0; i < this.f3554a.size(); i++) {
                this.f3554a.valueAt(i).f3556a.clear();
            }
        }
        if (abstractC0845ay2 != null) {
            m3141a();
        }
    }

    /* renamed from: b */
    private C0867bt m3139b(int i) {
        C0867bt c0867bt = this.f3554a.get(i);
        if (c0867bt != null) {
            return c0867bt;
        }
        C0867bt c0867bt2 = new C0867bt();
        this.f3554a.put(i, c0867bt2);
        return c0867bt2;
    }

    /* renamed from: a */
    public final void m3144a(AbstractC0879ce abstractC0879ce) {
        int i = abstractC0879ce.f3619f;
        ArrayList<AbstractC0879ce> arrayList = m3139b(i).f3556a;
        if (this.f3554a.get(i).f3557b <= arrayList.size()) {
            return;
        }
        abstractC0879ce.m3225s();
        arrayList.add(abstractC0879ce);
    }
}
