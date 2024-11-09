package androidx.core.p024g;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.g.x */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0539x implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0534s f2393a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnApplyWindowInsetsListenerC0539x(InterfaceC0534s interfaceC0534s) {
        this.f2393a = interfaceC0534s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.f2393a.mo250a(view, C0514ao.m1763a(windowInsets)).m1772h();
    }
}
