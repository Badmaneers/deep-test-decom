package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.ax */
/* loaded from: classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC0205ax implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0203av f1157a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC0205ax(C0203av c0203av) {
        this.f1157a = c0203av;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.f1157a.m755a(this.f1157a.f1151b)) {
            this.f1157a.mo392d();
        } else {
            this.f1157a.m756h();
            super/*androidx.appcompat.widget.bt*/.mo391a_();
        }
    }
}
