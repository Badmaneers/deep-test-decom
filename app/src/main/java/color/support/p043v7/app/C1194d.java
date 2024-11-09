package color.support.p043v7.app;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.d */
/* loaded from: classes.dex */
public final class C1194d implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ View f4922a;

    /* renamed from: b */
    final /* synthetic */ View f4923b;

    /* renamed from: c */
    final /* synthetic */ AlertController f4924c;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1194d(AlertController alertController, View view, View view2) {
        this.f4924c = alertController;
        this.f4922a = view;
        this.f4923b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m3949a(absListView, this.f4922a, this.f4923b);
    }
}
