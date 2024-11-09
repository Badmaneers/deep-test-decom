package androidx.appcompat.app;

import android.os.Message;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0089d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f291a;

    public ViewOnClickListenerC0089d(AlertController alertController) {
        this.f291a = alertController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message obtain;
        if (view == this.f291a.f86c && this.f291a.f87d != null) {
            obtain = Message.obtain(this.f291a.f87d);
        } else if (view == this.f291a.f88e && this.f291a.f89f != null) {
            obtain = Message.obtain(this.f291a.f89f);
        } else {
            obtain = (view != this.f291a.f90g || this.f291a.f91h == null) ? null : Message.obtain(this.f291a.f91h);
        }
        if (obtain != null) {
            obtain.sendToTarget();
        }
        this.f291a.f99p.obtainMessage(1, this.f291a.f84a).sendToTarget();
    }
}
