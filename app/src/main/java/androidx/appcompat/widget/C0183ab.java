package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityChooserView.java */
/* renamed from: androidx.appcompat.widget.ab */
/* loaded from: classes.dex */
public final class C0183ab extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1093a;

    public C0183ab(ActivityChooserView activityChooserView) {
        this.f1093a = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.f1093a.f835a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        super.onInvalidated();
        this.f1093a.f835a.notifyDataSetInvalidated();
    }
}
