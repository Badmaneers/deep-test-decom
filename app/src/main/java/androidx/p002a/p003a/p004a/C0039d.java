package androidx.p002a.p003a.p004a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: DefaultTaskExecutor.java */
/* renamed from: androidx.a.a.a.d */
/* loaded from: classes.dex */
public final class C0039d extends AbstractC0041f {

    /* renamed from: a */
    private final Object f14a = new Object();

    /* renamed from: b */
    private final ExecutorService f15b = Executors.newFixedThreadPool(4, new ThreadFactoryC0040e(this));

    /* renamed from: c */
    private volatile Handler f16c;

    @Override // androidx.p002a.p003a.p004a.AbstractC0041f
    /* renamed from: a */
    public final void mo12a(Runnable runnable) {
        this.f15b.execute(runnable);
    }

    @Override // androidx.p002a.p003a.p004a.AbstractC0041f
    /* renamed from: b */
    public final void mo13b(Runnable runnable) {
        if (this.f16c == null) {
            synchronized (this.f14a) {
                if (this.f16c == null) {
                    this.f16c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f16c.post(runnable);
    }

    @Override // androidx.p002a.p003a.p004a.AbstractC0041f
    /* renamed from: c */
    public final boolean mo14c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
