package androidx.core.p021d;

/* compiled from: SelfDestructiveThread.java */
/* renamed from: androidx.core.d.m */
/* loaded from: classes.dex */
final class RunnableC0451m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f2217a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0450l f2218b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0451m(RunnableC0450l runnableC0450l, Object obj) {
        this.f2218b = runnableC0450l;
        this.f2217a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2218b.f2215c.mo1565a(this.f2217a);
    }
}
