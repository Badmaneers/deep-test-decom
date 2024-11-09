package com.heytap.epona.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityStackManager.java */
/* renamed from: com.heytap.epona.internal.b */
/* loaded from: classes.dex */
public final class C2420b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C2419a f10669a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2420b(C2419a c2419a) {
        this.f10669a = c2419a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f10669a.m7715a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f10669a.m7717b(activity);
    }
}
