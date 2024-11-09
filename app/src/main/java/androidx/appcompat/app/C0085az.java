package androidx.appcompat.app;

import android.view.View;
import androidx.core.p024g.InterfaceC0513an;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WindowDecorActionBar.java */
/* renamed from: androidx.appcompat.app.az */
/* loaded from: classes.dex */
public final class C0085az implements InterfaceC0513an {

    /* renamed from: a */
    final /* synthetic */ C0082aw f284a;

    public C0085az(C0082aw c0082aw) {
        this.f284a = c0082aw;
    }

    @Override // androidx.core.p024g.InterfaceC0513an
    /* renamed from: a */
    public final void mo211a() {
        ((View) this.f284a.f261c.getParent()).invalidate();
    }
}
