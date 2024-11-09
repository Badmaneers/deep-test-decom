package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtendedFloatingActionButton.java */
/* renamed from: com.google.android.material.floatingactionbutton.f */
/* loaded from: classes.dex */
public final class C2196f implements InterfaceC2204n {

    /* renamed from: a */
    final /* synthetic */ ExtendedFloatingActionButton f9749a;

    public C2196f(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f9749a = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2204n
    /* renamed from: a */
    public final int mo6994a() {
        return this.f9749a.getCollapsedSize();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2204n
    /* renamed from: b */
    public final int mo6995b() {
        return this.f9749a.getCollapsedSize();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC2204n
    /* renamed from: c */
    public final ViewGroup.LayoutParams mo6996c() {
        return new ViewGroup.LayoutParams(this.f9749a.getCollapsedSize(), this.f9749a.getCollapsedSize());
    }
}
