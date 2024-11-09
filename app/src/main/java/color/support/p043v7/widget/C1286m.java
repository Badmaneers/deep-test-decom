package color.support.p043v7.widget;

import android.database.DataSetObserver;

/* compiled from: ColorBaseListPopupWindow.java */
/* renamed from: color.support.v7.widget.m */
/* loaded from: classes.dex */
final class C1286m extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ C1277d f5458a;

    private C1286m(C1277d c1277d) {
        this.f5458a = c1277d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1286m(C1277d c1277d, byte b) {
        this(c1277d);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f5458a.m4210b()) {
            this.f5458a.mo4108h();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f5458a.mo4081a();
    }
}
