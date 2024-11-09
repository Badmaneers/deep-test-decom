package androidx.core.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.d */
/* loaded from: classes.dex */
public final class RunnableC0406d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0409g f2127a;

    /* renamed from: b */
    final /* synthetic */ Object f2128b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0406d(C0409g c0409g, Object obj) {
        this.f2127a = c0409g;
        this.f2128b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2127a.f2133a = this.f2128b;
    }
}
