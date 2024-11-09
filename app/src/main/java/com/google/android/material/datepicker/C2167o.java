package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
final class C2167o implements InterfaceC2175w {

    /* renamed from: a */
    final /* synthetic */ C2163k f9637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2167o(C2163k c2163k) {
        this.f9637a = c2163k;
    }

    @Override // com.google.android.material.datepicker.InterfaceC2175w
    /* renamed from: a */
    public final void mo6892a(long j) {
        CalendarConstraints calendarConstraints;
        DateSelector dateSelector;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        DateSelector dateSelector2;
        calendarConstraints = this.f9637a.f9630h;
        if (calendarConstraints.m6794a().mo6802a(j)) {
            dateSelector = this.f9637a.f9629g;
            dateSelector.mo6806a(j);
            Iterator it = this.f9637a.f9573e.iterator();
            while (it.hasNext()) {
                InterfaceC2141ak interfaceC2141ak = (InterfaceC2141ak) it.next();
                dateSelector2 = this.f9637a.f9629g;
                interfaceC2141ak.mo6834a(dateSelector2.mo6804a());
            }
            recyclerView = this.f9637a.f9625ah;
            recyclerView.getAdapter().m3028d();
            recyclerView2 = this.f9637a.f9624ag;
            if (recyclerView2 != null) {
                recyclerView3 = this.f9637a.f9624ag;
                recyclerView3.getAdapter().m3028d();
            }
        }
    }
}
