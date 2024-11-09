package com.facebook.rebound;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSpringLooperFactory.java */
/* renamed from: com.facebook.rebound.e */
/* loaded from: classes.dex */
public final class RunnableC1874e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1873d f8636a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1874e(C1873d c1873d) {
        this.f8636a = c1873d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        long j;
        Handler handler;
        Runnable runnable;
        z = this.f8636a.f8634d;
        if (!z || this.f8636a.f8669a == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C1875f c1875f = this.f8636a.f8669a;
        j = this.f8636a.f8635e;
        c1875f.m6007a(uptimeMillis - j);
        this.f8636a.f8635e = uptimeMillis;
        handler = this.f8636a.f8632b;
        runnable = this.f8636a.f8633c;
        handler.post(runnable);
    }
}
