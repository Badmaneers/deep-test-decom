package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.l */
/* loaded from: classes.dex */
public final class C0097l implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f352a;

    /* renamed from: b */
    final /* synthetic */ C0094i f353b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0097l(C0094i c0094i, AlertController alertController) {
        this.f353b = c0094i;
        this.f352a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f353b.f342x.onClick(this.f352a.f84a, i);
        if (this.f353b.f311H) {
            return;
        }
        this.f352a.f84a.dismiss();
    }
}
