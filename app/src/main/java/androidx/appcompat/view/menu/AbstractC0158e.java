package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.p016a.p017a.InterfaceMenuItemC0401b;
import androidx.core.p016a.p017a.InterfaceSubMenuC0402c;
import androidx.p011b.C0318a;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMenuWrapper.java */
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public abstract class AbstractC0158e {

    /* renamed from: a */
    final Context f618a;

    /* renamed from: b */
    private Map<InterfaceMenuItemC0401b, MenuItem> f619b;

    /* renamed from: c */
    private Map<InterfaceSubMenuC0402c, SubMenu> f620c;

    public AbstractC0158e(Context context) {
        this.f618a = context;
    }

    /* renamed from: a */
    public final MenuItem m415a(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0401b)) {
            return menuItem;
        }
        InterfaceMenuItemC0401b interfaceMenuItemC0401b = (InterfaceMenuItemC0401b) menuItem;
        if (this.f619b == null) {
            this.f619b = new C0318a();
        }
        MenuItem menuItem2 = this.f619b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0174u menuItemC0174u = new MenuItemC0174u(this.f618a, interfaceMenuItemC0401b);
        this.f619b.put(interfaceMenuItemC0401b, menuItemC0174u);
        return menuItemC0174u;
    }

    /* renamed from: a */
    public final SubMenu m416a(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0402c)) {
            return subMenu;
        }
        InterfaceSubMenuC0402c interfaceSubMenuC0402c = (InterfaceSubMenuC0402c) subMenu;
        if (this.f620c == null) {
            this.f620c = new C0318a();
        }
        SubMenu subMenu2 = this.f620c.get(interfaceSubMenuC0402c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0154an subMenuC0154an = new SubMenuC0154an(this.f618a, interfaceSubMenuC0402c);
        this.f620c.put(interfaceSubMenuC0402c, subMenuC0154an);
        return subMenuC0154an;
    }

    /* renamed from: a */
    public final void m417a() {
        if (this.f619b != null) {
            this.f619b.clear();
        }
        if (this.f620c != null) {
            this.f620c.clear();
        }
    }

    /* renamed from: a */
    public final void m418a(int i) {
        if (this.f619b == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0401b> it = this.f619b.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public final void m419b(int i) {
        if (this.f619b == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0401b> it = this.f619b.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
