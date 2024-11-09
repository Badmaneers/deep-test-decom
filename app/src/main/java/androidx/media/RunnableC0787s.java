package androidx.media;

import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.s */
/* loaded from: classes.dex */
final class RunnableC0787s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0793x f3193a;

    /* renamed from: b */
    final /* synthetic */ String f3194b;

    /* renamed from: c */
    final /* synthetic */ ResultReceiver f3195c;

    /* renamed from: d */
    final /* synthetic */ C0782m f3196d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0787s(C0782m c0782m, InterfaceC0793x interfaceC0793x, String str, ResultReceiver resultReceiver) {
        this.f3196d = c0782m;
        this.f3193a = interfaceC0793x;
        this.f3194b = str;
        this.f3195c = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0779j c0779j = this.f3196d.f3175a.f3122b.get(this.f3193a.mo2684a());
        if (c0779j == null) {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f3194b);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f3196d.f3175a;
        String str = this.f3194b;
        C0775f c0775f = new C0775f(mediaBrowserServiceCompat, str, this.f3195c);
        mediaBrowserServiceCompat.f3123c = c0779j;
        c0775f.m2675a(2);
        c0775f.m2676c();
        mediaBrowserServiceCompat.f3123c = null;
        if (!c0775f.m2678e()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(str)));
        }
    }
}
