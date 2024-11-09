package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;

/* compiled from: PagerAdapter.java */
/* renamed from: androidx.viewpager.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC1094a {

    /* renamed from: a */
    private final DataSetObservable f4465a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f4466b;

    /* renamed from: a */
    public abstract int m3699a();

    /* renamed from: c */
    public abstract boolean m3703c();

    /* renamed from: a */
    public final void m3700a(DataSetObserver dataSetObserver) {
        this.f4465a.registerObserver(dataSetObserver);
    }

    /* renamed from: b */
    public final void m3701b(DataSetObserver dataSetObserver) {
        this.f4465a.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m3702c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f4466b = dataSetObserver;
        }
    }

    /* renamed from: b */
    public static void m3698b() {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
}
