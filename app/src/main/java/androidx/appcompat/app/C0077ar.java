package androidx.appcompat.app;

import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0145ae;

/* compiled from: ToolbarActionBar.java */
/* renamed from: androidx.appcompat.app.ar */
/* loaded from: classes.dex */
final class C0077ar implements InterfaceC0145ae {

    /* renamed from: a */
    final /* synthetic */ C0076aq f231a;

    /* renamed from: b */
    private boolean f232b;

    public C0077ar(C0076aq c0076aq) {
        this.f231a = c0076aq;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final boolean mo172a(C0168o c0168o) {
        if (this.f231a.f226b == null) {
            return false;
        }
        this.f231a.f226b.onMenuOpened(108, c0168o);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final void mo171a(C0168o c0168o, boolean z) {
        if (this.f232b) {
            return;
        }
        this.f232b = true;
        this.f231a.f225a.mo842n();
        if (this.f231a.f226b != null) {
            this.f231a.f226b.onPanelClosed(108, c0168o);
        }
        this.f232b = false;
    }
}
