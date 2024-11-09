package androidx.room;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.u */
/* loaded from: classes.dex */
public final class RunnableC0964u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0958o f3930a;

    public RunnableC0964u(C0958o c0958o) {
        this.f3930a = c0958o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3930a.f3914d.m3389b(this.f3930a.f3915e);
        try {
            InterfaceC0949f interfaceC0949f = this.f3930a.f3916f;
            if (interfaceC0949f != null) {
                interfaceC0949f.mo3378a(this.f3930a.f3918h, this.f3930a.f3913c);
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
        }
        this.f3930a.f3911a.unbindService(this.f3930a.f3920j);
    }
}
