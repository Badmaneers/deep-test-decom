package color.support.p043v7.app;

import android.view.View;
import android.widget.AdapterView;
import color.support.p043v7.app.AlertController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: color.support.v7.app.j */
/* loaded from: classes.dex */
public final class C1200j implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f4982a;

    /* renamed from: b */
    final /* synthetic */ AlertController f4983b;

    /* renamed from: c */
    final /* synthetic */ C1196f f4984c;

    public C1200j(C1196f c1196f, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f4984c = c1196f;
        this.f4982a = recycleListView;
        this.f4983b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f4984c.f4936I != null) {
            this.f4984c.f4936I[i] = this.f4982a.isItemChecked(i);
        }
        this.f4984c.f4940M.onClick(this.f4983b.f4869a, i, this.f4982a.isItemChecked(i));
    }
}
