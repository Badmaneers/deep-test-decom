package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.R;

/* compiled from: ListMenuPresenter.java */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public final class C0165l implements AdapterView.OnItemClickListener, InterfaceC0144ad {

    /* renamed from: a */
    Context f658a;

    /* renamed from: b */
    LayoutInflater f659b;

    /* renamed from: c */
    C0168o f660c;

    /* renamed from: d */
    ExpandedMenuView f661d;

    /* renamed from: e */
    int f662e;

    /* renamed from: f */
    int f663f;

    /* renamed from: g */
    int f664g;

    /* renamed from: h */
    C0166m f665h;

    /* renamed from: i */
    private InterfaceC0145ae f666i;

    /* renamed from: j */
    private int f667j;

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public final boolean mo389b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: b */
    public final boolean mo364b(C0172s c0172s) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final boolean mo368c(C0172s c0172s) {
        return false;
    }

    public C0165l(Context context, int i) {
        this(i);
        this.f658a = context;
        this.f659b = LayoutInflater.from(this.f658a);
    }

    private C0165l(int i) {
        this.f664g = i;
        this.f663f = 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo357a(Context context, C0168o c0168o) {
        if (this.f663f != 0) {
            this.f658a = new ContextThemeWrapper(context, this.f663f);
            this.f659b = LayoutInflater.from(this.f658a);
        } else if (this.f658a != null) {
            this.f658a = context;
            if (this.f659b == null) {
                this.f659b = LayoutInflater.from(this.f658a);
            }
        }
        this.f660c = c0168o;
        if (this.f665h != null) {
            this.f665h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final InterfaceC0146af m429a(ViewGroup viewGroup) {
        if (this.f661d == null) {
            this.f661d = (ExpandedMenuView) this.f659b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f665h == null) {
                this.f665h = new C0166m(this);
            }
            this.f661d.setAdapter((ListAdapter) this.f665h);
            this.f661d.setOnItemClickListener(this);
        }
        return this.f661d;
    }

    /* renamed from: a */
    public final ListAdapter m428a() {
        if (this.f665h == null) {
            this.f665h = new C0166m(this);
        }
        return this.f665h;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        if (this.f665h != null) {
            this.f665h.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo385a(InterfaceC0145ae interfaceC0145ae) {
        this.f666i = interfaceC0145ae;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final boolean mo388a(SubMenuC0153am subMenuC0153am) {
        if (!subMenuC0153am.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnClickListenerC0171r(subMenuC0153am).m474a();
        if (this.f666i == null) {
            return true;
        }
        this.f666i.mo172a(subMenuC0153am);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo386a(C0168o c0168o, boolean z) {
        if (this.f666i != null) {
            this.f666i.mo171a(c0168o, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f660c.m454a(this.f665h.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final int mo365c() {
        return this.f667j;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: f */
    public final Parcelable mo390f() {
        if (this.f661d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        if (this.f661d != null) {
            this.f661d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo384a(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f661d.restoreHierarchyState(sparseParcelableArray);
        }
    }
}
