package color.support.p043v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;

/* compiled from: AdapterViewCompat.java */
/* renamed from: color.support.v7.internal.widget.c */
/* loaded from: classes.dex */
final class C1236c extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ AdapterViewCompat f5252a;

    /* renamed from: b */
    private Parcelable f5253b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1236c(AdapterViewCompat adapterViewCompat) {
        this.f5252a = adapterViewCompat;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f5252a.f5093u = true;
        this.f5252a.f5073A = this.f5252a.f5098z;
        this.f5252a.f5098z = this.f5252a.getAdapter().getCount();
        if (this.f5252a.getAdapter().hasStableIds() && this.f5253b != null && this.f5252a.f5073A == 0 && this.f5252a.f5098z > 0) {
            this.f5252a.onRestoreInstanceState(this.f5253b);
            this.f5253b = null;
        } else {
            this.f5252a.m4024f();
        }
        this.f5252a.m4020b();
        this.f5252a.requestLayout();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        Parcelable onSaveInstanceState;
        this.f5252a.f5093u = true;
        if (this.f5252a.getAdapter().hasStableIds()) {
            onSaveInstanceState = this.f5252a.onSaveInstanceState();
            this.f5253b = onSaveInstanceState;
        }
        this.f5252a.f5073A = this.f5252a.f5098z;
        this.f5252a.f5098z = 0;
        this.f5252a.f5096x = -1;
        this.f5252a.f5097y = Long.MIN_VALUE;
        this.f5252a.f5094v = -1;
        this.f5252a.f5095w = Long.MIN_VALUE;
        this.f5252a.f5087o = false;
        this.f5252a.m4020b();
        this.f5252a.requestLayout();
    }
}
