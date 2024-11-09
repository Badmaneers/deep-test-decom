package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* compiled from: MediaSessionManager.java */
/* renamed from: androidx.media.ab */
/* loaded from: classes.dex */
public final class C0758ab {

    /* renamed from: a */
    InterfaceC0759ac f3128a;

    public C0758ab(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3128a = new C0762af(str, i, i2);
        } else {
            this.f3128a = new C0764ah(str, i, i2);
        }
    }

    public C0758ab(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f3128a = new C0762af(remoteUserInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0758ab) {
            return this.f3128a.equals(((C0758ab) obj).f3128a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3128a.hashCode();
    }
}
