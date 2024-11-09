package com.color.support.widget;

import androidx.recyclerview.widget.AbstractC0865br;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorFlingLocateHelper.java */
/* renamed from: com.color.support.widget.an */
/* loaded from: classes.dex */
public final class C1372an extends AbstractC0865br {

    /* renamed from: a */
    boolean f6930a = false;

    /* renamed from: b */
    final /* synthetic */ C1371am f6931b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1372an(C1371am c1371am) {
        this.f6931b = c1371am;
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3136a(RecyclerView recyclerView, int i) {
        super.mo3136a(recyclerView, i);
        if (i == 0 && this.f6930a) {
            this.f6930a = false;
            C1371am.m4891a(this.f6931b);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0865br
    /* renamed from: a */
    public final void mo3137a(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f6930a = true;
    }
}
