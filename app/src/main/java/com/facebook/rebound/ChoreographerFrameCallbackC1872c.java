package com.facebook.rebound;

import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSpringLooperFactory.java */
/* renamed from: com.facebook.rebound.c */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1872c implements Choreographer.FrameCallback {

    /* renamed from: a */
    final /* synthetic */ C1871b f8631a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChoreographerFrameCallbackC1872c(C1871b c1871b) {
        this.f8631a = c1871b;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z;
        long j2;
        Choreographer choreographer;
        Choreographer.FrameCallback frameCallback;
        z = this.f8631a.f8629d;
        if (!z || this.f8631a.f8669a == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C1875f c1875f = this.f8631a.f8669a;
        j2 = this.f8631a.f8630e;
        c1875f.m6007a(uptimeMillis - j2);
        this.f8631a.f8630e = uptimeMillis;
        choreographer = this.f8631a.f8627b;
        frameCallback = this.f8631a.f8628c;
        choreographer.postFrameCallback(frameCallback);
    }
}
