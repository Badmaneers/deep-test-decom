package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver;

/* compiled from: CoordinatorLayout.java */
/* renamed from: androidx.coordinatorlayout.widget.g */
/* loaded from: classes.dex */
final class ViewTreeObserverOnPreDrawListenerC0395g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f2098a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnPreDrawListenerC0395g(CoordinatorLayout coordinatorLayout) {
        this.f2098a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f2098a.m1399a(0);
        return true;
    }
}
