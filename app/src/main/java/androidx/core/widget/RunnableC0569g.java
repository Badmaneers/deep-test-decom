package androidx.core.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentLoadingProgressBar.java */
/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public final class RunnableC0569g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContentLoadingProgressBar f2515a;

    public RunnableC0569g(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f2515a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2515a.f2448c = false;
        if (this.f2515a.f2449d) {
            return;
        }
        this.f2515a.f2446a = System.currentTimeMillis();
        this.f2515a.setVisibility(0);
    }
}
