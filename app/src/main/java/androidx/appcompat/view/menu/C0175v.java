package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p024g.AbstractC0518c;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.v */
/* loaded from: classes.dex */
class C0175v extends AbstractC0518c {

    /* renamed from: a */
    final ActionProvider f741a;

    /* renamed from: b */
    final /* synthetic */ MenuItemC0174u f742b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175v(MenuItemC0174u menuItemC0174u, Context context, ActionProvider actionProvider) {
        super(context);
        this.f742b = menuItemC0174u;
        this.f741a = actionProvider;
    }

    @Override // androidx.core.p024g.AbstractC0518c
    /* renamed from: a */
    public final View mo498a() {
        return this.f741a.onCreateActionView();
    }

    @Override // androidx.core.p024g.AbstractC0518c
    /* renamed from: b */
    public final boolean mo500b() {
        return this.f741a.onPerformDefaultAction();
    }

    @Override // androidx.core.p024g.AbstractC0518c
    /* renamed from: c */
    public final boolean mo501c() {
        return this.f741a.hasSubMenu();
    }

    @Override // androidx.core.p024g.AbstractC0518c
    /* renamed from: a */
    public final void mo499a(SubMenu subMenu) {
        this.f741a.onPrepareSubMenu(this.f742b.m416a(subMenu));
    }
}
