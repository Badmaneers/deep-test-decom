package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CascadingMenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0160g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0159f f648a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC0160g(ViewOnKeyListenerC0159f viewOnKeyListenerC0159f) {
        this.f648a = viewOnKeyListenerC0159f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.f648a.mo393e() || this.f648a.f624b.size() <= 0 || this.f648a.f624b.get(0).f655a.m869k()) {
            return;
        }
        View view = this.f648a.f626d;
        if (view == null || !view.isShown()) {
            this.f648a.mo392d();
            return;
        }
        Iterator<C0164k> it = this.f648a.f624b.iterator();
        while (it.hasNext()) {
            it.next().f655a.mo391a_();
        }
    }
}
