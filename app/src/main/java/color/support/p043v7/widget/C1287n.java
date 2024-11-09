package color.support.p043v7.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.n */
/* loaded from: classes.dex */
public final class C1287n implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ C1277d f5459a;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    private C1287n(C1277d c1277d) {
        this.f5459a = c1277d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1287n(C1277d c1277d, byte b) {
        this(c1277d);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        Handler handler;
        RunnableC1289p runnableC1289p;
        RunnableC1289p runnableC1289p2;
        if (i != 1 || this.f5459a.m4225q() || this.f5459a.f5412c.getContentView() == null) {
            return;
        }
        handler = this.f5459a.f5407A;
        runnableC1289p = this.f5459a.f5431v;
        handler.removeCallbacks(runnableC1289p);
        runnableC1289p2 = this.f5459a.f5431v;
        runnableC1289p2.run();
    }
}
