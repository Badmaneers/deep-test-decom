package androidx.appcompat.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionBarOverlayLayout.java */
/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public final class RunnableC0298g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f1423a;

    public RunnableC0298g(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1423a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1423a.m528b();
        this.f1423a.f777c = this.f1423a.f775a.animate().translationY(-this.f1423a.f775a.getHeight()).setListener(this.f1423a.f778d);
    }
}
