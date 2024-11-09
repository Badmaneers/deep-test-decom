package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuBuilder.java */
/* renamed from: androidx.appcompat.view.menu.am */
/* loaded from: classes.dex */
public class SubMenuC0153am extends C0168o implements SubMenu {

    /* renamed from: d */
    private C0168o f604d;

    /* renamed from: e */
    private C0172s f605e;

    public SubMenuC0153am(Context context, C0168o c0168o, C0172s c0172s) {
        super(context);
        this.f604d = c0168o;
        this.f605e = c0172s;
    }

    @Override // androidx.appcompat.view.menu.C0168o, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f604d.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: d */
    public final boolean mo401d() {
        return this.f604d.mo401d();
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: e */
    public final boolean mo402e() {
        return this.f604d.mo402e();
    }

    /* renamed from: s */
    public final Menu m404s() {
        return this.f604d;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f605e;
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: a */
    public final void mo395a(InterfaceC0169p interfaceC0169p) {
        this.f604d.mo395a(interfaceC0169p);
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: p */
    public final C0168o mo403p() {
        return this.f604d.mo403p();
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: a */
    public final boolean mo396a(C0168o c0168o, MenuItem menuItem) {
        return super.mo396a(c0168o, menuItem) || this.f604d.mo396a(c0168o, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f605e.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f605e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m445a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m455b(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m447a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m444a(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m446a(view);
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: a */
    public final boolean mo397a(C0172s c0172s) {
        return this.f604d.mo397a(c0172s);
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: b */
    public final boolean mo399b(C0172s c0172s) {
        return this.f604d.mo399b(c0172s);
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: b */
    public final String mo398b() {
        int itemId = this.f605e != null ? this.f605e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo398b() + ":" + itemId;
    }

    @Override // androidx.appcompat.view.menu.C0168o, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f604d.setGroupDividerEnabled(z);
    }

    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: c */
    public final boolean mo400c() {
        return this.f604d.mo400c();
    }
}
