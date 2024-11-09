package androidx.p002a.p003a.p004a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultTaskExecutor.java */
/* renamed from: androidx.a.a.a.e */
/* loaded from: classes.dex */
public final class ThreadFactoryC0040e implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ C0039d f17a;

    /* renamed from: b */
    private final AtomicInteger f18b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC0040e(C0039d c0039d) {
        this.f17a = c0039d;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f18b.getAndIncrement())));
        return thread;
    }
}
