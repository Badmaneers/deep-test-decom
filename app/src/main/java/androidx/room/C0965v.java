package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* renamed from: androidx.room.v */
/* loaded from: classes.dex */
public final class C0965v extends AbstractC0956m {

    /* renamed from: b */
    final /* synthetic */ C0958o f3931b;

    @Override // androidx.room.AbstractC0956m
    /* renamed from: a */
    public final boolean mo3396a() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0965v(C0958o c0958o, String[] strArr) {
        super(strArr);
        this.f3931b = c0958o;
    }

    @Override // androidx.room.AbstractC0956m
    /* renamed from: a */
    public final void mo3395a(Set<String> set) {
        if (this.f3931b.f3919i.get()) {
            return;
        }
        try {
            InterfaceC0949f interfaceC0949f = this.f3931b.f3916f;
            if (interfaceC0949f != null) {
                interfaceC0949f.mo3377a(this.f3931b.f3913c, (String[]) set.toArray(new String[0]));
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot broadcast invalidation", e);
        }
    }
}
