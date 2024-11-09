package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.g */
/* loaded from: classes.dex */
final class C0409g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    Object f2133a;

    /* renamed from: b */
    private Activity f2134b;

    /* renamed from: c */
    private boolean f2135c = false;

    /* renamed from: d */
    private boolean f2136d = false;

    /* renamed from: e */
    private boolean f2137e = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0409g(Activity activity) {
        this.f2134b = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f2134b == activity) {
            this.f2135c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f2136d || this.f2137e || this.f2135c || !C0405c.m1458a(this.f2133a, activity)) {
            return;
        }
        this.f2137e = true;
        this.f2133a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f2134b == activity) {
            this.f2134b = null;
            this.f2136d = true;
        }
    }
}
