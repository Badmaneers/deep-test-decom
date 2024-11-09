package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.t */
/* loaded from: classes.dex */
final class RunnableC0789t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3201a;

    /* renamed from: b */
    final /* synthetic */ String f3202b;

    /* renamed from: c */
    final /* synthetic */ int f3203c;

    /* renamed from: d */
    final /* synthetic */ int f3204d;

    /* renamed from: e */
    final /* synthetic */ Bundle f3205e;

    /* renamed from: f */
    final /* synthetic */ C0782m f3206f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0789t(C0782m c0782m, InterfaceC0793x interfaceC0793x, String str, int i, int i2, Bundle bundle) {
        this.f3206f = c0782m;
        this.f3201a = interfaceC0793x;
        this.f3202b = str;
        this.f3203c = i;
        this.f3204d = i2;
        this.f3205e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder mo2684a = this.f3201a.mo2684a();
        this.f3206f.f3175a.f3122b.remove(mo2684a);
        C0779j c0779j = new C0779j(this.f3206f.f3175a, this.f3202b, this.f3203c, this.f3204d, this.f3205e, this.f3201a);
        this.f3206f.f3175a.f3122b.put(mo2684a, c0779j);
        try {
            mo2684a.linkToDeath(c0779j, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
