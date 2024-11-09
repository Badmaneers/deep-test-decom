package androidx.p012c.p013a;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CursorAdapter.java */
/* renamed from: androidx.c.a.c */
/* loaded from: classes.dex */
public final class C0332c extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ AbstractC0330a f1525a;

    public C0332c(AbstractC0330a abstractC0330a) {
        this.f1525a = abstractC0330a;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f1525a.f1515a = true;
        this.f1525a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f1525a.f1515a = false;
        this.f1525a.notifyDataSetInvalidated();
    }
}
