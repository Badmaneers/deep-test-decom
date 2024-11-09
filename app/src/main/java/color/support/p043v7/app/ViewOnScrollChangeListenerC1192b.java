package color.support.p043v7.app;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.b */
/* loaded from: classes.dex */
public final class ViewOnScrollChangeListenerC1192b implements View.OnScrollChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f4916a;

    /* renamed from: b */
    final /* synthetic */ View f4917b;

    /* renamed from: c */
    final /* synthetic */ AlertController f4918c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnScrollChangeListenerC1192b(AlertController alertController, View view, View view2) {
        this.f4918c = alertController;
        this.f4916a = view;
        this.f4917b = view2;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        AlertController.m3949a(view, this.f4916a, this.f4917b);
    }
}
