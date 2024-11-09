package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.h */
/* loaded from: classes.dex */
final class C0777h extends C0781l<Bundle> {

    /* renamed from: a */
    final /* synthetic */ ResultReceiver f3156a;

    /* renamed from: b */
    final /* synthetic */ MediaBrowserServiceCompat f3157b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777h(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f3157b = mediaBrowserServiceCompat;
        this.f3156a = resultReceiver;
    }

    @Override // androidx.media.C0781l
    /* renamed from: b */
    final void mo2672b() {
        this.f3156a.send(-1, null);
    }

    @Override // androidx.media.C0781l
    /* renamed from: a */
    final /* synthetic */ void mo2671a() {
        this.f3156a.send(0, null);
    }
}
