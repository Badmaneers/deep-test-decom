package com.google.android.material.internal;

import android.view.View;
import androidx.appcompat.view.menu.C0172s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationMenuPresenter.java */
/* renamed from: com.google.android.material.internal.k */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2266k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2265j f10033a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2266k(C2265j c2265j) {
        this.f10033a = c2265j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = true;
        this.f10033a.m7194b(true);
        C0172s itemData = ((NavigationMenuItemView) view).getItemData();
        boolean m454a = this.f10033a.f10012b.m454a(itemData, this.f10033a, 0);
        if (itemData != null && itemData.isCheckable() && m454a) {
            this.f10033a.f10013c.m7212a(itemData);
        } else {
            z = false;
        }
        this.f10033a.m7194b(false);
        if (z) {
            this.f10033a.mo387a(false);
        }
    }
}
