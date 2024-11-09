package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* renamed from: androidx.room.d */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0947d extends Binder implements InterfaceC0946c {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public AbstractBinderC0947d() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
    }

    /* renamed from: a */
    public static InterfaceC0946c m3375a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0946c)) {
            return (InterfaceC0946c) queryLocalInterface;
        }
        return new C0948e(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            mo3374a(parcel.createStringArray());
            return true;
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
