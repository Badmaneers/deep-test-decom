package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityChooserView.java */
/* renamed from: androidx.appcompat.widget.af */
/* loaded from: classes.dex */
public final class C0187af extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1097a;

    public C0187af(ActivityChooserView activityChooserView) {
        this.f1097a = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.f1097a.m575c();
    }
}
