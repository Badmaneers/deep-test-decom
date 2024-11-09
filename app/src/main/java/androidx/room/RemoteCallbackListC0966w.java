package androidx.room;

import android.os.RemoteCallbackList;

/* compiled from: MultiInstanceInvalidationService.java */
/* renamed from: androidx.room.w */
/* loaded from: classes.dex */
final class RemoteCallbackListC0966w extends RemoteCallbackList<InterfaceC0946c> {

    /* renamed from: a */
    final /* synthetic */ MultiInstanceInvalidationService f3932a;

    public RemoteCallbackListC0966w(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3932a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* synthetic */ void onCallbackDied(InterfaceC0946c interfaceC0946c, Object obj) {
        this.f3932a.f3781b.remove(Integer.valueOf(((Integer) obj).intValue()));
    }
}
