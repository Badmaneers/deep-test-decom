package androidx.dynamicanimation.p031a;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: AnimationHandler.java */
/* renamed from: androidx.dynamicanimation.a.e */
/* loaded from: classes.dex */
public final class C0615e extends AbstractC0614d {

    /* renamed from: b */
    long f2661b;

    /* renamed from: c */
    private final Runnable f2662c;

    /* renamed from: d */
    private final Handler f2663d;

    public C0615e(C0612b c0612b) {
        super(c0612b);
        this.f2661b = -1L;
        this.f2662c = new RunnableC0616f(this);
        this.f2663d = new Handler(Looper.myLooper());
    }

    @Override // androidx.dynamicanimation.p031a.AbstractC0614d
    /* renamed from: a */
    public final void mo2199a() {
        this.f2663d.postDelayed(this.f2662c, Math.max(10 - (SystemClock.uptimeMillis() - this.f2661b), 0L));
    }
}
