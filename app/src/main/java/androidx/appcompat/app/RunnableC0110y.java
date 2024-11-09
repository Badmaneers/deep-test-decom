package androidx.appcompat.app;

import androidx.core.p024g.C0538w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.y */
/* loaded from: classes.dex */
public final class RunnableC0110y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f369a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0110y(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f369a = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f369a.f155i.showAtLocation(this.f369a.f154h, 55, 0, 0);
        this.f369a.m134q();
        if (this.f369a.m132o()) {
            this.f369a.f154h.setAlpha(0.0f);
            this.f369a.f157k = C0538w.m1887p(this.f369a.f154h).m1753a(1.0f);
            this.f369a.f157k.m1756a(new C0111z(this));
            return;
        }
        this.f369a.f154h.setAlpha(1.0f);
        this.f369a.f154h.setVisibility(0);
    }
}
