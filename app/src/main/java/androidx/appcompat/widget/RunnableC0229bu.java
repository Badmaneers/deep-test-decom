package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.bu */
/* loaded from: classes.dex */
public final class RunnableC0229bu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0228bt f1266a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0229bu(C0228bt c0228bt) {
        this.f1266a = c0228bt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View m871m = this.f1266a.m871m();
        if (m871m == null || m871m.getWindowToken() == null) {
            return;
        }
        this.f1266a.mo391a_();
    }
}
