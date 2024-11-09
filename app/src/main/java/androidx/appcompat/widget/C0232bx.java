package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListPopupWindow.java */
/* renamed from: androidx.appcompat.widget.bx */
/* loaded from: classes.dex */
public final class C0232bx extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ C0228bt f1269a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0232bx(C0228bt c0228bt) {
        this.f1269a = c0228bt;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f1269a.mo393e()) {
            this.f1269a.mo391a_();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f1269a.mo392d();
    }
}
