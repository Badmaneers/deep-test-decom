package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* renamed from: androidx.room.e */
/* loaded from: classes.dex */
final class C0948e implements InterfaceC0946c {

    /* renamed from: a */
    private IBinder f3883a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0948e(IBinder iBinder) {
        this.f3883a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3883a;
    }

    @Override // androidx.room.InterfaceC0946c
    /* renamed from: a */
    public final void mo3374a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f3883a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
