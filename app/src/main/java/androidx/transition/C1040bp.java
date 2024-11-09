package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Visibility.java */
/* renamed from: androidx.transition.bp */
/* loaded from: classes.dex */
final class C1040bp extends C1008ak {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f4186a;

    /* renamed from: b */
    final /* synthetic */ View f4187b;

    /* renamed from: c */
    final /* synthetic */ View f4188c;

    /* renamed from: d */
    final /* synthetic */ AbstractC1039bo f4189d;

    public C1040bp(AbstractC1039bo abstractC1039bo, ViewGroup viewGroup, View view, View view2) {
        this.f4189d = abstractC1039bo;
        this.f4186a = viewGroup;
        this.f4187b = view;
        this.f4188c = view2;
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: b */
    public final void mo3521b() {
        C1022ay.m3542a(this.f4186a).mo3539b(this.f4187b);
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: c */
    public final void mo3522c() {
        if (this.f4187b.getParent() == null) {
            C1022ay.m3542a(this.f4186a).mo3538a(this.f4187b);
        } else {
            this.f4189d.mo3514i();
        }
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3520a(AbstractC1001ad abstractC1001ad) {
        this.f4188c.setTag(R.id.save_overlay_view, null);
        C1022ay.m3542a(this.f4186a).mo3539b(this.f4187b);
        abstractC1001ad.mo3501b(this);
    }
}
