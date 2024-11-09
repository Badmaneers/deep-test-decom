package color.support.p043v7.internal.widget;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbsSpinnerCompat.java */
/* renamed from: color.support.v7.internal.widget.a */
/* loaded from: classes.dex */
public final class C1217a {

    /* renamed from: a */
    final /* synthetic */ AbsSpinnerCompat f5205a;

    /* renamed from: b */
    private final SparseArray<View> f5206b = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1217a(AbsSpinnerCompat absSpinnerCompat) {
        this.f5205a = absSpinnerCompat;
    }

    /* renamed from: a */
    public final void m4064a(int i, View view) {
        this.f5206b.put(i, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final View m4062a(int i) {
        View view = this.f5206b.get(i);
        if (view != null) {
            this.f5206b.delete(i);
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4063a() {
        SparseArray<View> sparseArray = this.f5206b;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                this.f5205a.removeDetachedView(valueAt, true);
            }
        }
        sparseArray.clear();
    }
}
