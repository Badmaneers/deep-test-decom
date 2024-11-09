package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p016a.p017a.InterfaceMenuItemC0401b;
import androidx.core.p024g.AbstractC0518c;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.u */
/* loaded from: classes.dex */
public final class MenuItemC0174u extends AbstractC0158e implements MenuItem {

    /* renamed from: b */
    private final InterfaceMenuItemC0401b f739b;

    /* renamed from: c */
    private Method f740c;

    public MenuItemC0174u(Context context, InterfaceMenuItemC0401b interfaceMenuItemC0401b) {
        super(context);
        if (interfaceMenuItemC0401b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f739b = interfaceMenuItemC0401b;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f739b.getItemId();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f739b.getGroupId();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f739b.getOrder();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f739b.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f739b.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f739b.getTitle();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f739b.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f739b.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f739b.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f739b.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f739b.getIcon();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f739b.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f739b.getIntent();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f739b.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f739b.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f739b.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f739b.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f739b.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f739b.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f739b.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f739b.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f739b.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f739b.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f739b.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f739b.isCheckable();
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f739b.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f739b.isChecked();
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f739b.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f739b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f739b.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f739b.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f739b.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return m416a(this.f739b.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f739b.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC0179z(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f739b.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f739b.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f739b.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0177x(view);
        }
        this.f739b.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        this.f739b.setActionView(i);
        View actionView = this.f739b.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f739b.setActionView(new C0177x(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f739b.getActionView();
        return actionView instanceof C0177x ? (View) ((C0177x) actionView).f745a : actionView;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC0518c c0175v;
        if (Build.VERSION.SDK_INT >= 16) {
            c0175v = new ActionProviderVisibilityListenerC0176w(this, this.f618a, actionProvider);
        } else {
            c0175v = new C0175v(this, this.f618a, actionProvider);
        }
        InterfaceMenuItemC0401b interfaceMenuItemC0401b = this.f739b;
        if (actionProvider == null) {
            c0175v = null;
        }
        interfaceMenuItemC0401b.mo349a(c0175v);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC0518c mo351a = this.f739b.mo351a();
        if (mo351a instanceof C0175v) {
            return ((C0175v) mo351a).f741a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f739b.expandActionView();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f739b.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f739b.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f739b.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0178y(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f739b.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f739b.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f739b.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f739b.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f739b.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f739b.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f739b.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f739b.getIconTintMode();
    }

    /* renamed from: b */
    public final void m497b() {
        try {
            if (this.f740c == null) {
                this.f740c = this.f739b.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f740c.invoke(this.f739b, Boolean.TRUE);
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }
}
