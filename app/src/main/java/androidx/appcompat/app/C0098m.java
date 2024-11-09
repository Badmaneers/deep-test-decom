package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertController.java */
/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes.dex */
public final class C0098m implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f354a;

    /* renamed from: b */
    final /* synthetic */ AlertController f355b;

    /* renamed from: c */
    final /* synthetic */ C0094i f356c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0098m(C0094i c0094i, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f356c = c0094i;
        this.f354a = recycleListView;
        this.f355b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f356c.f309F != null) {
            this.f356c.f309F[i] = this.f354a.isItemChecked(i);
        }
        this.f356c.f313J.onClick(this.f355b.f84a, i, this.f354a.isItemChecked(i));
    }
}
