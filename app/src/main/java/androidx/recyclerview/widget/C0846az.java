package androidx.recyclerview.widget;

import android.database.Observable;

/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.az */
/* loaded from: classes.dex */
final class C0846az extends Observable<AbstractC0848ba> {
    /* renamed from: a */
    public final boolean m3030a() {
        return !this.mObservers.isEmpty();
    }

    /* renamed from: b */
    public final void m3031b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0848ba) this.mObservers.get(size)).mo3032a();
        }
    }

    /* renamed from: a */
    public final void m3029a(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0848ba) this.mObservers.get(size)).mo3034b(i, i2);
        }
    }
}
