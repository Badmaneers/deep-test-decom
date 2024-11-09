package androidx.appcompat.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionBarOverlayLayout.java */
/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public final class RunnableC0297f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f1422a;

    public RunnableC0297f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1422a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1422a.m528b();
        this.f1422a.f777c = this.f1422a.f775a.animate().translationY(0.0f).setListener(this.f1422a.f778d);
    }
}
