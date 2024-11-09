package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0169p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuView.java */
/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public final class C0311t implements InterfaceC0169p {

    /* renamed from: a */
    final /* synthetic */ ActionMenuView f1438a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0311t(ActionMenuView actionMenuView) {
        this.f1438a = actionMenuView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final boolean mo109a(C0168o c0168o, MenuItem menuItem) {
        return this.f1438a.f824b != null && this.f1438a.f824b.mo965a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0169p
    /* renamed from: a */
    public final void mo105a(C0168o c0168o) {
        if (this.f1438a.f823a != null) {
            this.f1438a.f823a.mo105a(c0168o);
        }
    }
}
