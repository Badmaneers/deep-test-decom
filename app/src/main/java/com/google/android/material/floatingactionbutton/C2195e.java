package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtendedFloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.e */
/* loaded from: classes.dex */
public final class C2195e implements InterfaceC2204n {

    /* renamed from: a */
    final /* synthetic */ ExtendedFloatingActionButton f9748a;

    public C2195e(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f9748a = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2204n
    /* renamed from: a */
    public final int mo6994a() {
        return this.f9748a.getMeasuredWidth();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2204n
    /* renamed from: b */
    public final int mo6995b() {
        return this.f9748a.getMeasuredHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2204n
    /* renamed from: c */
    public final ViewGroup.LayoutParams mo6996c() {
        return new ViewGroup.LayoutParams(-2, -2);
    }
}
