package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.InterfaceC0149ai;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityChooserView.java */
/* renamed from: androidx.appcompat.widget.ae */
/* loaded from: classes.dex */
public final class C0186ae extends AbstractViewOnAttachStateChangeListenerC0224bp {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1096a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186ae(ActivityChooserView activityChooserView, View view) {
        super(view);
        this.f1096a = activityChooserView;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: a */
    public final InterfaceC0149ai mo405a() {
        return this.f1096a.getListPopupWindow();
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: b */
    protected final boolean mo406b() {
        this.f1096a.m573a();
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnAttachStateChangeListenerC0224bp
    /* renamed from: c */
    protected final boolean mo676c() {
        this.f1096a.m574b();
        return true;
    }
}
