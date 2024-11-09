package com.google.android.material.tabs;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabLayout.java */
/* renamed from: com.google.android.material.tabs.e */
/* loaded from: classes.dex */
public final class C2354e extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ TabLayout f10399a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2354e(TabLayout tabLayout) {
        this.f10399a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f10399a.m7493a();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f10399a.m7493a();
    }
}
