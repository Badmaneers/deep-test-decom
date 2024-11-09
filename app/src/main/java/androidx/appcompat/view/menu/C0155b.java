package androidx.appcompat.view.menu;

import androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp;

/* compiled from: ActionMenuItemView.java */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
final class C0155b extends AbstractViewOnAttachStateChangeListenerC0224bp {

    /* renamed from: a */
    final /* synthetic */ ActionMenuItemView f607a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f607a = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: a */
    public final InterfaceC0149ai mo405a() {
        if (this.f607a.f514c != null) {
            return this.f607a.f514c.mo407a();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: b */
    protected final boolean mo406b() {
        InterfaceC0149ai mo405a;
        return this.f607a.f513b != null && this.f607a.f513b.mo344a(this.f607a.f512a) && (mo405a = mo405a()) != null && mo405a.mo393e();
    }
}
