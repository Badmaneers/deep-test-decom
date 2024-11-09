package androidx.transition;

import android.view.ViewGroup;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.n */
/* loaded from: classes.dex */
final class C1057n extends C1008ak {

    /* renamed from: a */
    boolean f4231a = false;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f4232b;

    /* renamed from: c */
    final /* synthetic */ C1047d f4233c;

    public C1057n(C1047d c1047d, ViewGroup viewGroup) {
        this.f4233c = c1047d;
        this.f4232b = viewGroup;
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3519a() {
        C1022ay.m3543a(this.f4232b, false);
        this.f4231a = true;
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3520a(AbstractC1001ad abstractC1001ad) {
        if (!this.f4231a) {
            C1022ay.m3543a(this.f4232b, false);
        }
        abstractC1001ad.mo3501b(this);
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: b */
    public final void mo3521b() {
        C1022ay.m3543a(this.f4232b, false);
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: c */
    public final void mo3522c() {
        C1022ay.m3543a(this.f4232b, true);
    }
}
