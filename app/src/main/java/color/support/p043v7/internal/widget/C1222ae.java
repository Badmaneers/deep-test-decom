package color.support.p043v7.internal.widget;

import android.view.ViewTreeObserver;
import color.support.p041a.p042a.C1159g;
import color.support.p043v7.widget.InterfaceC1298s;

/* compiled from: ColorSpinner.java */
/* renamed from: color.support.v7.internal.widget.ae */
/* loaded from: classes.dex */
final class C1222ae implements InterfaceC1298s {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f5212a;

    /* renamed from: b */
    final /* synthetic */ C1256w f5213b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1222ae(C1256w c1256w, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f5213b = c1256w;
        this.f5212a = onGlobalLayoutListener;
    }

    @Override // color.support.p043v7.widget.InterfaceC1298s
    /* renamed from: a */
    public final void mo4065a() {
        ViewTreeObserver viewTreeObserver = this.f5213b.f5279b.getViewTreeObserver();
        if (viewTreeObserver != null) {
            C1159g.m3816a(viewTreeObserver, this.f5212a);
        }
        super/*color.support.v7.internal.widget.m*/.mo4081a();
    }
}
