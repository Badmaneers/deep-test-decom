package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
/* renamed from: androidx.transition.aw */
/* loaded from: classes.dex */
final class C1020aw implements InterfaceC1021ax {

    /* renamed from: a */
    private final ViewGroupOverlay f4156a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1020aw(ViewGroup viewGroup) {
        this.f4156a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.InterfaceC1029be
    /* renamed from: a */
    public final void mo3540a(Drawable drawable) {
        this.f4156a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC1029be
    /* renamed from: b */
    public final void mo3541b(Drawable drawable) {
        this.f4156a.remove(drawable);
    }

    @Override // androidx.transition.InterfaceC1021ax
    /* renamed from: a */
    public final void mo3538a(View view) {
        this.f4156a.add(view);
    }

    @Override // androidx.transition.InterfaceC1021ax
    /* renamed from: b */
    public final void mo3539b(View view) {
        this.f4156a.remove(view);
    }
}
