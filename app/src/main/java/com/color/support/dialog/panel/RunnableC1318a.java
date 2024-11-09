package com.color.support.dialog.panel;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBottomSheetBehavior.java */
/* renamed from: com.color.support.dialog.panel.a */
/* loaded from: classes.dex */
public final class RunnableC1318a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f5672a;

    /* renamed from: b */
    final /* synthetic */ int f5673b;

    /* renamed from: c */
    final /* synthetic */ ColorBottomSheetBehavior f5674c;

    public RunnableC1318a(ColorBottomSheetBehavior colorBottomSheetBehavior, View view, int i) {
        this.f5674c = colorBottomSheetBehavior;
        this.f5672a = view;
        this.f5673b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5674c.m4320a(this.f5672a, this.f5673b);
    }
}
