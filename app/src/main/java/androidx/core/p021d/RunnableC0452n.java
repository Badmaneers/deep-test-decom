package androidx.core.p021d;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelfDestructiveThread.java */
/* renamed from: androidx.core.d.n */
/* loaded from: classes.dex */
public final class RunnableC0452n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2219a;

    /* renamed from: b */
    final /* synthetic */ Callable f2220b;

    /* renamed from: c */
    final /* synthetic */ ReentrantLock f2221c;

    /* renamed from: d */
    final /* synthetic */ AtomicBoolean f2222d;

    /* renamed from: e */
    final /* synthetic */ Condition f2223e;

    /* renamed from: f */
    final /* synthetic */ C0448j f2224f;

    public RunnableC0452n(C0448j c0448j, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f2224f = c0448j;
        this.f2219a = atomicReference;
        this.f2220b = callable;
        this.f2221c = reentrantLock;
        this.f2222d = atomicBoolean;
        this.f2223e = condition;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2219a.set(this.f2220b.call());
        } catch (Exception unused) {
        }
        this.f2221c.lock();
        try {
            this.f2222d.set(false);
            this.f2223e.signal();
        } finally {
            this.f2221c.unlock();
        }
    }
}
