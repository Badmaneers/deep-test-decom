package com.google.android.material.snackbar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.n */
/* loaded from: classes.dex */
public final class RunnableC2339n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f10322a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2339n(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10322a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10322a.f10274b == null) {
            return;
        }
        this.f10322a.f10274b.setVisibility(0);
        if (this.f10322a.f10274b.getAnimationMode() == 1) {
            BaseTransientBottomBar.m7434c(this.f10322a);
        } else {
            BaseTransientBottomBar.m7435d(this.f10322a);
        }
    }
}
