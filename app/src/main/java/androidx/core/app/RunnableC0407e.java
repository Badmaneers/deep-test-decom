package androidx.core.app;

import android.app.Application;

/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
final class RunnableC0407e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Application f2129a;

    /* renamed from: b */
    final /* synthetic */ C0409g f2130b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0407e(Application application, C0409g c0409g) {
        this.f2129a = application;
        this.f2130b = c0409g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2129a.unregisterActivityLifecycleCallbacks(this.f2130b);
    }
}
