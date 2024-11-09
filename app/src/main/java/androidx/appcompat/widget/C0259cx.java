package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cx */
/* loaded from: classes.dex */
public final class C0259cx implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1313a;

    public C0259cx(SearchView searchView) {
        this.f1313a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1313a.m618b(i);
    }
}
