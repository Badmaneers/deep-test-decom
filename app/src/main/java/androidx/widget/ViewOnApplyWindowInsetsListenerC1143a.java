package androidx.widget;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorDrawerLayout.java */
/* renamed from: androidx.widget.a */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1143a implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ ColorDrawerLayout f4637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnApplyWindowInsetsListenerC1143a(ColorDrawerLayout colorDrawerLayout) {
        this.f4637a = colorDrawerLayout;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((ColorDrawerLayout) view).m3798a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
