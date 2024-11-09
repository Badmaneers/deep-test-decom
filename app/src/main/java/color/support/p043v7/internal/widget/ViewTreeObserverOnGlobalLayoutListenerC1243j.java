package color.support.p043v7.internal.widget;

import android.view.ViewTreeObserver;
import color.support.p041a.p042a.C1154b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.j */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1243j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ColorBaseSpinner f5258a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC1243j(ColorBaseSpinner colorBaseSpinner) {
        this.f5258a = colorBaseSpinner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.f5258a.f5137F.mo4087b()) {
            this.f5258a.f5137F.mo4083a(this.f5258a.getTextDirection(), C1154b.m3809a(this.f5258a));
        }
        ViewTreeObserver viewTreeObserver = this.f5258a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }
}
