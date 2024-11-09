package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p018b.C0418a;
import androidx.core.p024g.C0538w;

/* compiled from: CollapsingToolbarLayout.java */
/* renamed from: com.google.android.material.appbar.n */
/* loaded from: classes.dex */
final class C2056n implements InterfaceC2052j {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f9070a;

    public C2056n(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f9070a = collapsingToolbarLayout;
    }

    @Override // com.google.android.material.appbar.InterfaceC2050h
    /* renamed from: a */
    public final void mo6322a(int i) {
        this.f9070a.f9028c = i;
        int m1766b = this.f9070a.f9029d != null ? this.f9070a.f9029d.m1766b() : 0;
        int childCount = this.f9070a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f9070a.getChildAt(i2);
            C2055m c2055m = (C2055m) childAt.getLayoutParams();
            C2061s m6313a = CollapsingToolbarLayout.m6313a(childAt);
            switch (c2055m.f9068a) {
                case 1:
                    m6313a.m6331a(C0418a.m1478a(-i, 0, this.f9070a.m6320b(childAt)));
                    break;
                case 2:
                    m6313a.m6331a(Math.round((-i) * c2055m.f9069b));
                    break;
            }
        }
        this.f9070a.m6319a();
        if (this.f9070a.f9027b != null && m1766b > 0) {
            C0538w.m1874f(this.f9070a);
        }
        this.f9070a.f9026a.m7157b(Math.abs(i) / ((this.f9070a.getHeight() - C0538w.m1886o(this.f9070a)) - m1766b));
    }
}
