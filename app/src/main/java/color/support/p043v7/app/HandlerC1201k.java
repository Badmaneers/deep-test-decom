package color.support.p043v7.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.k */
/* loaded from: classes.dex */
final class HandlerC1201k extends Handler {

    /* renamed from: a */
    private WeakReference<DialogInterface> f4985a;

    public HandlerC1201k(DialogInterface dialogInterface) {
        this.f4985a = new WeakReference<>(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            switch (i) {
                case -3:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick(this.f4985a.get(), message.what);
                    return;
                default:
                    return;
            }
        }
        ((DialogInterface) message.obj).dismiss();
    }
}
