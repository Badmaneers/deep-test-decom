package color.support.p043v7.app;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ColorAlertController.java */
/* renamed from: color.support.v7.app.z */
/* loaded from: classes.dex */
public final class C1216z implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f5026a;

    /* renamed from: b */
    final /* synthetic */ C1213w f5027b;

    public C1216z(C1213w c1213w, AlertController alertController) {
        this.f5027b = c1213w;
        this.f5026a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f5027b.f4936I != null) {
            this.f5027b.f4936I[i] = this.f5026a.f4873e.isItemChecked(i);
        }
        this.f5027b.f4940M.onClick(this.f5026a.f4869a, i, this.f5026a.f4873e.isItemChecked(i));
        if (this.f5027b.f4937J) {
            int i2 = this.f5026a.f4873e.isItemChecked(i) ? 2 : 0;
            if (this.f5027b.f4941N == null) {
                ((C1205o) this.f5026a.f4884p).m4008a(i2, i, this.f5026a.f4873e);
            } else {
                ((C1207q) this.f5026a.f4884p).m4009a(i2, i, this.f5026a.f4873e);
            }
        }
    }
}
