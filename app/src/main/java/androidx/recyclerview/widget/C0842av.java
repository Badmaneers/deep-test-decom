package androidx.recyclerview.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.av */
/* loaded from: classes.dex */
public final class C0842av implements InterfaceC0898cx {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f3510a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0842av(RecyclerView recyclerView) {
        this.f3510a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0898cx
    /* renamed from: a */
    public final void mo2991a(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2) {
        this.f3510a.mRecycler.m3167b(abstractC0879ce);
        this.f3510a.animateDisappearance(abstractC0879ce, c0853bf, c0853bf2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0898cx
    /* renamed from: b */
    public final void mo2992b(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2) {
        this.f3510a.animateAppearance(abstractC0879ce, c0853bf, c0853bf2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0898cx
    /* renamed from: c */
    public final void mo2993c(AbstractC0879ce abstractC0879ce, C0853bf c0853bf, C0853bf c0853bf2) {
        abstractC0879ce.m3204a(false);
        if (this.f3510a.mDataSetHasChangedAfterLayout) {
            if (this.f3510a.mItemAnimator.mo3042a(abstractC0879ce, abstractC0879ce, c0853bf, c0853bf2)) {
                this.f3510a.postAnimationRunner();
            }
        } else if (this.f3510a.mItemAnimator.mo3047c(abstractC0879ce, c0853bf, c0853bf2)) {
            this.f3510a.postAnimationRunner();
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC0898cx
    /* renamed from: a */
    public final void mo2990a(AbstractC0879ce abstractC0879ce) {
        this.f3510a.mLayout.m3092a(abstractC0879ce.f3614a, this.f3510a.mRecycler);
    }
}
