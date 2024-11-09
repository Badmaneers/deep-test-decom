package com.google.android.material.internal;

import android.view.View;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0484e;
import androidx.recyclerview.widget.C0880cf;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationMenuPresenter.java */
/* renamed from: com.google.android.material.internal.r */
/* loaded from: classes.dex */
public final class C2273r extends C0880cf {

    /* renamed from: b */
    final /* synthetic */ C2265j f10042b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2273r(C2265j c2265j, RecyclerView recyclerView) {
        super(recyclerView);
        this.f10042b = c2265j;
    }

    @Override // androidx.recyclerview.widget.C0880cf, androidx.core.p024g.C0479a
    /* renamed from: a */
    public final void mo1626a(View view, C0482c c0482c) {
        super.mo1626a(view, c0482c);
        c0482c.m1653a(C0484e.m1713a(this.f10042b.f10013c.m7217h()));
    }
}
