package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AbstractC0088c;

/* compiled from: ScrollingTabContainerView.java */
/* renamed from: androidx.appcompat.widget.cm */
/* loaded from: classes.dex */
final class C0248cm extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ ScrollingTabContainerView f1295a;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0248cm(ScrollingTabContainerView scrollingTabContainerView) {
        this.f1295a = scrollingTabContainerView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1295a.f930b.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((C0249cn) this.f1295a.f930b.getChildAt(i)).m910a();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            return this.f1295a.m599a((AbstractC0088c) getItem(i));
        }
        ((C0249cn) view).m911a((AbstractC0088c) getItem(i));
        return view;
    }
}
