package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: YearGridAdapter.java */
/* renamed from: com.google.android.material.datepicker.av */
/* loaded from: classes.dex */
final class ViewOnClickListenerC2152av implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f9586a;

    /* renamed from: b */
    final /* synthetic */ C2151au f9587b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC2152av(C2151au c2151au, int i) {
        this.f9587b = c2151au;
        this.f9586a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2163k c2163k;
        C2163k c2163k2;
        C2163k c2163k3;
        C2163k c2163k4;
        int i = this.f9586a;
        c2163k = this.f9587b.f9585a;
        Month m6815a = Month.m6815a(i, c2163k.m6888c().f9540a);
        c2163k2 = this.f9587b.f9585a;
        Month m6795a = c2163k2.m6890e().m6795a(m6815a);
        c2163k3 = this.f9587b.f9585a;
        c2163k3.m6884a(m6795a);
        c2163k4 = this.f9587b.f9585a;
        c2163k4.m6889d(C2174v.f9650a);
    }
}
