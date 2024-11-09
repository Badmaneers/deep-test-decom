package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.p */
/* loaded from: classes.dex */
final class RunnableC0785p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3184a;

    /* renamed from: b */
    final /* synthetic */ String f3185b;

    /* renamed from: c */
    final /* synthetic */ IBinder f3186c;

    /* renamed from: d */
    final /* synthetic */ Bundle f3187d;

    /* renamed from: e */
    final /* synthetic */ C0782m f3188e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0785p(C0782m c0782m, InterfaceC0793x interfaceC0793x, String str, IBinder iBinder, Bundle bundle) {
        this.f3188e = c0782m;
        this.f3184a = interfaceC0793x;
        this.f3185b = str;
        this.f3186c = iBinder;
        this.f3187d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0779j c0779j = this.f3188e.f3175a.f3122b.get(this.f3184a.mo2684a());
        if (c0779j == null) {
            Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f3185b);
            return;
        }
        this.f3188e.f3175a.m2663a(this.f3185b, c0779j, this.f3186c, this.f3187d);
    }
}
