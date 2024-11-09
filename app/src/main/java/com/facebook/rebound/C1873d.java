package com.facebook.rebound;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSpringLooperFactory.java */
/* renamed from: com.facebook.rebound.d */
/* loaded from: classes.dex */
public final class C1873d extends AbstractC1884o {

    /* renamed from: b */
    private final Handler f8632b;

    /* renamed from: c */
    private final Runnable f8633c = new RunnableC1874e(this);

    /* renamed from: d */
    private boolean f8634d;

    /* renamed from: e */
    private long f8635e;

    public C1873d(Handler handler) {
        this.f8632b = handler;
    }

    @Override // com.facebook.rebound.AbstractC1884o
    /* renamed from: a */
    public final void mo5999a() {
        if (this.f8634d) {
            return;
        }
        this.f8634d = true;
        this.f8635e = SystemClock.uptimeMillis();
        this.f8632b.removeCallbacks(this.f8633c);
        this.f8632b.post(this.f8633c);
    }

    @Override // com.facebook.rebound.AbstractC1884o
    /* renamed from: b */
    public final void mo6000b() {
        this.f8634d = false;
        this.f8632b.removeCallbacks(this.f8633c);
    }
}
