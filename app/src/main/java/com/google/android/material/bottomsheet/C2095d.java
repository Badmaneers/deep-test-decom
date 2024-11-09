package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.p024g.p025a.InterfaceC0491l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetBehavior.java */
/* renamed from: com.google.android.material.bottomsheet.d */
/* loaded from: classes.dex */
public final class C2095d implements InterfaceC0491l {

    /* renamed from: a */
    final /* synthetic */ int f9305a;

    /* renamed from: b */
    final /* synthetic */ BottomSheetBehavior f9306b;

    public C2095d(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f9306b = bottomSheetBehavior;
        this.f9305a = i;
    }

    @Override // androidx.core.p024g.p025a.InterfaceC0491l
    /* renamed from: a */
    public final boolean mo1722a(View view) {
        this.f9306b.mo4357e(this.f9305a);
        return true;
    }
}
