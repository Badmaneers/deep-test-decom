package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.w */
/* loaded from: classes.dex */
final class RunnableC0792w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3214a;

    /* renamed from: b */
    final /* synthetic */ String f3215b;

    /* renamed from: c */
    final /* synthetic */ Bundle f3216c;

    /* renamed from: d */
    final /* synthetic */ ResultReceiver f3217d;

    /* renamed from: e */
    final /* synthetic */ C0782m f3218e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0792w(C0782m c0782m, InterfaceC0793x interfaceC0793x, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f3218e = c0782m;
        this.f3214a = interfaceC0793x;
        this.f3215b = str;
        this.f3216c = bundle;
        this.f3217d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0779j c0779j = this.f3218e.f3175a.f3122b.get(this.f3214a.mo2684a());
        if (c0779j == null) {
            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f3215b + ", extras=" + this.f3216c);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3218e.f3175a;
        String str = this.f3215b;
        Bundle bundle = this.f3216c;
        C0777h c0777h = new C0777h(mediaBrowserServiceCompat, str, this.f3217d);
        mediaBrowserServiceCompat.f3123c = c0779j;
        c0777h.m2677d();
        mediaBrowserServiceCompat.f3123c = null;
        if (c0777h.m2678e()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
