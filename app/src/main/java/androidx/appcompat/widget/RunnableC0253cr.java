package androidx.appcompat.widget;

import android.database.Cursor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchView.java */
/* renamed from: androidx.appcompat.widget.cr */
/* loaded from: classes.dex */
public final class RunnableC0253cr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchView f1307a;

    public RunnableC0253cr(SearchView searchView) {
        this.f1307a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1307a.f971g instanceof ViewOnClickListenerC0269dg) {
            this.f1307a.f971g.mo934a((Cursor) null);
        }
    }
}
