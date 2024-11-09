package androidx.room;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.s */
/* loaded from: classes.dex */
public final class RunnableC0962s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0958o f3928a;

    public RunnableC0962s(C0958o c0958o) {
        this.f3928a = c0958o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC0949f interfaceC0949f = this.f3928a.f3916f;
            if (interfaceC0949f != null) {
                this.f3928a.f3913c = interfaceC0949f.mo3376a(this.f3928a.f3918h, this.f3928a.f3912b);
                this.f3928a.f3914d.m3386a(this.f3928a.f3915e);
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }
}
