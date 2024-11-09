package androidx.room;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: MultiInstanceInvalidationService.java */
/* renamed from: androidx.room.x */
/* loaded from: classes.dex */
final class BinderC0967x extends AbstractBinderC0950g {

    /* renamed from: a */
    final /* synthetic */ MultiInstanceInvalidationService f3933a;

    public BinderC0967x(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3933a = multiInstanceInvalidationService;
    }

    @Override // androidx.room.InterfaceC0949f
    /* renamed from: a */
    public final int mo3376a(InterfaceC0946c interfaceC0946c, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f3933a.f3782c) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3933a;
            int i = multiInstanceInvalidationService.f3780a + 1;
            multiInstanceInvalidationService.f3780a = i;
            if (this.f3933a.f3782c.register(interfaceC0946c, Integer.valueOf(i))) {
                this.f3933a.f3781b.put(Integer.valueOf(i), str);
                return i;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f3933a;
            multiInstanceInvalidationService2.f3780a--;
            return 0;
        }
    }

    @Override // androidx.room.InterfaceC0949f
    /* renamed from: a */
    public final void mo3378a(InterfaceC0946c interfaceC0946c, int i) {
        synchronized (this.f3933a.f3782c) {
            this.f3933a.f3782c.unregister(interfaceC0946c);
            this.f3933a.f3781b.remove(Integer.valueOf(i));
        }
    }

    @Override // androidx.room.InterfaceC0949f
    /* renamed from: a */
    public final void mo3377a(int i, String[] strArr) {
        synchronized (this.f3933a.f3782c) {
            String str = this.f3933a.f3781b.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = this.f3933a.f3782c.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                try {
                    int intValue = ((Integer) this.f3933a.f3782c.getBroadcastCookie(i2)).intValue();
                    String str2 = this.f3933a.f3781b.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            this.f3933a.f3782c.getBroadcastItem(i2).mo3374a(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    this.f3933a.f3782c.finishBroadcast();
                }
            }
        }
    }
}
