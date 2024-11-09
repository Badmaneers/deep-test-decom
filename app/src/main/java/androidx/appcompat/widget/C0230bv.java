package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.bv */
/* loaded from: classes.dex */
public final class C0230bv implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C0228bt f1267a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0230bv(C0228bt c0228bt) {
        this.f1267a = c0228bt;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0219bk c0219bk;
        if (i == -1 || (c0219bk = this.f1267a.f1243c) == null) {
            return;
        }
        c0219bk.setListSelectionHidden(false);
    }
}
