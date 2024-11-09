package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.k */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2360k implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f10429a;

    /* renamed from: b */
    final /* synthetic */ TabLayout.TabView f10430b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnLayoutChangeListenerC2360k(TabLayout.TabView tabView, View view) {
        this.f10430b = tabView;
        this.f10429a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f10429a.getVisibility() == 0) {
            this.f10430b.m7511c(this.f10429a);
        }
    }
}
