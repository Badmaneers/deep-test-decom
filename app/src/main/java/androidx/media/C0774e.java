package androidx.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Log;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.e */
/* loaded from: classes.dex */
public final class C0774e extends C0781l<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: a */
    final /* synthetic */ C0779j f3147a;

    /* renamed from: b */
    final /* synthetic */ String f3148b;

    /* renamed from: c */
    final /* synthetic */ Bundle f3149c;

    /* renamed from: d */
    final /* synthetic */ Bundle f3150d = null;

    /* renamed from: e */
    final /* synthetic */ MediaBrowserServiceCompat f3151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0774e(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, C0779j c0779j, String str, Bundle bundle) {
        super(obj);
        this.f3151e = mediaBrowserServiceCompat;
        this.f3147a = c0779j;
        this.f3148b = str;
        this.f3149c = bundle;
    }

    @Override // androidx.media.C0781l
    /* renamed from: a */
    final /* synthetic */ void mo2671a() {
        if (this.f3151e.f3122b.get(this.f3147a.f3165f.mo2684a()) != this.f3147a) {
            if (MediaBrowserServiceCompat.f3121a) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f3147a.f3160a + " id=" + this.f3148b);
                return;
            }
            return;
        }
        if ((m2679f() & 1) != 0) {
            MediaBrowserServiceCompat.m2661b();
        }
        try {
            this.f3147a.f3165f.mo2686a(this.f3148b, null, this.f3149c, this.f3150d);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f3148b + " package=" + this.f3147a.f3160a);
        }
    }
}
