package color.support.p043v7.app;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.c */
/* loaded from: classes.dex */
public final class RunnableC1193c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f4919a;

    /* renamed from: b */
    final /* synthetic */ View f4920b;

    /* renamed from: c */
    final /* synthetic */ AlertController f4921c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1193c(AlertController alertController, View view, View view2) {
        this.f4921c = alertController;
        this.f4919a = view;
        this.f4920b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.m3949a(this.f4921c.f4883o, this.f4919a, this.f4920b);
    }
}
