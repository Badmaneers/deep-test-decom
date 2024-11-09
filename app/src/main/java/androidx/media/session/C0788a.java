package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;

/* compiled from: MediaButtonReceiver.java */
/* renamed from: androidx.media.session.a */
/* loaded from: classes.dex */
final class C0788a extends MediaBrowserCompat.ConnectionCallback {

    /* renamed from: a */
    private final Context f3197a;

    /* renamed from: b */
    private final Intent f3198b;

    /* renamed from: c */
    private final BroadcastReceiver.PendingResult f3199c;

    /* renamed from: d */
    private MediaBrowserCompat f3200d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0788a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f3197a = context;
        this.f3198b = intent;
        this.f3199c = pendingResult;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2683a(MediaBrowserCompat mediaBrowserCompat) {
        this.f3200d = mediaBrowserCompat;
    }

    @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
    public final void onConnected() {
        try {
            new MediaControllerCompat(this.f3197a, this.f3200d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f3198b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        } catch (RemoteException e) {
            Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
        }
        m2682a();
    }

    @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
    public final void onConnectionSuspended() {
        m2682a();
    }

    @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
    public final void onConnectionFailed() {
        m2682a();
    }

    /* renamed from: a */
    private void m2682a() {
        this.f3200d.disconnect();
        this.f3199c.finish();
    }
}
