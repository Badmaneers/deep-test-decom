package com.google.android.material.behavior;

import android.view.View;
import androidx.core.p024g.C0538w;

/* compiled from: SwipeDismissBehavior.java */
/* renamed from: com.google.android.material.behavior.e */
/* loaded from: classes.dex */
final class RunnableC2070e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f9144a;

    /* renamed from: b */
    private final View f9145b;

    /* renamed from: c */
    private final boolean f9146c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2070e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f9144a = swipeDismissBehavior;
        this.f9145b = view;
        this.f9146c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9144a.f9129a != null && this.f9144a.f9129a.m2136g()) {
            C0538w.m1852a(this.f9145b, this);
        } else {
            if (!this.f9146c || this.f9144a.f9130b == null) {
                return;
            }
            this.f9144a.f9130b.mo6397a(this.f9145b);
        }
    }
}
