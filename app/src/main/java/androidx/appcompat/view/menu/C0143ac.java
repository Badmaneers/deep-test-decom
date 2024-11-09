package androidx.appcompat.view.menu;

import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MenuPopupHelper.java */
/* renamed from: androidx.appcompat.view.menu.ac */
/* loaded from: classes.dex */
public final class C0143ac implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C0142ab f579a;

    public C0143ac(C0142ab c0142ab) {
        this.f579a = c0142ab;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f579a.mo382f();
    }
}
