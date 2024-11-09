package androidx.appcompat.app;

import android.view.View;
import androidx.core.p024g.C0512am;
import androidx.core.p024g.InterfaceC0511al;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.z */
/* loaded from: classes.dex */
final class C0111z extends C0512am {

    /* renamed from: a */
    final /* synthetic */ RunnableC0110y f370a;

    public C0111z(RunnableC0110y runnableC0110y) {
        this.f370a = runnableC0110y;
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: a */
    public final void mo169a(View view) {
        this.f370a.f369a.f154h.setVisibility(0);
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: b */
    public final void mo170b(View view) {
        this.f370a.f369a.f154h.setAlpha(1.0f);
        this.f370a.f369a.f157k.m1756a((InterfaceC0511al) null);
        this.f370a.f369a.f157k = null;
    }
}
