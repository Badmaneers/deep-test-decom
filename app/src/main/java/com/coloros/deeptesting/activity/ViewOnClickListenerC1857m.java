package com.coloros.deeptesting.activity;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.coloros.deeptesting.R;
import com.coloros.deeptesting.p064a.C1842h;

/* compiled from: StatusActivity.java */
/* renamed from: com.coloros.deeptesting.activity.m */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1857m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ StatusActivity f8609a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1857m(StatusActivity statusActivity) {
        this.f8609a = statusActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Handler handler;
        if (!C1842h.m5959a()) {
            this.f8609a.finish();
            return;
        }
        if (!C1842h.m5960a((Context) this.f8609a)) {
            C1842h.m5958a(this.f8609a, this.f8609a.getString(R.string.dialog_title), this.f8609a.getString(R.string.dialog_nonetwork), null);
        } else {
            this.f8609a.m5987a();
            StatusActivity statusActivity = this.f8609a;
            handler = this.f8609a.f8596i;
            C1842h.m5957a(statusActivity, 1002, handler);
        }
    }
}
