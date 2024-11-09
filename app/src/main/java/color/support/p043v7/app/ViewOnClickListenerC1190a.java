package color.support.p043v7.app;

import android.os.Message;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.a */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1190a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f4909a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC1190a(AlertController alertController) {
        this.f4909a = alertController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message obtain;
        if (view == this.f4909a.f4874f && this.f4909a.f4876h != null) {
            obtain = Message.obtain(this.f4909a.f4876h);
        } else if (view == this.f4909a.f4877i && this.f4909a.f4879k != null) {
            obtain = Message.obtain(this.f4909a.f4879k);
        } else {
            obtain = (view != this.f4909a.f4880l || this.f4909a.f4882n == null) ? null : Message.obtain(this.f4909a.f4882n);
        }
        if (obtain != null) {
            obtain.sendToTarget();
        }
        this.f4909a.f4891w.obtainMessage(1, this.f4909a.f4869a).sendToTarget();
    }
}
