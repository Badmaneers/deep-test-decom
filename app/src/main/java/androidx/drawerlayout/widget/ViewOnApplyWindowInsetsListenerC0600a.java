package androidx.drawerlayout.widget;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawerLayout.java */
/* renamed from: androidx.drawerlayout.widget.a */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0600a implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ DrawerLayout f2626a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnApplyWindowInsetsListenerC0600a(DrawerLayout drawerLayout) {
        this.f2626a = drawerLayout;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((DrawerLayout) view).m2167a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
