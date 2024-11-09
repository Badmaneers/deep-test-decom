package com.google.android.material.transformation;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.p077f.InterfaceC2181b;

/* compiled from: ExpandableBehavior.java */
/* renamed from: com.google.android.material.transformation.a */
/* loaded from: classes.dex */
final class ViewTreeObserverOnPreDrawListenerC2403a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f10618a;

    /* renamed from: b */
    final /* synthetic */ int f10619b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC2181b f10620c;

    /* renamed from: d */
    final /* synthetic */ ExpandableBehavior f10621d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnPreDrawListenerC2403a(ExpandableBehavior expandableBehavior, View view, int i, InterfaceC2181b interfaceC2181b) {
        this.f10621d = expandableBehavior;
        this.f10618a = view;
        this.f10619b = i;
        this.f10620c = interfaceC2181b;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        this.f10618a.getViewTreeObserver().removeOnPreDrawListener(this);
        i = this.f10621d.f10607a;
        if (i == this.f10619b) {
            this.f10621d.mo7694a((View) this.f10620c, this.f10618a, this.f10620c.mo6911a(), false);
        }
        return false;
    }
}
