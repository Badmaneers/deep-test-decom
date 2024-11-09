package androidx.appcompat.app;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.g */
/* loaded from: classes.dex */
public final class C0092g implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ View f298a;

    /* renamed from: b */
    final /* synthetic */ View f299b;

    /* renamed from: c */
    final /* synthetic */ AlertController f300c;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C0092g(AlertController alertController, View view, View view2) {
        this.f300c = alertController;
        this.f298a = view;
        this.f299b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m50a(absListView, this.f298a, this.f299b);
    }
}
