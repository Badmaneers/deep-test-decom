package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: MenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.aa */
/* loaded from: classes.dex */
public abstract class AbstractC0141aa implements AdapterView.OnItemClickListener, InterfaceC0144ad, InterfaceC0149ai {

    /* renamed from: a */
    private Rect f566a;

    /* renamed from: a */
    public abstract void mo356a(int i);

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo357a(Context context, C0168o c0168o) {
    }

    /* renamed from: a */
    public abstract void mo359a(View view);

    /* renamed from: a */
    public abstract void mo360a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo361a(C0168o c0168o);

    /* renamed from: b */
    public abstract void mo362b(int i);

    /* renamed from: b */
    public abstract void mo363b(boolean z);

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public final boolean mo364b(C0172s c0172s) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final int mo365c() {
        return 0;
    }

    /* renamed from: c */
    public abstract void mo366c(int i);

    /* renamed from: c */
    public abstract void mo367c(boolean z);

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final boolean mo368c(C0172s c0172s) {
        return false;
    }

    /* renamed from: h */
    protected boolean mo369h() {
        return true;
    }

    /* renamed from: a */
    public final void m358a(Rect rect) {
        this.f566a = rect;
    }

    /* renamed from: i */
    public final Rect m370i() {
        return this.f566a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m354a(listAdapter).f670a.m454a((MenuItem) listAdapter.getItem(i), this, mo369h() ? 0 : 4);
    }

    /* renamed from: a */
    public static int m353a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static C0167n m354a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0167n) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0167n) listAdapter;
    }

    /* renamed from: b */
    public static boolean m355b(C0168o c0168o) {
        int size = c0168o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0168o.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
