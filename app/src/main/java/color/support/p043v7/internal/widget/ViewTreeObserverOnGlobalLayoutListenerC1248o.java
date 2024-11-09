package color.support.p043v7.internal.widget;

import android.view.ViewTreeObserver;
import color.support.p041a.p042a.C1154b;

/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.o */
/* loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC1248o implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C1246m f5270a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC1248o(C1246m c1246m) {
        this.f5270a = c1246m;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C1154b.m3811a();
        this.f5270a.m4094g();
        super/*color.support.v7.widget.u*/.mo4108h();
    }
}
