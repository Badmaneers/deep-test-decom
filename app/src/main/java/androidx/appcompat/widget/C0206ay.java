package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.ay */
/* loaded from: classes.dex */
final class C0206ay implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1158a;

    /* renamed from: b */
    final /* synthetic */ C0203av f1159b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0206ay(C0203av c0203av, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f1159b = c0203av;
        this.f1158a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f1159b.f1151b.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1158a);
        }
    }
}
