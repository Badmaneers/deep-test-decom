package color.support.p043v7.widget;

import android.database.DataSetObserver;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.core.p024g.p026b.C0517b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.g */
/* loaded from: classes.dex */
public final class C1280g implements ListAdapter {

    /* renamed from: a */
    final /* synthetic */ C1277d f5438a;

    /* renamed from: b */
    private ListAdapter f5439b;

    public C1280g(C1277d c1277d, ListAdapter listAdapter) {
        this.f5438a = c1277d;
        this.f5439b = listAdapter;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f5439b != null) {
            this.f5439b.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f5439b != null) {
            this.f5439b.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f5439b == null) {
            return 0;
        }
        return this.f5439b.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f5439b == null) {
            return null;
        }
        return this.f5439b.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (this.f5439b == null) {
            return 0L;
        }
        return this.f5439b.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f5439b != null && this.f5439b.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f5439b == null) {
            return null;
        }
        View view2 = this.f5439b.getView(i, view, viewGroup);
        if (view2 == null) {
            return view2;
        }
        view2.setAlpha(0.0f);
        view2.animate().alpha(1.0f).setInterpolator(C0517b.m1773a(0.33f, 0.0f, 0.66f, 1.0f)).setDuration(350L).setStartDelay(150L).start();
        return view2;
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        if (this.f5439b == null) {
            return 0;
        }
        return this.f5439b.getItemViewType(i);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        ListAdapter listAdapter;
        ListAdapter listAdapter2;
        ListAdapter listAdapter3;
        ListAdapter listAdapter4;
        if (this.f5439b == null) {
            listAdapter = this.f5438a.f5414e;
            if (listAdapter != null) {
                StringBuilder sb = new StringBuilder("getViewTypeCount:listAdapter = null,mAdapter = ");
                listAdapter3 = this.f5438a.f5414e;
                sb.append(listAdapter3);
                sb.append(",typeCount = ");
                listAdapter4 = this.f5438a.f5414e;
                sb.append(listAdapter4.getViewTypeCount());
                Log.d("ColorBaseListPopupWindow", sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("getViewTypeCount:listAdapter = null,mAdapter = ");
                listAdapter2 = this.f5438a.f5414e;
                sb2.append(listAdapter2);
                Log.d("ColorBaseListPopupWindow", sb2.toString());
            }
        } else {
            Log.d("ColorBaseListPopupWindow", "listAdapter.typeCount = " + this.f5439b.getViewTypeCount());
        }
        if (this.f5439b == null) {
            return 0;
        }
        return this.f5439b.getViewTypeCount();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return this.f5439b != null && this.f5439b.isEmpty();
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.f5439b != null && this.f5439b.areAllItemsEnabled();
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.f5439b != null && this.f5439b.isEnabled(i);
    }
}
