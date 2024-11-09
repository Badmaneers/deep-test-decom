package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransactionExecutor.java */
/* renamed from: androidx.room.al */
/* loaded from: classes.dex */
public final class ExecutorC0943al implements Executor {

    /* renamed from: a */
    private final Executor f3878a;

    /* renamed from: b */
    private final ArrayDeque<Runnable> f3879b = new ArrayDeque<>();

    /* renamed from: c */
    private Runnable f3880c;

    public ExecutorC0943al(Executor executor) {
        this.f3878a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f3879b.offer(new RunnableC0944am(this, runnable));
        if (this.f3880c == null) {
            m3371a();
        }
    }

    /* renamed from: a */
    public final synchronized void m3371a() {
        Runnable poll = this.f3879b.poll();
        this.f3880c = poll;
        if (poll != null) {
            this.f3878a.execute(this.f3880c);
        }
    }
}
