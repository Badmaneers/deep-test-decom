package androidx.appcompat.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TooltipCompatHandler.java */
/* renamed from: androidx.appcompat.widget.ea */
/* loaded from: classes.dex */
public final class RunnableC0290ea implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewOnAttachStateChangeListenerC0288dz f1410a;

    public RunnableC0290ea(ViewOnAttachStateChangeListenerC0288dz viewOnAttachStateChangeListenerC0288dz) {
        this.f1410a = viewOnAttachStateChangeListenerC0288dz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1410a.m980a(false);
    }
}
