package androidx.core.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentLoadingProgressBar.java */
/* renamed from: androidx.core.widget.f */
/* loaded from: classes.dex */
public final class RunnableC0568f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContentLoadingProgressBar f2514a;

    public RunnableC0568f(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f2514a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2514a.f2447b = false;
        this.f2514a.f2446a = -1L;
        this.f2514a.setVisibility(8);
    }
}
