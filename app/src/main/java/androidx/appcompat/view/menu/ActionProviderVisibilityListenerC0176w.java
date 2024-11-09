package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.core.p024g.InterfaceC0520e;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.w */
/* loaded from: classes.dex */
final class ActionProviderVisibilityListenerC0176w extends C0175v implements ActionProvider.VisibilityListener {

    /* renamed from: c */
    final /* synthetic */ MenuItemC0174u f743c;

    /* renamed from: d */
    private InterfaceC0520e f744d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionProviderVisibilityListenerC0176w(MenuItemC0174u menuItemC0174u, Context context, ActionProvider actionProvider) {
        super(menuItemC0174u, context, actionProvider);
        this.f743c = menuItemC0174u;
    }

    @Override // androidx.core.p024g.AbstractC0518c
    /* renamed from: a */
    public final View mo502a(MenuItem menuItem) {
        return this.f741a.onCreateActionView(menuItem);
    }

    @Override // androidx.core.p024g.AbstractC0518c
    /* renamed from: d */
    public final boolean mo504d() {
        return this.f741a.overridesItemVisibility();
    }

    @Override // androidx.core.p024g.AbstractC0518c
    /* renamed from: e */
    public final boolean mo505e() {
        return this.f741a.isVisible();
    }

    @Override // androidx.core.p024g.AbstractC0518c
    /* renamed from: a */
    public final void mo503a(InterfaceC0520e interfaceC0520e) {
        this.f744d = interfaceC0520e;
        this.f741a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        if (this.f744d != null) {
            this.f744d.mo496a();
        }
    }
}
