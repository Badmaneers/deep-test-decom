package com.google.android.material.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0172s;
import androidx.core.p024g.C0538w;
import androidx.recyclerview.widget.AbstractC0845ay;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationMenuPresenter.java */
/* renamed from: com.google.android.material.internal.m */
/* loaded from: classes.dex */
public final class C2268m extends AbstractC0845ay<AbstractC2277v> {

    /* renamed from: a */
    final /* synthetic */ C2265j f10034a;

    /* renamed from: b */
    private final ArrayList<InterfaceC2270o> f10035b = new ArrayList<>();

    /* renamed from: c */
    private C0172s f10036c;

    /* renamed from: d */
    private boolean f10037d;

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: b */
    public final long mo3021b(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final /* synthetic */ void mo3018a(AbstractC2277v abstractC2277v) {
        AbstractC2277v abstractC2277v2 = abstractC2277v;
        if (abstractC2277v2 instanceof C2274s) {
            ((NavigationMenuItemView) abstractC2277v2.f3614a).m7073b();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final /* synthetic */ void mo3019a(AbstractC2277v abstractC2277v, int i) {
        int i2;
        AbstractC2277v abstractC2277v2 = abstractC2277v;
        switch (mo3014a(i)) {
            case 0:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC2277v2.f3614a;
                navigationMenuItemView.setIconTintList(this.f10034a.f10018h);
                if (this.f10034a.f10016f) {
                    navigationMenuItemView.setTextAppearance(this.f10034a.f10015e);
                }
                if (this.f10034a.f10017g != null) {
                    navigationMenuItemView.setTextColor(this.f10034a.f10017g);
                }
                C0538w.m1846a(navigationMenuItemView, this.f10034a.f10019i != null ? this.f10034a.f10019i.getConstantState().newDrawable() : null);
                C2272q c2272q = (C2272q) this.f10035b.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(c2272q.f10040a);
                navigationMenuItemView.setHorizontalPadding(this.f10034a.f10020j);
                navigationMenuItemView.setIconPadding(this.f10034a.f10021k);
                if (this.f10034a.f10023m) {
                    navigationMenuItemView.setIconSize(this.f10034a.f10022l);
                }
                i2 = this.f10034a.f10030t;
                navigationMenuItemView.setMaxLines(i2);
                navigationMenuItemView.mo338a(c2272q.m7220a());
                return;
            case 1:
                ((TextView) abstractC2277v2.f3614a).setText(((C2272q) this.f10035b.get(i)).m7220a().getTitle());
                return;
            case 2:
                C2271p c2271p = (C2271p) this.f10035b.get(i);
                abstractC2277v2.f3614a.setPadding(0, c2271p.m7218a(), 0, c2271p.m7219b());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2268m(C2265j c2265j) {
        this.f10034a = c2265j;
        m7210i();
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: b */
    public final int mo3020b() {
        return this.f10035b.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final int mo3014a(int i) {
        InterfaceC2270o interfaceC2270o = this.f10035b.get(i);
        if (interfaceC2270o instanceof C2271p) {
            return 2;
        }
        if (interfaceC2270o instanceof C2269n) {
            return 3;
        }
        if (interfaceC2270o instanceof C2272q) {
            return ((C2272q) interfaceC2270o).m7220a().hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    /* renamed from: e */
    public final void m7214e() {
        m7210i();
        m3028d();
    }

    /* renamed from: i */
    private void m7210i() {
        if (this.f10037d) {
            return;
        }
        boolean z = true;
        this.f10037d = true;
        this.f10035b.clear();
        this.f10035b.add(new C2269n());
        int size = this.f10034a.f10012b.m468l().size();
        int i = -1;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < size) {
            C0172s c0172s = this.f10034a.f10012b.m468l().get(i2);
            if (c0172s.isChecked()) {
                m7212a(c0172s);
            }
            if (c0172s.isCheckable()) {
                c0172s.m482a(false);
            }
            if (c0172s.hasSubMenu()) {
                SubMenu subMenu = c0172s.getSubMenu();
                if (subMenu.hasVisibleItems()) {
                    if (i2 != 0) {
                        this.f10035b.add(new C2271p(this.f10034a.f10025o, 0));
                    }
                    this.f10035b.add(new C2272q(c0172s));
                    int size2 = this.f10035b.size();
                    int size3 = subMenu.size();
                    int i4 = 0;
                    boolean z3 = false;
                    while (i4 < size3) {
                        C0172s c0172s2 = (C0172s) subMenu.getItem(i4);
                        if (c0172s2.isVisible()) {
                            if (!z3 && c0172s2.getIcon() != null) {
                                z3 = z;
                            }
                            if (c0172s2.isCheckable()) {
                                c0172s2.m482a(false);
                            }
                            if (c0172s.isChecked()) {
                                m7212a(c0172s);
                            }
                            this.f10035b.add(new C2272q(c0172s2));
                        }
                        i4++;
                        z = true;
                    }
                    if (z3) {
                        m7209b(size2, this.f10035b.size());
                    }
                }
            } else {
                int groupId = c0172s.getGroupId();
                if (groupId != i) {
                    i3 = this.f10035b.size();
                    boolean z4 = c0172s.getIcon() != null;
                    if (i2 != 0) {
                        i3++;
                        this.f10035b.add(new C2271p(this.f10034a.f10025o, this.f10034a.f10025o));
                    }
                    z2 = z4;
                } else if (!z2 && c0172s.getIcon() != null) {
                    m7209b(i3, this.f10035b.size());
                    z2 = true;
                }
                C2272q c2272q = new C2272q(c0172s);
                c2272q.f10040a = z2;
                this.f10035b.add(c2272q);
                i = groupId;
            }
            i2++;
            z = true;
        }
        this.f10037d = false;
    }

    /* renamed from: b */
    private void m7209b(int i, int i2) {
        while (i < i2) {
            ((C2272q) this.f10035b.get(i)).f10040a = true;
            i++;
        }
    }

    /* renamed from: a */
    public final void m7212a(C0172s c0172s) {
        if (this.f10036c == c0172s || !c0172s.isCheckable()) {
            return;
        }
        if (this.f10036c != null) {
            this.f10036c.setChecked(false);
        }
        this.f10036c = c0172s;
        c0172s.setChecked(true);
    }

    /* renamed from: f */
    public final C0172s m7215f() {
        return this.f10036c;
    }

    /* renamed from: g */
    public final Bundle m7216g() {
        Bundle bundle = new Bundle();
        if (this.f10036c != null) {
            bundle.putInt("android:menu:checked", this.f10036c.getItemId());
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        int size = this.f10035b.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2270o interfaceC2270o = this.f10035b.get(i);
            if (interfaceC2270o instanceof C2272q) {
                C0172s m7220a = ((C2272q) interfaceC2270o).m7220a();
                View actionView = m7220a != null ? m7220a.getActionView() : null;
                if (actionView != null) {
                    ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                    actionView.saveHierarchyState(parcelableSparseArray);
                    sparseArray.put(m7220a.getItemId(), parcelableSparseArray);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
        return bundle;
    }

    /* renamed from: a */
    public final void m7211a(Bundle bundle) {
        C0172s m7220a;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        C0172s m7220a2;
        int i = bundle.getInt("android:menu:checked", 0);
        if (i != 0) {
            this.f10037d = true;
            int size = this.f10035b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                InterfaceC2270o interfaceC2270o = this.f10035b.get(i2);
                if ((interfaceC2270o instanceof C2272q) && (m7220a2 = ((C2272q) interfaceC2270o).m7220a()) != null && m7220a2.getItemId() == i) {
                    m7212a(m7220a2);
                    break;
                }
                i2++;
            }
            this.f10037d = false;
            m7210i();
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
        if (sparseParcelableArray != null) {
            int size2 = this.f10035b.size();
            for (int i3 = 0; i3 < size2; i3++) {
                InterfaceC2270o interfaceC2270o2 = this.f10035b.get(i3);
                if ((interfaceC2270o2 instanceof C2272q) && (m7220a = ((C2272q) interfaceC2270o2).m7220a()) != null && (actionView = m7220a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(m7220a.getItemId())) != null) {
                    actionView.restoreHierarchyState(parcelableSparseArray);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m7213a(boolean z) {
        this.f10037d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final int m7217h() {
        int i = this.f10034a.f10011a.getChildCount() == 0 ? 0 : 1;
        for (int i2 = 0; i2 < this.f10034a.f10013c.f10035b.size(); i2++) {
            if (this.f10034a.f10013c.mo3014a(i2) == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0845ay
    /* renamed from: a */
    public final /* synthetic */ AbstractC2277v mo3015a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C2274s(this.f10034a.f10014d, viewGroup, this.f10034a.f10026p);
            case 1:
                return new C2276u(this.f10034a.f10014d, viewGroup);
            case 2:
                return new C2275t(this.f10034a.f10014d, viewGroup);
            case 3:
                return new C2267l(this.f10034a.f10011a);
            default:
                return null;
        }
    }
}
