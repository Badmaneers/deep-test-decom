package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p016a.p017a.InterfaceSubMenuC0402c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubMenuWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.an */
/* loaded from: classes.dex */
public final class SubMenuC0154an extends MenuC0148ah implements SubMenu {

    /* renamed from: b */
    private final InterfaceSubMenuC0402c f606b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0154an(Context context, InterfaceSubMenuC0402c interfaceSubMenuC0402c) {
        super(context, interfaceSubMenuC0402c);
        this.f606b = interfaceSubMenuC0402c;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f606b.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f606b.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f606b.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f606b.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f606b.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f606b.clearHeader();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f606b.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f606b.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return m415a(this.f606b.getItem());
    }
}
