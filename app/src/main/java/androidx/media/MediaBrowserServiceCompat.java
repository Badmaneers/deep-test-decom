package androidx.media;

import android.app.Service;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.p023f.C0473d;
import androidx.p011b.C0318a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a */
    static final boolean f3121a = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: c */
    C0779j f3123c;

    /* renamed from: e */
    MediaSessionCompat.Token f3125e;

    /* renamed from: b */
    final C0318a<IBinder, C0779j> f3122b = new C0318a<>();

    /* renamed from: d */
    final HandlerC0795z f3124d = new HandlerC0795z(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List<MediaBrowserCompat.MediaItem> m2661b() {
        return null;
    }

    /* renamed from: a */
    public abstract C0778i m2662a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2663a(String str, C0779j c0779j, IBinder iBinder, Bundle bundle) {
        List<C0473d<IBinder, Bundle>> list = c0779j.f3166g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C0473d<IBinder, Bundle> c0473d : list) {
            if (iBinder == c0473d.f2273a && C0773d.m2670a(bundle, c0473d.f2274b)) {
                return;
            }
        }
        list.add(new C0473d<>(iBinder, bundle));
        c0779j.f3166g.put(str, list);
        C0774e c0774e = new C0774e(this, str, c0779j, str, bundle);
        this.f3123c = c0779j;
        if (bundle != null) {
            c0774e.m2675a(1);
        }
        this.f3123c = null;
        if (c0774e.m2678e()) {
            this.f3123c = c0779j;
            this.f3123c = null;
        } else {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c0779j.f3160a + " id=" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m2664a(String str, C0779j c0779j, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder == null) {
                return c0779j.f3166g.remove(str) != null;
            }
            List<C0473d<IBinder, Bundle>> list = c0779j.f3166g.get(str);
            if (list != null) {
                Iterator<C0473d<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f2273a) {
                        it.remove();
                        z = true;
                    }
                }
                if (list.size() == 0) {
                    c0779j.f3166g.remove(str);
                }
            }
            return z;
        } finally {
            this.f3123c = c0779j;
            this.f3123c = null;
        }
    }
}
