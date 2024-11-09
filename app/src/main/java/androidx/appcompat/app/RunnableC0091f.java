package androidx.appcompat.app;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
public final class RunnableC0091f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f295a;

    /* renamed from: b */
    final /* synthetic */ View f296b;

    /* renamed from: c */
    final /* synthetic */ AlertController f297c;

    public RunnableC0091f(AlertController alertController, View view, View view2) {
        this.f297c = alertController;
        this.f295a = view;
        this.f296b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.m50a(this.f297c.f92i, this.f295a, this.f296b);
    }
}
