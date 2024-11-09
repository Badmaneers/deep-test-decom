package color.support.p043v7.internal.widget;

import android.view.ViewTreeObserver;
import color.support.p041a.p042a.C1154b;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.ad */
/* loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC1221ad implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C1256w f5211a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC1221ad(C1256w c1256w) {
        this.f5211a = c1256w;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C1154b.m3811a();
        this.f5211a.m4094g();
        this.f5211a.m4097a(this.f5211a.m4226r());
        this.f5211a.mo4108h();
    }
}
