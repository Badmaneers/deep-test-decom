package com.coloros.deeptesting.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.color.support.dialog.p050a.DialogC1312a;

/* compiled from: ApplyActivity.java */
/* renamed from: com.coloros.deeptesting.activity.a */
/* loaded from: classes.dex */
final class HandlerC1845a extends Handler {

    /* renamed from: a */
    final /* synthetic */ ApplyActivity f8597a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC1845a(ApplyActivity applyActivity) {
        this.f8597a = applyActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        DialogC1312a dialogC1312a;
        dialogC1312a = this.f8597a.f8580r;
        dialogC1312a.dismiss();
        Intent intent = new Intent(this.f8597a, (Class<?>) StatusActivity.class);
        intent.putExtra("resultCode", message.what);
        intent.putExtra("data", (String) message.obj);
        this.f8597a.startActivity(intent);
        this.f8597a.finish();
    }
}
