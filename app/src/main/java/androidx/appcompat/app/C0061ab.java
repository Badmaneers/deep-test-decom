package androidx.appcompat.app;

import android.view.Window;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.InterfaceC0145ae;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.ab */
/* loaded from: classes.dex */
public final class C0061ab implements InterfaceC0145ae {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f196a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0061ab(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f196a = appCompatDelegateImpl;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final boolean mo172a(C0168o c0168o) {
        Window.Callback callback = this.f196a.f149c.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, c0168o);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0145ae
    /* renamed from: a */
    public final void mo171a(C0168o c0168o, boolean z) {
        this.f196a.m113b(c0168o);
    }
}
