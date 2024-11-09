package com.google.android.material.bottomnavigation;

import android.view.View;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomNavigationMenuView.java */
/* renamed from: com.google.android.material.bottomnavigation.c */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2085c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ BottomNavigationMenuView f9252a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2085c(BottomNavigationMenuView bottomNavigationMenuView) {
        this.f9252a = bottomNavigationMenuView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0168o c0168o;
        BottomNavigationPresenter bottomNavigationPresenter;
        C0172s itemData = ((BottomNavigationItemView) view).getItemData();
        c0168o = this.f9252a.f9211A;
        bottomNavigationPresenter = this.f9252a.f9235z;
        if (c0168o.m454a(itemData, bottomNavigationPresenter, 0)) {
            return;
        }
        itemData.setChecked(true);
    }
}
