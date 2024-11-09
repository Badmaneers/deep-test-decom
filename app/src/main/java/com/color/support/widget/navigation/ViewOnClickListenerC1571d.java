package com.color.support.widget.navigation;

import android.view.View;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorNavigationMenuView.java */
/* renamed from: com.color.support.widget.navigation.d */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1571d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ColorNavigationMenuView f7509a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1571d(ColorNavigationMenuView colorNavigationMenuView) {
        this.f7509a = colorNavigationMenuView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0168o c0168o;
        ColorNavigationPresenter colorNavigationPresenter;
        boolean z;
        C0172s itemData = ((ColorNavigationItemView) view).getItemData();
        c0168o = this.f7509a.f7479u;
        colorNavigationPresenter = this.f7509a.f7478t;
        if (!c0168o.m454a(itemData, colorNavigationPresenter, 0)) {
            itemData.setChecked(true);
        }
        z = this.f7509a.f7474p;
        if (!z || itemData == null || this.f7509a.getSelectedItemId() == itemData.getItemId()) {
            return;
        }
        ColorNavigationMenuView.m5297d(this.f7509a);
    }
}
