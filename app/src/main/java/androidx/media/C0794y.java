package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.y */
/* loaded from: classes.dex */
final class C0794y implements InterfaceC0793x {

    /* renamed from: a */
    final Messenger f3219a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0794y(Messenger messenger) {
        this.f3219a = messenger;
    }

    @Override // androidx.media.InterfaceC0793x
    /* renamed from: a */
    public final IBinder mo2684a() {
        return this.f3219a.getBinder();
    }

    @Override // androidx.media.InterfaceC0793x
    /* renamed from: a */
    public final void mo2685a(String str, MediaSessionCompat.Token token, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("extra_service_version", 2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putParcelable("data_media_session_token", token);
        bundle2.putBundle("data_root_hints", bundle);
        m2688a(1, bundle2);
    }

    @Override // androidx.media.InterfaceC0793x
    /* renamed from: b */
    public final void mo2687b() {
        m2688a(2, null);
    }

    @Override // androidx.media.InterfaceC0793x
    /* renamed from: a */
    public final void mo2686a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        m2688a(3, bundle3);
    }

    /* renamed from: a */
    private void m2688a(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        this.f3219a.send(obtain);
    }
}
