package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.z */
/* loaded from: classes.dex */
final class MenuItemOnMenuItemClickListenerC0179z implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ MenuItemC0174u f748a;

    /* renamed from: b */
    private final MenuItem.OnMenuItemClickListener f749b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemOnMenuItemClickListenerC0179z(MenuItemC0174u menuItemC0174u, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f748a = menuItemC0174u;
        this.f749b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f749b.onMenuItemClick(this.f748a.m415a(menuItem));
    }
}
