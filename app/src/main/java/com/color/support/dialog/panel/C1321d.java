package com.color.support.dialog.panel;

import android.view.View;
import androidx.core.p024g.p025a.InterfaceC0491l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBottomSheetBehavior.java */
/* renamed from: com.color.support.dialog.panel.d */
/* loaded from: classes.dex */
public final class C1321d implements InterfaceC0491l {

    /* renamed from: a */
    final /* synthetic */ int f5677a;

    /* renamed from: b */
    final /* synthetic */ ColorBottomSheetBehavior f5678b;

    public C1321d(ColorBottomSheetBehavior colorBottomSheetBehavior, int i) {
        this.f5678b = colorBottomSheetBehavior;
        this.f5677a = i;
    }

    @Override // androidx.core.p024g.p025a.InterfaceC0491l
    /* renamed from: a */
    public final boolean mo1722a(View view) {
        this.f5678b.m4327c(this.f5677a);
        return true;
    }
}
