package androidx.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0410h;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.z */
/* loaded from: classes.dex */
final class HandlerC0795z extends Handler {

    /* renamed from: a */
    final /* synthetic */ MediaBrowserServiceCompat f3220a;

    /* renamed from: b */
    private final C0782m f3221b;

    public HandlerC0795z(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f3220a = mediaBrowserServiceCompat;
        this.f3221b = new C0782m(this.f3220a);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle);
                C0782m c0782m = this.f3221b;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i2 = data.getInt("data_calling_uid");
                C0794y c0794y = new C0794y(message.replyTo);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = c0782m.f3175a;
                boolean z = false;
                if (string != null) {
                    String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i2);
                    int length = packagesForUid.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (packagesForUid[i3].equals(string)) {
                                z = true;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
                }
                c0782m.f3175a.f3124d.m2689a(new RunnableC0783n(c0782m, c0794y, string, i, i2, bundle));
                return;
            case 2:
                C0782m c0782m2 = this.f3221b;
                c0782m2.f3175a.f3124d.m2689a(new RunnableC0784o(c0782m2, new C0794y(message.replyTo)));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                MediaSessionCompat.ensureClassLoader(bundle2);
                C0782m c0782m3 = this.f3221b;
                c0782m3.f3175a.f3124d.m2689a(new RunnableC0785p(c0782m3, new C0794y(message.replyTo), data.getString("data_media_item_id"), C0410h.m1464a(data, "data_callback_token"), bundle2));
                return;
            case 4:
                C0782m c0782m4 = this.f3221b;
                c0782m4.f3175a.f3124d.m2689a(new RunnableC0786q(c0782m4, new C0794y(message.replyTo), data.getString("data_media_item_id"), C0410h.m1464a(data, "data_callback_token")));
                return;
            case 5:
                C0782m c0782m5 = this.f3221b;
                String string2 = data.getString("data_media_item_id");
                ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                C0794y c0794y2 = new C0794y(message.replyTo);
                if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                    return;
                }
                c0782m5.f3175a.f3124d.m2689a(new RunnableC0787s(c0782m5, c0794y2, string2, resultReceiver));
                return;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle3);
                C0782m c0782m6 = this.f3221b;
                c0782m6.f3175a.f3124d.m2689a(new RunnableC0789t(c0782m6, new C0794y(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3));
                return;
            case 7:
                C0782m c0782m7 = this.f3221b;
                c0782m7.f3175a.f3124d.m2689a(new RunnableC0790u(c0782m7, new C0794y(message.replyTo)));
                return;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                MediaSessionCompat.ensureClassLoader(bundle4);
                C0782m c0782m8 = this.f3221b;
                String string3 = data.getString("data_search_query");
                ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                C0794y c0794y3 = new C0794y(message.replyTo);
                if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                    return;
                }
                c0782m8.f3175a.f3124d.m2689a(new RunnableC0791v(c0782m8, c0794y3, string3, bundle4, resultReceiver2));
                return;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.ensureClassLoader(bundle5);
                C0782m c0782m9 = this.f3221b;
                String string4 = data.getString("data_custom_action");
                ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                C0794y c0794y4 = new C0794y(message.replyTo);
                if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                    return;
                }
                c0782m9.f3175a.f3124d.m2689a(new RunnableC0792w(c0782m9, c0794y4, string4, bundle5, resultReceiver3));
                return;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                return;
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        data.putInt("data_calling_pid", Binder.getCallingPid());
        return super.sendMessageAtTime(message, j);
    }

    /* renamed from: a */
    private void m2689a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }
}
