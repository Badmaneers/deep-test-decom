package androidx.viewpager.widget;

import android.database.DataSetObserver;

/* compiled from: ViewPager.java */
/* renamed from: androidx.viewpager.widget.q */
/* loaded from: classes.dex */
final class C1110q extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ViewPager f4486a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1110q(ViewPager viewPager) {
        this.f4486a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f4486a.m3690a();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f4486a.m3690a();
    }
}
