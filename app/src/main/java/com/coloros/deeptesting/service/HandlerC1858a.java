package com.coloros.deeptesting.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* compiled from: RequestService.java */
/* renamed from: com.coloros.deeptesting.service.a */
/* loaded from: classes.dex */
final class HandlerC1858a extends Handler {

    /* renamed from: a */
    final /* synthetic */ RequestService f8615a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1858a(RequestService requestService, Looper looper) {
        super(looper);
        this.f8615a = requestService;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        int i;
        String str2;
        Messenger messenger;
        Message message2 = new Message();
        C1860c m5990a = this.f8615a.m5990a();
        if (m5990a == null) {
            message2.what = 100;
        } else {
            message2.what = m5990a.f8622a;
            message2.obj = m5990a.f8623b;
            if (m5990a.f8624c != null) {
                str = m5990a.f8624c.f8625a;
                if (str != null) {
                    message2.what = m5990a.f8622a + 1;
                    str2 = m5990a.f8624c.f8625a;
                    message2.obj = str2;
                } else {
                    message2.what = m5990a.f8622a;
                    i = m5990a.f8624c.f8626b;
                    message2.obj = Integer.valueOf(i);
                }
            }
        }
        try {
            messenger = this.f8615a.f8613d;
            messenger.send(message2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
