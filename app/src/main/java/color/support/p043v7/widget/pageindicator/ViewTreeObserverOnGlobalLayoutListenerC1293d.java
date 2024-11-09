package color.support.p043v7.widget.pageindicator;

import android.os.Build;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorPageIndicator.java */
/* renamed from: color.support.v7.widget.pageindicator.d */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1293d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ColorPageIndicator f5496a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC1293d(ColorPageIndicator colorPageIndicator) {
        this.f5496a = colorPageIndicator;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int unused;
        if (Build.VERSION.SDK_INT > 16) {
            this.f5496a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        ColorPageIndicator colorPageIndicator = this.f5496a;
        unused = this.f5496a.f5476j;
        colorPageIndicator.m4241b();
    }
}
