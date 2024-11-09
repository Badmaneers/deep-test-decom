package com.coloros.deeptesting.activity;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.coloros.deeptesting.R;
import com.coloros.deeptesting.p064a.C1842h;

/* compiled from: MainActivity.java */
/* renamed from: com.coloros.deeptesting.activity.h */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1852h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MainActivity f8604a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1852h(MainActivity mainActivity) {
        this.f8604a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Handler handler;
        if (C1842h.m5960a((Context) this.f8604a)) {
            this.f8604a.m5982h();
            this.f8604a.f8583k = 11;
            MainActivity mainActivity = this.f8604a;
            handler = this.f8604a.f8587o;
            C1842h.m5957a(mainActivity, 1001, handler);
            return;
        }
        C1842h.m5958a(this.f8604a, this.f8604a.getString(R.string.dialog_title), this.f8604a.getString(R.string.dialog_nonetwork), null);
    }
}
