package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.n */
/* loaded from: classes.dex */
final class RunnableC0783n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3176a;

    /* renamed from: b */
    final /* synthetic */ String f3177b;

    /* renamed from: c */
    final /* synthetic */ int f3178c;

    /* renamed from: d */
    final /* synthetic */ int f3179d;

    /* renamed from: e */
    final /* synthetic */ Bundle f3180e;

    /* renamed from: f */
    final /* synthetic */ C0782m f3181f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0783n(C0782m c0782m, InterfaceC0793x interfaceC0793x, String str, int i, int i2, Bundle bundle) {
        this.f3181f = c0782m;
        this.f3176a = interfaceC0793x;
        this.f3177b = str;
        this.f3178c = i;
        this.f3179d = i2;
        this.f3180e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder mo2684a = this.f3176a.mo2684a();
        this.f3181f.f3175a.f3122b.remove(mo2684a);
        C0779j c0779j = new C0779j(this.f3181f.f3175a, this.f3177b, this.f3178c, this.f3179d, this.f3180e, this.f3176a);
        this.f3181f.f3175a.f3123c = c0779j;
        c0779j.f3167h = this.f3181f.f3175a.m2662a();
        this.f3181f.f3175a.f3123c = null;
        if (c0779j.f3167h == null) {
            Log.i("MBServiceCompat", "No root for client " + this.f3177b + " from service " + getClass().getName());
            try {
                this.f3176a.mo2687b();
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f3177b);
                return;
            }
        }
        try {
            this.f3181f.f3175a.f3122b.put(mo2684a, c0779j);
            mo2684a.linkToDeath(c0779j, 0);
            if (this.f3181f.f3175a.f3125e != null) {
                this.f3176a.mo2685a(c0779j.f3167h.m2673a(), this.f3181f.f3175a.f3125e, c0779j.f3167h.m2674b());
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f3177b);
            this.f3181f.f3175a.f3122b.remove(mo2684a);
        }
    }
}
