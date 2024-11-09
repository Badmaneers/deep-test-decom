package com.color.support.widget;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

/* compiled from: SecurityKeyboardView.java */
/* renamed from: com.color.support.widget.gg */
/* loaded from: classes.dex */
final class HandlerC1549gg extends Handler {

    /* renamed from: a */
    final /* synthetic */ SecurityKeyboardView f7351a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC1549gg(SecurityKeyboardView securityKeyboardView) {
        this.f7351a = securityKeyboardView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        TextView textView;
        boolean m4838c;
        switch (message.what) {
            case 1:
                this.f7351a.m4834b(message.arg1);
                return;
            case 2:
                Log.d("SecurityKeyboardView", "handleMessage MSG_REMOVE_PREVIEW");
                textView = this.f7351a.f6867m;
                textView.setVisibility(4);
                return;
            case 3:
                m4838c = this.f7351a.m4838c();
                if (m4838c) {
                    sendMessageDelayed(Message.obtain(this, 3), 50L);
                    return;
                }
                return;
            case 4:
                SecurityKeyboardView securityKeyboardView = this.f7351a;
                Object obj = message.obj;
                SecurityKeyboardView.m4839c(securityKeyboardView);
                return;
            default:
                return;
        }
    }
}
