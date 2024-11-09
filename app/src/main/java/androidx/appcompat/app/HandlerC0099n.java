package androidx.appcompat.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes.dex */
final class HandlerC0099n extends Handler {

    /* renamed from: a */
    private WeakReference<DialogInterface> f357a;

    public HandlerC0099n(DialogInterface dialogInterface) {
        this.f357a = new WeakReference<>(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            switch (i) {
                case -3:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick(this.f357a.get(), message.what);
                    return;
                default:
                    return;
            }
        }
        ((DialogInterface) message.obj).dismiss();
    }
}
