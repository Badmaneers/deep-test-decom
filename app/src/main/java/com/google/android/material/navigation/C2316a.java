package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0169p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationView.java */
/* renamed from: com.google.android.material.navigation.a */
/* loaded from: classes.dex */
public final class C2316a implements InterfaceC0169p {

    /* renamed from: a */
    final /* synthetic */ NavigationView f10206a;

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final void mo105a(C0168o c0168o) {
    }

    public C2316a(NavigationView navigationView) {
        this.f10206a = navigationView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final boolean mo109a(C0168o c0168o, MenuItem menuItem) {
        return this.f10206a.f10198c != null && this.f10206a.f10198c.m7386a();
    }
}
