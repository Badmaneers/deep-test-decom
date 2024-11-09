package androidx.core.p021d;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelfDestructiveThread.java */
/* renamed from: androidx.core.d.j */
/* loaded from: classes.dex */
public final class C0448j {

    /* renamed from: b */
    private HandlerThread f2205b;

    /* renamed from: c */
    private Handler f2206c;

    /* renamed from: h */
    private final String f2211h;

    /* renamed from: a */
    private final Object f2204a = new Object();

    /* renamed from: e */
    private Handler.Callback f2208e = new C0449k(this);

    /* renamed from: g */
    private final int f2210g = 10;

    /* renamed from: f */
    private final int f2209f = 10000;

    /* renamed from: d */
    private int f2207d = 0;

    public C0448j(String str) {
        this.f2211h = str;
    }

    /* renamed from: b */
    private void m1573b(Runnable runnable) {
        synchronized (this.f2204a) {
            if (this.f2205b == null) {
                this.f2205b = new HandlerThread(this.f2211h, this.f2210g);
                this.f2205b.start();
                this.f2206c = new Handler(this.f2205b.getLooper(), this.f2208e);
                this.f2207d++;
            }
            this.f2206c.removeMessages(0);
            this.f2206c.sendMessage(this.f2206c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public final <T> void m1577a(Callable<T> callable, InterfaceC0453o<T> interfaceC0453o) {
        m1573b(new RunnableC0450l(this, callable, new Handler(), interfaceC0453o));
    }

    /* renamed from: a */
    public final <T> T m1574a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m1573b(new RunnableC0452n(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1576a(Runnable runnable) {
        runnable.run();
        synchronized (this.f2204a) {
            this.f2206c.removeMessages(0);
            this.f2206c.sendMessageDelayed(this.f2206c.obtainMessage(0), this.f2209f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1575a() {
        synchronized (this.f2204a) {
            if (this.f2206c.hasMessages(1)) {
                return;
            }
            this.f2205b.quit();
            this.f2205b = null;
            this.f2206c = null;
        }
    }
}
