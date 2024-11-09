package androidx.appcompat.app;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0169p;

/* compiled from: ToolbarActionBar.java */
/* renamed from: androidx.appcompat.app.as */
/* loaded from: classes.dex */
final class C0078as implements InterfaceC0169p {

    /* renamed from: a */
    final /* synthetic */ C0076aq f233a;

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final boolean mo109a(C0168o c0168o, MenuItem menuItem) {
        return false;
    }

    public C0078as(C0076aq c0076aq) {
        this.f233a = c0076aq;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final void mo105a(C0168o c0168o) {
        if (this.f233a.f226b != null) {
            if (this.f233a.f225a.mo837i()) {
                this.f233a.f226b.onPanelClosed(108, c0168o);
            } else if (this.f233a.f226b.onPreparePanel(0, null, c0168o)) {
                this.f233a.f226b.onMenuOpened(108, c0168o);
            }
        }
    }
}
