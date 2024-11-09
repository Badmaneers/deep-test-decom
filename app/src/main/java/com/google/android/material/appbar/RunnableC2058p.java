package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p024g.C0538w;

/* compiled from: HeaderBehavior.java */
/* renamed from: com.google.android.material.appbar.p */
/* loaded from: classes.dex */
final class RunnableC2058p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC2057o f9078a;

    /* renamed from: b */
    private final CoordinatorLayout f9079b;

    /* renamed from: c */
    private final View f9080c;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC2058p(AbstractC2057o abstractC2057o, CoordinatorLayout coordinatorLayout, V v) {
        this.f9078a = abstractC2057o;
        this.f9079b = coordinatorLayout;
        this.f9080c = v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9080c == null || this.f9078a.f9071a == null) {
            return;
        }
        if (this.f9078a.f9071a.computeScrollOffset()) {
            this.f9078a.m6323a_(this.f9079b, this.f9080c, this.f9078a.f9071a.getCurrY());
            C0538w.m1852a(this.f9080c, this);
        } else {
            this.f9078a.mo6305c(this.f9079b, this.f9080c);
        }
    }
}
