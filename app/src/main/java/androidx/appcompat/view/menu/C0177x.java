package androidx.appcompat.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.InterfaceC0130d;

/* compiled from: MenuItemWrapperICS.java */
/* renamed from: androidx.appcompat.view.menu.x */
/* loaded from: classes.dex */
final class C0177x extends FrameLayout implements InterfaceC0130d {

    /* renamed from: a */
    final CollapsibleActionView f745a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public C0177x(View view) {
        super(view.getContext());
        this.f745a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // androidx.appcompat.view.InterfaceC0130d
    /* renamed from: a */
    public final void mo312a() {
        this.f745a.onActionViewExpanded();
    }

    @Override // androidx.appcompat.view.InterfaceC0130d
    /* renamed from: b */
    public final void mo313b() {
        this.f745a.onActionViewCollapsed();
    }
}
