package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p024g.p025a.InterfaceC0491l;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBarLayout.java */
/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes.dex */
public final class C2046d implements InterfaceC0491l {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f9056a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f9057b;

    /* renamed from: c */
    final /* synthetic */ View f9058c;

    /* renamed from: d */
    final /* synthetic */ int f9059d;

    /* renamed from: e */
    final /* synthetic */ AppBarLayout.BaseBehavior f9060e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2046d(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f9060e = baseBehavior;
        this.f9056a = coordinatorLayout;
        this.f9057b = appBarLayout;
        this.f9058c = view;
        this.f9059d = i;
    }

    @Override // androidx.core.p024g.p025a.InterfaceC0491l
    /* renamed from: a */
    public final boolean mo1722a(View view) {
        this.f9060e.mo1411a(this.f9056a, (CoordinatorLayout) this.f9057b, this.f9058c, 0, this.f9059d, new int[]{0, 0}, 1);
        return true;
    }
}
