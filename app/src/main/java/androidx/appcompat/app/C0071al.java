package androidx.appcompat.app;

import android.view.Menu;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0145ae;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.al */
/* loaded from: classes.dex */
public final class C0071al implements InterfaceC0145ae {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f209a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0071al(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f209a = appCompatDelegateImpl;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final void mo171a(C0168o c0168o, boolean z) {
        C0168o mo403p = c0168o.mo403p();
        boolean z2 = mo403p != c0168o;
        AppCompatDelegateImpl appCompatDelegateImpl = this.f209a;
        if (z2) {
            c0168o = mo403p;
        }
        AppCompatDelegateImpl.PanelFeatureState m96a = appCompatDelegateImpl.m96a((Menu) c0168o);
        if (m96a != null) {
            if (z2) {
                this.f209a.m100a(m96a.f168a, m96a, mo403p);
                this.f209a.m104a(m96a, true);
            } else {
                this.f209a.m104a(m96a, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final boolean mo172a(C0168o c0168o) {
        Window.Callback callback;
        if (c0168o != null || !this.f209a.f158l || (callback = this.f209a.f149c.getCallback()) == null || this.f209a.f163q) {
            return true;
        }
        callback.onMenuOpened(108, c0168o);
        return true;
    }
}
