package androidx.fragment.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DialogFragment.java */
/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public final class RunnableC0692d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DialogInterfaceOnCancelListenerC0691c f2953a;

    public RunnableC0692d(DialogInterfaceOnCancelListenerC0691c dialogInterfaceOnCancelListenerC0691c) {
        this.f2953a = dialogInterfaceOnCancelListenerC0691c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2953a.f2949f != null) {
            this.f2953a.onDismiss(this.f2953a.f2949f);
        }
    }
}
