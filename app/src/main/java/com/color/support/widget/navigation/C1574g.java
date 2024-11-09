package com.color.support.widget.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0169p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorNavigationView.java */
/* renamed from: com.color.support.widget.navigation.g */
/* loaded from: classes.dex */
public final class C1574g implements InterfaceC0169p {

    /* renamed from: a */
    final /* synthetic */ ColorNavigationView f7512a;

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final void mo105a(C0168o c0168o) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1574g(ColorNavigationView colorNavigationView) {
        this.f7512a = colorNavigationView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final boolean mo109a(C0168o c0168o, MenuItem menuItem) {
        InterfaceC1578k interfaceC1578k;
        ColorNavigationMenuView colorNavigationMenuView;
        InterfaceC1579l interfaceC1579l;
        InterfaceC1579l interfaceC1579l2;
        InterfaceC1578k unused;
        interfaceC1578k = this.f7512a.f7498n;
        if (interfaceC1578k == null || menuItem.getItemId() != this.f7512a.getSelectedItemId()) {
            colorNavigationMenuView = this.f7512a.f7490f;
            colorNavigationMenuView.m5302a(menuItem);
            interfaceC1579l = this.f7512a.f7497m;
            if (interfaceC1579l == null) {
                return false;
            }
            interfaceC1579l2 = this.f7512a.f7497m;
            return !interfaceC1579l2.m5321a();
        }
        unused = this.f7512a.f7498n;
        return true;
    }
}
