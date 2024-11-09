package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.ak */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0151ak implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0150aj f602a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC0151ak(ViewOnKeyListenerC0150aj viewOnKeyListenerC0150aj) {
        this.f602a = viewOnKeyListenerC0150aj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.f602a.mo393e() || this.f602a.f582a.m869k()) {
            return;
        }
        View view = this.f602a.f584c;
        if (view == null || !view.isShown()) {
            this.f602a.mo392d();
        } else {
            this.f602a.f582a.mo391a_();
        }
    }
}
