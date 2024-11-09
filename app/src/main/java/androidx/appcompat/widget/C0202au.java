package androidx.appcompat.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.au */
/* loaded from: classes.dex */
final class C0202au implements ListAdapter, SpinnerAdapter {

    /* renamed from: a */
    private SpinnerAdapter f1148a;

    /* renamed from: b */
    private ListAdapter f1149b;

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    public C0202au(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f1148a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f1149b = (ListAdapter) spinnerAdapter;
        }
        if (theme == null || Build.VERSION.SDK_INT < 23 || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            return;
        }
        ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
        if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f1148a == null) {
            return 0;
        }
        return this.f1148a.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f1148a == null) {
            return null;
        }
        return this.f1148a.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (this.f1148a == null) {
            return -1L;
        }
        return this.f1148a.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f1148a == null) {
            return null;
        }
        return this.f1148a.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f1148a != null && this.f1148a.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f1148a != null) {
            this.f1148a.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f1148a != null) {
            this.f1148a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f1149b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f1149b;
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
