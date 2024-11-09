package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0168o;
import androidx.appcompat.view.menu.C0172s;

/* compiled from: NavigationMenu.java */
/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes.dex */
public final class C2263h extends C0168o {
    public C2263h(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0168o, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0172s c0172s = (C0172s) mo442a(i, i2, i3, charSequence);
        C2278w c2278w = new C2278w(m462f(), this, c0172s);
        c0172s.m481a(c2278w);
        return c2278w;
    }
}
