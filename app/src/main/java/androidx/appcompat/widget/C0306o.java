package androidx.appcompat.widget;

import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0145ae;
import androidx.appcompat.view.menu.SubMenuC0153am;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
public final class C0306o implements InterfaceC0145ae {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1431a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0306o(ActionMenuPresenter actionMenuPresenter) {
        this.f1431a = actionMenuPresenter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final boolean mo172a(C0168o c0168o) {
        if (c0168o == null) {
            return false;
        }
        this.f1431a.f805l = ((SubMenuC0153am) c0168o).getItem().getItemId();
        InterfaceC0145ae a2 = this.f1431a.m409a();
        if (a2 != null) {
            return a2.mo172a(c0168o);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final void mo171a(C0168o c0168o, boolean z) {
        if (c0168o instanceof SubMenuC0153am) {
            c0168o.mo403p().m452a(false);
        }
        InterfaceC0145ae a2 = this.f1431a.m409a();
        if (a2 != null) {
            a2.mo171a(c0168o, z);
        }
    }
}
