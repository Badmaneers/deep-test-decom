package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.core.p023f.C0472c;

/* compiled from: MediaSessionManagerImplApi28.java */
/* renamed from: androidx.media.af */
/* loaded from: classes.dex */
final class C0762af implements InterfaceC0759ac {

    /* renamed from: a */
    final MediaSessionManager.RemoteUserInfo f3129a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0762af(String str, int i, int i2) {
        this.f3129a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0762af(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f3129a = remoteUserInfo;
    }

    public final int hashCode() {
        return C0472c.m1614a(this.f3129a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0762af) {
            return this.f3129a.equals(((C0762af) obj).f3129a);
        }
        return false;
    }
}
