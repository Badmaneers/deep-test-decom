package androidx.appcompat.widget;

import android.widget.AbsListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.by */
/* loaded from: classes.dex */
public final class C0233by implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ C0228bt f1270a;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0233by(C0228bt c0228bt) {
        this.f1270a = c0228bt;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 1 || this.f1270a.m875q() || this.f1270a.f1247g.getContentView() == null) {
            return;
        }
        this.f1270a.f1246f.removeCallbacks(this.f1270a.f1245e);
        this.f1270a.f1245e.run();
    }
}
