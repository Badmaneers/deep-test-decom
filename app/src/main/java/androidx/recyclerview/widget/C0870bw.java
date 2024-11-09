package androidx.recyclerview.widget;

import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.bw */
/* loaded from: classes.dex */
public final class C0870bw extends AbstractC0848ba {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f3569a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0870bw(RecyclerView recyclerView) {
        this.f3569a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.AbstractC0848ba
    /* renamed from: a */
    public final void mo3032a() {
        this.f3569a.assertNotInLayoutOrScroll(null);
        this.f3569a.mState.f3594f = true;
        this.f3569a.processDataSetCompletelyChanged(true);
        if (this.f3569a.mAdapterHelper.m2930d()) {
            return;
        }
        this.f3569a.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC0848ba
    /* renamed from: b */
    public final void mo3034b(int i, int i2) {
        this.f3569a.assertNotInLayoutOrScroll(null);
        if (this.f3569a.mAdapterHelper.m2928b(i, i2)) {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION && this.f3569a.mHasFixedSize && this.f3569a.mIsAttached) {
                C0538w.m1852a(this.f3569a, this.f3569a.mUpdateChildViewsRunnable);
            } else {
                this.f3569a.mAdapterUpdateDuringMeasure = true;
                this.f3569a.requestLayout();
            }
        }
    }
}
