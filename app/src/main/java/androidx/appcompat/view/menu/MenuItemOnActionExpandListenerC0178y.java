package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.y */
/* loaded from: classes.dex */
final class MenuItemOnActionExpandListenerC0178y implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ MenuItemC0174u f746a;

    /* renamed from: b */
    private final MenuItem.OnActionExpandListener f747b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemOnActionExpandListenerC0178y(MenuItemC0174u menuItemC0174u, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f746a = menuItemC0174u;
        this.f747b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f747b.onMenuItemActionExpand(this.f746a.m415a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f747b.onMenuItemActionCollapse(this.f746a.m415a(menuItem));
    }
}
