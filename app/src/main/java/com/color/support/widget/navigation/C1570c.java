package com.color.support.widget.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;

/* compiled from: ColorNavigationMenu.java */
/* renamed from: com.color.support.widget.navigation.c */
/* loaded from: classes.dex */
public final class C1570c extends C0168o {
    public C1570c(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0168o, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.C0168o
    /* renamed from: a */
    public final MenuItem mo442a(int i, int i2, int i3, CharSequence charSequence) {
        m464h();
        MenuItem mo442a = super.mo442a(i, i2, i3, charSequence);
        if (mo442a instanceof C0172s) {
            ((C0172s) mo442a).m482a(true);
        }
        m465i();
        return mo442a;
    }
}
