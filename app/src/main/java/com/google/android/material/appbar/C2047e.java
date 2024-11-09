package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p024g.p025a.InterfaceC0491l;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBarLayout.java */
/* renamed from: com.google.android.material.appbar.e */
/* loaded from: classes.dex */
public final class C2047e implements InterfaceC0491l {

    /* renamed from: a */
    final /* synthetic */ AppBarLayout f9061a;

    /* renamed from: b */
    final /* synthetic */ boolean f9062b;

    /* renamed from: c */
    final /* synthetic */ AppBarLayout.BaseBehavior f9063c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2047e(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.f9063c = baseBehavior;
        this.f9061a = appBarLayout;
        this.f9062b = z;
    }

    @Override // androidx.core.p024g.p025a.InterfaceC0491l
    /* renamed from: a */
    public final boolean mo1722a(View view) {
        this.f9061a.setExpanded(this.f9062b);
        return true;
    }
}
