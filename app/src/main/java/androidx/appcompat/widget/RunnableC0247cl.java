package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollingTabContainerView.java */
/* renamed from: androidx.appcompat.widget.cl */
/* loaded from: classes.dex */
public final class RunnableC0247cl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f1293a;

    /* renamed from: b */
    final /* synthetic */ ScrollingTabContainerView f1294b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0247cl(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.f1294b = scrollingTabContainerView;
        this.f1293a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1294b.smoothScrollTo(this.f1293a.getLeft() - ((this.f1294b.getWidth() - this.f1293a.getWidth()) / 2), 0);
        this.f1294b.f929a = null;
    }
}
