package com.google.android.material.datepicker;

import androidx.recyclerview.widget.C0876cb;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
final class C2166n extends C2148ar {

    /* renamed from: a */
    final /* synthetic */ int f9635a;

    /* renamed from: b */
    final /* synthetic */ C2163k f9636b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166n(C2163k c2163k, int i, int i2) {
        super(i);
        this.f9636b = c2163k;
        this.f9635a = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo2830a(C0876cb c0876cb, int[] iArr) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        if (this.f9635a == 0) {
            recyclerView3 = this.f9636b.f9625ah;
            iArr[0] = recyclerView3.getWidth();
            recyclerView4 = this.f9636b.f9625ah;
            iArr[1] = recyclerView4.getWidth();
            return;
        }
        recyclerView = this.f9636b.f9625ah;
        iArr[0] = recyclerView.getHeight();
        recyclerView2 = this.f9636b.f9625ah;
        iArr[1] = recyclerView2.getHeight();
    }
}
