package androidx.coordinatorlayout.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoordinatorLayout.java */
/* renamed from: androidx.coordinatorlayout.widget.e */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC0393e implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f2079a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewGroupOnHierarchyChangeListenerC0393e(CoordinatorLayout coordinatorLayout) {
        this.f2079a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (this.f2079a.f2058e != null) {
            this.f2079a.f2058e.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        this.f2079a.m1399a(2);
        if (this.f2079a.f2058e != null) {
            this.f2079a.f2058e.onChildViewRemoved(view, view2);
        }
    }
}
