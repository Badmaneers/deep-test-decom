package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityChooserView.java */
/* renamed from: androidx.appcompat.widget.ac */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0184ac implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1094a;

    public ViewTreeObserverOnGlobalLayoutListenerC0184ac(ActivityChooserView activityChooserView) {
        this.f1094a = activityChooserView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f1094a.getListPopupWindow().mo393e()) {
            if (!this.f1094a.isShown()) {
                this.f1094a.getListPopupWindow().mo392d();
                return;
            }
            this.f1094a.getListPopupWindow().mo391a_();
            if (this.f1094a.f838d != null) {
                this.f1094a.f838d.m1775a(true);
            }
        }
    }
}
