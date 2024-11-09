package com.coloros.deeptesting.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.color.support.dialog.p050a.DialogC1312a;
import com.coloros.deeptesting.R;
import com.coloros.deeptesting.p064a.C1842h;

/* compiled from: MainActivity.java */
/* renamed from: com.coloros.deeptesting.activity.f */
/* loaded from: classes.dex */
final class HandlerC1850f extends Handler {

    /* renamed from: a */
    final /* synthetic */ MainActivity f8602a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC1850f(MainActivity mainActivity) {
        this.f8602a = mainActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        DialogC1312a dialogC1312a;
        DialogC1312a dialogC1312a2;
        i = this.f8602a.f8583k;
        switch (i) {
            case 11:
                dialogC1312a = this.f8602a.f8586n;
                dialogC1312a.dismiss();
                Intent intent = new Intent(this.f8602a, (Class<?>) StatusActivity.class);
                intent.putExtra("resultCode", message.what);
                intent.putExtra("data", (String) message.obj);
                this.f8602a.startActivity(intent);
                return;
            case 12:
                if (message.what == 0) {
                    C1842h.m5965c();
                    this.f8602a.f8582j = -1;
                    this.f8602a.onStart();
                    return;
                } else {
                    C1842h.m5958a(this.f8602a, this.f8602a.getString(R.string.dialog_title), this.f8602a.getString(R.string.dialog_nonetwork), null);
                    return;
                }
            default:
                dialogC1312a2 = this.f8602a.f8586n;
                dialogC1312a2.dismiss();
                if (message.what == 0) {
                    if (((Integer) message.obj).intValue() == 0) {
                        this.f8602a.f8582j = -2;
                        this.f8602a.onStart();
                        return;
                    } else {
                        this.f8602a.f8582j = -1;
                        this.f8602a.onStart();
                        return;
                    }
                }
                C1842h.m5958a(this.f8602a, this.f8602a.getString(R.string.dialog_title), this.f8602a.getString(R.string.dialog_nonetwork), null);
                return;
        }
    }
}
