package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationService.java */
/* renamed from: androidx.room.h */
/* loaded from: classes.dex */
final class C0951h implements InterfaceC0949f {

    /* renamed from: a */
    private IBinder f3884a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0951h(IBinder iBinder) {
        this.f3884a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3884a;
    }

    @Override // androidx.room.InterfaceC0949f
    /* renamed from: a */
    public final int mo3376a(InterfaceC0946c interfaceC0946c, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            obtain.writeStrongBinder(interfaceC0946c != null ? interfaceC0946c.asBinder() : null);
            obtain.writeString(str);
            this.f3884a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // androidx.room.InterfaceC0949f
    /* renamed from: a */
    public final void mo3378a(InterfaceC0946c interfaceC0946c, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            obtain.writeStrongBinder(interfaceC0946c != null ? interfaceC0946c.asBinder() : null);
            obtain.writeInt(i);
            this.f3884a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // androidx.room.InterfaceC0949f
    /* renamed from: a */
    public final void mo3377a(int i, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.f3884a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
