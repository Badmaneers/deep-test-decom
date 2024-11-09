package androidx.slidingpanelayout.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlidingPaneLayout.java */
/* renamed from: androidx.slidingpanelayout.widget.b */
/* loaded from: classes.dex */
public final class RunnableC0976b implements Runnable {

    /* renamed from: a */
    final View f3979a;

    /* renamed from: b */
    final /* synthetic */ SlidingPaneLayout f3980b;

    public RunnableC0976b(SlidingPaneLayout slidingPaneLayout, View view) {
        this.f3980b = slidingPaneLayout;
        this.f3979a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3979a.getParent() == this.f3980b) {
            this.f3979a.setLayerType(0, null);
            this.f3980b.m3432b(this.f3979a);
        }
        this.f3980b.f3959g.remove(this);
    }
}
