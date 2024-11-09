package com.google.android.material.snackbar;

import android.os.Build;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.j */
/* loaded from: classes.dex */
public final class C2335j implements InterfaceC2341p {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10318a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2335j(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10318a = baseTransientBottomBar;
    }

    @Override // com.google.android.material.snackbar.InterfaceC2341p
    /* renamed from: a */
    public final void mo7452a() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f10318a.f10274b.getRootWindowInsets()) == null) {
            return;
        }
        this.f10318a.f10285p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        this.f10318a.m7438e();
    }

    @Override // com.google.android.material.snackbar.InterfaceC2341p
    /* renamed from: b */
    public final void mo7453b() {
        if (C2345t.m7457a().m7468f(this.f10318a.f10275c)) {
            BaseTransientBottomBar.f10270a.post(new RunnableC2336k(this));
        }
    }
}
