package com.google.android.material.snackbar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.l */
/* loaded from: classes.dex */
public final class C2337l implements InterfaceC2342q {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10320a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2337l(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10320a = baseTransientBottomBar;
    }

    @Override // com.google.android.material.snackbar.InterfaceC2342q
    /* renamed from: a */
    public final void mo7454a() {
        this.f10320a.f10274b.setOnLayoutChangeListener(null);
        this.f10320a.m7439f();
    }
}
