package androidx.appcompat.app;

import android.view.View;
import androidx.core.p024g.C0514ao;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0534s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.v */
/* loaded from: classes.dex */
public final class C0107v implements InterfaceC0534s {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f366a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0107v(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f366a = appCompatDelegateImpl;
    }

    @Override // androidx.core.p024g.InterfaceC0534s
    /* renamed from: a */
    public final C0514ao mo250a(View view, C0514ao c0514ao) {
        int m1766b = c0514ao.m1766b();
        int m126i = this.f366a.m126i(m1766b);
        if (m1766b != m126i) {
            c0514ao = c0514ao.m1765a(c0514ao.m1764a(), m126i, c0514ao.m1767c(), c0514ao.m1768d());
        }
        return C0538w.m1837a(view, c0514ao);
    }
}
