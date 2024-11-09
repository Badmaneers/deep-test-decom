package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.p016a.p017a.InterfaceMenuC0400a;

/* compiled from: MenuWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.ah */
/* loaded from: classes.dex */
public class MenuC0148ah extends AbstractC0158e implements Menu {

    /* renamed from: b */
    private final InterfaceMenuC0400a f580b;

    public MenuC0148ah(Context context, InterfaceMenuC0400a interfaceMenuC0400a) {
        super(context);
        if (interfaceMenuC0400a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f580b = interfaceMenuC0400a;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m415a(this.f580b.add(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m415a(this.f580b.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m415a(this.f580b.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m415a(this.f580b.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m416a(this.f580b.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m416a(this.f580b.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m416a(this.f580b.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m416a(this.f580b.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f580b.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m415a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m419b(i);
        this.f580b.removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m418a(i);
        this.f580b.removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        m417a();
        this.f580b.clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f580b.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f580b.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f580b.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f580b.hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m415a(this.f580b.findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return this.f580b.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m415a(this.f580b.getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        this.f580b.close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f580b.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f580b.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f580b.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f580b.setQwertyMode(z);
    }
}
