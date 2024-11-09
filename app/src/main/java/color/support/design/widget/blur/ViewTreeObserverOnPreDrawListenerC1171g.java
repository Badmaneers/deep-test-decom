package color.support.design.widget.blur;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorBlurringView.java */
/* renamed from: color.support.design.widget.blur.g */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1171g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ColorBlurringView f4750a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnPreDrawListenerC1171g(ColorBlurringView colorBlurringView) {
        this.f4750a = colorBlurringView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        if (this.f4750a.isDirty()) {
            return true;
        }
        view = this.f4750a.f4724d;
        if (!view.isDirty() || !this.f4750a.isShown()) {
            return true;
        }
        this.f4750a.invalidate();
        return true;
    }
}
