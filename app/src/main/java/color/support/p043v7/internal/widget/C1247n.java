package color.support.p043v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.n */
/* loaded from: classes.dex */
public final class C1247n implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ ColorBaseSpinner f5268a;

    /* renamed from: b */
    final /* synthetic */ C1246m f5269b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1247n(C1246m c1246m, ColorBaseSpinner colorBaseSpinner) {
        this.f5269b = c1246m;
        this.f5268a = colorBaseSpinner;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter;
        this.f5269b.f5265a.setSelection(i);
        if (this.f5269b.f5265a.f5091s != null) {
            ColorBaseSpinner colorBaseSpinner = this.f5269b.f5265a;
            listAdapter = this.f5269b.f5267e;
            listAdapter.getItemId(i);
            colorBaseSpinner.m4019a(view);
        }
        this.f5269b.mo4081a();
    }
}
