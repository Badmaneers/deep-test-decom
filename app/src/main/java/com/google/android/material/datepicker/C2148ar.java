package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmoothCalendarLayoutManager.java */
/* renamed from: com.google.android.material.datepicker.ar */
/* loaded from: classes.dex */
public class C2148ar extends LinearLayoutManager {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2148ar(int i) {
        super(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0856bi
    /* renamed from: a */
    public final void mo2828a(RecyclerView recyclerView, int i) {
        C2149as c2149as = new C2149as(this, recyclerView.getContext());
        c2149as.m3180c(i);
        m3096a(c2149as);
    }
}
