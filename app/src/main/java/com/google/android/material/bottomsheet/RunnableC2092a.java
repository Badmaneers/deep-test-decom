package com.google.android.material.bottomsheet;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetBehavior.java */
/* renamed from: com.google.android.material.bottomsheet.a */
/* loaded from: classes.dex */
public final class RunnableC2092a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f9300a;

    /* renamed from: b */
    final /* synthetic */ int f9301b;

    /* renamed from: c */
    final /* synthetic */ BottomSheetBehavior f9302c;

    public RunnableC2092a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f9302c = bottomSheetBehavior;
        this.f9300a = view;
        this.f9301b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9302c.m6494a(this.f9300a, this.f9301b);
    }
}
