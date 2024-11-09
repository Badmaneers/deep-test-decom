package com.color.support.dialog.panel;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorGuideBehavior.java */
/* renamed from: com.color.support.dialog.panel.g */
/* loaded from: classes.dex */
public final class RunnableC1324g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f5683a;

    /* renamed from: b */
    final /* synthetic */ int f5684b;

    /* renamed from: c */
    final /* synthetic */ ColorGuideBehavior f5685c;

    public RunnableC1324g(ColorGuideBehavior colorGuideBehavior, View view, int i) {
        this.f5685c = colorGuideBehavior;
        this.f5683a = view;
        this.f5684b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5685c.m4351a(this.f5683a, this.f5684b);
    }
}
