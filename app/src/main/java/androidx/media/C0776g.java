package androidx.media;

import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.g */
/* loaded from: classes.dex */
final class C0776g extends C0781l<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: a */
    final /* synthetic */ ResultReceiver f3154a;

    /* renamed from: b */
    final /* synthetic */ MediaBrowserServiceCompat f3155b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0776g(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f3155b = mediaBrowserServiceCompat;
        this.f3154a = resultReceiver;
    }

    @Override // androidx.media.C0781l
    /* renamed from: a */
    final /* synthetic */ void mo2671a() {
        this.f3154a.send(-1, null);
    }
}
