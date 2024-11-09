package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.f */
/* loaded from: classes.dex */
final class C0775f extends C0781l<MediaBrowserCompat.MediaItem> {

    /* renamed from: a */
    final /* synthetic */ ResultReceiver f3152a;

    /* renamed from: b */
    final /* synthetic */ MediaBrowserServiceCompat f3153b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0775f(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f3153b = mediaBrowserServiceCompat;
        this.f3152a = resultReceiver;
    }

    @Override // androidx.media.C0781l
    /* renamed from: a */
    final /* synthetic */ void mo2671a() {
        if ((m2679f() & 2) != 0) {
            this.f3152a.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        this.f3152a.send(0, bundle);
    }
}
