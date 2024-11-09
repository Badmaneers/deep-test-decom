package androidx.appcompat.app;

import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.AbstractC0128b;
import androidx.appcompat.view.InterfaceC0129c;
import androidx.core.p024g.C0538w;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.ac */
/* loaded from: classes.dex */
public final class C0062ac implements InterfaceC0129c {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f197a;

    /* renamed from: b */
    private InterfaceC0129c f198b;

    public C0062ac(AppCompatDelegateImpl appCompatDelegateImpl, InterfaceC0129c interfaceC0129c) {
        this.f197a = appCompatDelegateImpl;
        this.f198b = interfaceC0129c;
    }

    @Override // androidx.appcompat.view.InterfaceC0129c
    /* renamed from: a */
    public final boolean mo174a(AbstractC0128b abstractC0128b, Menu menu) {
        return this.f198b.mo174a(abstractC0128b, menu);
    }

    @Override // androidx.appcompat.view.InterfaceC0129c
    /* renamed from: b */
    public final boolean mo176b(AbstractC0128b abstractC0128b, Menu menu) {
        return this.f198b.mo176b(abstractC0128b, menu);
    }

    @Override // androidx.appcompat.view.InterfaceC0129c
    /* renamed from: a */
    public final boolean mo175a(AbstractC0128b abstractC0128b, MenuItem menuItem) {
        return this.f198b.mo175a(abstractC0128b, menuItem);
    }

    @Override // androidx.appcompat.view.InterfaceC0129c
    /* renamed from: a */
    public final void mo173a(AbstractC0128b abstractC0128b) {
        this.f198b.mo173a(abstractC0128b);
        if (this.f197a.f155i != null) {
            this.f197a.f149c.getDecorView().removeCallbacks(this.f197a.f156j);
        }
        if (this.f197a.f154h != null) {
            this.f197a.m134q();
            this.f197a.f157k = C0538w.m1887p(this.f197a.f154h).m1753a(0.0f);
            this.f197a.f157k.m1756a(new C0063ad(this));
        }
        this.f197a.f153g = null;
    }
}
