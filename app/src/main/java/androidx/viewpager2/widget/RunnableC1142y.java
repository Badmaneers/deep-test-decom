package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewPager2.java */
/* renamed from: androidx.viewpager2.widget.y */
/* loaded from: classes.dex */
public final class RunnableC1142y implements Runnable {

    /* renamed from: a */
    private final int f4567a;

    /* renamed from: b */
    private final RecyclerView f4568b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1142y(int i, RecyclerView recyclerView) {
        this.f4567a = i;
        this.f4568b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4568b.smoothScrollToPosition(this.f4567a);
    }
}
