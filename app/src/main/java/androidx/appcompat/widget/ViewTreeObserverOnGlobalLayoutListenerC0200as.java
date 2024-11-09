package androidx.appcompat.widget;

import android.os.Build;
import android.view.ViewTreeObserver;

/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.as */
/* loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC0200as implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ AppCompatSpinner f1143a;

    public ViewTreeObserverOnGlobalLayoutListenerC0200as(AppCompatSpinner appCompatSpinner) {
        this.f1143a = appCompatSpinner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.f1143a.getInternalPopup().mo752e()) {
            this.f1143a.m577a();
        }
        ViewTreeObserver viewTreeObserver = this.f1143a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }
}
