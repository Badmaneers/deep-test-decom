package com.coloros.deeptesting.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemProperties;
import android.text.TextUtils;
import android.view.View;
import com.coloros.deeptesting.R;
import com.coloros.deeptesting.p064a.C1842h;
import com.coloros.neton.BuildConfig;

/* compiled from: ApplyActivity.java */
/* renamed from: com.coloros.deeptesting.activity.e */
/* loaded from: classes.dex */
final class ViewOnClickListenerC1849e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ApplyActivity f8601a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1849e(ApplyActivity applyActivity) {
        this.f8601a = applyActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        Handler handler;
        z = this.f8601a.f8579q;
        if (z) {
            if (!C1842h.m5959a()) {
                this.f8601a.finish();
                return;
            }
            if (!TextUtils.isEmpty(SystemProperties.get("ro.oppo.operator", BuildConfig.FLAVOR))) {
                Intent intent = new Intent(this.f8601a, (Class<?>) StatusActivity.class);
                intent.putExtra("resultCode", 11);
                this.f8601a.startActivity(intent);
                this.f8601a.finish();
                return;
            }
            if (C1842h.m5960a((Context) this.f8601a)) {
                this.f8601a.m5973h();
                ApplyActivity applyActivity = this.f8601a;
                handler = this.f8601a.f8581s;
                C1842h.m5957a(applyActivity, 1000, handler);
                return;
            }
            C1842h.m5958a(this.f8601a, this.f8601a.getString(R.string.dialog_title), this.f8601a.getString(R.string.dialog_nonetwork), null);
        }
    }
}
