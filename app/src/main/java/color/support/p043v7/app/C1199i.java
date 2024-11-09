package color.support.p043v7.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.i */
/* loaded from: classes.dex */
public final class C1199i implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f4980a;

    /* renamed from: b */
    final /* synthetic */ C1196f f4981b;

    public C1199i(C1196f c1196f, AlertController alertController) {
        this.f4981b = c1196f;
        this.f4980a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4981b.f4928A.onClick(this.f4980a.f4869a, i);
        if (this.f4981b.f4938K) {
            return;
        }
        this.f4980a.f4869a.dismiss();
    }
}
