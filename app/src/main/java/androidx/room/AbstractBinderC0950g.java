package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationService.java */
/* renamed from: androidx.room.g */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0950g extends Binder implements InterfaceC0949f {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public AbstractBinderC0950g() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    /* renamed from: a */
    public static InterfaceC0949f m3379a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0949f)) {
            return (InterfaceC0949f) queryLocalInterface;
        }
        return new C0951h(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int a2 = mo3376a(AbstractBinderC0947d.m3375a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            case 2:
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo3378a(AbstractBinderC0947d.m3375a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo3377a(parcel.readInt(), parcel.createStringArray());
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
