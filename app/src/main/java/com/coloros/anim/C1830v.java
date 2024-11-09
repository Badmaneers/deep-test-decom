package com.coloros.anim;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.coloros.anim.p062f.C1806b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: EffectiveAnimationTask.java */
/* renamed from: com.coloros.anim.v */
/* loaded from: classes.dex */
public final class C1830v<T> {

    /* renamed from: a */
    public static Executor f8484a = Executors.newCachedThreadPool();

    /* renamed from: b */
    private final Set<InterfaceC1827s<T>> f8485b;

    /* renamed from: c */
    private final Set<InterfaceC1827s<Throwable>> f8486c;

    /* renamed from: d */
    private final Handler f8487d;

    /* renamed from: e */
    private volatile C1829u<T> f8488e;

    public C1830v(Callable<C1829u<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1830v(Callable<C1829u<T>> callable, boolean z) {
        this.f8485b = new LinkedHashSet(1);
        this.f8486c = new LinkedHashSet(1);
        this.f8487d = new HandlerC1831w(this, Looper.getMainLooper());
        this.f8488e = null;
        if (z) {
            try {
                m5927a((C1829u) callable.call());
                return;
            } catch (Throwable th) {
                m5927a((C1829u) new C1829u<>(th));
                return;
            }
        }
        f8484a.execute(new C1832x(this, callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5927a(C1829u<T> c1829u) {
        if (this.f8488e != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f8488e = c1829u;
        C1806b.m5866b("Load anim composition done,setting result!!!");
        m5926a();
    }

    /* renamed from: a */
    public final synchronized C1830v<T> m5932a(InterfaceC1827s<T> interfaceC1827s) {
        if (this.f8488e != null && this.f8488e.m5924a() != null) {
            C1806b.m5866b("EffectiveAnimationTask addListener listener.onResult");
            interfaceC1827s.mo5556a(this.f8488e.m5924a());
            return this;
        }
        this.f8485b.add(interfaceC1827s);
        return this;
    }

    /* renamed from: b */
    public final synchronized C1830v<T> m5933b(InterfaceC1827s<T> interfaceC1827s) {
        this.f8485b.remove(interfaceC1827s);
        return this;
    }

    /* renamed from: c */
    public final synchronized C1830v<T> m5934c(InterfaceC1827s<Throwable> interfaceC1827s) {
        if (this.f8488e != null && this.f8488e.m5925b() != null) {
            interfaceC1827s.mo5556a(this.f8488e.m5925b());
            return this;
        }
        this.f8486c.add(interfaceC1827s);
        return this;
    }

    /* renamed from: d */
    public final synchronized C1830v<T> m5935d(InterfaceC1827s<Throwable> interfaceC1827s) {
        this.f8486c.remove(interfaceC1827s);
        return this;
    }

    /* renamed from: a */
    private void m5926a() {
        Message obtainMessage = this.f8487d.obtainMessage(1001);
        obtainMessage.setAsynchronous(true);
        this.f8487d.sendMessageAtFrontOfQueue(obtainMessage);
    }

    /* renamed from: a */
    private synchronized void m5930a(T t) {
        Iterator it = new ArrayList(this.f8485b).iterator();
        while (it.hasNext()) {
            ((InterfaceC1827s) it.next()).mo5556a(t);
        }
    }

    /* renamed from: a */
    private synchronized void m5931a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f8486c);
        if (arrayList.isEmpty()) {
            Log.w("EffectiveAnimation", "EffectiveAnimation encountered an error but no failure listener was added.", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1827s) it.next()).mo5556a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m5928a(C1830v c1830v) {
        boolean z = Looper.getMainLooper() == Looper.myLooper();
        if (c1830v.f8488e == null || !z) {
            return;
        }
        C1829u<T> c1829u = c1830v.f8488e;
        if (c1829u.m5924a() != null) {
            c1830v.m5930a((C1830v) c1829u.m5924a());
        } else {
            c1830v.m5931a(c1829u.m5925b());
        }
    }
}
