package com.google.android.material.bottomnavigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0169p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomNavigationView.java */
/* renamed from: com.google.android.material.bottomnavigation.e */
/* loaded from: classes.dex */
public final class C2087e implements InterfaceC0169p {

    /* renamed from: a */
    final /* synthetic */ BottomNavigationView f9253a;

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final void mo105a(C0168o c0168o) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2087e(BottomNavigationView bottomNavigationView) {
        this.f9253a = bottomNavigationView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final boolean mo109a(C0168o c0168o, MenuItem menuItem) {
        InterfaceC2089g interfaceC2089g;
        InterfaceC2090h interfaceC2090h;
        InterfaceC2090h interfaceC2090h2;
        InterfaceC2089g unused;
        interfaceC2089g = this.f9253a.f9249h;
        if (interfaceC2089g == null || menuItem.getItemId() != this.f9253a.getSelectedItemId()) {
            interfaceC2090h = this.f9253a.f9248g;
            if (interfaceC2090h == null) {
                return false;
            }
            interfaceC2090h2 = this.f9253a.f9248g;
            return !interfaceC2090h2.m6478a();
        }
        unused = this.f9253a.f9249h;
        return true;
    }
}
