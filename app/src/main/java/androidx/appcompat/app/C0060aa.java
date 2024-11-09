package androidx.appcompat.app;

import android.view.View;
import androidx.core.p024g.C0512am;
import androidx.core.p024g.C0538w;
import androidx.core.p024g.InterfaceC0511al;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.aa */
/* loaded from: classes.dex */
public final class C0060aa extends C0512am {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f195a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0060aa(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f195a = appCompatDelegateImpl;
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: a */
    public final void mo169a(View view) {
        this.f195a.f154h.setVisibility(0);
        this.f195a.f154h.sendAccessibilityEvent(32);
        if (this.f195a.f154h.getParent() instanceof View) {
            C0538w.m1892u((View) this.f195a.f154h.getParent());
        }
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: b */
    public final void mo170b(View view) {
        this.f195a.f154h.setAlpha(1.0f);
        this.f195a.f157k.m1756a((InterfaceC0511al) null);
        this.f195a.f157k = null;
    }
}
