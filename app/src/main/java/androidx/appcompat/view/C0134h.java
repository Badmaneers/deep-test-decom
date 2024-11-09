package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuC0148ah;
import androidx.appcompat.view.menu.MenuItemC0174u;
import androidx.core.p016a.p017a.InterfaceMenuC0400a;
import androidx.core.p016a.p017a.InterfaceMenuItemC0401b;
import androidx.p011b.C0328n;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
/* renamed from: androidx.appcompat.view.h */
/* loaded from: classes.dex */
public final class C0134h implements InterfaceC0129c {

    /* renamed from: a */
    final ActionMode.Callback f458a;

    /* renamed from: b */
    final Context f459b;

    /* renamed from: c */
    final ArrayList<C0133g> f460c = new ArrayList<>();

    /* renamed from: d */
    final C0328n<Menu, Menu> f461d = new C0328n<>();

    public C0134h(Context context, ActionMode.Callback callback) {
        this.f459b = context;
        this.f458a = callback;
    }

    @Override // androidx.appcompat.view.InterfaceC0129c
    /* renamed from: a */
    public final boolean mo174a(AbstractC0128b abstractC0128b, Menu menu) {
        return this.f458a.onCreateActionMode(m316b(abstractC0128b), m315a(menu));
    }

    @Override // androidx.appcompat.view.InterfaceC0129c
    /* renamed from: b */
    public final boolean mo176b(AbstractC0128b abstractC0128b, Menu menu) {
        return this.f458a.onPrepareActionMode(m316b(abstractC0128b), m315a(menu));
    }

    @Override // androidx.appcompat.view.InterfaceC0129c
    /* renamed from: a */
    public final boolean mo175a(AbstractC0128b abstractC0128b, MenuItem menuItem) {
        return this.f458a.onActionItemClicked(m316b(abstractC0128b), new MenuItemC0174u(this.f459b, (InterfaceMenuItemC0401b) menuItem));
    }

    @Override // androidx.appcompat.view.InterfaceC0129c
    /* renamed from: a */
    public final void mo173a(AbstractC0128b abstractC0128b) {
        this.f458a.onDestroyActionMode(m316b(abstractC0128b));
    }

    /* renamed from: a */
    private Menu m315a(Menu menu) {
        Menu menu2 = this.f461d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        MenuC0148ah menuC0148ah = new MenuC0148ah(this.f459b, (InterfaceMenuC0400a) menu);
        this.f461d.put(menu, menuC0148ah);
        return menuC0148ah;
    }

    /* renamed from: b */
    public final ActionMode m316b(AbstractC0128b abstractC0128b) {
        int size = this.f460c.size();
        for (int i = 0; i < size; i++) {
            C0133g c0133g = this.f460c.get(i);
            if (c0133g != null && c0133g.f457b == abstractC0128b) {
                return c0133g;
            }
        }
        C0133g c0133g2 = new C0133g(this.f459b, abstractC0128b);
        this.f460c.add(c0133g2);
        return c0133g2;
    }
}
