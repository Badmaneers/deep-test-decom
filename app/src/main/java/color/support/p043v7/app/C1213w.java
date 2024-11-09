package color.support.p043v7.app;

import android.content.Context;

/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.w */
/* loaded from: classes.dex */
public final class C1213w extends C1196f {

    /* renamed from: T */
    public String f5021T;

    public C1213w(Context context) {
        super(context);
    }

    @Override // color.support.p043v7.app.C1196f
    /* renamed from: a */
    public final void mo3999a(AlertController alertController) {
        super.mo3999a(alertController);
        if (this.f4969w == null && this.f4941N == null && this.f4972z == null) {
            return;
        }
        if (this.f4937J) {
            if (this.f4941N == null) {
                alertController.f4884p = new C1214x(this, this.f4947a, alertController.f4888t, this.f4969w, this.f4970x, this.f4936I, alertController);
            } else {
                alertController.f4884p = new C1215y(this, this.f4947a, this.f4941N, alertController.f4888t, this.f4942O, this.f4943P, this.f5021T, this.f4937J, alertController);
            }
        } else if (this.f4938K) {
            int i = alertController.f4889u;
            if (this.f4941N != null) {
                alertController.f4884p = new C1207q(this.f4947a, this.f4941N, i, this.f4942O, this.f5021T);
            } else if (this.f4972z == null) {
                alertController.f4884p = new C1205o(this.f4947a, i, this.f4969w, this.f4970x);
            }
        }
        if (this.f4940M != null) {
            alertController.f4873e.setOnItemClickListener(new C1216z(this, alertController));
        }
    }
}
