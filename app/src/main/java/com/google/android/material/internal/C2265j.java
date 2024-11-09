package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;
import androidx.appcompat.view.menu.InterfaceC0144ad;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.InterfaceC0146af;
import androidx.appcompat.view.menu.SubMenuC0153am;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import com.google.android.material.R;

/* compiled from: NavigationMenuPresenter.java */
/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes.dex */
public final class C2265j implements InterfaceC0144ad {

    /* renamed from: a */
    LinearLayout f10011a;

    /* renamed from: b */
    C0168o f10012b;

    /* renamed from: c */
    C2268m f10013c;

    /* renamed from: d */
    LayoutInflater f10014d;

    /* renamed from: e */
    int f10015e;

    /* renamed from: f */
    boolean f10016f;

    /* renamed from: g */
    ColorStateList f10017g;

    /* renamed from: h */
    ColorStateList f10018h;

    /* renamed from: i */
    Drawable f10019i;

    /* renamed from: j */
    int f10020j;

    /* renamed from: k */
    int f10021k;

    /* renamed from: l */
    int f10022l;

    /* renamed from: m */
    boolean f10023m;

    /* renamed from: o */
    int f10025o;

    /* renamed from: q */
    private NavigationMenuView f10027q;

    /* renamed from: r */
    private InterfaceC0145ae f10028r;

    /* renamed from: s */
    private int f10029s;

    /* renamed from: t */
    private int f10030t;

    /* renamed from: u */
    private int f10031u;

    /* renamed from: n */
    boolean f10024n = true;

    /* renamed from: v */
    private int f10032v = -1;

    /* renamed from: p */
    final View.OnClickListener f10026p = new ViewOnClickListenerC2266k(this);

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final boolean mo388a(SubMenuC0153am subMenuC0153am) {
        return false;
    }

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

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo357a(Context context, C0168o c0168o) {
        this.f10014d = LayoutInflater.from(context);
        this.f10012b = c0168o;
        this.f10025o = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a */
    public final InterfaceC0146af m7186a(ViewGroup viewGroup) {
        if (this.f10027q == null) {
            this.f10027q = (NavigationMenuView) this.f10014d.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f10027q.setAccessibilityDelegateCompat(new C2273r(this, this.f10027q));
            if (this.f10013c == null) {
                this.f10013c = new C2268m(this);
            }
            if (this.f10032v != -1) {
                this.f10027q.setOverScrollMode(this.f10032v);
            }
            this.f10011a = (LinearLayout) this.f10014d.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f10027q, false);
            this.f10027q.setAdapter(this.f10013c);
        }
        return this.f10027q;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo387a(boolean z) {
        if (this.f10013c != null) {
            this.f10013c.m7214e();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo385a(InterfaceC0145ae interfaceC0145ae) {
        this.f10028r = interfaceC0145ae;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo386a(C0168o c0168o, boolean z) {
        if (this.f10028r != null) {
            this.f10028r.mo171a(c0168o, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: c */
    public final int mo365c() {
        return this.f10029s;
    }

    /* renamed from: a */
    public final void m7187a() {
        this.f10029s = 1;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: f */
    public final Parcelable mo390f() {
        Bundle bundle = new Bundle();
        if (this.f10027q != null) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            this.f10027q.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f10013c != null) {
            bundle.putBundle("android:menu:adapter", this.f10013c.m7216g());
        }
        if (this.f10011a != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f10011a.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0144ad
    /* renamed from: a */
    public final void mo384a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f10027q.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f10013c.m7211a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f10011a.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: a */
    public final void m7190a(C0172s c0172s) {
        this.f10013c.m7212a(c0172s);
    }

    /* renamed from: d */
    public final C0172s m7197d() {
        return this.f10013c.m7215f();
    }

    /* renamed from: a */
    public final View m7185a(int i) {
        View inflate = this.f10014d.inflate(i, (ViewGroup) this.f10011a, false);
        this.f10011a.addView(inflate);
        this.f10027q.setPadding(0, 0, 0, this.f10027q.getPaddingBottom());
        return inflate;
    }

    /* renamed from: e */
    public final int m7199e() {
        return this.f10011a.getChildCount();
    }

    /* renamed from: g */
    public final ColorStateList m7202g() {
        return this.f10018h;
    }

    /* renamed from: a */
    public final void m7188a(ColorStateList colorStateList) {
        this.f10018h = colorStateList;
        mo387a(false);
    }

    /* renamed from: h */
    public final ColorStateList m7204h() {
        return this.f10017g;
    }

    /* renamed from: b */
    public final void m7193b(ColorStateList colorStateList) {
        this.f10017g = colorStateList;
        mo387a(false);
    }

    /* renamed from: b */
    public final void m7192b(int i) {
        this.f10015e = i;
        this.f10016f = true;
        mo387a(false);
    }

    /* renamed from: i */
    public final Drawable m7205i() {
        return this.f10019i;
    }

    /* renamed from: a */
    public final void m7189a(Drawable drawable) {
        this.f10019i = drawable;
        mo387a(false);
    }

    /* renamed from: j */
    public final int m7206j() {
        return this.f10020j;
    }

    /* renamed from: c */
    public final void m7195c(int i) {
        this.f10020j = i;
        mo387a(false);
    }

    /* renamed from: k */
    public final int m7207k() {
        return this.f10021k;
    }

    /* renamed from: d */
    public final void m7198d(int i) {
        this.f10021k = i;
        mo387a(false);
    }

    /* renamed from: e */
    public final void m7200e(int i) {
        this.f10030t = i;
        mo387a(false);
    }

    /* renamed from: l */
    public final int m7208l() {
        return this.f10030t;
    }

    /* renamed from: f */
    public final void m7201f(int i) {
        if (this.f10022l != i) {
            this.f10022l = i;
            this.f10023m = true;
            mo387a(false);
        }
    }

    /* renamed from: b */
    public final void m7194b(boolean z) {
        if (this.f10013c != null) {
            this.f10013c.m7213a(z);
        }
    }

    /* renamed from: c */
    public final void m7196c(boolean z) {
        if (this.f10024n != z) {
            this.f10024n = z;
            m7184m();
        }
    }

    /* renamed from: m */
    private void m7184m() {
        this.f10027q.setPadding(0, (this.f10011a.getChildCount() == 0 && this.f10024n) ? this.f10031u : 0, 0, this.f10027q.getPaddingBottom());
    }

    /* renamed from: a */
    public final void m7191a(C0514ao c0514ao) {
        int m1766b = c0514ao.m1766b();
        if (this.f10031u != m1766b) {
            this.f10031u = m1766b;
            m7184m();
        }
        this.f10027q.setPadding(0, this.f10027q.getPaddingTop(), 0, c0514ao.m1768d());
        C0538w.m1859b(this.f10011a, c0514ao);
    }

    /* renamed from: g */
    public final void m7203g(int i) {
        this.f10032v = i;
        if (this.f10027q != null) {
            this.f10027q.setOverScrollMode(i);
        }
    }
}
