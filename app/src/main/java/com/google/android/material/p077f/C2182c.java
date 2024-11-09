package com.google.android.material.p077f;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ExpandableWidgetHelper.java */
/* renamed from: com.google.android.material.f.c */
/* loaded from: classes.dex */
public final class C2182c {

    /* renamed from: a */
    private final View f9679a;

    /* renamed from: b */
    private boolean f9680b = false;

    /* renamed from: c */
    private int f9681c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C2182c(InterfaceC2181b interfaceC2181b) {
        this.f9679a = (View) interfaceC2181b;
    }

    /* renamed from: a */
    public final boolean m6914a() {
        return this.f9680b;
    }

    /* renamed from: b */
    public final Bundle m6915b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f9680b);
        bundle.putInt("expandedComponentIdHint", this.f9681c);
        return bundle;
    }

    /* renamed from: a */
    public final void m6913a(Bundle bundle) {
        this.f9680b = bundle.getBoolean("expanded", false);
        this.f9681c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f9680b) {
            ViewParent parent = this.f9679a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m1400a(this.f9679a);
            }
        }
    }

    /* renamed from: a */
    public final void m6912a(int i) {
        this.f9681c = i;
    }

    /* renamed from: c */
    public final int m6916c() {
        return this.f9681c;
    }
}
