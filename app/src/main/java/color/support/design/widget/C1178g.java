package color.support.design.widget;

import android.database.DataSetObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorTabLayout.java */
/* renamed from: color.support.design.widget.g */
/* loaded from: classes.dex */
public final class C1178g extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ColorTabLayout f4772a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1178g(ColorTabLayout colorTabLayout) {
        this.f4772a = colorTabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f4772a.m3860a();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f4772a.m3860a();
    }
}
