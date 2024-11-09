package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.r */
/* loaded from: classes.dex */
public final class ServiceConnectionC0961r implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0958o f3927a;

    public ServiceConnectionC0961r(C0958o c0958o) {
        this.f3927a = c0958o;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3927a.f3916f = AbstractBinderC0950g.m3379a(iBinder);
        this.f3927a.f3917g.execute(this.f3927a.f3921k);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3927a.f3917g.execute(this.f3927a.f3922l);
        this.f3927a.f3916f = null;
    }
}
