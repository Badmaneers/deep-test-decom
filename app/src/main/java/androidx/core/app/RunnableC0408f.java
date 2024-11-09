package androidx.core.app;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class RunnableC0408f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f2131a;

    /* renamed from: b */
    final /* synthetic */ Object f2132b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0408f(Object obj, Object obj2) {
        this.f2131a = obj;
        this.f2132b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (C0405c.f2123d != null) {
                C0405c.f2123d.invoke(this.f2131a, this.f2132b, Boolean.FALSE, "AppCompat recreation");
            } else {
                C0405c.f2124e.invoke(this.f2131a, this.f2132b, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
