package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Chip.java */
/* renamed from: com.google.android.material.chip.b */
/* loaded from: classes.dex */
public final class C2112b extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ Chip f9437a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2112b(Chip chip) {
        this.f9437a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        C2114d c2114d;
        C2114d c2114d2;
        c2114d = this.f9437a.f9410e;
        if (c2114d != null) {
            c2114d2 = this.f9437a.f9410e;
            c2114d2.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
