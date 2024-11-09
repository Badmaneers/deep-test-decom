package color.support.p043v7.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.e */
/* loaded from: classes.dex */
public final class RunnableC1278e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1277d f5436a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1278e(C1277d c1277d) {
        this.f5436a = c1277d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View m4221m = this.f5436a.m4221m();
        if (m4221m == null || m4221m.getWindowToken() == null) {
            return;
        }
        this.f5436a.mo4108h();
    }
}
