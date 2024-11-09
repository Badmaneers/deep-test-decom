package androidx.recyclerview.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.ax */
/* loaded from: classes.dex */
public final class C0844ax implements InterfaceC0847b {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f3512a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0844ax(RecyclerView recyclerView) {
        this.f3512a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0847b
    /* renamed from: a */
    public final AbstractC0879ce mo3006a(int i) {
        AbstractC0879ce findViewHolderForPosition = this.f3512a.findViewHolderForPosition(i, true);
        if (findViewHolderForPosition == null || this.f3512a.mChildHelper.m3295d(findViewHolderForPosition.f3614a)) {
            return null;
        }
        return findViewHolderForPosition;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0847b
    /* renamed from: a */
    public final void mo3007a(int i, int i2) {
        this.f3512a.offsetPositionRecordsForRemove(i, i2, true);
        this.f3512a.mItemsAddedOrRemoved = true;
        this.f3512a.mState.f3591c += i2;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0847b
    /* renamed from: b */
    public final void mo3010b(int i, int i2) {
        this.f3512a.offsetPositionRecordsForRemove(i, i2, false);
        this.f3512a.mItemsAddedOrRemoved = true;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0847b
    /* renamed from: a */
    public final void mo3008a(int i, int i2, Object obj) {
        this.f3512a.viewRangeUpdate(i, i2, obj);
        this.f3512a.mItemsChanged = true;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0847b
    /* renamed from: a */
    public final void mo3009a(C0874c c0874c) {
        m3005c(c0874c);
    }

    /* renamed from: c */
    private void m3005c(C0874c c0874c) {
        int i = c0874c.f3585a;
        if (i == 4) {
            this.f3512a.mLayout.mo2792c(c0874c.f3586b, c0874c.f3588d);
            return;
        }
        if (i != 8) {
            switch (i) {
                case 1:
                    this.f3512a.mLayout.mo2779a(c0874c.f3586b, c0874c.f3588d);
                    return;
                case 2:
                    this.f3512a.mLayout.mo2790b(c0874c.f3586b, c0874c.f3588d);
                    return;
                default:
                    return;
            }
        }
        this.f3512a.mLayout.mo2796d(c0874c.f3586b, c0874c.f3588d);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0847b
    /* renamed from: b */
    public final void mo3011b(C0874c c0874c) {
        m3005c(c0874c);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0847b
    /* renamed from: c */
    public final void mo3012c(int i, int i2) {
        this.f3512a.offsetPositionRecordsForInsert(i, i2);
        this.f3512a.mItemsAddedOrRemoved = true;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0847b
    /* renamed from: d */
    public final void mo3013d(int i, int i2) {
        this.f3512a.offsetPositionRecordsForMove(i, i2);
        this.f3512a.mItemsAddedOrRemoved = true;
    }
}
