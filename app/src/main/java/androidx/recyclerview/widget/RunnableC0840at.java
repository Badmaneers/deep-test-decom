package androidx.recyclerview.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecyclerView.java */
/* renamed from: androidx.recyclerview.widget.at */
/* loaded from: classes.dex */
public final class RunnableC0840at implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f3509a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0840at(RecyclerView recyclerView) {
        this.f3509a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3509a.mItemAnimator != null) {
            this.f3509a.mItemAnimator.mo3039a();
        }
        this.f3509a.mPostedAnimatorRunner = false;
    }
}
