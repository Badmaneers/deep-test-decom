package com.heytap.tingle.ipc;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IMaster.java */
/* renamed from: com.heytap.tingle.ipc.e */
/* loaded from: classes.dex */
public final class C2465e implements InterfaceC2463c {

    /* renamed from: a */
    public static InterfaceC2463c f10739a;

    /* renamed from: b */
    private IBinder f10740b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2465e(IBinder iBinder) {
        this.f10740b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10740b;
    }

    @Override // com.heytap.tingle.ipc.InterfaceC2463c
    /* renamed from: a */
    public final int mo7807a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.heytap.tingle.ipc.IMaster");
            if (!this.f10740b.transact(4, obtain, obtain2, 0) && AbstractBinderC2464d.m7809b() != null) {
                return AbstractBinderC2464d.m7809b().mo7807a();
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
