package color.support.p043v7.app;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.v */
/* loaded from: classes.dex */
public final class HandlerC1212v extends Handler {

    /* renamed from: a */
    private WeakReference<ColorAlertController> f5020a;

    public HandlerC1212v(ColorAlertController colorAlertController) {
        this.f5020a = new WeakReference<>(colorAlertController);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
            case 2:
                ((ColorAlertController) message.obj).m3997s();
                return;
            default:
                return;
        }
    }
}
