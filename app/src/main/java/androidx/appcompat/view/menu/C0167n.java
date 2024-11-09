package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* renamed from: androidx.appcompat.view.menu.n */
/* loaded from: classes.dex */
public final class C0167n extends BaseAdapter {

    /* renamed from: a */
    C0168o f670a;

    /* renamed from: b */
    private int f671b = -1;

    /* renamed from: c */
    private boolean f672c;

    /* renamed from: d */
    private final boolean f673d;

    /* renamed from: e */
    private final LayoutInflater f674e;

    /* renamed from: f */
    private final int f675f;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C0167n(C0168o c0168o, LayoutInflater layoutInflater, boolean z, int i) {
        this.f673d = z;
        this.f674e = layoutInflater;
        this.f670a = c0168o;
        this.f675f = i;
        m432b();
    }

    /* renamed from: a */
    public final void m435a(boolean z) {
        this.f672c = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<C0172s> m471o = this.f673d ? this.f670a.m471o() : this.f670a.m468l();
        if (this.f671b < 0) {
            return m471o.size();
        }
        return m471o.size() - 1;
    }

    /* renamed from: a */
    public final C0168o m433a() {
        return this.f670a;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final C0172s getItem(int i) {
        ArrayList<C0172s> m471o = this.f673d ? this.f670a.m471o() : this.f670a.m468l();
        if (this.f671b >= 0 && i >= this.f671b) {
            i++;
        }
        return m471o.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f674e.inflate(this.f675f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        int groupId2 = i2 >= 0 ? getItem(i2).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f670a.mo400c() && groupId != groupId2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0147ag interfaceC0147ag = (InterfaceC0147ag) view;
        if (this.f672c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0147ag.mo338a(getItem(i));
        return view;
    }

    /* renamed from: b */
    private void m432b() {
        C0172s m473r = this.f670a.m473r();
        if (m473r != null) {
            ArrayList<C0172s> m471o = this.f670a.m471o();
            int size = m471o.size();
            for (int i = 0; i < size; i++) {
                if (m471o.get(i) == m473r) {
                    this.f671b = i;
                    return;
                }
            }
        }
        this.f671b = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m432b();
        super.notifyDataSetChanged();
    }
}
