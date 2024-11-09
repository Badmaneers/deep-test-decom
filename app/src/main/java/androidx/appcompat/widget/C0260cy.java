package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cy */
/* loaded from: classes.dex */
public final class C0260cy implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1314a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public C0260cy(SearchView searchView) {
        this.f1314a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1314a.m620c(i);
    }
}
