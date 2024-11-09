package com.heytap.tingle.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMaster.java */
/* renamed from: com.heytap.tingle.ipc.d */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2464d extends Binder implements InterfaceC2463c {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2464d() {
        attachInterface(this, "com.heytap.tingle.ipc.IMaster");
    }

    /* renamed from: a */
    public static InterfaceC2463c m7808a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.tingle.ipc.IMaster");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2463c)) {
            return (InterfaceC2463c) queryLocalInterface;
        }
        return new C2465e(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 4) {
            if (i == 1598968902) {
                parcel2.writeString("com.heytap.tingle.ipc.IMaster");
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("com.heytap.tingle.ipc.IMaster");
        int a2 = mo7807a();
        parcel2.writeNoException();
        parcel2.writeInt(a2);
        return true;
    }

    /* renamed from: b */
    public static InterfaceC2463c m7809b() {
        return C2465e.f10739a;
    }
}
