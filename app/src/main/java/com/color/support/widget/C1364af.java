package com.color.support.widget;

import android.database.DataSetObserver;

/* compiled from: ColorExpandableListView.java */
/* renamed from: com.color.support.widget.af */
/* loaded from: classes.dex */
public final class C1364af extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ C1361ac f6923a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1364af(C1361ac c1361ac) {
        this.f6923a = c1361ac;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f6923a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f6923a.notifyDataSetInvalidated();
    }
}
