package androidx.transition;

/* compiled from: TransitionSet.java */
/* renamed from: androidx.transition.ar */
/* loaded from: classes.dex */
final class C1015ar extends C1008ak {

    /* renamed from: a */
    C1013ap f4145a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1015ar(C1013ap c1013ap) {
        this.f4145a = c1013ap;
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: d */
    public final void mo3523d() {
        if (this.f4145a.f4139i) {
            return;
        }
        this.f4145a.m3512g();
        this.f4145a.f4139i = true;
    }

    @Override // androidx.transition.C1008ak, androidx.transition.InterfaceC1007aj
    /* renamed from: a */
    public final void mo3520a(AbstractC1001ad abstractC1001ad) {
        C1013ap c1013ap = this.f4145a;
        c1013ap.f4138h--;
        if (this.f4145a.f4138h == 0) {
            this.f4145a.f4139i = false;
            this.f4145a.m3513h();
        }
        abstractC1001ad.mo3501b(this);
    }
}
