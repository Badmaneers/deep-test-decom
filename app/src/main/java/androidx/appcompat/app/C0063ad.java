package androidx.appcompat.app;

import android.view.View;
import androidx.core.p024g.C0512am;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0511al;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.ad */
/* loaded from: classes.dex */
final class C0063ad extends C0512am {

    /* renamed from: a */
    final /* synthetic */ C0062ac f199a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0063ad(C0062ac c0062ac) {
        this.f199a = c0062ac;
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: b */
    public final void mo170b(View view) {
        this.f199a.f197a.f154h.setVisibility(8);
        if (this.f199a.f197a.f155i != null) {
            this.f199a.f197a.f155i.dismiss();
        } else if (this.f199a.f197a.f154h.getParent() instanceof View) {
            C0538w.m1892u((View) this.f199a.f197a.f154h.getParent());
        }
        this.f199a.f197a.f154h.removeAllViews();
        this.f199a.f197a.f157k.m1756a((InterfaceC0511al) null);
        this.f199a.f197a.f157k = null;
    }
}
