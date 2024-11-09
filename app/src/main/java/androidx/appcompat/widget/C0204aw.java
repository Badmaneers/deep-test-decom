package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.aw */
/* loaded from: classes.dex */
public final class C0204aw implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AppCompatSpinner f1155a;

    /* renamed from: b */
    final /* synthetic */ C0203av f1156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0204aw(C0203av c0203av, AppCompatSpinner appCompatSpinner) {
        this.f1156b = c0203av;
        this.f1155a = appCompatSpinner;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1156b.f1151b.setSelection(i);
        if (this.f1156b.f1151b.getOnItemClickListener() != null) {
            this.f1156b.f1151b.performItemClick(view, i, this.f1156b.f1150a.getItemId(i));
        }
        this.f1156b.mo392d();
    }
}
