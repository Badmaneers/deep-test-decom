package androidx.appcompat.view.menu;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.al */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0152al implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0150aj f603a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnAttachStateChangeListenerC0152al(ViewOnKeyListenerC0150aj viewOnKeyListenerC0150aj) {
        this.f603a = viewOnKeyListenerC0150aj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f603a.f585d != null) {
            if (!this.f603a.f585d.isAlive()) {
                this.f603a.f585d = view.getViewTreeObserver();
            }
            this.f603a.f585d.removeGlobalOnLayoutListener(this.f603a.f583b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
