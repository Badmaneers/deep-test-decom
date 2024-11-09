package androidx.appcompat.view.menu;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CascadingMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0161h implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0159f f649a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnAttachStateChangeListenerC0161h(ViewOnKeyListenerC0159f viewOnKeyListenerC0159f) {
        this.f649a = viewOnKeyListenerC0159f;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f649a.f627e != null) {
            if (!this.f649a.f627e.isAlive()) {
                this.f649a.f627e = view.getViewTreeObserver();
            }
            this.f649a.f627e.removeGlobalOnLayoutListener(this.f649a.f625c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
