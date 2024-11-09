package color.support.p043v7.internal.widget;

import android.view.ViewTreeObserver;
import color.support.p043v7.widget.InterfaceC1298s;

/* compiled from: ColorBaseSpinner.java */
/* renamed from: color.support.v7.internal.widget.p */
/* loaded from: classes.dex */
final class C1249p implements InterfaceC1298s {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f5271a;

    /* renamed from: b */
    final /* synthetic */ C1246m f5272b;

    public C1249p(C1246m c1246m, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f5272b = c1246m;
        this.f5271a = onGlobalLayoutListener;
    }

    @Override // color.support.p043v7.widget.InterfaceC1298s
    /* renamed from: a */
    public final void mo4065a() {
        ViewTreeObserver viewTreeObserver = this.f5272b.f5265a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f5271a);
        }
    }
}
