package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class RunnableC2165m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f9633a;

    /* renamed from: b */
    final /* synthetic */ C2163k f9634b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2165m(C2163k c2163k, int i) {
        this.f9634b = c2163k;
        this.f9633a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        recyclerView = this.f9634b.f9625ah;
        recyclerView.smoothScrollToPosition(this.f9633a);
    }
}
