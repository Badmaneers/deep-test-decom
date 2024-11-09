package androidx.room;

/* compiled from: TransactionExecutor.java */
/* renamed from: androidx.room.am */
/* loaded from: classes.dex */
final class RunnableC0944am implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f3881a;

    /* renamed from: b */
    final /* synthetic */ ExecutorC0943al f3882b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0944am(ExecutorC0943al executorC0943al, Runnable runnable) {
        this.f3882b = executorC0943al;
        this.f3881a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3881a.run();
        } finally {
            this.f3882b.m3371a();
        }
    }
}
