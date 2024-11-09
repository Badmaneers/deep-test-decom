package androidx.media;

import android.os.IBinder;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.u */
/* loaded from: classes.dex */
final class RunnableC0790u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3207a;

    /* renamed from: b */
    final /* synthetic */ C0782m f3208b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0790u(C0782m c0782m, InterfaceC0793x interfaceC0793x) {
        this.f3208b = c0782m;
        this.f3207a = interfaceC0793x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder mo2684a = this.f3207a.mo2684a();
        C0779j remove = this.f3208b.f3175a.f3122b.remove(mo2684a);
        if (remove != null) {
            mo2684a.unlinkToDeath(remove, 0);
        }
    }
}
