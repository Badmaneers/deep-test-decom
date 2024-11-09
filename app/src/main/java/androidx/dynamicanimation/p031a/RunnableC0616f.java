package androidx.dynamicanimation.p031a;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimationHandler.java */
/* renamed from: androidx.dynamicanimation.a.f */
/* loaded from: classes.dex */
public final class RunnableC0616f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0615e f2664a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0616f(C0615e c0615e) {
        this.f2664a = c0615e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2664a.f2661b = SystemClock.uptimeMillis();
        this.f2664a.f2660a.m2197a();
    }
}
