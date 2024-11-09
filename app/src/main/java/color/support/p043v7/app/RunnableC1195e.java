package color.support.p043v7.app;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.e */
/* loaded from: classes.dex */
public final class RunnableC1195e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f4925a;

    /* renamed from: b */
    final /* synthetic */ View f4926b;

    /* renamed from: c */
    final /* synthetic */ AlertController f4927c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1195e(AlertController alertController, View view, View view2) {
        this.f4927c = alertController;
        this.f4925a = view;
        this.f4926b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.m3949a(this.f4927c.f4873e, this.f4925a, this.f4926b);
    }
}
