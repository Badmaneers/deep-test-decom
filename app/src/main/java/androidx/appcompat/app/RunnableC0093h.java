package androidx.appcompat.app;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
public final class RunnableC0093h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f301a;

    /* renamed from: b */
    final /* synthetic */ View f302b;

    /* renamed from: c */
    final /* synthetic */ AlertController f303c;

    public RunnableC0093h(AlertController alertController, View view, View view2) {
        this.f303c = alertController;
        this.f301a = view;
        this.f302b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.m50a(this.f303c.f85b, this.f301a, this.f302b);
    }
}
