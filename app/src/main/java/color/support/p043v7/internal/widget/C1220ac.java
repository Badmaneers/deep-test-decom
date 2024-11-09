package color.support.p043v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.ac */
/* loaded from: classes.dex */
public final class C1220ac implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ ColorSpinner f5209a;

    /* renamed from: b */
    final /* synthetic */ C1256w f5210b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1220ac(C1256w c1256w, ColorSpinner colorSpinner) {
        this.f5210b = c1256w;
        this.f5209a = colorSpinner;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        int selectedItemPosition = this.f5210b.f5279b.getSelectedItemPosition();
        this.f5210b.f5285j = selectedItemPosition != i;
        z = this.f5210b.f5279b.f5184T;
        if (z) {
            this.f5210b.f5284i = i;
            if (selectedItemPosition != i) {
                this.f5210b.f5279b.setNextSelectedPositionInt(i);
                this.f5210b.f5279b.mo4021c();
                this.f5210b.f5279b.setNextSelectedPositionInt(selectedItemPosition);
            }
        } else {
            this.f5210b.f5279b.setSelection(i);
        }
        if (this.f5210b.f5279b.f5091s != null) {
            ColorSpinner colorSpinner = this.f5210b.f5279b;
            this.f5210b.f5279b.f5062a.getItemId(i);
            colorSpinner.m4019a(view);
        }
        this.f5210b.mo4081a();
        this.f5210b.f5285j = false;
    }
}
