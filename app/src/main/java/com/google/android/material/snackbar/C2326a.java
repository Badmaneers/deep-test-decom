package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;

/* compiled from: BaseTransientBottomBar.java */
/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes.dex */
final class C2326a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                ((BaseTransientBottomBar) message.obj).m7443a();
                return true;
            case 1:
                ((BaseTransientBottomBar) message.obj).m7444a(message.arg1);
                return true;
            default:
                return false;
        }
    }
}
