package com.google.android.material.datepicker;

import android.widget.Button;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [S] */
/* compiled from: MaterialDatePicker.java */
/* renamed from: com.google.android.material.datepicker.ab */
/* loaded from: classes.dex */
public final class C2132ab<S> implements InterfaceC2141ak<S> {

    /* renamed from: a */
    final /* synthetic */ C2177y f9555a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2132ab(C2177y c2177y) {
        this.f9555a = c2177y;
    }

    @Override // com.google.android.material.datepicker.InterfaceC2141ak
    /* renamed from: a */
    public final void mo6834a(S s) {
        DateSelector dateSelector;
        Button button;
        Button button2;
        this.f9555a.m6897af();
        dateSelector = this.f9555a.f9662am;
        if (dateSelector.mo6808b()) {
            button2 = this.f9555a.f9673ax;
            button2.setEnabled(true);
        } else {
            button = this.f9555a.f9673ax;
            button.setEnabled(false);
        }
    }
}
