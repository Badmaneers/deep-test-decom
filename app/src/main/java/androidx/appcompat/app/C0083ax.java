package androidx.appcompat.app;

import android.view.View;
import androidx.core.p024g.C0512am;
import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WindowDecorActionBar.java */
/* renamed from: androidx.appcompat.app.ax */
/* loaded from: classes.dex */
public final class C0083ax extends C0512am {

    /* renamed from: a */
    final /* synthetic */ C0082aw f282a;

    public C0083ax(C0082aw c0082aw) {
        this.f282a = c0082aw;
    }

    @Override // androidx.core.p024g.C0512am, androidx.core.p024g.InterfaceC0511al
    /* renamed from: b */
    public final void mo170b(View view) {
        if (this.f282a.f269k && this.f282a.f264f != null) {
            this.f282a.f264f.setTranslationY(0.0f);
            this.f282a.f261c.setTranslationY(0.0f);
        }
        this.f282a.f261c.setVisibility(8);
        this.f282a.f261c.setTransitioning(false);
        this.f282a.f272n = null;
        C0082aw c0082aw = this.f282a;
        if (c0082aw.f268j != null) {
            c0082aw.f268j.mo173a(c0082aw.f267i);
            c0082aw.f267i = null;
            c0082aw.f268j = null;
        }
        if (this.f282a.f260b != null) {
            C0538w.m1892u(this.f282a.f260b);
        }
    }
}
