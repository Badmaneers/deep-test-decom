package androidx.appcompat.app;

import android.content.res.Resources;
import java.lang.Thread;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.t */
/* loaded from: classes.dex */
final class C0105t implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f364a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0105t(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f364a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String message;
        boolean z = false;
        if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
            z = true;
        }
        if (z) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f364a.uncaughtException(thread, notFoundException);
            return;
        }
        this.f364a.uncaughtException(thread, th);
    }
}
