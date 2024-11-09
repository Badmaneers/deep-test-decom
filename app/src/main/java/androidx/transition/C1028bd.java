package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
/* renamed from: androidx.transition.bd */
/* loaded from: classes.dex */
final class C1028bd implements InterfaceC1029be {

    /* renamed from: a */
    private final ViewOverlay f4170a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1028bd(View view) {
        this.f4170a = view.getOverlay();
    }

    @Override // androidx.transition.InterfaceC1029be
    /* renamed from: a */
    public final void mo3540a(Drawable drawable) {
        this.f4170a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC1029be
    /* renamed from: b */
    public final void mo3541b(Drawable drawable) {
        this.f4170a.remove(drawable);
    }
}
