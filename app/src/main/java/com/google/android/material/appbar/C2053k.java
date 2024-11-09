package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p023f.C0472c;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0534s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollapsingToolbarLayout.java */
/* renamed from: com.google.android.material.appbar.k */
/* loaded from: classes.dex */
public final class C2053k implements InterfaceC0534s {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f9066a;

    public C2053k(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f9066a = collapsingToolbarLayout;
    }

    @Override // androidx.core.p024g.InterfaceC0534s
    /* renamed from: a */
    public final C0514ao mo250a(View view, C0514ao c0514ao) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f9066a;
        C0514ao c0514ao2 = C0538w.m1893v(collapsingToolbarLayout) ? c0514ao : null;
        if (!C0472c.m1615a(collapsingToolbarLayout.f9029d, c0514ao2)) {
            collapsingToolbarLayout.f9029d = c0514ao2;
            collapsingToolbarLayout.requestLayout();
        }
        return c0514ao.m1771g();
    }
}
