package com.facebook.rebound;

import android.annotation.TargetApi;
import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSpringLooperFactory.java */
@TargetApi(16)
/* renamed from: com.facebook.rebound.b */
/* loaded from: classes.dex */
public final class C1871b extends AbstractC1884o {

    /* renamed from: b */
    private final Choreographer f8627b;

    /* renamed from: c */
    private final Choreographer.FrameCallback f8628c = new ChoreographerFrameCallbackC1872c(this);

    /* renamed from: d */
    private boolean f8629d;

    /* renamed from: e */
    private long f8630e;

    public C1871b(Choreographer choreographer) {
        this.f8627b = choreographer;
    }

    @Override // com.facebook.rebound.AbstractC1884o
    /* renamed from: a */
    public final void mo5999a() {
        if (this.f8629d) {
            return;
        }
        this.f8629d = true;
        this.f8630e = SystemClock.uptimeMillis();
        this.f8627b.removeFrameCallback(this.f8628c);
        this.f8627b.postFrameCallback(this.f8628c);
    }

    @Override // com.facebook.rebound.AbstractC1884o
    /* renamed from: b */
    public final void mo6000b() {
        this.f8629d = false;
        this.f8627b.removeFrameCallback(this.f8628c);
    }
}
