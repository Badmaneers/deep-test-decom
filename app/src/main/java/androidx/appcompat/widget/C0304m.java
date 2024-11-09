package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.InterfaceC0149ai;
import androidx.appcompat.widget.ActionMenuPresenter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public final class C0304m extends AbstractViewOnAttachStateChangeListenerC0224bp {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1428a;

    /* renamed from: b */
    final /* synthetic */ ActionMenuPresenter.OverflowMenuButton f1429b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0304m(ActionMenuPresenter.OverflowMenuButton overflowMenuButton, View view, ActionMenuPresenter actionMenuPresenter) {
        super(view);
        this.f1429b = overflowMenuButton;
        this.f1428a = actionMenuPresenter;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: a */
    public final InterfaceC0149ai mo405a() {
        if (ActionMenuPresenter.this.f801h == null) {
            return null;
        }
        return ActionMenuPresenter.this.f801h.m379c();
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: b */
    public final boolean mo406b() {
        ActionMenuPresenter.this.m550h();
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: c */
    public final boolean mo676c() {
        if (ActionMenuPresenter.this.f803j != null) {
            return false;
        }
        ActionMenuPresenter.this.m551i();
        return true;
    }
}
