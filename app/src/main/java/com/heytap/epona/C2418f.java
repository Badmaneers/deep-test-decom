package com.heytap.epona;

import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Route.java */
/* renamed from: com.heytap.epona.f */
/* loaded from: classes.dex */
public final class C2418f {

    /* renamed from: a */
    private final int f10663a = 64;

    /* renamed from: b */
    private ExecutorService f10664b = m7714a();

    /* renamed from: c */
    private ArrayDeque<Object> f10665c = new ArrayDeque<>();

    /* renamed from: d */
    private ArrayDeque<Object> f10666d = new ArrayDeque<>();

    /* renamed from: a */
    private synchronized ExecutorService m7714a() {
        if (this.f10664b == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            final String str = "Epona Route";
            final Boolean bool = Boolean.FALSE;
            this.f10664b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactory() { // from class: com.heytap.epona.-$$Lambda$f$0H5s-G77aOaWCkppRoo6Go7l5t8
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread m7713a;
                    m7713a = C2418f.m7713a(str, bool, runnable);
                    return m7713a;
                }
            });
        }
        return this.f10664b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Thread m7713a(String str, Boolean bool, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(bool.booleanValue());
        return thread;
    }
}
