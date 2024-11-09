package color.support.p043v7.internal.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.l */
/* loaded from: classes.dex */
final class C1245l implements ListAdapter, SpinnerAdapter {

    /* renamed from: a */
    private SpinnerAdapter f5263a;

    /* renamed from: b */
    private ListAdapter f5264b;

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    public C1245l(SpinnerAdapter spinnerAdapter) {
        this.f5263a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f5264b = (ListAdapter) spinnerAdapter;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f5263a == null) {
            return 0;
        }
        return this.f5263a.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f5263a == null) {
            return null;
        }
        return this.f5263a.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (this.f5263a == null) {
            return -1L;
        }
        return this.f5263a.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f5263a == null) {
            return null;
        }
        return this.f5263a.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f5263a != null && this.f5263a.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f5263a != null) {
            this.f5263a.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f5263a != null) {
            this.f5263a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f5264b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f5264b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }
}
