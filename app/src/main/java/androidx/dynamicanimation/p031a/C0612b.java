package androidx.dynamicanimation.p031a;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimationHandler.java */
/* renamed from: androidx.dynamicanimation.a.b */
/* loaded from: classes.dex */
public final class C0612b {

    /* renamed from: a */
    final /* synthetic */ C0608a f2659a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0612b(C0608a c0608a) {
        this.f2659a = c0608a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2197a() {
        this.f2659a.f2640c = SystemClock.uptimeMillis();
        this.f2659a.m2178a(this.f2659a.f2640c);
        if (this.f2659a.f2639b.size() > 0) {
            this.f2659a.m2180b().mo2199a();
        }
    }
}
