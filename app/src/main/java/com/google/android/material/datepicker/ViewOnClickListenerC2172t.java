package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.t */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2172t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2138ah f9646a;

    /* renamed from: b */
    final /* synthetic */ C2163k f9647b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2172t(C2163k c2163k, C2138ah c2138ah) {
        this.f9647b = c2163k;
        this.f9646a = c2138ah;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        int m2849n = this.f9647b.m6887af().m2849n() + 1;
        recyclerView = this.f9647b.f9625ah;
        if (m2849n < recyclerView.getAdapter().mo3020b()) {
            this.f9647b.m6884a(this.f9646a.m6841d(m2849n));
        }
    }
}
