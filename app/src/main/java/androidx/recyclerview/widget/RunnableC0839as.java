package androidx.recyclerview.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.as */
/* loaded from: classes.dex */
public final class RunnableC0839as implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f3508a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0839as(RecyclerView recyclerView) {
        this.f3508a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3508a.mFirstLayoutComplete || this.f3508a.isLayoutRequested()) {
            return;
        }
        if (!this.f3508a.mIsAttached) {
            this.f3508a.requestLayout();
        } else if (this.f3508a.mLayoutSuppressed) {
            this.f3508a.mLayoutWasDefered = true;
        } else {
            this.f3508a.consumePendingUpdateOperations();
        }
    }
}
