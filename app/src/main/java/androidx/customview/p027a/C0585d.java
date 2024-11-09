package androidx.customview.p027a;

import android.os.Bundle;
import androidx.core.p024g.p025a.C0482c;
import androidx.core.p024g.p025a.C0487h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExploreByTouchHelper.java */
/* renamed from: androidx.customview.a.d */
/* loaded from: classes.dex */
public final class C0585d extends C0487h {

    /* renamed from: a */
    final /* synthetic */ AbstractC0582a f2544a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0585d(AbstractC0582a abstractC0582a) {
        this.f2544a = abstractC0582a;
    }

    @Override // androidx.core.p024g.p025a.C0487h
    /* renamed from: a */
    public final C0482c mo1717a(int i) {
        return C0482c.m1636a(this.f2544a.m2083b(i));
    }

    @Override // androidx.core.p024g.p025a.C0487h
    /* renamed from: a */
    public final boolean mo1719a(int i, int i2, Bundle bundle) {
        return this.f2544a.m2080a(i, i2, bundle);
    }

    @Override // androidx.core.p024g.p025a.C0487h
    /* renamed from: b */
    public final C0482c mo1720b(int i) {
        int i2 = i == 2 ? this.f2544a.f2534a : this.f2544a.f2535b;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1717a(i2);
    }
}
