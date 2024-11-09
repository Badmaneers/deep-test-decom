package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: MonthsPagerAdapter.java */
/* renamed from: com.google.android.material.datepicker.ai */
/* loaded from: classes.dex */
final class C2139ai implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ MaterialCalendarGridView f9569a;

    /* renamed from: b */
    final /* synthetic */ C2138ah f9570b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2139ai(C2138ah c2138ah, MaterialCalendarGridView materialCalendarGridView) {
        this.f9570b = c2138ah;
        this.f9569a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        InterfaceC2175w interfaceC2175w;
        C2137ag m6813a = this.f9569a.m6813a();
        if (i >= m6813a.f9561b.m6819b() && i <= m6813a.m6836a()) {
            interfaceC2175w = this.f9570b.f9567c;
            interfaceC2175w.mo6892a(this.f9569a.m6813a().getItem(i).longValue());
        }
    }
}
