package com.google.android.material.behavior;

import android.view.View;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.p025a.InterfaceC0491l;

/* compiled from: SwipeDismissBehavior.java */
/* renamed from: com.google.android.material.behavior.c */
/* loaded from: classes.dex */
final class C2068c implements InterfaceC0491l {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f9143a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2068c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f9143a = swipeDismissBehavior;
    }

    @Override // androidx.core.p024g.p025a.InterfaceC0491l
    /* renamed from: a */
    public final boolean mo1722a(View view) {
        boolean z = false;
        if (!this.f9143a.mo6392a(view)) {
            return false;
        }
        boolean z2 = C0538w.m1878h(view) == 1;
        if ((this.f9143a.f9131c == 0 && z2) || (this.f9143a.f9131c == 1 && !z2)) {
            z = true;
        }
        C0538w.m1871d(view, z ? -view.getWidth() : view.getWidth());
        view.setAlpha(0.0f);
        if (this.f9143a.f9130b != null) {
            this.f9143a.f9130b.mo6397a(view);
        }
        return true;
    }
}
