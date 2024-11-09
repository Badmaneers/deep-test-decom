package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public final class C0166m extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ C0165l f668a;

    /* renamed from: b */
    private int f669b = -1;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C0166m(C0165l c0165l) {
        this.f668a = c0165l;
        m430a();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.f668a.f660c.m471o().size() - this.f668a.f662e;
        return this.f669b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final C0172s getItem(int i) {
        ArrayList<C0172s> m471o = this.f668a.f660c.m471o();
        int i2 = i + this.f668a.f662e;
        if (this.f669b >= 0 && i2 >= this.f669b) {
            i2++;
        }
        return m471o.get(i2);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f668a.f659b.inflate(this.f668a.f664g, viewGroup, false);
        }
        ((InterfaceC0147ag) view).mo338a(getItem(i));
        return view;
    }

    /* renamed from: a */
    private void m430a() {
        C0172s m473r = this.f668a.f660c.m473r();
        if (m473r != null) {
            ArrayList<C0172s> m471o = this.f668a.f660c.m471o();
            int size = m471o.size();
            for (int i = 0; i < size; i++) {
                if (m471o.get(i) == m473r) {
                    this.f669b = i;
                    return;
                }
            }
        }
        this.f669b = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m430a();
        super.notifyDataSetChanged();
    }
}
