package androidx.appcompat.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.u */
/* loaded from: classes.dex */
public final class RunnableC0106u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f365a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0106u(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f365a = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if ((this.f365a.f165s & 1) != 0) {
            this.f365a.m125h(0);
        }
        if ((this.f365a.f165s & 4096) != 0) {
            this.f365a.m125h(108);
        }
        this.f365a.f164r = false;
        this.f365a.f165s = 0;
    }
}
