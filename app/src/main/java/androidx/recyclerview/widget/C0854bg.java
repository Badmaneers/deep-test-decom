package androidx.recyclerview.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bg */
/* loaded from: classes.dex */
public final class C0854bg implements InterfaceC0852be {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f3525a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0854bg(RecyclerView recyclerView) {
        this.f3525a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0852be
    /* renamed from: a */
    public final void mo3056a(AbstractC0879ce abstractC0879ce) {
        abstractC0879ce.m3204a(true);
        if (abstractC0879ce.f3621h != null && abstractC0879ce.f3622i == null) {
            abstractC0879ce.f3621h = null;
        }
        abstractC0879ce.f3622i = null;
        if (((abstractC0879ce.f3623j & 16) != 0) || this.f3525a.removeAnimatingView(abstractC0879ce.f3614a) || !abstractC0879ce.m3221o()) {
            return;
        }
        this.f3525a.removeDetachedView(abstractC0879ce.f3614a, false);
    }
}
