package com.google.android.material.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0534s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrimInsetsFrameLayout.java */
/* renamed from: com.google.android.material.internal.aa */
/* loaded from: classes.dex */
public final class C2232aa implements InterfaceC0534s {

    /* renamed from: a */
    final /* synthetic */ ScrimInsetsFrameLayout f9902a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2232aa(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        this.f9902a = scrimInsetsFrameLayout;
    }

    @Override // androidx.core.p024g.InterfaceC0534s
    /* renamed from: a */
    public final C0514ao mo250a(View view, C0514ao c0514ao) {
        if (this.f9902a.f9896b == null) {
            this.f9902a.f9896b = new Rect();
        }
        this.f9902a.f9896b.set(c0514ao.m1764a(), c0514ao.m1766b(), c0514ao.m1767c(), c0514ao.m1768d());
        this.f9902a.mo7074a(c0514ao);
        this.f9902a.setWillNotDraw(!c0514ao.m1769e() || this.f9902a.f9895a == null);
        C0538w.m1874f(this.f9902a);
        return c0514ao.m1771g();
    }
}
