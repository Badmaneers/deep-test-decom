package androidx.core.p021d;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelfDestructiveThread.java */
/* renamed from: androidx.core.d.l */
/* loaded from: classes.dex */
public final class RunnableC0450l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Callable f2213a;

    /* renamed from: b */
    final /* synthetic */ Handler f2214b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC0453o f2215c;

    /* renamed from: d */
    final /* synthetic */ C0448j f2216d;

    public RunnableC0450l(C0448j c0448j, Callable callable, Handler handler, InterfaceC0453o interfaceC0453o) {
        this.f2216d = c0448j;
        this.f2213a = callable;
        this.f2214b = handler;
        this.f2215c = interfaceC0453o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f2213a.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f2214b.post(new RunnableC0451m(this, obj));
    }
}
