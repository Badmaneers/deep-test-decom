package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.v */
/* loaded from: classes.dex */
final class RunnableC0791v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3209a;

    /* renamed from: b */
    final /* synthetic */ String f3210b;

    /* renamed from: c */
    final /* synthetic */ Bundle f3211c;

    /* renamed from: d */
    final /* synthetic */ ResultReceiver f3212d;

    /* renamed from: e */
    final /* synthetic */ C0782m f3213e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0791v(C0782m c0782m, InterfaceC0793x interfaceC0793x, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f3213e = c0782m;
        this.f3209a = interfaceC0793x;
        this.f3210b = str;
        this.f3211c = bundle;
        this.f3212d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0779j c0779j = this.f3213e.f3175a.f3122b.get(this.f3209a.mo2684a());
        if (c0779j == null) {
            Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f3210b);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3213e.f3175a;
        String str = this.f3210b;
        C0776g c0776g = new C0776g(mediaBrowserServiceCompat, str, this.f3212d);
        mediaBrowserServiceCompat.f3123c = c0779j;
        c0776g.m2675a(4);
        c0776g.m2676c();
        mediaBrowserServiceCompat.f3123c = null;
        if (!c0776g.m2678e()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=".concat(String.valueOf(str)));
        }
    }
}
