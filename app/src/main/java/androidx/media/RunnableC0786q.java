package androidx.media;

import android.os.IBinder;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.q */
/* loaded from: classes.dex */
final class RunnableC0786q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3189a;

    /* renamed from: b */
    final /* synthetic */ String f3190b;

    /* renamed from: c */
    final /* synthetic */ IBinder f3191c;

    /* renamed from: d */
    final /* synthetic */ C0782m f3192d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0786q(C0782m c0782m, InterfaceC0793x interfaceC0793x, String str, IBinder iBinder) {
        this.f3192d = c0782m;
        this.f3189a = interfaceC0793x;
        this.f3190b = str;
        this.f3191c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0779j c0779j = this.f3192d.f3175a.f3122b.get(this.f3189a.mo2684a());
        if (c0779j == null) {
            Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f3190b);
        } else {
            if (this.f3192d.f3175a.m2664a(this.f3190b, c0779j, this.f3191c)) {
                return;
            }
            Log.w("MBServiceCompat", "removeSubscription called for " + this.f3190b + " which is not subscribed");
        }
    }
}
