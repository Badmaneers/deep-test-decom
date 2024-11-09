package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2173u implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2138ah f9648a;

    /* renamed from: b */
    final /* synthetic */ C2163k f9649b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2173u(C2163k c2163k, C2138ah c2138ah) {
        this.f9649b = c2163k;
        this.f9648a = c2138ah;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int m2851p = this.f9649b.m6887af().m2851p() - 1;
        if (m2851p >= 0) {
            this.f9649b.m6884a(this.f9648a.m6841d(m2851p));
        }
    }
}
