package com.heytap.epona.internal;

import android.app.Activity;
import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.Stack;

/* compiled from: ActivityStackManager.java */
/* renamed from: com.heytap.epona.internal.a */
/* loaded from: classes.dex */
public final class C2419a {

    /* renamed from: a */
    private final Stack<WeakReference<Activity>> f10667a = new Stack<>();

    /* renamed from: b */
    private final Application.ActivityLifecycleCallbacks f10668b = new C2420b(this);

    /* renamed from: a */
    public final void m7719a(Application application) {
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.f10668b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m7715a(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f10667a.push(new WeakReference<>(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m7717b(Activity activity) {
        Activity activity2;
        if (activity == null) {
            return;
        }
        for (int size = this.f10667a.size() - 1; size >= 0; size--) {
            try {
                WeakReference<Activity> weakReference = this.f10667a.get(size);
                if (weakReference != null && (activity2 = weakReference.get()) != null && activity2.getClass().getSimpleName().equals(activity.getClass().getSimpleName())) {
                    this.f10667a.remove(size);
                    return;
                }
            } catch (Exception unused) {
            }
        }
    }
}
